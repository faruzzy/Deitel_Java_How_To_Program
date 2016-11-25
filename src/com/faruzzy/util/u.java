package com.faruzzy.util;

/**
 * @author Roland Pangu
 */
public final class u {
    public static void print(String arg) {
        System.out.print(arg);
    }

    public static void println(String arg) {
        System.out.println(arg);
    }

    public static void printf(String... args) {
        System.out.printf(args[0], args[1]);
    }

    public static <T> void printArray(T[] array) {
        for (T val : array)
            System.out.printf("%s ", val);
        println();
    }

    public static <T> void printArray(T[][] array) {
        for (T[] row : array) {
            for (T val : row)
                System.out.printf("%s ", val);
            println();
        }
    }


    public static void println() {
        System.out.println();
    }
}
