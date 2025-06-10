import java.util.*;
public class conversion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the temperature in celicius");
        int n=scanner.nextInt();

        int m=((n*9/5)+32);

        System.out.println("the ferenite temperature is "+ m);
        
    }
}
