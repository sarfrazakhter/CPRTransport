package com.cps.cprtransport;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.cps.cprtransport.utils.DataRepository;

public class SplashActivity extends AppCompatActivity {


        private final int SPLASH_DISPLAY_LENGTH = 2000;
        String token;
        Button submit;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
            token = DataRepository.getInstance().getSessionId(SplashActivity.this);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    if(token!=null){

                        startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    }else {

                        startActivity(new Intent(SplashActivity.this, Login.class));
                        finish();
                    }

                }
            }, SPLASH_DISPLAY_LENGTH);

    }
}
