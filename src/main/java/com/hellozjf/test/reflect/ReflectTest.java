package com.hellozjf.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;

import com.hellozjf.zjftools.StringResource;

public class ReflectTest {
    
    private static final Logger LOGGER = Logger.getLogger(ReflectTest.class);
    
    public static Car initByDefaultConst() throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class clazz = classLoader.loadClass("com.hellozjf.test.reflect.Car");
        
        Constructor constructor = clazz.getDeclaredConstructor((Class[]) null);
        Car car = (Car) constructor.newInstance();
        
        Method setBrand = clazz.getMethod("setBrand", String.class);
        setBrand.invoke(car, StringResource.getString("com.hellozjf.test.reflect.ReflectTest.car.brand"));
        Method setColor = clazz.getMethod("setColor", String.class);
        setColor.invoke(car, StringResource.getString("com.hellozjf.test.reflect.ReflectTest.car.color"));
        Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
        setMaxSpeed.invoke(car, 200);
        
        return car;
    }

    public static void main(String[] args) throws Exception {
        Car car = initByDefaultConst();
//        car.introduce();
        LOGGER.info(car);
    }

}
