package com.hellozjf.test.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MapTest {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(MapTest.class);

    public static void traverseMap() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "你好");
        map.put("2", "你坏坏");
        map.put("3", "再见");
        
        Set<Entry<String, String>> set = map.entrySet();
        for (Entry<String, String> entry : set) {
            LOGGER.debug("{}:{}", entry.getKey(), entry.getValue());
        }
        
        map.forEach((k, v)->LOGGER.debug("{}:{}", k, v));
    }
    
    public static void main(String[] args) {
        traverseMap();
    }
}
