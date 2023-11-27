package AiQuesttions;

import java.util.Scanner;

public class Ex1 {
public static void main(String[] args) {
    
    // Sum of Two Numbers
Scanner Scan = new Scanner(System.in);
System.out.print("Enter A = ");
int num1 = Scan.nextInt();

System.out.print("Enter B = ");
int num2 = Scan.nextInt();

System.out.print("Sum = " + (num1+num2));

Scan.close();
}    
}

