package Loops;

import java.util.Scanner;

public class ReverseDigitsOfNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter NUmber  = ");
            int num = sc.nextInt();
            int reverse = 0;
            for(;num>0;)
            {
                reverse = (reverse*10+num%10);
                num = num/10;
            }
            System.out.println(reverse);
            sc.close();
        }
    }
    
}
