package com.faruzzy.deitel.chapt5;

/**
 * @author Roland
 */
public class Exercise_5_15 {
    private static void printTriangleA() {
        for (int j = 1; j <= 10; j++) {
            for (int k = 1; k <= j; k++)
                System.out.print("*");
            System.out.println();
        }
    }

    private static void printTriangleB() {
        for (int j = 10; j >= 1; j--) {
            for (int k = 1; k <= j; k++)
                System.out.print("*");
            System.out.println();
        }
    }

    private static void printTriangleC() {
        for (int j = 10; j >= 1; j--) {
            boolean stringPrinted = false;
            for (int k = 1; k <= j; k++) {
                int c = 10 - j;
                if (!stringPrinted && c > 0) {
                    for (int i = 1; i <= c; i++)
                        System.out.print(" ");
                    stringPrinted = true;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*private static void printTriangleD() {
        for (int k = 10; k < 10; k++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(" ");
            }

            int c = 10 -
        }
    }*/

    public static void main(String[] args) {
        printTriangleA();
        System.out.println();

        printTriangleB();
        System.out.println();

        printTriangleC();
        System.out.println();
    }
}
