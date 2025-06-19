package BUILTINFUNCTION;

import java.util.Scanner;

public class PalindromeChecker {

    // Function to take input
    public static String getInput(Scanner scanner) {
        System.out.print("Enter a string: ");
        return scanner.nextLine().toLowerCase().replaceAll("\\s+", "");
    }

    // Function to check if string is palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    // Function to display result
    public static void displayResult(String str, boolean result) {
        if (result) {
            System.out.println("\"" + str + "\" is a Palindrome ✅");
        } else {
            System.out.println("\"" + str + "\" is NOT a Palindrome ❌");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = getInput(scanner);
        boolean isPalin = isPalindrome(input);
        displayResult(input, isPalin);

        scanner.close();
    }
}

