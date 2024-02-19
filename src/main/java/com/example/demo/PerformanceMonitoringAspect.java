package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Aspect
public class PerformanceMonitoringAspect {

    @Around("execution(* *.countToN(..))")
    public Object monitorPerformance(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;

        String response =((ResponseEntity<String>) result).getBody()
        					+ ", executed in " 
        					+ executionTime 
        					+ " milliseconds";

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}