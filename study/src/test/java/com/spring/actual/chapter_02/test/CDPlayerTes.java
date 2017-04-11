package com.spring.actual.chapter_02.test;

import com.spring.actual.chapter_02.cd.CDPlayer;
import com.spring.actual.chapter_02.cd.CdPlayConfig;
import com.spring.actual.chapter_02.cd.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
@ContextConfiguration(classes = CdPlayConfig.class)//spring-test.jar
//@ContextConfiguration(locations = "/chapter02/cd.xml")
public class CDPlayerTes {

    @Autowired
    private CompactDisc disc;

    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void cdShouldNotBeNull()
    {
        assertNotNull(disc);
        disc.play();
    }

    @Test
    public void testCdPlay()
    {
        cdPlayer.play();
    }

}
