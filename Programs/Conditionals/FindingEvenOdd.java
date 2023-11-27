package Conditionals;

import java.util.Scanner;

public class FindingEvenOdd {
    
public static void main(String[] args) {
 
    // Making Program to find even number

    System.out.println("Enter A Number = ");
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();  

   /*  if ( (num %2 )== 0 ){

        System.out.println("You Have Entered An Even Number" );
    }

    else {

        System.out.println("You Entered An Odd Number");
    }*/
       
// Program To Find Odd Number.

if ( (num %2 ) == 1)
{
    System.out.println("You Have Entred An Odd Number");
}
else
{
    System.out.println("You Have Entered Even Number");
}

      
     s.close();



}
}
