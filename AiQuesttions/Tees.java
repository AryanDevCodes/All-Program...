package AiQuesttions;
import java.util.Scanner;
public class Tees {
    public static void main(String[] args) {
      
     Scanner Scan = new Scanner(System.in);
        
          int A = Scan.nextInt();
        //  while(A <= 5){
        //      System.out.println("Hello Aryan ");
        //       ++A  ;
        //  }

        // for(;A<=6;){
        //     System.out.println("kk");
        // }
System.out.println("Enter a NUmber " );
        // for (int i=1  ; i<=10 ;i++){
            
        //         System.out.println( A + "*" +(i) +"=="+ A*i);
        //}
                  int i=1;
                while (i<=10){
                    System.out.println(A + "*"+(i) + " = "+ A*i);
                    ;

                }
     Scan.close();
    }
    
}
