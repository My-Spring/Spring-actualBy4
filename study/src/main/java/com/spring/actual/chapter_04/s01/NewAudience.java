package com.spring.actual.chapter_04.s01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Method;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/20
 */
@Aspect
public class NewAudience {

    //定义切点
    @Pointcut("execution(* com.spring.actual.chapter_04.s01.Performance.perform(..))")
    public void performance()
    {

    }

    //** 表示返回任意类型  (..)匹配任意参数
    @Before("performance()")
    public void beforePerform()
    {
        System.out.println("准备演出了，观众们开始入座...");
    }

    @Before("performance()")
    public void beforePerform2()
    {
        System.out.println("观众入座完毕，手机调静音..");
    }

    //成功调用之后执行
    @AfterReturning("performance()")
    public void afterPerformSuccess()
    {
        System.out.println("演出非常成功，演员致谢，观众鼓掌...");
    }

    //调用失败之后执行
    @AfterThrowing("performance()")
    public void afterPerformFail()
    {
        System.out.println("演出失败，演员致歉，观众理解...");
    }

    //不论演出成功或者失败，演出之后执行
    //@After("performance()")
    public void afterPerform()
    {
        System.out.printf("演出结束了，观众离场...");
    }

    @Around("performance()")
    public void roundPerform(ProceedingJoinPoint joinPoint)
    {
        System.out.printf("艺术厅正在演出...");
        try
        {
            //如果不调这个方法的话，那么你的通知实际上会阻塞对被通知方法的调用
            //joinPoint.proceed();
        } catch (Throwable throwable)
        {
            throwable.printStackTrace();
        }
    }
}
