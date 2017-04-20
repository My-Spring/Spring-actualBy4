package com.spring.actual.chapter_03.s05;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/17
 */
public class BlankDisc implements CompactDisc{

    private String title;

    private String singer;

    private List<String> tacks;

    public BlankDisc()
    {
    }

    public BlankDisc(@Value("#{systemProperties['disc.title']}")String title)
    {
        this.title = title;
    }

    public BlankDisc(@Value("${disc.title}")String title, @Value("${disc.singer}")String singer)
    {
        this.title = title;
        this.singer = singer;
    }

    public BlankDisc(String title, String singer, List<String> tacks)
    {
        this.title = title;
        this.singer = singer;
        this.tacks = tacks;
    }

    @Override
    public void play()
    {
        System.out.println(singer + "开始演唱" + title);
        if(tacks != null && tacks.size() > 0)
        {
            for(String tack : tacks)
            {
                System.out.println("-Track:" + tack);
            }
        }
    }
}
