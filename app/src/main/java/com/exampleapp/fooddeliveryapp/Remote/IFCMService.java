package com.exampleapp.fooddeliveryapp.Remote;

import com.exampleapp.fooddeliveryapp.Model.FCMResponse;
import com.exampleapp.fooddeliveryapp.Model.FCMSendData;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key="
    })
    @POST("fcm/send")
    Observable<FCMResponse> sendNotification(@Body FCMSendData body);
}
