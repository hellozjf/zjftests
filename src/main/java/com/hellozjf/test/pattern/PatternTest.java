package com.hellozjf.test.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {

    public static void main(String[] args) {
        
        String regex = "a\\s+b";
        Pattern pattern = Pattern.compile(regex);
        String s = "a  \t  b";
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.find());
    }

}
