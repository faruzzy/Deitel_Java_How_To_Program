package com.faruzzy.deitel.chapt5;

/**
 * @author Roland
 */
public class Exercise_5_15 {
    /*
     * Print the following:
         *
         **
         ***
         ****
         *****
         ******
         *******
         ********
         *********
         **********
     */
    private static void printTriangleA() {
        for (int j = 1; j <= 10; j++) {
            for (int k = 1; k <= j; k++)
                System.out.print("*");
            System.out.println();
        }
    }

    /*
     * Print the following:

        **********
        *********
        ********
        *******
        ******
        *****
        ****
        ***
        **
        *

     */

    private static void printTriangleB() {
        for (int j = 10; j >= 1; j--) {
            for (int k = 1; k <= j; k++)
                System.out.print("*");
            System.out.println();
        }
    }

    /*
     *  Print the following:

        **********
         *********
          ********
           *******
            ******
             *****
              ****
               ***
                **
                 *
     */

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

    /**
      * Print the following:

       *
       **
       ***
       ****
       *****
       ******
       *******
       ********
       *********
     */
    private static void printTriangleD() {
        for (int k = 10; k >= 1; k--) {
            int j;
            for (j = 1; j < k; j++) {
                System.out.print(" ");
            }

            int c = 10 - j;
            for (int q = 1; q <= c; q++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String... args) {
        printTriangleA();
        System.out.println();

        printTriangleB();
        System.out.println();

        printTriangleC();
        System.out.println();

        printTriangleD();
        System.out.println();
    }
}
