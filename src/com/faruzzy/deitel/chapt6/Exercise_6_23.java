package com.faruzzy.deitel.chapt6;

import java.util.Scanner;

/**
 * @author Roland Pangu
 */
public class Exercise_6_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first value: ");
        int a = Integer.parseInt(input.next());
        System.out.println();

        System.out.print("Please enter the second value: ");
        int b = Integer.parseInt(input.next());
        System.out.println();

        System.out.print("Please enter the third value: ");
        int c = Integer.parseInt(input.next());
        System.out.println();

        double minimum = minimum3(a, b, c);

        System.out.printf("The minimum number is %.2f\n", minimum);
    }

    private static double minimum3(double a, double b, double c) {
        double min = a;

        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }
}
