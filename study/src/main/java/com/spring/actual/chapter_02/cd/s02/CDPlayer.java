package com.spring.actual.chapter_02.cd.s02;

import org.springframework.beans.factory.annotation.Autowired;
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
public class CDPlayer implements MediaPlay {

    private CompactDisc compactDisc;

    //属性注入
    @Autowired
    public void setCompactDisc(CompactDisc compactDisc)
    {
        this.compactDisc = compactDisc;
    }

    public void play()
    {
        compactDisc.play();
    }

}
