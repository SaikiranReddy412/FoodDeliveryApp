package com.exampleapp.fooddeliveryapp.Callback;

import com.exampleapp.fooddeliveryapp.Model.BestDealModel;
import com.exampleapp.fooddeliveryapp.Model.PopularCategoryModel;

import java.util.List;

public interface IBestDealCallbackListener {
    void onBestDealLoadSuccess(List<BestDealModel> bestDealModels);
    void onBestDealLoadFailed(String message);
}
