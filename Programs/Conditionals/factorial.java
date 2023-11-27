package Conditionals;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A Number = ");
        int num = scan.nextInt();
        int factori = 1;
        // for (int i = 1; i <= num; i++) {
        //     factori = factori * i;
        // }
        int i=1;
        while(i<=num)
        {
            factori = factori*i;  
            i++;
        }
        System.out.println("Factorial of " + num + " = " + factori);

        scan.close();
    }
}
