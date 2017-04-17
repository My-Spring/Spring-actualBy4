package com.spring.actual.chapter_03.test;

import com.spring.actual.chapter_03.s02.Dessert;
import com.spring.actual.chapter_03.s02.DessertConfig;
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
 * @Date 2017/4/14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfig.class)
public class DessertTest {

    @Autowired
    //@Qualifier("ice")
    private Dessert dessert;

    @Test
    public void testDessert()
    {
        dessert.say();
    }

    /*@Autowired
    @Qualifier("ice")
    public void setDessert(Dessert dessert)
    {
        this.dessert = dessert;
    }*/
}
