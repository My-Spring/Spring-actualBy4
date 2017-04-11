package com.spring.actual.chapter_02.cd;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/11
 */
@Configuration
//@ComponentScan("com.spring.actual.chapter_02.cd") //默认会扫描与配置类相同的包
//@ComponentScan(basePackages = "com.spring.actual.chapter_02.cd")
//@ComponentScan(basePackages = {"com.spring.actual.chapter_02.cd","test"})
@ComponentScan(basePackageClasses = CdPlayConfig.class)
public class CdPlayConfig {
}
