package com.example.handle;

import com.example.domain.Result;
import com.example.exception.GirlException;
import com.example.utils.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Siwde on 2017/4/11.
 */
@ControllerAdvice//配合异常捕获使用
public class HandleException {

    private final static Logger logger = LoggerFactory.getLogger(HandleException.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody//因为异常返回不是json  所以这里用ResponBody
    public Result handleException(Exception e){
        if(e instanceof GirlException){
            GirlException girlException = (GirlException) e;
            return ResultUtils.error(girlException.getCode(), e.getMessage());
        }else{
            logger.error("【系统异常】{}",e);
            return ResultUtils.error(-1,"虚拟机运行期错误！");
        }

    }
}
