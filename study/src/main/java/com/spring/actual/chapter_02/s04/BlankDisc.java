package com.spring.actual.chapter_02.s04;

import java.util.List;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/11
 */
public class BlankDisc implements CompactDisc {

    private String title;

    private String singer;

    private List<String> tacks;

    public BlankDisc()
    {
    }

    public BlankDisc(String title, String singer)
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

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setSinger(String singer)
    {
        this.singer = singer;
    }

    public void setTacks(List<String> tacks)
    {
        this.tacks = tacks;
    }

    @Override
    public void play()
    {
        System.out.println(singer + "开始演唱" + title);
        for(String tack : tacks)
        {
            System.out.println("-Track:" + tack);
        }
    }
}
