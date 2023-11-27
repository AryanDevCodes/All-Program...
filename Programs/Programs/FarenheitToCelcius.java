package Programs;
import java.util.Scanner;

public class FarenheitToCelcius {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.print("Enter The  Temperature in Farenheit" +" = ");
double Farenheit = scan.nextFloat();
double celcius = (Farenheit-32)*5/9;

System.out.println("\n Farenheit in Celcius " +" = " + celcius );

scan.close();
    
}


}

