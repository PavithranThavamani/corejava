package com.onebill.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        GirlFriend bean = context.getBean("gf1", GirlFriend.class);
        System.out.println(bean);
        
//        GirlFriend bean2 = (GirlFriend) context.getBean("gf1");
//        System.out.println(bean2);

    }
}
