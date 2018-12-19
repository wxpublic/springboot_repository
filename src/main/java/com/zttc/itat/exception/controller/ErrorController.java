package com.zttc.itat.exception.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @version 1.0
 * @Description: 全局异常捕获测试类，参数为零的时候，爆出除数不能为零，
 *                 系统通过GlobalExceptionHandler类扫描到此异常并统一处理,如果参数正常则返回结算结果；
 * @author: ChenRuiQing.
 * @url： http://127.0.0.1:8080/getUser/1 or http://127.0.0.1:8080/getUser/0
 * Create Time:  2018-12-17 下午 4:09
 */
@RestController
public class ErrorController {
    @RequestMapping("/getUser/{i}")
    public String getUSer(@PathVariable("i") int i){
        int j = 10/i;
        return j+"";
    }

}
