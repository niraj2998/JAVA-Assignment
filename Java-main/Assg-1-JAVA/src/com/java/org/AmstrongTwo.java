package com.java.org;

public class AmstrongTwo {
    public static void main(String[] args) {
        for (int i = 100; i <= 1000; i++) {
            int a = i;
            int b = 0;
            int c = 0;
            while (a > 0) {
                b = a % 10;
                c = c + (b * b * b);
                a = a / 10;
            }
            if (i == c)
                System.out.println(i);
        }

    }

}
