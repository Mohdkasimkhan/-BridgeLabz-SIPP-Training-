import java.util.Scanner;

public class power_calc {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=sc.nextInt();
        System.out.println("enter the second number");
        int num2=sc.nextInt();
       
        double result=Math.pow(num1, num2);
        System.out.println(result);
    }
}
