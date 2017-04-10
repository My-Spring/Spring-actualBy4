package com.srping.actual.chapter_01.config;

import com.srping.actual.chapter_01.BraveKnight;
import com.srping.actual.chapter_01.Knight;
import com.srping.actual.chapter_01.Quest;
import com.srping.actual.chapter_01.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/10
 */
@Configuration
public class KnightConfig {

    @Bean
    public Knight knight()
    {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest()
    {
        return new SlayDragonQuest(System.out);
    }
}
