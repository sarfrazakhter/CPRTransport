package com.cps.cprtransport.utils;

/**
 * Created by Vikas on 11/1/2016.
 */

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;


public class DataRepository {

    public static DataRepository dataRepository;



	/*private DataRepository(){

		//Do Nothing
	}*/

    public static DataRepository getInstance(){

        if(dataRepository == null){

            dataRepository = new DataRepository();
        }
        return dataRepository;
    }

    /********************Session ID*********************************/
    public void putDeviceSessionInPref(Context context, String sessionID){
        SharedPreferences pref = context.getSharedPreferences("PREF_SID", Context.MODE_PRIVATE);
        Editor editor = pref.edit();

        editor.putString("SESSIONID", sessionID);
        editor.commit();
    }

    public String getSessionId(Context context){
        SharedPreferences prefs = context.getSharedPreferences("PREF_SID", Context.MODE_PRIVATE);

        String id = prefs.getString("SESSIONID", null);
        return id;
    }

    public void clearSessionId(Context context){

        Editor editor = context.getSharedPreferences("PREF_SID", Context.MODE_PRIVATE).edit();
        editor.clear();
        editor.commit();

    }

    //*********************falg********************************************

    public void putFlagValueInPref(Context context, Integer n){
        SharedPreferences pref = context.getSharedPreferences("PREF_FLAG", Context.MODE_PRIVATE);
        Editor editor = pref.edit();
        String p = Integer.toString(n);
        editor.putString("FLAG", p);
        editor.commit();
    }

    public String getFlag(Context context){
        SharedPreferences prefs = context.getSharedPreferences("PREF_FLAG", Context.MODE_PRIVATE);

        String id = prefs.getString("FLAG", null);
        return id;
    }

    public void clearFlag(Context context){

        Editor editor = context.getSharedPreferences("PREF_FLAG", Context.MODE_PRIVATE).edit();
        editor.clear();
        editor.commit();

    }


    /*************************Panic Data***********************************/

    public void putPanicIDInPref(Context context, String panicID){
        SharedPreferences pref = context.getSharedPreferences("PREF_PANICID", Context.MODE_PRIVATE);
        Editor editor = pref.edit();

        editor.putString("panicID", panicID);
        editor.commit();
    }

    public String getpanicID(Context context){
        SharedPreferences prefs = context.getSharedPreferences("PREF_PANICID", Context.MODE_PRIVATE);

        String id = prefs.getString("panicID", null);
        return id;
    }

    public void clearpanicID(Context context){

        Editor editor = context.getSharedPreferences("PREF_PANICID", Context.MODE_PRIVATE).edit();
        editor.clear();
        editor.commit();

    }




   // ************************Panic Data**********************************

    public void putPanicAddressInPref(Context context, String address){
        SharedPreferences pref = context.getSharedPreferences("PREF_PANICADD", Context.MODE_PRIVATE);
        Editor editor = pref.edit();

        editor.putString("address",address);
        editor.commit();
    }

    public String getpanicADD(Context context){
        SharedPreferences prefs = context.getSharedPreferences("PREF_PANICADD", Context.MODE_PRIVATE);

        String id = prefs.getString("address", null);
        return id;
    }

    public void clearpanicADD(Context context){

        Editor editor = context.getSharedPreferences("PREF_PANICADD", Context.MODE_PRIVATE).edit();
        editor.clear();
        editor.commit();

    }






	public void putUserIDInPref(Context context, String userID){
		SharedPreferences pref = context.getSharedPreferences("PREF_USERID", Context.MODE_PRIVATE);
		Editor editor = pref.edit();

		editor.putString("userID", userID);
		editor.commit();
	}

	public String getUserID(Context context){
		SharedPreferences prefs = context.getSharedPreferences("PREF_USERID", Context.MODE_PRIVATE);

		String id = prefs.getString("userID", null);
		return id;
	}

	public void clearUserID(Context context){

		Editor editor = context.getSharedPreferences("PREF_USERID", Context.MODE_PRIVATE).edit();
		editor.clear();
		editor.commit();

	}

	/************************************************************//*

	public void putLatitudeInPref(Context context,String latitude){
		SharedPreferences pref = context.getSharedPreferences("PREF_SID", Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = pref.edit();

		editor.putString("latitude", latitude);
		editor.commit();
	}

	public String getLatitude(Context context){
		SharedPreferences prefs = context.getSharedPreferences("PREF_SID",Context.MODE_PRIVATE);

		String id = prefs.getString("latitude", null);
		return id;
	}

	public void clearLatitude(Context context){

		Editor editor = context.getSharedPreferences("PREF_SID", Context.MODE_PRIVATE).edit();
		editor.clear();
		editor.commit();

	}

	*//*********************************************************//*

	public void putLongitudeInPref(Context context,String longitude){
		SharedPreferences pref = context.getSharedPreferences("PREF_SID", Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = pref.edit();

		editor.putString("longitude", longitude);
		editor.commit();
	}

	public String getLongitude(Context context){
		SharedPreferences prefs = context.getSharedPreferences("PREF_SID",Context.MODE_PRIVATE);

		String id = prefs.getString("longitude", null);
		return id;
	}

	public void clearLongitude(Context context){

		Editor editor = context.getSharedPreferences("PREF_SID", Context.MODE_PRIVATE).edit();
		editor.clear();
		editor.commit();

	}
	*/
   //...............................profile data update..........................................................................//

    public void putGenderInPref(Context context, String gender){
        SharedPreferences pref = context.getSharedPreferences("PREF_Gender", Context.MODE_PRIVATE);
        Editor editor = pref.edit();

        editor.putString("gender",gender);
        editor.commit();
    }

    public String getGender(Context context){
        SharedPreferences prefs = context.getSharedPreferences("PREF_Gender", Context.MODE_PRIVATE);

        String id = prefs.getString("gender", null);
        return id;
    }

    public void clearGender(Context context){

        Editor editor = context.getSharedPreferences("PREF_Gender", Context.MODE_PRIVATE).edit();
        editor.clear();
        editor.commit();

    }

    public void putMobileNumInPref(Context context, String mobileNum){
        SharedPreferences pref = context.getSharedPreferences("PREF_MOBILE", Context.MODE_PRIVATE);
        Editor editor = pref.edit();
        editor.putString("MobileNumber", mobileNum);
        editor.commit();
    }

    public String getMobileNum(Context context){
        SharedPreferences prefs = context.getSharedPreferences("PREF_MOBILE", Context.MODE_PRIVATE);
        String id = prefs.getString("MobileNumber", null);
        return id;
    }

    public void putUserNameInPref(Context context, String userName) {
        SharedPreferences pref = context.getSharedPreferences("PREF_NAME", Context.MODE_PRIVATE);
        Editor editor = pref.edit();
        editor.putString("UserName", userName);
        editor.commit();
    }

    public String getUserName(Context context){
        SharedPreferences prefs = context.getSharedPreferences("PREF_NAME", Context.MODE_PRIVATE);
        String name = prefs.getString("UserName", null);
        return name;
    }

    public void putEmailIdInPref(Context context, String emailAddress) {
        SharedPreferences pref = context.getSharedPreferences("PREF_EMAIL", Context.MODE_PRIVATE);
        Editor editor = pref.edit();
        editor.putString("PREF_EMAIL", emailAddress);
        editor.commit();
    }

    public String getEmail(Context context){
        SharedPreferences prefs = context.getSharedPreferences("PREF_EMAIL", Context.MODE_PRIVATE);
        String email = prefs.getString("PREF_EMAIL", null);
        return email;
    }

    //Entry Panic Flaf Group vreate..........................//

    public void putPanicEntryData(Context context, String flag) {
        SharedPreferences pref = context.getSharedPreferences("PREF_NAME_PANIC", Context.MODE_PRIVATE);
        Editor editor = pref.edit();
        editor.putString("Panic Flag", flag);
        editor.commit();
    }


    public String getPanicFlag(Context context){
        SharedPreferences prefs = context.getSharedPreferences("PREF_NAME_PANIC", Context.MODE_PRIVATE);
        String panicFlag = prefs.getString("Panic Flag", null);
        return panicFlag;
    }

    public void putConnectionString(Context context, String b) {
        SharedPreferences pref = context.getSharedPreferences("PREF_NAME_CONNECTION", Context.MODE_PRIVATE);
        Editor editor = pref.edit();
        editor.putString("Connection Flag", b);
        editor.commit();
    }

    public String getConnectionString(Context context){
        SharedPreferences prefs = context.getSharedPreferences("PREF_NAME_CONNECTION", Context.MODE_PRIVATE);
        String connectionFlag = prefs.getString("Connection Flag", null);
        return connectionFlag;
    }

    public void clearConnectionFlag(Context context) {
        Editor editor = context.getSharedPreferences("PREF_NAME_CONNECTION", Context.MODE_PRIVATE).edit();
        editor.clear();
        editor.commit();
    }

    public void putnFlagValueInPref(Context context, int n) {
        SharedPreferences pref = context.getSharedPreferences("PREF_NAME_FLAGN", Context.MODE_PRIVATE);
        Editor editor = pref.edit();
        String p = Integer.toString(n);
        editor.putString("FLAGN", p);
        editor.commit();
    }

    public String getnFlagValueInPref(Context context){
        SharedPreferences prefs = context.getSharedPreferences("PREF_NAME_FLAGN", Context.MODE_PRIVATE);
        String connectionFlag = prefs.getString("FLAGN", null);
        return connectionFlag;
    }

    public void putselectedpage(Context context, String selection) {
        SharedPreferences pref = context.getSharedPreferences("PREF_SELECTOR", Context.MODE_PRIVATE);
        Editor editor = pref.edit();
        editor.putString("Selection Flag",selection);
        editor.commit();
    }

    public String getselectedpage(Context context){
        SharedPreferences prefs = context.getSharedPreferences("PREF_SELECTOR", Context.MODE_PRIVATE);
        String connectionFlag = prefs.getString("Selection Flag", null);
        return connectionFlag;
    }

    public void clearselectedpage(Context context) {
        Editor editor = context.getSharedPreferences("PREF_SELECTOR", Context.MODE_PRIVATE).edit();
        editor.clear();
        editor.commit();
    }

    public void putkillprocessString(Context context, String kill) {
        SharedPreferences pref = context.getSharedPreferences("PREF_KILL", Context.MODE_PRIVATE);
        Editor editor = pref.edit();
        editor.putString("Selection Flag",kill);
        editor.commit();
    }

    public String getkillappString(Context context){
        SharedPreferences prefs = context.getSharedPreferences("PREF_KILL", Context.MODE_PRIVATE);
        String connectionFlag = prefs.getString("Selection Flag", null);
        return connectionFlag;
    }

    public void clearkillappString(Context context) {
        Editor editor = context.getSharedPreferences("PREF_KILL", Context.MODE_PRIVATE).edit();
        editor.clear();
        editor.commit();
    }

    public void putbitmap(Context context, String encodedImage) {

        SharedPreferences pref = context.getSharedPreferences("PREF_BITMAP", Context.MODE_PRIVATE);
        Editor editor = pref.edit();
        editor.putString("Selection Flag",encodedImage);
        editor.commit();
    }

    public String getbitmap(Context context){
        SharedPreferences prefs = context.getSharedPreferences("PREF_BITMAP", Context.MODE_PRIVATE);
        String bitmapFlag = prefs.getString("Selection Flag", null);
        return bitmapFlag;
    }

    public void clearBitmap(Context context) {

        Editor editor = context.getSharedPreferences("PREF_BITMAP", Context.MODE_PRIVATE).edit();
        editor.clear();
        editor.commit();
    }

    public void putFirstLoginResult(Context context, String firstLogin) {
        SharedPreferences pref = context.getSharedPreferences("PREF_LOGIN_FIRST", Context.MODE_PRIVATE);
        Editor editor = pref.edit();
        editor.putString("First Login Flag",firstLogin);
        editor.commit();
    }

    public String getFirstLoginFlag(Context context){
        SharedPreferences prefs = context.getSharedPreferences("PREF_LOGIN_FIRST", Context.MODE_PRIVATE);
        String bitmapFlag = prefs.getString("First Login Flag", null);
        return bitmapFlag;
    }

    public void clearFirstLoginFlag(Context context) {

        Editor editor = context.getSharedPreferences("PREF_LOGIN_FIRST", Context.MODE_PRIVATE).edit();
        editor.clear();
        editor.commit();
    }

    /********************Session ID*********************************/
    public void putFcmTokenInPref(Context context, String FcmToken){
        SharedPreferences pref = context.getSharedPreferences("PREF_TOKEN", Context.MODE_PRIVATE);
        Editor editor = pref.edit();

        editor.putString("FCMTOKEN", FcmToken);
        editor.commit();
    }

    public String getFcmToken(Context context){
        SharedPreferences prefs = context.getSharedPreferences("PREF_TOKEN", Context.MODE_PRIVATE);

        String id = prefs.getString("FCMTOKEN", null);
        return id;
    }
}
