package com.exampleapp.fooddeliveryapp.Callback;

import com.exampleapp.fooddeliveryapp.Model.OrderModel;

import java.util.List;

public interface ILoadOrderCallbackListener {
    void onLoadOrderSuccess(List<OrderModel> orderList);
    void onLoadOrderFailed(String message);
}
