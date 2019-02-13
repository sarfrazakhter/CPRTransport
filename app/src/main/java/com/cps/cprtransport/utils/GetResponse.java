package com.cps.cprtransport.utils;

import android.content.Context;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;


public class GetResponse {

    Context context;
    String JsonResponse = null;
    HttpURLConnection urlConnection = null;
    BufferedReader reader = null;

    public String postData(String url, JSONObject LSS) throws IOException, JSONException {

        String jResponse = null;


        DefaultHttpClient httpClient = new DefaultHttpClient();

        HttpPost httpPost = new HttpPost(url);

        try {

            StringEntity entity = new StringEntity(LSS.toString());

            entity.setContentType("application/json");

            httpPost.setEntity(entity);

            HttpResponse httpResponse = httpClient.execute(httpPost);

            HttpEntity httpEntity = httpResponse.getEntity();

            jResponse = EntityUtils.toString(httpEntity);

        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return jResponse;


    }



    /*public String getData(String url) throws IOException, JSONException {

        String jResponse = null;

        DefaultHttpClient httpClient = new DefaultHttpClient();

        HttpGet httpGet = new HttpGet(url);

        try {

            HttpResponse httpResponse = httpClient.execute(httpGet);

            HttpEntity httpEntity = httpResponse.getEntity();

            jResponse = EntityUtils.toString(httpEntity);

        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return jResponse;

    }*/

    /*private String getRealPathFromURI(Uri contentURI , Context context) {
        String result;
        Cursor cursor = context.getContentResolver().query(contentURI, null, null, null, null);
        if (cursor == null) { // Source is Dropbox or other similar local file path
            result = contentURI.getPath();
        } else {
            cursor.moveToFirst();
            int idx = cursor.getColumnIndex( MediaStore.Images.ImageColumns.DATA);
            result = cursor.getString(idx);
            cursor.close();
        }
        return result;
    }*/

    /*public String postMultipartDataLocation(String url, File imfile, Context c, String locationId) {
        // TODO Auto-generated method stub
        String jResponse = null;

        HttpClient client = new DefaultHttpClient();
        HttpPost postMethod = new HttpPost(url);

        File file = imfile;

        MultipartEntity entity = new MultipartEntity();

        FileBody contentFile = new FileBody(imfile);
        entity.addPart("file", contentFile);

        StringBody contentString = null;

        try {

            contentString = new StringBody(DataRepository.getInstance().getSessionId(c));

        } catch (UnsupportedEncodingException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        entity.addPart("deviceSession ",contentString);

        StringBody contentString_LocationId = null;

        try {

            contentString_LocationId = new StringBody(locationId);

        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        entity.addPart("locationId", contentString_LocationId);

        postMethod.setEntity(entity);
        HttpResponse httpResponse = null;

        try {
            httpResponse = client.execute(postMethod);
        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        HttpEntity httpEntity = httpResponse.getEntity();

        try {
            jResponse = EntityUtils.toString(httpEntity);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return jResponse;

    }

    public String postMultipartDataCircle(String url, File imfile, Context c, String circleId) {
        // TODO Auto-generated method stub
        String jResponse = null;

        HttpClient client = new DefaultHttpClient();
        HttpPost postMethod = new HttpPost(url);

        // File file = imfile;

        MultipartEntity entity = new MultipartEntity();

        FileBody contentFile = new FileBody(imfile);
        entity.addPart("file ", contentFile);

        StringBody contentString = null;
        try {
            contentString = new StringBody(DataRepository.getInstance().getSessionId(c));
        } catch (UnsupportedEncodingException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        entity.addPart("deviceSession ",contentString);

        StringBody contentString_CircleId = null;
        try {
            contentString_CircleId = new StringBody(circleId);
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        entity.addPart("circleId", contentString_CircleId);

        postMethod.setEntity(entity);
        HttpResponse httpResponse = null;
        try {
            httpResponse = client.execute(postMethod);
        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        HttpEntity httpEntity = httpResponse.getEntity();

        try {
            jResponse = EntityUtils.toString(httpEntity);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return jResponse;
    }

    public String postMultipartData(String url, File mCurrentPhoto, ProfileUpdate profileUpdate) throws IOException {

        String jResponse = null;

        HttpClient client = new DefaultHttpClient();
        HttpPost postMethod = new HttpPost(url);

        //File file = imfile;

        MultipartEntity entity = new MultipartEntity();

        FileBody contentFile = new FileBody(mCurrentPhoto);
        entity.addPart("file ",contentFile);

        StringBody contentString = new StringBody(DataRepository.getInstance().getSessionId(profileUpdate));
        entity.addPart("deviceSession ",contentString);

        postMethod.setEntity(entity);
        HttpResponse httpResponse  = client.execute(postMethod);

        HttpEntity httpEntity = httpResponse.getEntity();

        jResponse = EntityUtils.toString(httpEntity);


        return jResponse;
    }

    public String postMultipartDataPanic(String url, File imfile, String lat, String longi, String address, Context c) {
        // TODO Auto-generated method stub
        String jResponse = null;
        StringBody contentString = null;
        StringBody contentString_Latitude = null;
        StringBody contentString_Longitude = null;
        StringBody contentString_Address = null;
        HttpResponse httpResponse = null;

        HttpClient client = new DefaultHttpClient();
        HttpPost postMethod = new HttpPost(url);

        // File file = imfile;

        MultipartEntity entity = new MultipartEntity();

        FileBody contentFile = new FileBody(imfile);
        entity.addPart("file ", contentFile);

        try {

            contentString = new StringBody(DataRepository.getInstance().getSessionId(c));
            contentString_Latitude = new StringBody(lat);
            contentString_Longitude = new StringBody(longi);
            contentString_Address = new StringBody(address);

        } catch (UnsupportedEncodingException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        entity.addPart("deviceSession ",contentString);
        entity.addPart("latitude", contentString_Latitude);
        entity.addPart("longitude", contentString_Longitude);
        entity.addPart("address", contentString_Address);

        postMethod.setEntity(entity);

        try {

            httpResponse = client.execute(postMethod);
            HttpEntity httpEntity = httpResponse.getEntity();
            jResponse = EntityUtils.toString(httpEntity);

        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return jResponse;
    }*/
}

