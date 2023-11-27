package AiQuesttions;
import java.util.Scanner;
public class Ecercise {
    public static void main(String[] args) {
        System.out.print("Enter Number = ");
           Scanner Scan = new Scanner(System.in);
             int Num1 = Scan.nextInt();

                   if (Num1%2==1){
                        System.out.println("Weird");
                   }
                 else if ((Num1%2==0) &&(Num1>=2 && Num1 <=5) ) {
                    System.out.println("Not Weird");
                 }
                 if ( (Num1%2==0) && (Num1 >=6 && Num1 <=20)){
                    System.out.println("Weird");
                 }
                 else if ((Num1%2==0) && (Num1>=20)){
                    System.out.println("Not Weird");
                 }
                 if (Num1<0){
                    System.out.println("You Have Entered A negative Number" +" :) " + "Please Correct It ");
                 }
                
       Scan.close();         
   }
}
