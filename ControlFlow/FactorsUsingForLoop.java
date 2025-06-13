package ControlFlow;


import java.util.Scanner;

public class FactorsUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

      
        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            System.out.println("Factors of " + number + " (excluding itself) are:");

         
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

      
    }
}
