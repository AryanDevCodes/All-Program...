package Loops;
import java.util.Scanner;

public class fibbonacci {
    public static void main(String[] args) {
            Scanner Scan = new Scanner(System.in);
    int size= Scan.nextInt();
    int num1=0,num2=1;
    System.out.print(num1+" "+ num2);
    int ans = 0;
    for(int i = 2;i<size;i++)
    {
        ans = num1+num2;
        System.out.print(" " + ans);
        num1 = num2;
        num2 = ans;
    }
    
    Scan.close();
    }
}
