package com.srping.actual.chapter_01;

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
public class SlayDragonQuest implements Quest{

    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream)
    {
        this.printStream = printStream;
    }

    @Override
    public void embark()
    {
        printStream.println("任务：去杀掉一头恶龙...");
    }
}
