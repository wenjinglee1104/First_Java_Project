package com.miaoshaproject.error;

public interface CommonError {    //接口
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);//方法


}
