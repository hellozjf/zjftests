package com.hellozjf.test.properties;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    
    private static final Logger LOG = LoggerFactory.getLogger(ApplicationContextTest.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Properties properties = (Properties) context.getBean("properties");
        System.out.println(properties);
    }

}
