package com.indivaragroup.operator.booleanOp;

public class BooleanEx {
    public static void BooleanExamples(){
        boolean benar = true;
        boolean salah = false;

        System.out.println(benar && salah); //false
        System.out.println(benar || salah); //true
        System.out.println(salah && salah); //false
        System.out.println(benar || benar); //true

        System.out.println(!salah);     //true
        System.out.println(!benar);     //false
    }
}
