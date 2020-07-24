package com.exampleapp.fooddeliveryapp.ui.foodlist;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.exampleapp.fooddeliveryapp.Common.Common;
import com.exampleapp.fooddeliveryapp.Model.FoodModel;

import java.util.List;

public class FoodListViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<List<FoodModel>> mutableLiveDataFoodList;

    public FoodListViewModel() {

    }

    public MutableLiveData<List<FoodModel>> getMutableLiveDataFoodList() {
        if (mutableLiveDataFoodList == null)
            mutableLiveDataFoodList = new MutableLiveData<>();
        mutableLiveDataFoodList.setValue(Common.categorySelected.getFoods());

        return mutableLiveDataFoodList;
    }
}
