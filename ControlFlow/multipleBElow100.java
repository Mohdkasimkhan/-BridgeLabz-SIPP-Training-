package ControlFlow;
import java.util.*;

public class multipleBElow100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number:");

        int number=sc.nextInt();

        if(number<=0 || number>=100){
            System.out.println("enter the number betweeen zero one to hundred");


        } else{
            System.out.println(number);

             for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
        }
    }

