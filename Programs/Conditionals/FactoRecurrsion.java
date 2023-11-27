package Conditionals;

import java.util.Scanner;

public class FactoRecurrsion {
    static int Factorial = 1;
    public static void calcFactorial(int num)
        {
            if(num>=1)
            {
                Factorial=Factorial*num;
                calcFactorial(num-1);
            }
        }
        public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int num = scan.nextInt();
        // FactoRecurrsion ob = new FactoRecurrsion();
        FactoRecurrsion.calcFactorial(num);
        System.out.println("Factorial of "+ num + " = "+ Factorial);
        scan.close();
    }
    }
