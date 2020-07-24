package com.exampleapp.fooddeliveryapp.Callback;

import com.exampleapp.fooddeliveryapp.Model.OrderModel;

public interface ILoadTimeFromFirebaseListener {
    void onLoadTimeSuccess(OrderModel order, long estimateTimeInMs);
    void onLoadTimeFailed(String message);
}
