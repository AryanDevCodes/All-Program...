package AiQuesttions;
import java.util.Scanner;
public class FindingMaximu {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("A = ");
        int A = Scan.nextInt();
        System.out.print("B = ");
        int B = Scan.nextInt();
        System.out.print("C = ");
        int C = Scan.nextInt();

int Maximum = (A > B)? ((A > C)? A:C) : (B > C)? B : C ;
System.out.println("\nThe Maximum Among All is " + A + " , "+ B + " , " + C + " = " + Maximum);


     Scan.close();
    }
    
}
