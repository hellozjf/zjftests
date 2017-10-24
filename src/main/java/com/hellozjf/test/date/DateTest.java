package com.hellozjf.test.date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateTest {
    
    private static final Logger LOG = LoggerFactory.getLogger(DateTest.class);

    public static void main(String[] args) {
        
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = localDateTime.toInstant(ZoneOffset.ofHours(8));
        Date date = Date.from(instant);
        LOG.debug("{}", date);
        LOG.debug("{}", instant.toEpochMilli());
        
//        String s = "10/8/2017 12:00:00 PM";
//        Date date = new Date(s);
//        System.out.println(date);

    }

}
