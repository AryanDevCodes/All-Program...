package Loops;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum =  0,z;
       
       // Sum of digits In Number 

        // int On = n;
        // while(n>0)
        // {
        //     sum +=n % 10;
        //     n = n/10;
        // }
        // System.out.println("Sum of  " + On + " = " +sum );
        
       // Sum of Digits Upto n

        // for (int i = 1; i<=n;i++)
        // {
        //     sum = n*((n+1)/2);
        // }
        // System.out.println(sum);

            // Sum of Entered Number As Size n 

           System.out.println("Enter Numbers = ");
           for(int i = 0;i<n;i++)
           {
            z = scan.nextInt();
            sum = sum+z;
           }
           System.out.println("Sum : "+sum);

        scan.close();
    }
    
}
