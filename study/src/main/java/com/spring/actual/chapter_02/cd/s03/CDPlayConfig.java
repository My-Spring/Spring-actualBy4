package com.spring.actual.chapter_02.cd.s03;

import org.springframework.context.annotation.Bean;
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
@Import(DBConfig.class)
public class CDPlayConfig {

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc)
    {
        return new CDPlayer(compactDisc);
    }

    @Bean
    public CompactDisc compactDisc()
    {
        return new MusicDisc();
    }
}
