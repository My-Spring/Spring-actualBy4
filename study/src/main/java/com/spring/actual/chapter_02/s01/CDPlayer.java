package com.spring.actual.chapter_02.s01;

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
@Component
public class CDPlayer implements MediaPlay {

    private CompactDisc disc;

    //构造器注入
    @Autowired
    public CDPlayer(CompactDisc disc)
    {
        this.disc = disc;
    }

    public void play()
    {
        disc.play();
    }

    @Autowired
    public void insertDisc(CompactDisc disc)
    {
        this.disc = disc;
    }
}
