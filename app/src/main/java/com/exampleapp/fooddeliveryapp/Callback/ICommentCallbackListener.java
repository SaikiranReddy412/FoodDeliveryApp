package com.exampleapp.fooddeliveryapp.Callback;

import com.exampleapp.fooddeliveryapp.Model.CommentModel;

import java.util.List;

public interface ICommentCallbackListener {

    void onCommentLoadSuccess(List<CommentModel> commentModels);
    void onCommentLoadFailed(String message);
}
