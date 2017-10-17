package com.hellozjf.test.Integer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntegerTest {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(IntegerTest.class);

    public static void main(String[] args) {
        
        Integer i1 = -100;
        Integer i2 = 100;
        Boolean b = (i1 == i2);
        LOGGER.debug(b.toString());
        
        int i = (Integer) null;
        LOGGER.debug(Integer.toString(i));
    }

}
