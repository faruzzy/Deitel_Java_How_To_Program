package com.faruzzy.deitel.chapt6;

import java.util.Scanner;

/**
 * @author Roland Pangu
 */

public class Exercise_6_28 {
	public static void main(String... args) {
		System.out.print("Enter your average: ");
		Scanner input = new Scanner(System.in);
		System.out.println();

		int average = Integer.parseInt(input.next());
		System.out.printf("Your quality point is %d\n", qualityPoints(average));
	}

	private static int qualityPoints(int average) {
		if (average >= 90 && average <= 100) {
			return 4;
		} else if (average <= 80 && average >= 89) {
			return 3;
		} else if (average <= 70 && average >= 79) {
			return 2;
		} else if (average <= 69 && average >= 60) {
			return 1;
		} else {
			return 0;
		}
	}
}
