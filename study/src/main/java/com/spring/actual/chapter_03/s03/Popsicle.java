package com.spring.actual.chapter_03.s03;

import org.springframework.stereotype.Component;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/17
 */
@Component
@Cold
@Fruity
public class Popsicle implements Dessert{
    @Override
    public void say()
    {
        System.out.println("I am popsicle~");
    }
}
