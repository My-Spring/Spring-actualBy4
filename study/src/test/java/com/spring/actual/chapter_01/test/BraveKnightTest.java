package com.spring.actual.chapter_01.test;

import com.srping.actual.chapter_01.knight.BraveKnight;
import com.srping.actual.chapter_01.knight.Quest;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/10
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkQuest()
    {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest,times(1)).embark();
    }
}
