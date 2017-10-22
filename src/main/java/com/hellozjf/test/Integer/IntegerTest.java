package com.hellozjf.test.Integer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntegerTest {
    
    private static final Logger LOG = LoggerFactory.getLogger(IntegerTest.class);
    
    private Integer iTest;
    
    public Integer getiTest() {
        return iTest;
    }

    public void setiTest(Integer iTest) {
        this.iTest = iTest;
    }

    @Override
    public String toString() {
        return "IntegerTest [iTest=" + iTest + "]";
    }

    public static void main(String[] args) {
        
        Integer i1 = -100;
        Integer i2 = 100;
        Boolean b = (i1 == i2);
        LOG.debug(b.toString());
        
        IntegerTest integerTest = new IntegerTest();
        integerTest.setiTest(null);
        LOG.debug("{}", integerTest);
    }
}
