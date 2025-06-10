import java.util.*;
class volume_cylinder {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of cylinder");
        int radi=sc.nextInt();
        System.out.println("enter the height of cylinder");
        int height=sc.nextInt();
        double volume_of_cylinder=3.14*(radi*radi)*height;
        System.out.println("thevolume of cylindder"+volume_of_cylinder);

    }
}