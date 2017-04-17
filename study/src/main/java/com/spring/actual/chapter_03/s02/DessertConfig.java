package com.spring.actual.chapter_03.s02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/14
 */
@Configuration
@ComponentScan
public class DessertConfig {

    private Dessert dessert;

    /*@Bean
    @Primary //设置为首选的 避免多个bean 造成歧义
    public Dessert dessert()
    {
        return new IceCream();
    }*/

}
