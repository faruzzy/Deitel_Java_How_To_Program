package com.faruzzy.deitel.chapt6;

/**
 * @author Roland
 */
public class Exercise_6_16 {
    private static boolean isMultiple(int a, int b) {
        return (b % a) == 0;
    }

    public static void main(String... args) {
        int a = 3;
        int b = 9;

        if (isMultiple(a, b)) {
            System.out.printf("%d is a multiple of %d", b, a) ;
        } else {
            System.out.printf("%d is not a multiple of %d", b, a) ;
        }
    }
}
