package Conditionals;

import java.util.Scanner;

public class MultipleOfAnyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A Number = ");
        int num = scan.nextInt();
        System.out.println("Multiple Of " + num+" = ");
        // for(int i=1;i<=10;i++)
        // {
        //     int multi = num*i;
        //     System.out.println( num + " X "+ i + " = "+ multi);
        // }
         int i=1;
         while(i<=10)
         {
            int multi = num*i;
            System.out.println(num + " x "+ i + " = "+ multi);
            i++;
         }
         
        scan.close();
    }
}
