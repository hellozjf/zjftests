package com.hellozjf.test.classloader;

import org.apache.log4j.Logger;

public class ClassLoaderTest {
    
    private static final Logger LOGGER = Logger.getLogger(ClassLoaderTest.class);
    
    public static void main(String[] args) {
        
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        LOGGER.info(classLoader);
        LOGGER.info(classLoader.getParent());
        LOGGER.info(classLoader.getParent().getParent());
    }

}
