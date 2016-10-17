package com.faruzzy.deitel.chapt6;

import java.util.Scanner;

/**
 * @author Roland Pangu
 */
public class Exercise_6_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = Integer.parseInt(input.next());

        System.out.println();

        System.out.print("Enter the first number: ");
        int second = Integer.parseInt(input.next());

        System.out.printf("The greatest common divisor of %d and %d is %d.", first, second, GCD(first, second));
    }

    private static int GCD(int a, int b) {
        int minMiddle = Math.min(a, b);
        int gcd = 0;

        for (int i = 1; i <= minMiddle; i++)
            if (a % i == 0 && b % i == 0)
                gcd = i;

        return gcd;
    }
}
