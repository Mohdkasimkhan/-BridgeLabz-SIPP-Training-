package BUILTINFUNCTION;

import java.util.Scanner;

public class PrimeChecker {

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime
        }

        // Only check till √number for efficiency
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Divisible by some number → not prime
            }
        }

        return true; // No divisors found → prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number to check if it's prime: ");
        int num = scanner.nextInt();

        // Check prime
        if (isPrime(num)) {
            System.out.println(num + " is a Prime number ");
        } else {
            System.out.println(num + " is NOT a Prime number ");
        }

        scanner.close();
    }
}

