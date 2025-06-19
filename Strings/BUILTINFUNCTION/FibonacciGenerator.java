package BUILTINFUNCTION;

import java.util.Scanner;

public class FibonacciGenerator {

    // Function to generate and print Fibonacci sequence
    public static void printFibonacci(int terms) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Sequence: ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();

        // Call function
        printFibonacci(terms);

        scanner.close();
    }
}

