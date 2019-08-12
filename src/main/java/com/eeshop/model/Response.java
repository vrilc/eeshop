package com.better517na.fangyuan.model;

import java.io.Serializable;

public class Response<T> implements Serializable{


    private static final long serialVersionUID = 5008039245025844693L;
    private T content;
    private int code;
    private String message;
    private long time; 

    
    public Response() {
        this.time=System.currentTimeMillis();
    }
    public Response(T content,int code,String message){
        this.content=content;
        this.time=System.currentTimeMillis();
        this.code=code;
        this.message = message;
    }
    public T getContent() {
    	return this.content;
    }
    public void setContent(T content) {
    	this.content = content;
    }
    public int getCode() {
    	return this.code;
    }
    public void setCode(int code) {
    	this.code = code;
    }
    public String getMessage() {
    	return this.message;
    }
    public void setMessage(String message) {
    	this.message = message;
    }
    public long getTime() {
    	return this.time;
    }
    public void setTime(long time) {
    	this.time = time;
    }
    
}