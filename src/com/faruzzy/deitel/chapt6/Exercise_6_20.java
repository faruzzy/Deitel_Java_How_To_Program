package com.faruzzy.deitel.chapt6;

import java.util.Scanner;

/**
 * @author Roland Pangu
 */
public class Exercise_6_20 {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the radius of the Circle: ");
        int radius = Integer.parseInt(input.next());
        double area = circleArea(radius);

        System.out.println();
        System.out.printf("The circle area is: %.2f", area);
    }

    private static double circleArea(int radius) {
        return  Math.PI * Math.pow(radius, 2);
    }
}
