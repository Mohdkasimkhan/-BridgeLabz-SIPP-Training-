package BUILTINFUNCTION;

import java.util.Scanner;

public class GcdLcmCalculator {

    public static int[] getInputs(Scanner scanner) {
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        return new int[]{a, b};
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b, int gcdValue) {
        return (a * b) / gcdValue;
    }

    public static void displayResults(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = getInputs(scanner);
        int a = nums[0], b = nums[1];

        int gcdValue = gcd(a, b);
        int lcmValue = lcm(a, b, gcdValue);

        displayResults(a, b, gcdValue, lcmValue);

        scanner.close();
    }
}
