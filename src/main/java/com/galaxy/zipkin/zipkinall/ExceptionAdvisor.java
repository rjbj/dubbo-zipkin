package com.galaxy.zipkin.zipkinall;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdvisor{
    private Logger logger = LoggerFactory.getLogger(ExceptionAdvisor.class);
    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler(Exception e) throws Exception {
       logger.error(e.getMessage(),e);
    }
}
