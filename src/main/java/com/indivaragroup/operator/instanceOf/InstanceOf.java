package com.indivaragroup.operator.instanceOf;

public class InstanceOf {
    public static void InstanceOfExample(){
        Object value = "test";
        boolean isTrue = value instanceof String;

        System.out.println(value instanceof String);
        System.out.println(value instanceof Integer);
        System.out.println(!isTrue);
    }
}
