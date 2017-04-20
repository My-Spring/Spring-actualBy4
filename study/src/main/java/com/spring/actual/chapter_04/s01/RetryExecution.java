package com.spring.actual.chapter_04.s01;

import java.lang.annotation.*;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/4/20
 */

/**
 * Retention(保留)注解说明,这种类型的注解会被保留到那个阶段. 有三个值:
 1.RetentionPolicy.SOURCE —— 这种类型的Annotations只在源代码级别保留,编译时就会被忽略
 2.RetentionPolicy.CLASS —— 这种类型的Annotations编译时被保留,在class文件中存在,但JVM将会忽略
 3.RetentionPolicy.RUNTIME —— 这种类型的Annotations将被JVM保留,所以他们能在运行时被JVM或其他使

 Documented 注解表明这个注解应该被 javadoc工具记录. 默认情况下,javadoc是不包括注解的 .
 但如果声明注解时指定了 @Documented,则它会被 javadoc 之类的工具处理, 所以注解类型信息也会被包括在生成的文档中.
 */
@Retention(RetentionPolicy.RUNTIME)//保留时间：运行期
@Target(ElementType.METHOD) //方法及
@Inherited //  @Inherited：允许子类继承父类的注解
@Documented
public @interface RetryExecution {

    int retryTimes() default 2;
}
