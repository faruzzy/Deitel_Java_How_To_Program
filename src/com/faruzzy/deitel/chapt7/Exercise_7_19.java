package com.faruzzy.deitel.chapt7;

import com.faruzzy.util.u;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Roland Pangu
 */
public class Exercise_7_19 {
    private static Random rand = new Random();
    private static Boolean[] seats = new Boolean[10];

    private static boolean isFull() {
        for (boolean seat : seats)
            if (!seat)
                return false;
        return true;
    }

    private static boolean isFirstClassFull() {
        for (int i = 0; i < 5; i++)
            if (!seats[i])
                return false;
        return true;
    }

    private static boolean isEconomyFull() {
        for (int i = 5; i < seats.length; i++)
            if (!seats[i])
                return false;
        return true;
    }

    private static void selectFirstClassSeat() {
        do {
            int index = rand.nextInt(6);
            u.println("index selected: " + index);
            if (!seats[index]) {
                seats[index] = true;
                break;
            }
        } while(true);
    }

    private static void selectEconomySeat() {
        do {
            int index = 5 + rand.nextInt(5);
            if (!seats[index]) {
                seats[index] = true;
                break;
            }
        } while(true);
    }

    public static void main(String... args) {
        Arrays.fill(seats, false);
        Scanner scanner = new Scanner(System.in);
        do {
            u.print("Please Type 1 for First Class - Please Type 2 for Economy ");
            String response = scanner.next();

            if (response.equals("1")) {
                if (isFirstClassFull()) {
                    u.print("Is it acceptable to be downgraded ? (yes/no)");
                    String downgrade = scanner.next();

                    if (downgrade.equalsIgnoreCase("yes"))
                        selectEconomySeat();
                } else {
                    selectFirstClassSeat();
                }
            }

            if (response.equals("2")) {
                if (isEconomyFull()) {
                    u.print("Is it acceptable to be upgraded ? (yes/no)");
                    String upgrade = scanner.next();

                    if (upgrade.equalsIgnoreCase("yes"))
                        selectFirstClassSeat();
                } else {
                    selectEconomySeat();
                }
            }
        } while (!isFull());
        u.println("The aircraft is full");
    }
}
