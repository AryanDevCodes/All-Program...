package Loops.Pattern;
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int Rows = sc.nextInt();
         for(int i = 1;i<=Rows;i++)
         {
            // // Print Rows-i = Spaces
            // for(int j=1;j<=Rows-i;j++)
            // {
            //     System.out.print(" ");
            // }
            // // Print 2*i-1 = Stars
            // for(int k = 1;k<=(2*i-1);k++)
            // {
            //     System.out.print("*");
            // }

//         Number Pyramid .. 
                for(int j = 1;j<=Rows-i;j++)
                {
                    System.out.print(" ");
                }
                // Printing 1 to i
                for(int k = 1;k<=i;k++)
                {
                    System.out.print(k);
                }
                /// i-1  -> 1

                for(int l = i-1;l>=1;l--)
                {
                    System.out.print(l);
                }
            System.out.println();
         }
         sc.close();
    }
}
