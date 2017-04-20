package com.spring.actual.chapter_04.s01;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
@Component
public class RetryMethodAdvisor extends AbstractPointcutAdvisor{

    @Autowired
    private RetryMethodInterceptor interceptor;

    private final StaticMethodMatcherPointcut pointcut = new
            StaticMethodMatcherPointcut() {
                @Override
                public boolean matches(Method method, Class<?> targetClass) {
                    return method.isAnnotationPresent(RetryExecution.class);
                }
            };

    @Override
    public Pointcut getPointcut()
    {
        return this.pointcut;
    }

    @Override
    public Advice getAdvice()
    {
        return this.interceptor;
    }
}
