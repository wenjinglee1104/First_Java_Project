package com.miaoshaproject.error;

public class BusinessException extends  Exception implements CommonError{

    private  CommonError commonError;

    //直接接收传参，用于构建异常
    public  BusinessException(CommonError commonError){
        super();
        this.commonError=commonError;
    }

    //接收自定义errMsg的方法构造异常
    public BusinessException(CommonError commonError,String errMsg){
        super();
        this.commonError=commonError;
        this.commonError.setErrMsg(errMsg);
    }
    @Override
    public int getErrCode() {
        return this.commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
            return this;
    }
}
