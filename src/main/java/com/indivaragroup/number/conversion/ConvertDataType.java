package com.indivaragroup.number.conversion;

public class ConvertDataType {
    public static void numberConvert(){
        byte byteValue = 120;
        int intValue = byteValue;
        double doubleValue = intValue;

        System.out.println("Widening Casting: ");
        System.out.println("byte -> int: " + intValue);
        System.out.println("int -> double: " + doubleValue);

        double nilaiDouble = 9.78;
        int nilaiInt = (int) nilaiDouble;
        byte nilaiByte = (byte) nilaiInt;

        System.out.println();
        System.out.println("Narrowing Casting");
        System.out.println("double -> int: " + nilaiInt);
        System.out.println("int -> byte: " + nilaiByte);
    }
}
