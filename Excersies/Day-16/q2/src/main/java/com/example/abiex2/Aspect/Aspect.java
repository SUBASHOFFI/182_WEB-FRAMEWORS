package com.example.abiex1.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Configuration
@Aspect
public class Aspect {
 Logger logger=LoggerFactory.getLogger(Aspect.class);

    @Before(value="execution(* com.example.abiex1.controller.*.*(..)) ")
    public void beforeAdvice (JoinPoint joinpoint)
    {	
        logger.info("Inside Before Advice");
    }

    // @Around(value="execution(* com.example.logging.controller.*.*(..)) ")
    // public void aroundAdvice (JoinPoint joinpoint)
    // {	
   
    //     logger.info("Inside Around Advice");
    // }

     @Around(value = "execution(* com.example.abiex1.controller.*.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Before invoking method: {}", joinPoint.getSignature().getName());

        // Proceed with the original method execution
        Object result = joinPoint.proceed();

        logger.info("After invoking method: {}", joinPoint.getSignature().getName());

        return result;
    }
    @After(value="execution(* com.example.abiex2.service.*.*(..)) ")
    public void afterAdvice (JoinPoint joinpoint)
    {	
        logger.info("Inside After Advice");
    }
}

