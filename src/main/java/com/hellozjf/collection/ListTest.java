package com.hellozjf.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ListTest {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ListTest.class);

    public static void testAsList() {
        String[] ss = {"1", "2"};
        List<String> list = Arrays.asList(ss);
        LOGGER.debug(list.toString());
        ss[0] = "3";
        LOGGER.debug(list.toString());
    }
    
    public static void testToArray() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        String[] ss = new String[list.size()];
        ss = list.toArray(ss);
        LOGGER.debug(Arrays.toString(ss));
    }
    
    public static void testRemove() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        for (Iterator<String> iter = list.iterator(); iter.hasNext();) {
            String s = iter.next();
            if (s.equals("2")) {
                iter.remove();
            }
        }
        LOGGER.debug(list.toString());
    }
    
    public static void main(String[] args) {
        testAsList();
        testToArray();
        testRemove();
    }
}
