package com.spring.actual.chapter_03.s01;

import org.springframework.stereotype.Component;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/13
 */
//@Component
public class MagicBean {

    public void say()
    {
        System.out.println("我被创建了啊~");
    }

    public static void main(String args[])
    {
        MagicBean magicBean = new MagicBean();
        magicBean.say();
    }
}
