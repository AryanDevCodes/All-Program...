package Programs;
import java.util.Scanner;

public class tast {

public static void main(String[] args) {
    
Scanner scan = new Scanner(System.in);
System.out.println("Enter Temperature in Farenheit =  ");

int fr = scan.nextInt();
int cel = (5*(fr-32))/9;
System.out.println("The converted Value" +" in celcius  =\n " + cel);
scan.close();


}


}