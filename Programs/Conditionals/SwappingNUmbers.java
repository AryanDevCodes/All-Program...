package Conditionals;
import java.util.Scanner;
public class SwappingNUmbers {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.print("Enter A = ");
         int A = scan.nextInt();
         System.out.print("Enter B = ");
         int B = scan.nextInt();
// //         TAKING THIRD VARIABLE
//          int c;
//          c=A;
//          A=B;
//          B=c;

//          System.out.println("A = " + A);
//          System.out.println("B = " + B);

// Not Using Third Variable
            
             A=A+B;
             B=A-B;
             A=A-B;
             System.out.println("A = " + A);
             System.out.println("B = " + B);
scan.close();
    }
    
}