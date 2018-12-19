package com.zttc.itat.aop;
import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
/**
 * @version 1.0
 * @Description: aop切面类，负责扫描指定包范围下的所有类中的指定方法
 * @author: ChenRuiQing.
 * Create Time:  2018-12-17 下午 5:23
 */
@Aspect
@Component
@Slf4j
public class WebLogAspect {

    @Pointcut("execution(public * com.zttc.itat..*.*(..))") //扫描指定包下的包含所有子包下的所有类的public方法
    public void webLog() {}

    /**
     * aop前置通知拦截请求参数
     * @param joinPoint
     */
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint){
        //转换为原生servlet获取url及参数
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        log.info("URL : " + request.getRequestURL().toString());
        log.info("HTTP_METHOD : " + request.getMethod());
        log.info("IP : " + request.getRemoteAddr());
        Enumeration<String> enu = request.getParameterNames();
        while (enu.hasMoreElements()) {
            String name = (String) enu.nextElement();
            log.info("name:{},value:{}", name, request.getParameter(name));
        }
    }


    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        log.info("RESPONSE : " + ret);
    }
}
/**
匹配com.sid.controller.TestAopController类下所有public方法
@Pointcut("execution(public * com.sid.controller.TestAopController.*(..))")
args() 用于匹配当前执行的方法传入的参数为指定类型的执行方法；
target()  用于匹配当前目标对象类型的执行方法；注意是目标对象的类型匹配，这样就不包括引入接口也类型匹配；
within()  用于匹配指定类型内的方法执行

例如：
// 匹配指定包中的所有的方法, 但不包括子包
within(com.sid.controller.*)
// 匹配指定包中的所有的方法, 包括子包
within(com.sid.controller..*)
// 匹配当前包中的指定类中的方法
within(TestAopController)
// 匹配一个接口的所有实现类中的实现的方法
within(UserMapper+)
 */