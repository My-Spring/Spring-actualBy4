package com.spring.actual.chapter_03.test;

import com.spring.actual.chapter_03.s01.MagicBean;
import com.spring.actual.chapter_03.s01.MagicBeanConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MagicBeanConfig.class)
public class MagicBeanTest {

    @Autowired
    private MagicBean magicBean;

    @Test
    public void testMagicBean()
    {
        //cdPlayer.play();
        magicBean.say();
    }
}
