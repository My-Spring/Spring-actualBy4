package com.spring.actual.chapter_03.s02;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/14
 */
@Component
//@Primary //设置为首选的 避免多个bean 造成歧义
public class Cake implements Dessert{
    @Override
    public void say()
    {
        System.out.println("I am Cake~");
    }
}
