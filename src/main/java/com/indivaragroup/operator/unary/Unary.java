package com.indivaragroup.operator.unary;

public class Unary {
    public static void UnaryExample(){
        int a = 5;

        // Pre-increment: Increment first, then use the value
        System.out.println(++a); // Output: 6

        // Post-increment: Use the value first, then increment
        System.out.println(a++); // Output: 6 (a becomes 7 afterward)
        System.out.println(a);   // Output: 7

        // Pre-decrement: Decrement first, then use the value
        System.out.println(--a); // Output: 6

        // Post-decrement: Use the value first, then decrement
        System.out.println(a--); // Output: 6 (a becomes 5 afterward)
        System.out.println(a);   // Output: 5

        // Negation operator
        int b = -a;
        System.out.println(b);   // Output: -5

        boolean bool = true;
        System.out.println(!bool);
    }
}
