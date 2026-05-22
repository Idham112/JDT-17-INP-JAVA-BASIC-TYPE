package com.indivaragroup.challengeBagus;

import com.indivaragroup.operator.comparison.Comparison;

public class TestBagus {
    public static void TestBagus() {
        int a = 2;
        int b = 5;

        int c = ++a + b-- +a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int x = 4;

        int y = x++ + ++x + x;
        System.out.println(x);
        System.out.println(y);
    }
}
