package com.cc.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cc.app.service.NameService;

public class Test {
    public static final String[] BEAN_DEFINITIONS = {"classpath*:applicationContext.xml"};

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(BEAN_DEFINITIONS);
        NameService nameService = (NameService) context.getBean("nameService");
        System.out.println("My Name Is :" + nameService.getMyName());
        context.close();
    }

}
