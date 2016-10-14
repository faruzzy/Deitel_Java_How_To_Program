package com.faruzzy.deitel.chapt6;

import java.util.Scanner;

/**
 * @author Roland Pangu
 */
public class Exercise_6_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of the square: ");
        int size = Integer.parseInt(input.next());

        System.out.println();

        System.out.print("Please enter the filling Character: ");
        String fillCharacter =  input.next();

        squareOf(size, fillCharacter);
    }

    private static void squareOf(int size, String fillCharacter) {
        System.out.println();
        for (int k = 1; k <= size; k++) {
            for (int q = 1; q <= size; q++)
                System.out.print(fillCharacter);
            System.out.println();
        }
    }
}
