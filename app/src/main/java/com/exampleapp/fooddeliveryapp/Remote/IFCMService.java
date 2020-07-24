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
            "Authorization:key=AAAAsRZ86oU:APA91bGRU7n8WOmElm0jCKzspf9Rd2YknBUcmBBHfKbqGjtMuv_OFMneNrJxZkvy5L41a4ZTd7dDBY7lAoRT0kTC9FXnflzzktW9SAq5wilypVshJ-6N8oatS9GxscPIIsA8FY_sDX79"
    })
    @POST("fcm/send")
    Observable<FCMResponse> sendNotification(@Body FCMSendData body);
}
