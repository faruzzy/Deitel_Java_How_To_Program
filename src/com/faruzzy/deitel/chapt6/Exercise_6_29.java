package com.faruzzy.deitel.chapt6;


import java.util.Random;

/**
 * @author Roland Pangu
 */
public class Exercise_6_29 {
    private static int tailCount = 0;
    private static int headCount = 0;

    public static void main(String[] args) {
        for (int k = 1; k <= 240; k++) {
            if (toss())
                headCount++;
            else
                tailCount++;
        }

        System.out.printf("Head\tTail\n");
        System.out.printf("%d     %d\n", headCount, tailCount);
    }

    private static boolean toss() {
        Random random = new Random();
        return 1 == random.nextInt(2);
    }
}
