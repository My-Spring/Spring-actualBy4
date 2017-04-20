package com.spring.actual.chapter_04.s01;

import org.springframework.stereotype.Component;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/20
 */
@Component
public class MusicPerformance implements Performance{
    @Override
    public void perform()
    {
        System.out.println("音乐演出");
    }
}
