package com.indivaragroup.ifStatement;

public class Switch {
    public static void SwitchLearn(){
        String cuaca = "siang";
        switch (cuaca){
            case "siang":
                System.out.println("panas");
                break;
            case "malam":
                System.out.println("dingin");
                break;
            default:
                System.out.println("bukan cuaca");
                break;
        }
    }
    public static void SwitchLambda(){
        String cuaca = "siang";
    }
}
