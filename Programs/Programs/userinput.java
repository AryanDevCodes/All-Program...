package Programs;
import java.util.Scanner;

public class userinput{

public static void main(String[] args) {
System.out.println("Enter Your Name");
Scanner input = new Scanner(System.in);
String namew =  input.next();
String name = input.next();
System.out.println("Your Name is Shown as "+namew +name);

input.close();
}
}