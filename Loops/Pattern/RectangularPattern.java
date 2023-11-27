package Loops.Pattern;

import java.util.Scanner;

public class RectangularPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Row  = scan.nextInt();
        int Column = scan.nextInt();
        for (int i = 1;i<=Row;i++)
        {
            for(int j = 1;j<=Column;j++)

//          For Printing Rectangular Pattern .. 
            {
                if(i==1 || i==Row ||j ==1 || j==Column)
                {
                    System.out.print("*");
                }
                 else
                {
                    System.out.print(" ");
                }
            }
           
            System.out.println();
        }
        scan.close();
    }
}