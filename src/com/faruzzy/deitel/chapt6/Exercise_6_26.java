package com.faruzzy.deitel.chapt6;

import java.util.Scanner;

/**
 * @author Roland Pangu
 */
public class Exercise_6_26 {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to be reversed: ");
        int value = Integer.parseInt(input.next());

        System.out.println();
        System.out.printf("The reverse of %d is: %s\n", value, reverse(value));
    }

    private static String reverse(int value) {
        String val = value + "";
        String str = "";

        for (int j = val.length() - 1; j >= 0; j--)
            str += val.charAt(j) + "";
        return str;
    }
}
