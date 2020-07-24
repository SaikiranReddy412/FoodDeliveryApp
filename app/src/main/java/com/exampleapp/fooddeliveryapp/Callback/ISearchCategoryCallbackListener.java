package com.exampleapp.fooddeliveryapp.Callback;

import com.exampleapp.fooddeliveryapp.Database.CartItem;
import com.exampleapp.fooddeliveryapp.Model.CategoryModel;
import com.exampleapp.fooddeliveryapp.Model.FoodModel;

public interface ISearchCategoryCallbackListener {
    void onSearchCategoryFound(CategoryModel categoryModel,CartItem cartItem);
    void onSearchCategoryNotFound(String message);
}
