package com.example.enums;

/**
 * Created by Siwde on 2017/4/11.
 */
public enum ResultEnum {
    //枚举可以自定义参数
    UNKONW_ERROR(1,"未知错误"),
    SUCCESS(0,"成功"),
    S_SCHOOL(100,"小学"),
    M_SCHOOL(101,"中学")
    ;
    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public Integer getCode() {
        return code;
    }

}
