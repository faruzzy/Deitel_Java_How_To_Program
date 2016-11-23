package com.faruzzy.deitel.chapt6;

/**
 * @author Roland Pangu
 */
public class Exercise_6_24 {
    public static void main(String... args) {
        for (int i = 1; i <= 1000; i++)
            if (perfect(i))
                System.out.println(i);
    }

    private static boolean perfect(int value) {
        int total = 0;
        for (int i = value - 1; i >= 1; i--) {
            if (value % i == 0)
                total += i;
        }

        return total == value;
    }
}
