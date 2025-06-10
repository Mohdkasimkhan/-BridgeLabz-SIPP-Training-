import java.util.Scanner;

public class average_3num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num1");
        int num1=sc.nextInt();
        System.out.println("enter the second number");
        int num2=sc.nextInt();
        System.out.println("enter the third number");
        int num3=sc.nextInt();

        double average_3num=(num1+num2+num3)/3;
        System.out.println(average_3num);
    }
}
