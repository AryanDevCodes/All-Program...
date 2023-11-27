package Programs;
import java.util.Scanner;

//Ecercise on Short Hand Operator.

public class Exercise {
/**
 * @param args
 */
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println(" A = ");
int num1 = s.nextInt();
System.out.println(" B = ");
int num2 = s.nextInt();

// Calculating A+B
System.out.println("A+B = " + " " + (num1+num2));

//Calculating A+2B
System.out.println("A+2B = " + " " +(num1+2*num2));

//Calculating A+3B
System.out.println("A+3B = " + " " + (num1+3*num2) );


s.close();
}
}
