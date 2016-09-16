package com.faruzzy.deitel.chapt6;

/**
 * @author Roland
 */
public class Exercise_6_17 {
    private static boolean isEven(int value) {
        return (value % 2) == 0;
    }

    public static void main(String[] args) {
        if (isEven(12))
            System.out.println("Is even");
        else
            System.out.println("Is not even");
    }
}
