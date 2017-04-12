package com.spring.actual.chapter_02.cd.s03;

import org.springframework.context.annotation.Bean;
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
public class DBConfig {

    private CompactDisc compactDisc;

    @Bean(name = "compactDisc")
    public CompactDisc compactDisc()
    {
        return new SgtPepper();
    }


}
