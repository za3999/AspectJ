package com.example.za399.testapplication.aspectj;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class LogAspect {

    @Pointcut("execution(@com.example.za399.testapplication.aspectj.DebugLog * *(..))")
    public void method() {
    }

    @Around("method()")
    public Object aroundPoint(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();
        Log.d("caifu", "aroundPoint className:" + className + ",methodName:" + methodName);
        Object result = joinPoint.proceed();
        return result;
    }

    @Before("method()")
    public void beforePoint(JoinPoint joinPoint) {
        if (joinPoint != null) {
            MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
            String className = methodSignature.getDeclaringType().getSimpleName();
            String methodName = methodSignature.getName();
            Log.d("caifu", "befortPoint className:" + className + ",methodName:" + methodName);
        } else {
            Log.d("caifu", "befortPoint joinPoint is null");
        }
    }

    @After("method()")
    public void afterPoint(JoinPoint joinPoint) {
        if (joinPoint != null) {
            MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
            String className = methodSignature.getDeclaringType().getSimpleName();
            String methodName = methodSignature.getName();
            Log.d("caifu", "afterPoint className:" + className + ",methodName:" + methodName);
        } else {
            Log.d("caifu", "afterPoint joinPoint is null");
        }
    }

    @AfterReturning("method()")
    public void afterReturning(JoinPoint joinPoint) {
        if (joinPoint != null) {
            MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
            String className = methodSignature.getDeclaringType().getSimpleName();
            String methodName = methodSignature.getName();
            Log.d("caifu", "afterReturning className:" + className + ",methodName:" + methodName);
        } else {
            Log.d("caifu", "afterReturning joinPoint is null");
        }
    }
}
