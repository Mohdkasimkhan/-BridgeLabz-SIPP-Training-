package ControlFlow;



import java.util.*;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      //Declare variables
        double first, second;
        String op;

     
        System.out.print("Enter first number: ");
        first = sc.nextDouble();

        System.out.print("Enter second number: ");
        second = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        op = sc.next();

        
        for (int i = 1; i < 2; i++) {
            //  Switch-case 
            switch (op) {
                case "+":
                    System.out.println("Result: " + (first + second));
                    break;
                case "-":
                    System.out.println("Result: " + (first - second));
                    break;
                case "*":
                    System.out.println("Result: " + (first * second));
                    break;
                case "/":
                    if (second != 0) {
                        System.out.println("Result: " + (first / second));
                    } else {
                        System.out.println("Error: Cannot divide by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid Operator!");
            }
        }

       
    }
}
