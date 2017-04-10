package com.srping.actual.chapter_01.minstrel;

import java.io.PrintStream;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/10
 */
public class Minstrel {

    private PrintStream printStream;

    public Minstrel(PrintStream printStream)
    {
        this.printStream = printStream;
    }

    public void singBeforeQuest()
    {
        printStream.println("骑士准备前往杀死恶龙拉~");
    }

    public void singAfterQuest()
    {
        printStream.println("骑士已经把恶龙杀死拉~");
    }
}
