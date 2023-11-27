package AiQuesttions;

import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("A = ");
        int A = Scan.nextInt();
        System.out.print("B = ");
        int B = Scan.nextInt();
        System.out.print("C = ");
        int C = Scan.nextInt();

        // Condition True False
        int Max = (A > B) ? ((A > C) ? A : C) : ((B > C) ? B : C);

        System.out.println("Maximum Number Among  " + A + ", " + B + ", " + C + " Is " + Max);
        Scan.close();
    }
}
