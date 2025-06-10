import java.util.Scanner;

public class perimeter_rectangle {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the height of rectangle");
        int length=sc.nextInt();
        System.out.println("enter the width of rectangle");
        int width=sc.nextInt();
        double perimeter_rectangle=2*(length+width);
        System.out.println(perimeter_rectangle);
        
    }
}
