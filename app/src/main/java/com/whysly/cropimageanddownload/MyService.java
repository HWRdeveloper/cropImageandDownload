package com.whysly.cropimageanddownload;


import com.google.gson.JsonObject;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;

public interface MyService {






    @Multipart
    @PATCH("me")
    Call<JsonObject> uploadImage(@Header("Authorization") String value, @Part MultipartBody.Part profile_img);




}