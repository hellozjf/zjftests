package com.hellozjf.test.properties;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertyTest {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(PropertyTest.class);
    
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        InputStream in = PropertyTest.class.getClassLoader().getResourceAsStream("log4j.properties");
        LOGGER.debug("in={}", in);
        properties.load(in);
        Iterator<String> iter = properties.stringPropertyNames().iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            LOGGER.debug("{}:{}", key, properties.get(key));
        }
    }

}
