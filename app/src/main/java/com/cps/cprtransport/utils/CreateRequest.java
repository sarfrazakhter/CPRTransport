package com.cps.cprtransport.utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CreateRequest {

    public JSONObject createLoginRequest(String phone, String password) throws JSONException {

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("email", phone);
        jsonObject.put("password", password);
        return jsonObject;

    }
}
