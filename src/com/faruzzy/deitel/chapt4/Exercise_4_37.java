package com.faruzzy.deitel.chapt4;

import java.util.Scanner;

/**
 * @author Roland
 */
public class Exercise_4_37 {
   private static String encrypt(String s) {
       String result = "";
       for (int i = 0; i < s.length(); i++) {
           int x = (Character.getNumericValue(s.charAt(i)) + 7) / 10;
           result += x;
       }

       char[] res = result.toCharArray();
       char temp1 = res[0];
       char temp2 = res[1];

       // swap the first with the third
       res[0] = res[2];
       res[2] = temp1;

       // swap the second with the last
       res[1] = res[3];
       res[3] = temp2;

       return result;
   }

   private static String decrypt(String s) {
       String result = "";
       for (int i = 0; i < s.length(); i++) {
           int x = (Character.getNumericValue(s.charAt(i)) - 7) * 10;
           result += x;
       }
       char[] res = result.toCharArray();
       char temp1 = res[2];
       char temp2 = res[3];

       //swap the third with the first
       res[2] = res[0];
       res[0] = temp1;

       // swap the last with the second
       res[3] = res[1];
       res[1] = temp2;

       return result;
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Please enter input: ");
       String input = scanner.next();

       System.out.println();
       String encrypted = encrypt(input);
       String decrypted = decrypt(encrypted);

       System.out.printf("%s encrypted: %s", input, encrypted);
       System.out.printf("%s decrypted: %s", encrypted, decrypted);
   }
}
