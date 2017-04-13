package com.spring.actual.chapter_02.s04;

import org.springframework.beans.factory.annotation.Autowired;

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

    @Autowired
    public CDPlayer(CompactDisc compactDisc)
    {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play()
    {
        compactDisc.play();
    }
}
