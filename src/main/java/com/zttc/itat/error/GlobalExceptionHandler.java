package com.zttc.itat.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2018-12-17 下午 4:12
 */
@ControllerAdvice(basePackages = "com.zttc.itat")
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> errorResult(){
        Map<String,Object> errorResultMap = new HashMap<String,Object>();
        errorResultMap.put("errorCode","500");
        errorResultMap.put("errorMsg","全局捕获异常之系统异常");
        return errorResultMap;
    }
}
