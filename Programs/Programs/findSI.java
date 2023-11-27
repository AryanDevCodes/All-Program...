package Programs;
import java.util.Scanner;
public class findSI {
    public static void main(String[] args) {
       
       // Calculating Simple Interest

        Scanner s= new Scanner(System.in);
System.out.println("Enter P");  
        int P = s.nextInt();
System.out.println("Enter R");
        int R = s.nextInt();
System.out.println("Enter T (in Months)");
        int T = s.nextInt();
    
       
        int SI = (P*R*T)/100;

System.out.println("SI will be = ");
        System.out.println(SI);

// Calculating Amount 

int Amount = P+SI;
System.out.println("Amount Will Be");
System.out.println(Amount);

s.close();

    }
}
