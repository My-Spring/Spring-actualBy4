package com.spring.actual.chapter_03.s01;

import org.springframework.context.annotation.*;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/13
 */
@Configuration
//@ComponentScan
@ImportResource(value = "/chapter03/magic.xml")
public class MagicBeanConfig {

    private MagicBean magicBean;

    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean()
    {
        return new MagicBean();
    }
}
