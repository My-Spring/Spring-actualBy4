package com.spring.actual.chapter_04.s01;

import org.springframework.stereotype.Component;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/20
 */
@Component
public class DancePerformance implements Performance{
    @Override
    @RetryExecution
    public void perform()
    {
        System.out.println("舞蹈演出...");
        throw new RuntimeException();
    }
}
