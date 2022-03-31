package com.identitycard.demo.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger logger = LogManager.getLogger(LoggingAspect.class);

    @Pointcut("execution(* com.identitycard.demo.service.*.*(..))")
    public void pointCut(){};


    @Around("pointCut()")
    public Object logStopWatch(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        logger.info("Executing "+joinPoint);
        try {
            stopWatch.start();
            Object obj = joinPoint.proceed();
            stopWatch.stop();
            logger.info("Complete  "+joinPoint+" successfully!!!");
            logger.info("Execution time of "+joinPoint+" is "+stopWatch.getTotalTimeMillis()+" ms.");
            return obj;
        }catch (Exception ex){
            logger.error(ex.getMessage());
            return ex;
        }
    }
}
