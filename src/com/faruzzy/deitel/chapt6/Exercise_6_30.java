package com.faruzzy.deitel.chapt6;

import java.util.Random;
import java.util.Scanner;
import com.faruzzy.util.u;

/**
 * @author Roland Pangu
 */
public class Exercise_6_30 {
    private static int aOperand = 0;
    private static int bOperand = 0;
    private static int answer = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userAnswer;
        boolean check;

        for (int i = 1; i <= 5; i++) {
            generateQuestion();

            do {
                System.out.printf("How much is %d times %d ? ", aOperand, bOperand);
                userAnswer = Integer.parseInt(input.next());
                u.println();

                check = isAnswerCorrect(answer, userAnswer);
                if (!check)
                    u.println("No. Please try again!");
                else
                    u.println("Very good!");
            } while (!check);

        }

        u.println("Great stuff, keep coming back!");
    }

    private static boolean isAnswerCorrect(int answer, int userAnswer) {
       return answer == userAnswer;
    }

    private static void generateQuestion() {
        Random random = new Random();
        aOperand = 1 + random.nextInt(9);
        bOperand = 1 + random.nextInt(9);
        answer = aOperand * bOperand;
    }
}
