package com.srping.actual.chapter_01;

import com.srping.actual.chapter_01.config.KnightConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.context.support.XmlWebApplicationContext;

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
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/chapter01/knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();*/

        /*ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:chapter01/knights.xml");
        Knight knight = applicationContext.getBean(Knight.class);
        knight.embarkOnQuest();*/

        /*ServletContext servletContext = request.getSession().getServletContext();
        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext);*/

        KnightConfig knightConfig = new KnightConfig();
        Knight knight = knightConfig.knight();
        knight.embarkOnQuest();
    }
}
