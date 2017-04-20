package com.spring.actual.chapter_04.test;

import com.spring.actual.chapter_04.s01.Audience;
import com.spring.actual.chapter_04.s01.ConcertConfig;
import com.spring.actual.chapter_04.s01.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/20
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = ConcertConfig.class)
@ContextConfiguration(locations = "/chapter04/s01.xml")
public class PerformanceTest {

    @Autowired
    @Qualifier("musicPerformance")
    private Performance performance;

    @Test
    public void testPerformance()
    {
        performance.perform();
    }
}
