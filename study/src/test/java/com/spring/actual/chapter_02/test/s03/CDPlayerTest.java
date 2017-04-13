package com.spring.actual.chapter_02.test.s03;

import com.spring.actual.chapter_02.s03.CompactDisc;
import com.spring.actual.chapter_02.s03.MediaPlay;
import com.spring.actual.chapter_02.s03.SoundSystemConfig;
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
@ContextConfiguration(classes = SoundSystemConfig.class)//spring-test.jar
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
        //cdPlayer.play(); //class加载比xml优先 DBConfig 里的compactDisc 被xml的覆盖
        mediaPlay.play();
    }
}
