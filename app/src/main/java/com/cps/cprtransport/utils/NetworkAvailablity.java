package com.cps.cprtransport.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;

public class NetworkAvailablity {

    public static boolean isNetworkAvailable(Context ctx) {
        //ConnectivityManager connMgr = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
        ConnectivityManager connMgr = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] arrInfo = connMgr.getAllNetworkInfo();


        for(int i=0;i<=arrInfo.length-1; i++){
            String strInfo = arrInfo[i].toString();

        }

        if (connMgr.getNetworkInfo(ConnectivityManager.TYPE_WIFI).isConnected()|| connMgr.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).isConnected()) {
            return true;
        }

        return false;
    }

    public static boolean isAirplaneModeOn(Context context) {

        return Settings.System.getInt(context.getContentResolver(),
                Settings.System.AIRPLANE_MODE_ON, 0) != 0;

    }


}