package com.spring.actual.chapter_02.s01;

import org.springframework.stereotype.Component;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/11
 */
@Component
public class SgtPepper implements CompactDisc{

    private String title = "死了都要爱~";

    private String singer =  "信乐团";

    @Override
    public void play()
    {
        System.out.println(singer + "开始演唱" + title);
    }
}
