package AiQuesttions;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

//        Convert Farenheit To Celcius Or Vice Versa

Scanner Scan = new Scanner(System.in);
System.out.print("Farenheit = ");
double Farenheit = Scan.nextDouble();
double Celcius = (Farenheit - 32) *5/9;
System.out.print("Celcius = ");
System.out.println(Celcius);


Scan.close();
    }
}
