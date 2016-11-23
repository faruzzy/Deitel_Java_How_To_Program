package com.faruzzy.deitel.chapt5;

/**
 * @author Roland
 */
public class Exercise_5_16 {
    public static void main(String... args) {
        for (int i = 1; i <= 30; i++) {
            String s = "";

            for (int k = 1; k <= i; k++)
                s += "*";

            System.out.printf("%2d: %s\n", i, s);
        }
    }
}
