package ControlFlow;


import java.util.*;

public class youngestandTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        int amarHeight = sc.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int akbarHeight = sc.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int anthonyHeight = sc.nextInt();

        //  Find youngest
        String youngest = "Amar";
        int minAge = amarAge;

        if (akbarAge < minAge) {
            youngest = "Akbar";
            minAge = akbarAge;
        }
        if (anthonyAge < minAge) {
            youngest = "Anthony";
            minAge = anthonyAge;
        }

       //Find tallest
        String tallest = "Amar";
        int maxHeight = amarHeight;

        if (akbarHeight > maxHeight) {
            tallest = "Akbar";
            maxHeight = akbarHeight;
        }
        if (anthonyHeight > maxHeight) {
            tallest = "Anthony";
            maxHeight = anthonyHeight;
        }


        System.out.println("Youngest friend is: " + youngest + " (Age: " + minAge + ")");
        System.out.println("Tallest friend is: " + tallest + " (Height: " + maxHeight + " cm)");

    
    }
}
