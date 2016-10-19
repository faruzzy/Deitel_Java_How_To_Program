package com.faruzzy.deitel.chapt6;

import java.util.Random;
import java.util.Scanner;
import com.faruzzy.util.u;
/**
 * @author Roland Pangu
 */

public class Exercise_6_31 {
    private static int aOperand = 0;
    private static int bOperand = 0;
    private static int answer = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userAnswer;
        boolean check;

        for (int k = 1; k <= 5; k++) {
            generateQuestion();

            do {
                System.out.printf("How much is %d times %d ? ", aOperand, bOperand);
                userAnswer = Integer.parseInt(input.next());
                u.println();

                check = isAnswerCorrect(answer, userAnswer);
                printMessage(check);
            } while(!check);
        }

        u.println("Great stuff son! Keep coming back!");
    }

    private static boolean isAnswerCorrect(int answer, int userAnswer) {
        return answer == userAnswer;
    }

    private static void printMessage(boolean check) {
        Random random = new Random();
        int choice;

        choice = 1 + random.nextInt(3);
        switch(choice) {
            case 1:
                if (check)
                    u.println("Very good!");
                else
                    u.println("No. Please try again");
                break;
            case 2:
                if (check)
                    u.println("Excellent");
                else
                    u.println("Wrong. Try once more.");
                break;
            case 3:
                if (check)
                    u.println("Nice Work!");
                else
                    u.println("Don't give up!");
                break;
            default:
                if (check)
                    u.println("Keep up the good work!");
                else
                    u.println("No. Keep Trying.");
                break;
        }
    }

    private static void generateQuestion() {
        Random random = new Random();
        aOperand = 1 + random.nextInt(9);
        bOperand = 1 + random.nextInt(9);
        answer = aOperand * bOperand;
    }
}
