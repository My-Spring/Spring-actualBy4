package com.spring.actual.chapter_02.test.s02;

import com.spring.actual.chapter_02.s02.CompactDisc;
import com.spring.actual.chapter_02.s02.MediaPlay;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/11
 */
@RunWith(SpringJUnit4ClassRunner.class)//要求junit-4.12及其以上
@ContextConfiguration(locations = "/chapter02/cd.xml")//spring-test.jar
public class CDPlayerTest {

    @Autowired
    private CompactDisc disc;

    @Autowired
    private MediaPlay mediaPlay;

    @Test
    public void cdShouldNotBeNull()
    {
        assertNotNull(disc);
        disc.play();
    }

    @Test
    public void testCdPlay()
    {
        //cdPlayer.play();
        mediaPlay.play();
    }
}
