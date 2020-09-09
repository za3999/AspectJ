package com.example.za399.testapplication.aspectj;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackPointAspect {

    @Pointcut("execution(* android.app.Activity+.onCreate(..))")
    public void activityOnCreatePointcut() {
    }

    @Pointcut("execution(* android.app.Activity+.onDestroy(..))")
    public void activityOnDestroyPointcut() {
    }

    @Pointcut("execution(* *(..))")
    public void allMethod() {
    }
//
//    @Around("activityOnCreatePointcut() || fragmentOnCreatePointcut() || fragmentV4OnCreatePointcut()")
//    public void aroundJoinPageOpenPoint(final ProceedingJoinPoint joinPoint) throws Throwable {
//        Object target = joinPoint.getTarget();
//        String className = target.getClass().getName();
//        long time = System.currentTimeMillis();
//        joinPoint.proceed();
//        Log.d("caifu", "cost time:" + className + ":" + (System.currentTimeMillis() - time));
//    }

    @Around("allMethod()")
    public void aroundAllMethod(final ProceedingJoinPoint joinPoint) throws Throwable {
        long time = System.currentTimeMillis();
        joinPoint.proceed();
        Log.d("caifu", "cost time:" + joinPoint.getSignature() + ":" + (System.currentTimeMillis() - time));
    }

}
