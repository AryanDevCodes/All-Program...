package AiQuesttions;
import java.util.Scanner;
public class BinaryNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int BinaryNumber = scan.nextInt();
        int decimalNum = scan.nextInt();
        int power = 1;
        int answer = 0;

//              Binary to decimal

        // while(BinaryNumber>0)
        // {
        //     int unitDigit = BinaryNumber%10;
        //     answer = answer+(unitDigit*power);
        //     BinaryNumber = BinaryNumber/10;
        //     power = power*2;
        // }

         //// Decimal TO Binary

         while(decimalNum>0)
         {
            int parity = decimalNum%2;
            answer = answer+(parity*power);
            power = power*10; 
            decimalNum = decimalNum/2;
         }

        System.out.println(answer);
        scan.close();
    }
}
