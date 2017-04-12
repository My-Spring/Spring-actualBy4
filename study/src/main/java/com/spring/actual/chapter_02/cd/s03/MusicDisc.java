package com.spring.actual.chapter_02.cd.s03;


/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/11
 */
public class MusicDisc implements CompactDisc {

    private String title = "画中仙";

    private String singer =  "金莎";

    @Override
    public void play()
    {
        System.out.println(singer + "开始演唱" + title);
    }
}
