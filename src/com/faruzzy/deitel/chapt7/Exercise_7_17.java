package com.faruzzy.deitel.chapt7;

import java.util.Random;

/**
 * @author Roland Pangu
 */
public class Exercise_7_17 {
    public static void main(String... args) {
        Random rand = new Random();
        int[] frequency = new int[13];

        for (int i = 1; i <= 36000; i++) {
            int face1 = 1 + rand.nextInt(6);
            int face2 = 1 + rand.nextInt(6);
            ++frequency[face1 + face2];
        }

        System.out.printf("\n%s%15s", "Sum", "Frequency\n");

        for (int j = 2; j < frequency.length; j++)
            System.out.printf("%2d %10d\n", j, frequency[j]);
    }
}
