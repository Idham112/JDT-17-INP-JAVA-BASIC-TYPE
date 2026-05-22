package com.indivaragroup.operator.bitwise;

public class BitwiseExample {
    public static void BitWiseExamples() {
        int a = 5; // Binary: 0101
        int b = 3; // Binary: 0011

        System.out.println(a & b);  // AND: 1
        System.out.println(a | b);  // OR: 7
        System.out.println(a ^ b);  // XOR: 6
        System.out.println(~a);     // Complement: -6
        System.out.println(a << 1); // Left shift: 10
        System.out.println(a >> 1); // Right shift: 2
    }
}
