package com.faruzzy.deitel.chapt6;

import java.util.Scanner;

/**
 * @author Roland Pangu
 */
public class Exercise_6_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What unit are you using ? ");
        System.out.print("Enter 1) Farenheit or 2) Celsisus: ");
        String unit = input.next();

        System.out.println();

        System.out.print("Enter the value: ");
        double value = Integer.parseInt(input.next());

        System.out.println();

        value = unit.equals("1") ? getCelsiusValue(value) : getFarenheitValue(value);
        System.out.printf("%.2f", value);
    }

    private static double getCelsiusValue(double farenheitValue) {
        return (5 / 9) * (farenheitValue - 32);
    }

    private static double getFarenheitValue(double celsiusValue) {
        return 9 / 5 * celsiusValue + 32;
    }
}
