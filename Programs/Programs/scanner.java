package Programs;
import java.util.Scanner;

public class scanner{
public static void main(String[] args) {
    
System.out.print("Enter A Valuable input =");

Scanner input = new Scanner(System.in);

String kame = input.next();
String hame = input.next();

System.out.println("Here Is Your Valuable Input =   "+kame + hame);
input.close();
}



}