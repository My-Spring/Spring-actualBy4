package com.spring.actual.chapter_03.s05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySourcesPropertyResolver;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/17
 */
@Configuration
@PropertySource(value = "classpath:/chapter03/s05.properties",encoding = "UTF-8")//声明属性来源
public class ExpressiveConfig {

    @Autowired
    private Environment env;

    @Value("${disc.title}")
    private  String title;
    @Value("${disc.singer}")
    private  String singer;

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer()
    {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public BlankDisc disc()
    {
        //return new BlankDisc(env.getProperty("disc.title"),env.getProperty("disc.singer"));
        return new BlankDisc(title,singer);
    }
}
