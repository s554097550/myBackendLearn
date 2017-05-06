package com.example.utils;

import com.example.domain.Result;

/**
 * Created by Siwde on 2017/4/11.
 */
public class ResultUtils {
    //发现有重复的代码，就把它提取出来
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
