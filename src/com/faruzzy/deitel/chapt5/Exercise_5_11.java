package com.faruzzy.deitel.chapt5;

import java.util.Scanner;

/**
 * @author Roland
 */
public class Exercise_5_11 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of input: ");
        int input = Integer.parseInt(scanner.next());

        System.out.println();
        int lowestValue = 0;

        for (int i = 0; i < input; i++) {
            System.out.print("Input " + (i + 1) + ": ");
            int userInput = Integer.parseInt(scanner.next());
            if (i == 0) {
                lowestValue = userInput;
                continue;
            }

            if (userInput < lowestValue)
                lowestValue = userInput;
        }

        System.out.println("Lowest value is " + lowestValue);

    }
}
