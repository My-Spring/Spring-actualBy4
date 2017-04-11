package com.spring.actual.chapter_01.knight;

import com.spring.actual.chapter_01.minstrel.Minstrel;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/10
 */
public class BraveKnight implements Knight{

    private Quest quest;

    private Minstrel minstrel;

    public BraveKnight(Quest quest, Minstrel minstrel)
    {
        this.quest = quest;
        this.minstrel = minstrel;
    }

    public BraveKnight(Quest quest)
    {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest()
    {
        quest.embark();
    }

    @Override
    public void embarkOnQuestWithMinstrel()
    {
        minstrel.singBeforeQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }

    public static void main(String args[])
    {
        RescueDamselQuest rescueDamselQuest = new RescueDamselQuest();
        Minstrel minstrel1 = new Minstrel(System.out);
        BraveKnight braveKnight = new BraveKnight(rescueDamselQuest,minstrel1);
        braveKnight.embarkOnQuestWithMinstrel();
    }
}
