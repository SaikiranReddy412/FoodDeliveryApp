package com.exampleapp.fooddeliveryapp.Callback;

import com.exampleapp.fooddeliveryapp.Model.BestDealModel;
import com.exampleapp.fooddeliveryapp.Model.CategoryModel;

import java.util.List;

public interface ICategoryCallbackListener {
    void onCategoryLoadSuccess(List<CategoryModel> categoryModelList);
    void onCategoryLoadFailed(String message);
}
