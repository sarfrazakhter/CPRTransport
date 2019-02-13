package com.cps.cprtransport;

import android.animation.ObjectAnimator;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.cps.cprtransport.utils.Constants;
import com.cps.cprtransport.utils.Constants_Config;
import com.cps.cprtransport.utils.CreateRequest;
import com.cps.cprtransport.utils.DataRepository;
import com.cps.cprtransport.utils.GetResponse;
import com.cps.cprtransport.utils.NetworkAvailablity;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class Login extends AppCompatActivity {
    TextView tv_login;
    private EditText ed_user_name,ed_password;
    RelativeLayout mainLay;
    String userName,password,token;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        view();
        events();
        //setOnEditorActionListeneroneditText();
    }

    private void events() {

        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // startActivity(new Intent(DeliveryBoy_Login.this,Activity_DeliveryDash.class));

                if (NetworkAvailablity.isNetworkAvailable(Login.this))

                    getUserInPut();

                else
                    Toast.makeText(Login.this,"please check internet connectivity",Toast.LENGTH_SHORT).show();


            }
        });
    }

    protected void getUserInPut()  {

        userName = ed_user_name.getText().toString();
        password=   ed_password.getText().toString();

        String proceedStatus = validateUserInput(userName, password);

        if (proceedStatus.equalsIgnoreCase("Ready")) {

            JSONObject loginObject = null;

            try {

                loginObject = new CreateRequest().createLoginRequest(userName, password);

            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            new GetloginResponse().execute(loginObject);
        }

    }
    ProgressDialog progressDialog;
    public class GetloginResponse extends AsyncTask<JSONObject, Integer, String> {

        String response;

        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();

            progressDialog= Constants.loader(progressDialog,Login.this);
        }

        @Override
        protected String doInBackground(JSONObject... params) {
            // TODO Auto-generated method stub

            try {

                response = new GetResponse().postData(Constants_Config.loginUrl,params[0]);



            } catch (IOException | JSONException e) {

                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            return response;
        }

        @Override
        protected void onPostExecute(String result) {
            // TODO Auto-generated method stub
            super.onPostExecute(result);

            progressDialog.dismiss();

            if (null != result) {

                JSONObject object;

                try {

                    object = new JSONObject(result);

                    String token = object.getString("auth_token");

                    if (token !=null) {


                       DataRepository.getInstance().putDeviceSessionInPref(Login.this,token);
                        startActivity(new Intent(Login.this,MainActivity.class));


                    } else {

                        //Toast.makeText(Mi_LoginActivity.this, object.getString("message"), Toast.LENGTH_LONG).show();

                        progressDialog.dismiss();


                    }

                } catch (JSONException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        }




    }


    private String validateUserInput(String phone, String password) {
        // TODO Auto-generated method stub

        String status = "";
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        if (!phone.matches(emailPattern)) {
            //ed_user_name.setError(getString(R.string.usernameempty));
            Constants.messageViewRe(mainLay, getString(R.string.validemail));
            status = "Not Ready";
        }
        // final String pass = editTextPassword.getText().toString();
        else if (!isValidPassword(password)) {
            //ed_password.setError(getString(R.string.validpassword));
            Constants.messageViewRe(mainLay, getString(R.string.validpassword));
            status = "Not Ready";

        } else {
            status = "Ready";
        }

        return status;
    }

    private boolean isValidPassword(String pass) {
        // TODO Auto-generated method stub
        if (pass != null ) {
            return true;
        }
        return false;
    }

    private void view() {

        tv_login  = (TextView)findViewById(R.id.tv_login);
        ed_password = (EditText)findViewById(R.id.ed_password);
        ed_user_name = (EditText)findViewById(R.id.ed_user_name);
        mainLay      =(RelativeLayout)findViewById(R.id.mainLay);
    }
}
