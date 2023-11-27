

import java.util.Scanner;

public class Russian {
    public static void main(String[] args) {

     System.out.print("Enter Amount = ");
         Scanner Scan = new Scanner(System.in);
          int Money = Scan.nextInt();

     if (Money>=100000) {
         System.out.println("You Afford Russian");}
               
     else if (Money >= 50000 && Money <=80000){
            System.out.println("Your Are Soo Lucky :) ");
        }

     if (Money <= 50000 && Money >= 30000 ){
         System.out.println("You Are Poor But Fine  ");
}
     else if (Money < 30000) {
         System.out.println("Bhag Madharchod ");
       }

       Scan.close();
}
    }
    
