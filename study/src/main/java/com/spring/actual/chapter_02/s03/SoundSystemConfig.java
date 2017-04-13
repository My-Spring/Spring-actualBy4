package com.spring.actual.chapter_02.s03;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

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
//@ImportResource("/chapter02/cd-config.xml")
@Import({DBConfig.class,CDPlayConfig.class})
public class SoundSystemConfig {
}
