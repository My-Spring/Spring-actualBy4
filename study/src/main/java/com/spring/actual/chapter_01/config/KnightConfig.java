package com.spring.actual.chapter_01.config;

import com.spring.actual.chapter_01.knight.Knight;
import com.spring.actual.chapter_01.knight.Quest;
import com.spring.actual.chapter_01.minstrel.Minstrel;
import com.spring.actual.chapter_01.knight.BraveKnight;
import com.spring.actual.chapter_01.knight.SlayDragonQuest;
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
        return new BraveKnight(quest(),new Minstrel(System.out));
    }

    @Bean
    public Quest quest()
    {
        return new SlayDragonQuest(System.out);
    }
}
