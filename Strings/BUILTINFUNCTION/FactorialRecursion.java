import java.util.Scanner;

public class FactorialRecursion {

    public static int getNumber(Scanner scanner) {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void showResult(int n, long fact) {
        System.out.println("Factorial of " + n + " is: " + fact);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = getNumber(scanner);
        long result = factorial(num);
        showResult(num, result);

        scanner.close();
    }
}
