import java.util.Scanner;

public class convert_kilo_mile {
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
        System.out.println("enter the distance in kilometer");
        int kilometer=scanner.nextInt();

       double mile=kilometer*0.621371;
       System.out.println(mile);
        
    }
}
