package com.faruzzy.deitel.chapt6;

import java.util.Scanner;

/**
 * @author Roland
 */
public class Exercise_6_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of rows and columns: ");
        int val = Integer.parseInt(scanner.next());

        System.out.println();
        for (int k = 1; k <= val; k++) {
            for (int q = 1; q <= val; q++)
                System.out.print("*");
            System.out.println();
        }
    }
}
