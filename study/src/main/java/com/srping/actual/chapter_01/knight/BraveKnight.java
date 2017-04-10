package com.srping.actual.chapter_01.knight;

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

    public BraveKnight(Quest quest)
    {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest()
    {
        quest.embark();
    }

    public static void main(String args[])
    {
        RescueDamselQuest rescueDamselQuest = new RescueDamselQuest();
        BraveKnight braveKnight = new BraveKnight(rescueDamselQuest);
        braveKnight.embarkOnQuest();
    }
}
