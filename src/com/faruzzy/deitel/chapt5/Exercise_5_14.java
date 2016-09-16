package com.faruzzy.deitel.chapt5;

/**
 * @author Roland
 */
public class Exercise_5_14 {
    public static void main(String[] args) {
        double amount;
        double principal = 1000.0;

        for (int k = 5; k <= 10; k++) {
            System.out.printf("%s%20s", "Year", "Amount on deposit");
            double rate = (double) k / 100;
            System.out.printf(" %s\n", "(Rate " + rate + "%)");

            for (int year = 1; year <= 10; year++) {
                amount = principal * Math.pow(1 + rate, year);
                System.out.printf("%4d%,20.2f\n", year, amount);
            }

            System.out.println();
        }
    }
}
