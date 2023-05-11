package org.example.service;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RS {
    OkHttpClient client = new OkHttpClient();
    public String run(String url){
        Request request = new Request.Builder().url(url).build();
        String message = null;
        try(Response response = client.newCall(request).execute()){
            System.out.println(response.code());
            if (response.isSuccessful()){
                message = response.body().string();
            }
        }catch (Exception e){
            message = e.getMessage();
        }
        return message;
    }
}