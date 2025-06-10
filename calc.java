import java.util.*;
class calc_si {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principal amount");
        int p=sc.nextInt();
        System.out.println("enter the rate");
        int r=sc.nextInt();
        System.out.println("enter the time ");
        int t=sc.nextInt();
        double si=p*r*t/100;
        System.out.println(si);

    }
}