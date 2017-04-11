package com.spring.actual.chapter_02.cd.s03;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

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
@Import({DBConfig.class,CDPlayConfig.class})
@ImportResource("/chapter02/cd-config.xml")
public class SoundSystemConfig {
}
