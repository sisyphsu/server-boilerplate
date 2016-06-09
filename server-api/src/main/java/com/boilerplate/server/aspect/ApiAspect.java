package com.boilerplate.server.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Api切面，负责进入Api前参数校验和业务异常处理。
 * Created by sulin on 15/5/26.
 */
@Aspect
@Service
public class ApiAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiAspect.class);

    /**
     * 针对Service接口的public且返回值为BaseVO的方法添加切面处理, 将业务异常自动转换为code/msg。
     */
    @Around("execution(public * com.water.server.controller.*Controller.*(..))")
    public Object aroundController(ProceedingJoinPoint pjp) throws IllegalAccessException, InstantiationException {
        try {
            LOGGER.info("有请求来啦");
            return pjp.proceed(pjp.getArgs());
        } catch (Throwable throwable) {
            LOGGER.info("有请求错啦");
            return null;
        } finally {
            LOGGER.info("有请求完啦");
        }
    }

}
