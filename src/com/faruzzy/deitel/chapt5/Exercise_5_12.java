package com.faruzzy.deitel.chapt5;

/**
 * @author Roland
 */
public class Exercise_5_12 {
    public static void main(String[] args) {
        int odd = 1;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0)
                odd *= i;
        }

        System.out.println("The product of odd integers from 1 to 15 is: " + odd);
    }
}
