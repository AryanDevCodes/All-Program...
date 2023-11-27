package Programs;
import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter 1st Number");
        int num1 = Scan.nextInt();
        System.out.println("Enter 2nd Number");
        int num2 = Scan.nextInt();
        System.out.println("Sum = ");
System.out.println(num1+num2);


Scan.close();
    }
}