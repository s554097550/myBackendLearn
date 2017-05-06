package com.example.exception;

import com.example.enums.ResultEnum;

/**
 * Created by Siwde on 2017/4/11.
 */
public class GirlException extends RuntimeException{

    //错误码code
    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
