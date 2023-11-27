package AiQuesttions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("Enter What You Want To Calcuate = ");
    Scanner Scan = new Scanner(System.in);
String Str = Scan.next();

switch (Str) {
     case "+" : System.out.print("A = ");
                 int num1 = Scan.nextInt();
                 System.out.print("B = ");
                 int num2 = Scan.nextInt();
                 System.out.print("Add = " + (num1 + num2));
                 break;

     case "-" : System.out.print("A = ");
                       Double B =Scan.nextDouble();
                       System.out.print("B = ");
                       Double C = Scan.nextDouble();
                       System.out.print("Answer = " + (B - C));
                       break;              

     case "*": System.out.print("A = ");
                     double num3 = Scan.nextDouble(); 
                     System.out.print("B = ");
                     double num4 = Scan.nextDouble();
                      System.out.print("Multi = " + (num3*num4));
                      break;

     case "/":  System.out.print("A = ");
                     int num5 = Scan.nextInt();
                     System.out.print("B = ");
                     int num6 = Scan.nextInt();
                     System.out.print("Quetient = "+ (num5/num6) +","+"Remainder = "+ (num5 % num6)  );
                     break;

     case "SquareRoot" : System.out.print("Enter Number = ");       
                     double num7 = Scan.nextDouble();
                     double num8 = Math.sqrt(num7);
                     System.out.print("Squareroot = " + num8);
                     break;
                     
     case "Square" : System.out.print("Enter Number = ");
                     double A = Scan.nextDouble();
                     System.out.println("Square = " + (A*A));
                     break;
     
     case "Percent" : System.out.print("Enter Value = ");
                      double D = Scan.nextDouble();
                      System.out.print("Total Value = ");
                      double E = Scan.nextDouble();
                      double Percent = (D/E) * 100 ;
                      System.out.print("Percent = " + Percent);
                      break;
     default : System.out.println("\nEnter What To Calculate = ");                
                }
Scan.close();
    }
}
