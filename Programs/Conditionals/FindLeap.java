package Conditionals;

import java.util.Scanner;

public class FindLeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year = ");
        int year = sc.nextInt();
    // if(year%4==0)
    //     {
    //         System.out.println("Leap Year");
    //          if(year%100==0)
    //          {
    //             System.out.println("Not Leap Year");
    //             if(year%400==0)
    //             {
    //                 System.out.println("Leap Year");
    //             }
    //             else{
    //                 System.out.println("Not Leap Year");
    //             }
    //          }
    //          else
    //          {
    //             System.out.println("Leap Year");
    //          }
    //     }
    //     else 
    //     {
    //         System.out.println("Not A Leap Year");
    //     }



    // Anothr way

    if((year%400==0) ||(year%4==0 && year%100!=0))
    {
        System.out.println("Leap Year");
    }
    else
    {
        System.out.println("Not A leap Year");
    }
    sc.close();
    }
    
}
