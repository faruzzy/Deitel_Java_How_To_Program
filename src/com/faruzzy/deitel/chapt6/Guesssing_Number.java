package com.faruzzy.deitel.chapt6;

import java.util.Random;
import java.util.Scanner;
import com.faruzzy.util.u;

/**
 * @author Roland Pangu
 */
public class Guesssing_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rdm = new Random();
        int numberToGuess = 1 + rdm.nextInt(999);
        int answer;

        do {
            System.out.print("Please a guess the number between 1 - 1000: ");
            answer = Integer.parseInt(input.next());
            int suggestion;

            if (answer < numberToGuess) {
                u.println("Too low. Try again!");
                suggestion = (answer + 1 + numberToGuess) / 2;
                System.out.printf("What about %d\n", suggestion);
            } else if (answer > numberToGuess) {
                u.println("Too high. Try again!");
                suggestion = (answer - 1 + numberToGuess) / 2;
                System.out.printf("What about %d\n", suggestion);
            } else {
                break;
            }

        } while (answer != numberToGuess);

        System.out.printf("Congratulations! You guessed the number %d", answer);
    }
}
