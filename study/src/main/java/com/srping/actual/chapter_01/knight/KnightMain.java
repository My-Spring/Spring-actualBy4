package com.srping.actual.chapter_01.knight;

import com.srping.actual.chapter_01.config.KnightConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/10
 */
public class KnightMain {

    public static void main(String args[])
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/chapter01/knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();

        /*ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:chapter01/knights.xml");
        Knight knight = applicationContext.getBean(Knight.class);
        knight.embarkOnQuest();*/

        /*ServletContext servletContext = request.getSession().getServletContext();
        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext);*/

       /* AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();*/

        /*KnightConfig knightConfig = new KnightConfig();
        Knight knight = knightConfig.knight();
        knight.embarkOnQuest();*/
    }
}
