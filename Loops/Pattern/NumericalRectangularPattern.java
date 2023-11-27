package Loops.Pattern;

import java.util.Scanner;

public class NumericalRectangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        for(int i=1;i<=rows;i++)
        {
            //for(int j = i;j<=rows;j++)
            // {
            //     System.out.print(j);
            // }
            // for(int k =1;k<=i-1;k++)
            //  {
            //         System.out.print(k);
            //  }

            // Another            
            for(int j= 1;j<=col;j++)
            {
                if((i+j)%2==0)
                { 
                    System.out.print("1");
                }
                else{
                    System.out.print("2");
                }
            }

         System.out.println();
        }
        sc.close();
    }
}
