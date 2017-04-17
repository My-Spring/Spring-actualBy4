package com.spring.actual.chapter_03.test;

import com.spring.actual.chapter_03.s03.*;
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
 * @Date 2017/4/17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ColdConfig.class)
public class ColdTest {

    private Dessert dessert;

    @Test
    public void testCold()
    {
        dessert.say();
    }

    @Autowired
    @Cold
    @Fruity
    public void setDessert(Dessert dessert)
    {
        this.dessert = dessert;
    }
}
