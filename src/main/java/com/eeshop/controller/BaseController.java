package com.better517na.fangyuan.controller;

import com.better517na.fangyuan.model.Response;
import com.better517na.fangyuan.util.StatusCode;

public class BaseController {

    public <T> Response<T> toSuccess(T content){
        return new Response<T>(content, StatusCode.SUCCESS,"success");
    }

    public <T> Response<T> toFailure(T content,int code,String message){
        return new Response<T>(content, code, message);
    }
    public <T> Response<T> toFailure(T content,String message){
        return new Response<T>(content, StatusCode.FAILURE, message);
    }
    public <T> Response<T> toFailure(String message){
        return new Response<T>(null, StatusCode.FAILURE, message);
    }

}