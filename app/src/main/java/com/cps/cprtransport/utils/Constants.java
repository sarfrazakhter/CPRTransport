package com.cps.cprtransport.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.support.design.widget.Snackbar;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cps.cprtransport.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;




public class Constants {

    public static int SERVICESTATUS        = 0;
    public static int TIMEOUT              = 180000;
    public static String Host              = "http://www.shamelsms.net/";
    public static String NoorSchoolHost    = "http://www.noorschool.net/";

    public static String REGISTER          = Host+"api/Register.aspx?";
    public static String LOGIN             = Host+"api/users.aspx?";
    public static String USERINFO          = Host+"api/UserInfo.aspx";              // http://www.shamelsms.net/api/UserInfo.aspx
    public static String TEACHER           = NoorSchoolHost+"mob_api/Teachers.aspx";//http://www.noorschool.net/mob_api/Teachers.aspx
    public static String CATEGORIES        = Host+"api/Categories.aspx";//http://www.shamelsms.net/api/Categories.aspx
    public static String SENDERLIST        = Host+"api/Senders.aspx";              //  http:http:/www.shamelsms.net/api/Senders.aspx
    public static String TEMPLETLIST       = Host+"api/Templates.aspx";           //http://www.shamelsms.net/api/Templates.aspx
    public static String GETBALANCE        = Host+"api/users.aspx";//http://www.shamelsms.net/api/users.aspx?code=7&username=Bhupen&password=12345
    public static String SENDSMS           = Host+"api/httpSms.aspx";  ////http://www.shamelsms.net/api/httpSms.aspx
    public static String SENDGROUPSMS      = Host+"api/SendSMS.aspx"; //http://www.shamelsms.net/api/SendSMS.aspx
    public static String MESSAHEHISTORY    = NoorSchoolHost+"mob_api/MessageHistory.aspx";
    public static String ABSENCEHISTORY    = NoorSchoolHost+"mob_api/Attendance.aspx"; //http://www.noorschool.net/mob_api/Attendance.aspx
    public static String LATEHISTORY       = NoorSchoolHost+"mob_api/Attendance.aspx"; //Attendance.aspx
    public static String REASONSLIST       = NoorSchoolHost+"mob_api/Attendance.aspx"; // ReasonsList
    public static String CLASSES           = NoorSchoolHost+"mob_api/Classes.aspx";    // http://www.noorschool.net/mobi_api/Classes.aspx
    public static String ATTENDANCE        = NoorSchoolHost+"mob_api/Attendance.aspx";    // http://www.noorschool.net/mobi_api/Classes.aspx

    public static String CONTACT_US        = NoorSchoolHost+"mob_api/ContactsUs.aspx";
    public static String SENDERLISTNEW     = Host+"api/users.aspx";
    public static String UPLOADCONTACTs    = Host+"api/users.aspx";  //http://www.shamelsms.net/api/users.aspx


    //Sarfraz Added...

    public static String SENDER            = Host+"api/Senders.aspx";   //	http://www.shamelsms.net/api/Senders.aspx
    public static String deleteSender      = Host+"api/Senders.aspx";  // 	http://www.shamelsms.net/api/Senders.aspx
    public static String addsender         = Host+"api/users.aspx?";   //http://www.shamelsms.net/api/users.aspx?
    public static String updateuser        = Host+"api/UserInfo.aspx"; //http://www.shamelsms.net/api/UserInfo.aspx
    public static String MESSAGEHISTORY    = Host+"api/MessageHistory.aspx";//http://www.shamelsms.net/api/MessageHistory.aspx



    public static String FEATURELINK       = "http://www.noorschool.net/AboutShamelSMS.aspx";
    public static String VIDEOSLINK        = "http://www.noorschool.net/GetUrls.aspx";
    public static String ABOUTUSLINK       = "http://www.noorschool.net/AboutShamelSMS.aspx";
    public static String LIVECHAT          = NoorSchoolHost+"ChatWithUs.aspx";

    public static String CON_MOBILE        = "0554112537";
    public static String CON_PHONE         = "0112299801";
    public static String CON_PHONE2         = "0112292973";
    public static String CON_WEBSITE       = "www.shamelsms.net";  //put website link without http
    public static String CON_EMAIL         = "support@shamelsms.net";


//*******************  Preference Costants***************************



    public static String USERID             = "UserID";
    public static String USERNAME           = "USERNAME";
    public static String DISPLAYUSERNAME    = "DISPLAYUSERNAME";
    public static String PASSWORD           = "PASSWORD";
    public static String ISREMEBER          = "ISREMEMBER";
    public static String AUTOLOGIN          = "AUTOLOGIN";
    public static String BALANCE            = "BALANCE";
    public static String DEFAULT_SENDER     = "DEFAULT_SENDER";
    public static String LANGUAGE           = "LANGUAGE";
    public static String CURRENTLOCALE      = "locale";

//*******************  Fix Costants Variables***************************


    public static String AbsenceAttendance  = "Absence";
    public static String LateAttendance     = "Late";
    public static String BehaviorAttendance = "Behavior";
    public static String TeacherAttendanceType = "Teacher";
    public static String StudentAttendanceType = "Student";
    public static String AttendanceType     = "";

    public static String AppURL             = "https://play.google.com/store/apps/details?id=acodet.com.shamelsms&hl=en";
    public static String AppVersion            =  "AppVersion";

    public static ProgressDialog loader(ProgressDialog progressDialog, Context context)
    {
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(context.getString(R.string.loading)); // Setting Title
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER); // Progress Dialog Style Spinner
        progressDialog.show(); // Display Progress Dialog
        progressDialog.setCancelable(false);

        return progressDialog;
    }

   /* public static ProgressDialog loader(ProgressDialog progressDialog, Context context)
    {
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(context.getString(R.string.loading)); // Setting Title
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER); // Progress Dialog Style Spinner
        progressDialog.show(); // Display Progress Dialog
        progressDialog.setCancelable(false);

        return progressDialog;
    }*/

/*public static ProgressDialog loadercon(ProgressDialog progressDialog, Context context)
    {
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(context.getString(R.string.loading_contacts)); // Setting Title
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER); // Progress Dialog Style Spinner
        progressDialog.show(); // Display Progress Dialog
        progressDialog.setCancelable(false);

        return progressDialog;
    }*/



    public static String current_Date()
    {
        String date;
        Calendar c = Calendar.getInstance();
        SimpleDateFormat dt = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        date = dt.format(c.getTime());
        return date;
    }
    /*public static String current_Time()
    {
        String time;
        Calendar c = Calendar.getInstance();
        SimpleDateFormat tm = new SimpleDateFormat("hh:mm ",Locale.ENGLISH);
        time = tm.format(c.getTime());
        return time;
Date dt = new Date(date1);
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm aa",Local.us);
        String time1 = sdf.format(dt);

    }*/

    public static String validateNumber(String number)
    {
        String status = null;
        if(number.startsWith("+91")&& number.length()==13) {
            status = String.valueOf(true);
        }else if(number.startsWith("+9665")&& number.length()==13) {
            status = String.valueOf(true);
        }else if(number.startsWith("91")&& number.length()==12) {
            status = String.valueOf(true);
        }else if(number.startsWith("9665")&& number.length()==12) {
            status = String.valueOf(true);
        }else if(number.startsWith("+1")&& number.length()==12) {
            status = String.valueOf(true);
        }else if(number.startsWith("05")&& number.length()==10) {
            status = String.valueOf(true);
        }
        else if(number.startsWith("00")&& number.length()==14) {
            status = String.valueOf(true);

        } else if(number.startsWith("+62")&& number.length()==12) {
            status = String.valueOf(true);

        }else if(number.startsWith("+98")&& number.length()==13) {
            //contactList.get(pos).setSelected(true);//iran
            status = String.valueOf(true);
        }
        else if(number.startsWith("+964")&& number.length()==14) {
            //contactList.get(pos).setSelected(true);//iraq
            status = String.valueOf(true);

        }else if(number.startsWith("+962")&& number.length()==11) {
            //contactList.get(pos).setSelected(true);//jordan
            status = String.valueOf(true);

        }else if(number.startsWith("+213")&& number.length()==13) {
            //contactList.get(pos).setSelected(true);//Algeria
            status = String.valueOf(true);

        }else if(number.startsWith("+973")&& number.length()==12) {
            //contactList.get(pos).setSelected(true);//behrain
            status = String.valueOf(true);

        }else if(number.startsWith("+880")&& number.length()==14) {
            //contactList.get(pos).setSelected(true);//jordan
            status = String.valueOf(true);

        }else if(number.startsWith("+86")&& number.length()==14) {
            //contactList.get(pos).setSelected(true);//jordan
            status = String.valueOf(true);

        }else if(number.startsWith("+20")&& number.length()==13) {
            //contactList.get(pos).setSelected(true);//Egypt
            status = String.valueOf(true);

        }else if(number.startsWith("+33")&& number.length()==12) {
            //contactList.get(pos).setSelected(true);//France
            status = String.valueOf(true);

        }else if(number.startsWith("+233")&& number.length()==13) {
            //contactList.get(pos).setSelected(true);//jordan
            status = String.valueOf(true);

        }else if(number.startsWith("+39")&& number.length()==13) {
            //contactList.get(pos).setSelected(true);//Italy
            status = String.valueOf(true);

        }else if(number.startsWith("+81")&& number.length()==11) {
            //contactList.get(pos).setSelected(true);//japan
            status = String.valueOf(true);

        }else if(number.startsWith("+965")&& number.length()==11) {
            //contactList.get(pos).setSelected(true);//kuwait
            status = String.valueOf(true);

        }else if(number.startsWith("+961")&& number.length()==12) {
            //contactList.get(pos).setSelected(true);//lebonan
            status = String.valueOf(true);

        }else if(number.startsWith("+218")&& number.length()==13) {
            //contactList.get(pos).setSelected(true);//libya
            status = String.valueOf(true);

        }else if(number.startsWith("+60")&& number.length()==11) {
            //contactList.get(pos).setSelected(true);//Malaysia
            status = String.valueOf(true);

        }else if(number.startsWith("+233")&& number.length()==12) {
            //contactList.get(pos).setSelected(true);//Mali
            status = String.valueOf(true);

        }else if(number.startsWith("+212")&& number.length()==13) {
            //contactList.get(pos).setSelected(true);//Morocco
            status = String.valueOf(true);

        }else if(number.startsWith("+234")&& number.length()==15) {
            //contactList.get(pos).setSelected(true);//Nigeria
            status = String.valueOf(true);

        }else if(number.startsWith("+968")&& number.length()==12) {
            //contactList.get(pos).setSelected(true);//Oman
            status = String.valueOf(true);

        }else if(number.startsWith("+92")&& number.length()==13) {
            //contactList.get(pos).setSelected(true);//Pakistan
            status = String.valueOf(true);

        }else if(number.startsWith("+970")&& number.length()==11) {
            //contactList.get(pos).setSelected(true);//Palestine
            status = String.valueOf(true);

        }else if(number.startsWith("+63")&& number.length()==13) {
            //contactList.get(pos).setSelected(true);//Philipins
            status = String.valueOf(true);

        }else if(number.startsWith("+974")&& number.length()==9) {
            //contactList.get(pos).setSelected(true);//qatar
            status = String.valueOf(true);

        }else if(number.startsWith("+40")&& number.length()==12) {
            //contactList.get(pos).setSelected(true);//Romania
            status = String.valueOf(true);

        }else if(number.startsWith("+7")&& number.length()==12) {
            //contactList.get(pos).setSelected(true);//Russia
            status = String.valueOf(true);

        }else if(number.startsWith("+381")&& number.length()==11) {
            //contactList.get(pos).setSelected(true);//serbia
            status = String.valueOf(true);

        }else if(number.startsWith("+27")&& number.length()==12) {
            //contactList.get(pos).setSelected(true);//south africa
            status = String.valueOf(true);

        }else if(number.startsWith("+211")&& number.length()==13) {
            //contactList.get(pos).setSelected(true);//south sudan
            status = String.valueOf(true);

        }else if(number.startsWith("+252")&& number.length()==11) {
            //contactList.get(pos).setSelected(true);//somalia
            status = String.valueOf(true);

        }else if(number.startsWith("+94")&& number.length()==10) {
            //contactList.get(pos).setSelected(true);//sri lanka
            status = String.valueOf(true);

        }else if(number.startsWith("+90")&& number.length()==14) {
            //contactList.get(pos).setSelected(true);//turkey
            status = String.valueOf(true);

        }else if(number.startsWith("+971")&& number.length()==13) {
            //contactList.get(pos).setSelected(true);//united arab amarats
            status = String.valueOf(true);

        }else if(number.startsWith("+44")&& number.length()==13) {
            //contactList.get(pos).setSelected(true);//u.k
            status = String.valueOf(true);

        }else if(number.startsWith("+998")&& number.length()==14) {
            //contactList.get(pos).setSelected(true);//jordan
            status = String.valueOf(true);

        }else if(number.startsWith("+84")&& number.length()==13) {
            //contactList.get(pos).setSelected(true);//vietnam
            status = String.valueOf(true);

        }else if(number.startsWith("+967")&& number.length()==13) {
            //contactList.get(pos).setSelected(true);//yamen
            status = String.valueOf(true);

        }else if(number.startsWith("+260")&& number.length()==14) {
            //contactList.get(pos).setSelected(true);//zambia
            status = String.valueOf(true);

        }else if(number.startsWith("+49")&& number.length()==13) {
            //contactList.get(pos).setSelected(true);//Germany
            status = String.valueOf(true);

        }else if(number.startsWith("+235")&& number.length()==12) {
            //contactList.get(pos).setSelected(true);//chad+20
            status = String.valueOf(true);

        }else if(number.startsWith("+44")&& number.length()==13) {
            //contactList.get(pos).setSelected(true);//England
            status = String.valueOf(true);

        }
        else if(!number.startsWith("0") && number.length()==10) {
            //contactList.get(pos).setSelected(true);//England
            status = String.valueOf(true);

        }else if(!number.startsWith("+91") && number.length()==10) {
            //contactList.get(pos).setSelected(true);//England
            status = String.valueOf(true);


        }else if(number.startsWith("0")&& number.length()==11) {
            //contactList.get(pos).setSelected(true);//England
            status = String.valueOf(true);

        }else if(number.startsWith("0612")&& number.length()==11) {
            //contactList.get(pos).setSelected(true);//England
            status = String.valueOf(true);

        }else{
            status = String.valueOf(false);
        }

        return status;
    }
/*public static void sigleButton(String msg,Context context)
    {
        // custom dialog
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.singlebuttonalert);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        Button okbutton = (Button) dialog.findViewById(R.id.okbutton);
        TextView msz    = (TextView) dialog.findViewById(R.id.message);
        msz.setText(msg);
        // if button is clicked, close the custom dialog
        okbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }*/


/*public static void sucessButton(Context context)
    {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.sucess_pop_ups);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        Button okbutton = (Button) dialog.findViewById(R.id.sucess);

        okbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }*/


/*
public static void sucessButtonBhupi(Context context,String message)
    {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.sucess_pop_ups);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        Button okbutton = (Button) dialog.findViewById(R.id.sucess);
        okbutton.setText(context.getString(R.string.ok));
        TextView textView = (TextView) dialog.findViewById(R.id.message);
        textView.setText(message);

        okbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
*/

    /*public static void errorButton(Context context,String nmessage)
    {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.errorpopups);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        TextView message =(TextView)dialog.findViewById(R.id.message);
        message.setText(nmessage);
        Button error = (Button) dialog.findViewById(R.id.error);
        error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
*/
 /* public static void errorButtonBhupi(Context context,String MSZ)
    {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.errorpopups);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        Button error = (Button) dialog.findViewById(R.id.error);
        TextView message = (TextView) dialog.findViewById(R.id.message);
        message.setText(MSZ);
        error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }*/


/*public static void sucessButtonupload(Context context)
    {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.sucessupload);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        Button okbutton = (Button) dialog.findViewById(R.id.sucess);

        okbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }*/



    @SuppressLint("ResourceAsColor")
    public static void messageView(LinearLayout layout, String message)
    {
        Snackbar snackbar = Snackbar
                .make(layout, message, Snackbar.LENGTH_LONG);

        TextView tv = (TextView) snackbar.getView().findViewById(android.support.design.R.id.snackbar_text);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        } else {
            tv.setGravity(Gravity.CENTER_HORIZONTAL);
        }
        //tv.setTextColor(R.color.lightgreen);
        snackbar.show();
    }


    @SuppressLint("ResourceAsColor")
    public static void messageViewRe(RelativeLayout layout, String message)
    {
        Snackbar snackbar = Snackbar
                .make(layout, message, Snackbar.LENGTH_LONG);

        TextView tv = (TextView) snackbar.getView().findViewById(android.support.design.R.id.snackbar_text);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        } else {
            tv.setGravity(Gravity.CENTER_HORIZONTAL);
        }
        //tv.setTextColor(R.color.lightgreen);
        snackbar.show();
    }

    @SuppressLint("ResourceAsColor")
    public static void messagepopups(View v, String message) {

        Snackbar snackbar = Snackbar
                .make(v, message, Snackbar.LENGTH_LONG);

        TextView tv = (TextView) snackbar.getView().findViewById(android.support.design.R.id.snackbar_text);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        } else {
            tv.setGravity(Gravity.CENTER_HORIZONTAL);
        }
        //tv.setTextColor(R.color.lightgreen);
        snackbar.show();
    }





    public static void hideKeyboard(Activity activity) {
        InputMethodManager inputMethodManager =
                (InputMethodManager) activity.getSystemService(
                        Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(
                activity.getCurrentFocus().getWindowToken(), 0);
    }
    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager
                = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
    public static int messageCounterArb(String data)
    {
        int counter=0;
        if(data.length()==0)
            counter=0;
        else if(data.length()>0 && data.length()<=70)
            counter=1;
        else if(data.length()>70 && data.length()<=134)
            counter=2;
        else if(data.length()>134 && data.length()<=201)
            counter=3;
        else if(data.length()>201 && data.length()<=268)
            counter=4;
        else if(data.length()>268 && data.length()<=335)
            counter=5;
        else if(data.length()>335 && data.length()<=402)
            counter=6;
        else if(data.length()>402 && data.length()<=469)
            counter=7;
        else if(data.length()>469 && data.length()<=536)
            counter=8;
        else if(data.length()>536 && data.length()<=603)
            counter=9;
        else if(data.length()>603 && data.length()<=670)
            counter=10;

        else if(data.length()>670 && data.length()<=737)
            counter=11;
        else if(data.length()>737 && data.length()<=804)
            counter=12;
        else if(data.length()>804 && data.length()<=871)
            counter=13;
        else if(data.length()>871 && data.length()<=938)
            counter=14;
        else if(data.length()>938 && data.length()<=1005)
            counter=15;
        else if(data.length()>1005 && data.length()<=1072)
            counter=16;
        else if(data.length()>1072 && data.length()<=1139)
            counter=17;
        else if(data.length()>1139 && data.length()<=1206)
            counter=18;
        else if(data.length()>1206 && data.length()<=1273)
            counter=19;
        else if(data.length()>1273 && data.length()<=1340)
            counter=20;

        else if(data.length()>1340 && data.length()<=1407)
            counter=21;
        else if(data.length()>1407 && data.length()<=1474)
            counter=22;
        else if(data.length()>1474 && data.length()<=1541)
            counter=23;
        else if(data.length()>1541 && data.length()<=1608)
            counter=24;
        else if(data.length()>1608 && data.length()<=1675)
            counter=25;
        else if(data.length()>1675 && data.length()<=1742)
            counter=26;
        else if(data.length()>1742 && data.length()<=1809)
            counter=27;
        else if(data.length()>1809 && data.length()<=1876)
            counter = 28;
        else if(data.length()>1876 && data.length()<=1943)
            counter = 29;
        else if(data.length()>1943 && data.length()<=2010)
            counter = 30;
        else
            counter = 31;
        return counter;
    }



    public static int messageCounterArbNew(int data)
    {
        int counter=0;
        if(data ==0)
            counter=0;
        else if(data >0 && data <=70)
            counter=1;
        else if(data >70 && data <=134)
            counter=2;
        else if(data >134 && data <=201)
            counter=3;
        else if(data >201 && data <=268)
            counter=4;
        else if(data >268 && data <=335)
            counter=5;
        else if(data >335 && data <=402)
            counter=6;
        else if(data >402 && data <=469)
            counter=7;
        else if(data >469 && data <=536)
            counter=8;
        else if(data >536 && data <=603)
            counter=9;
        else if(data >603 && data <=670)
            counter=10;

        else if(data >670 && data <=737)
            counter=11;
        else if(data >737 && data <=804)
            counter=12;
        else if(data >804 && data <=871)
            counter=13;
        else if(data >871 && data <=938)
            counter=14;
        else if(data >938 && data <=1005)
            counter=15;
        else if(data >1005 && data <=1072)
            counter=16;
        else if(data >1072 && data <=1139)
            counter=17;
        else if(data >1139 && data <=1206)
            counter=18;
        else if(data >1206 && data <=1273)
            counter=19;
        else if(data >1273 && data <=1340)
            counter=20;

        else if(data >1340 && data <=1407)
            counter=21;
        else if(data >1407 && data <=1474)
            counter=22;
        else if(data >1474 && data <=1541)
            counter=23;
        else if(data >1541 && data <=1608)
            counter=24;
        else if(data >1608 && data <=1675)
            counter=25;
        else if(data >1675 && data <=1742)
            counter=26;
        else if(data >1742 && data <=1809)
            counter=27;
        else if(data >1809 && data <=1876)
            counter = 28;
        else if(data >1876 && data <=1943)
            counter = 29;
        else if(data >1943 && data<=2010)
            counter = 30;
        else
            counter = 31;
        return counter;
    }

    public static int messageCounterEng(String data)
    {
        int counter=0;
        if(data.length()==0)
            counter=0;
        else if(data.length()>0 && data.length()<=160)
            counter=1;
        else if(data.length()>160 && data.length()<=306)
            counter=2;
        else if(data.length()>306 && data.length()<=459)
            counter=3;
        else if(data.length()>459 && data.length()<=612)
            counter=4;
        else if(data.length()>612 && data.length()<=765)
            counter=5;
        else if(data.length()>765 && data.length()<=918)
            counter=6;
        else if(data.length()>918 && data.length()<=1071)
            counter=7;
        else if(data.length()>1071 && data.length()<=1224)
            counter=8;
        else if(data.length()>1224 && data.length()<=1377)
            counter=9;
        else if(data.length()>1377 && data.length()<=1530)
            counter=10;

        else if(data.length()>1530 && data.length()<=1683)
            counter=11;
        else if(data.length()>1683 && data.length()<=1836)
            counter=12;
        else if(data.length()>1836 && data.length()<=1990)
            counter=13;
        else
            counter=14;

        return counter;
    }

    public static int Linecount(String s)
    {
        int c = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='\n')
                c++;
        }
        return c;
    }

    public static int messageCounterEngNew(int data)
    {
        int counter=0;


        if(data==0)
            counter=0;
        else if(data>0 && data <=160)
            counter=1;
        else if(data >160 && data <=306)
            counter=2;
        else if(data >306 && data <=459)
            counter=3;
        else if(data >459 && data <=612)
            counter=4;
        else if(data >612 && data <=765)
            counter=5;
        else if(data >765 && data <=918)
            counter=6;
        else if(data >918 && data <=1071)
            counter=7;
        else if(data >1071 && data <=1224)
            counter=8;
        else if(data >1224 && data <=1377)
            counter=9;
        else if(data >1377 && data <=1530)
            counter=10;

        else if(data >1530 && data <=1683)
            counter=11;
        else if(data >1683 && data <=1836)
            counter=12;
        else if(data >1836 && data <=1990)
            counter=13;
        else
            counter=14;

        return counter;
    }

    public static boolean getArbStatus(String s){
        boolean arabicStatus = false;
        String str  = "دجحخهعغفقثصضطكمنتالبيسشظزوةىلارؤءئإلإألأآلآ";
        for(int i = 0;i<s.length();i++){
            if(str.contains(String.valueOf(s.charAt(i))))
            {
                arabicStatus = true;
                break;
            }

        }
        return arabicStatus;
    }

/*public static void sigleButtonSuccess(String msg,Context context)
    {
        // custom dialog
        Log.e("TestBhupi=>","Single");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.sucess_pop_ups);
        Button okbutton     = (Button) dialog.findViewById(R.id.sucess);
        TextView msz        = (TextView) dialog.findViewById(R.id.message);
        msz.setText(msg);
        // if button is clicked, close the custom dialog
        okbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }*/


}


