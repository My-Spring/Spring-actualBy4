package com.spring.actual.chapter_04.s01;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/20
 */
@Component
public class RetryMethodInterceptor implements MethodInterceptor{

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable
    {
        int retryTimes = methodInvocation.getMethod().getAnnotation(RetryExecution.class).retryTimes();
        while (--retryTimes >= 0) {
            try {
                return methodInvocation.proceed();
            } catch (Throwable t) {
                t.printStackTrace();
            }
        }
        return methodInvocation.proceed();
    }
}
