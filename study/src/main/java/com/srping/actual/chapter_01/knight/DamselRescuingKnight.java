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
public class DamselRescuingKnight implements Knight{

    private RescueDamselQuest rescueDamselQuest;

    public DamselRescuingKnight()
    {
        this.rescueDamselQuest = new RescueDamselQuest();
    }

    @Override
    public void embarkOnQuest()
    {
        rescueDamselQuest.embark();
    }

    @Override
    public void embarkOnQuestWithMinstrel()
    {
        rescueDamselQuest.embark();
    }

    public static void main(String args[])
    {
        DamselRescuingKnight damselRescuingKnight = new DamselRescuingKnight();
        damselRescuingKnight.embarkOnQuest();
    }
}
