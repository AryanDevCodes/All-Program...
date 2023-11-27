package Programs;
import java.util.Scanner;

//Exercise to find (A-B),(A-2B),(A-4B).

public class Exercise2 {
    public static void main(String[] args) {
        
Scanner s = new Scanner(System.in);
System.out.println("A = ");
int num1 = s.nextInt();
System.out.println("B = ");
int num2 = s.nextInt();



System.out.println("A-B =  " + (num1 - num2));
System.out.println("A-2B = " + (num1 - 2*num2) );
System.out.println("A-4B = " + (num1 - 4*num2));



s.close();
 
}
}
