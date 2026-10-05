package com.erofeev.practice1;

import java.util.Scanner;

public class ReverseLetter {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String s = scanner.nextLine();

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
                continue;
            }

            if (!Character.isLetter(chars[right])) {
                right--;
                continue;
            }

            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }

        System.out.println("Output: " + new String(chars));

        scanner.close();
    }

}
