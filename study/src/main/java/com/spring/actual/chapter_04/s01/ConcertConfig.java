package com.spring.actual.chapter_04.s01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/20
 */
@Configuration
@EnableAspectJAutoProxy //启用aspect代理
@ComponentScan
public class ConcertConfig {

    /*@Bean
    public NewAudience audience()
    {
        return new NewAudience();
    }*/

   /* @Bean
    public Audience audience()
    {
        return new Audience();
    }*/
}
