package AiQuesttions;
import java.util.Scanner;

public class Ex3{
public static void main(String[] args) {
 
Scanner Scan = new Scanner(System.in);
System.out.print("Enter a = ");
double num1 = Scan.nextDouble();
System.out.print("Enter B = ");
double num2 = Scan.nextDouble();
System.out.print("Enter C = ");
double num3 = Scan.nextDouble();

double d = (num2*num2) - (4.0*num1*num3);

if (d >0.0){
    double r1 = ( -num2 + Math.pow(d, 0.5) / (2.0 * num1));
    double r2 = (-num2 - Math.pow(d,0.5) / (2.0 * num1));
    System.out.println("The Roots Are " + r1 + " and " + r2);
}

else if (d==0){
    double r1 = (-num2/(2*num1));
    System.out.print("The Roots Are = " + r1 );
}

else {
    System.out.println("The Roots Are Not Real");
}

Scan.close();
}
}