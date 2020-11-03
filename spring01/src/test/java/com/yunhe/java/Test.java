package com.yunhe.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Test
 * @Description
 * @Author Administrator
 * @Date 2020/11/3 15:43
 * @Version
 **/
public class Test{
    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Student student = context.getBean("stu", Student.class);

        Student student1 = context.getBean("stu", Student.class);
        System.out.println( student==student1);


    }
}