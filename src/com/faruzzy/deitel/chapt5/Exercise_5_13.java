package com.faruzzy.deitel.chapt5;

/**
 * @author Roland
 */
public class Exercise_5_13 {
    private static int factorials(int value) {
        int result = value;
        if (value <= 1)
            return 1;
        else {
            for (int k = value - 1; k > 0; k--) {
                result *= k;
            }
        }

        return result;
    }

    public static void main(String... args) {
        System.out.printf("%s %5s\n", "Value", "Factorial");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d %5d\n", i, factorials(i));
        }
    }
}
