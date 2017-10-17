package com.hellozjf.test.pojo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestPOJO {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestPOJO.class);
    private Date gmtCreate = new Date();
    private Integer value;
    
    public Date getGmtCreate() {
        return gmtCreate;
    }
    public Integer getValue() {
        return value;
    }
    public void setValue(Integer value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "TestPOJO [gmtCreate=" + gmtCreate + ", value=" + value + "]";
    }
    
    public static void main(String[] args) throws Exception {
        TestPOJO testPOJO = new TestPOJO();
        testPOJO.setValue(100);
        LOGGER.debug(testPOJO.toString());
        Thread.sleep(5000);
        testPOJO.setValue(200);
        LOGGER.debug(testPOJO.toString());
        
        String s = "1,2,3,,";
        String[] ss = s.split(",");
        LOGGER.debug(Integer.toString(ss.length));
    }
}
