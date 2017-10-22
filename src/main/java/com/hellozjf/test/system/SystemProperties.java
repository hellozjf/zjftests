package com.hellozjf.test.system;

import java.util.Properties;

public class SystemProperties {
    
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        properties.forEach((k, v)->System.out.println(k + ":" + v));
    }
}
