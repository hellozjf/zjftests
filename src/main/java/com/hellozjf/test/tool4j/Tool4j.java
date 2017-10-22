package com.hellozjf.test.tool4j;

import com.hellozjf.tool4j.PropertiesUtils;

public class Tool4j {

    public static void main(String[] args) {
        String value = PropertiesUtils.getStringResourceValue("com.hellozjf.test.reflect.ReflectTest.car.brand");
        System.out.println(value);
    }

}
