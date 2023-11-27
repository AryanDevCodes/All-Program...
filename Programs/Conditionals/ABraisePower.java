package Conditionals;

import java.util.Scanner;

public class ABraisePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number = ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number = ");
        int num2 = sc.nextInt();
        int answer = 1;
        for(int i = 1;i<=num2;i++)
        {
            answer *= num1;
        } 
        System.out.println(answer);
        sc.close();
    }
    
}
