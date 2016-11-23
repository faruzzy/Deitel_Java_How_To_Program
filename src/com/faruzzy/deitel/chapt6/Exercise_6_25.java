package com.faruzzy.deitel.chapt6;

/**
 * @author Roland Pangu
 */
public class Exercise_6_25 {
    public static void main(String... args) {
        for (int i = 1; i < 10000; i++) {
            if (isPrime(i))
                System.out.printf("%d is Prime\n", i);
        }
    }

    private static boolean isPrime(int val) {
        if (val == 1 || val == 2 || val == 3) return true;

        for (int k = (int) Math.sqrt(val); k >= 2; k--)
            if (val % k == 0) return false;

        return true;
    }
}
