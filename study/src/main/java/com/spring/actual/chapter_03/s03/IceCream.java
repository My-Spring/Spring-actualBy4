package com.spring.actual.chapter_03.s03;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/14
 */
@Component
@Cold
@Creamy
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope(value = WebApplicationContext.SCOPE_SESSION,proxyMode = ScopedProxyMode.INTERFACES)
public class IceCream implements Dessert{
    @Override
    public void say()
    {
        System.out.println("I am IceCream~");
    }
}
