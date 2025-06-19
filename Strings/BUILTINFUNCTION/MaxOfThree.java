package BUILTINFUNCTION;

import java.util.Scanner;

public class MaxOfThree {

    // Function to take integer input from user
    public static int getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to calculate max of three numbers
    public static int findMax(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take 3 inputs
        int num1 = getInput(scanner, "Enter first number: ");
        int num2 = getInput(scanner, "Enter second number: ");
        int num3 = getInput(scanner, "Enter third number: ");

        // Calculate max
        int max = findMax(num1, num2, num3);

        // Output result
        System.out.println("The maximum of the three numbers is: " + max);

        scanner.close();
    }
}
