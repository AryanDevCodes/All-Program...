package Loops;

import java.util.Scanner;

public class sumofSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = 0;
        for(int i  =1 ; i<=num;i++)
        {
            if(i %2==0)
            {
                answer = answer - i;
            }
            else{
                answer = answer + i;
            }
            
        }
        System.out.println(answer);
        sc.close();
    }
}
