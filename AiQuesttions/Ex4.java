package AiQuesttions;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        
// Program To Find Area Of 2D Figures

//Area Of Rectangle
Scanner Scan = new Scanner(System.in);
System.out.print("Enter L = ");
Double Num1 = Scan.nextDouble();
System.out.print("Enter B = ");
Double Num2 = Scan.nextDouble();

Double Area = (Num1*Num2);

System.out.println("The Area Of The Rectangle = " + Area );



Scan.close();
    }
    
}
