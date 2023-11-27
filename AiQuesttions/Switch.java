package AiQuesttions;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        String str = Scan.next();

        {
            switch (str) {
                case "Game":
                    System.out.println("Game is opening ........");
                    break;

                case "Calculator":
                    System.out.println("Calculator is opening ......");
                    break;

                case "PUBG":
                    System.out.println("PUBG Is Opening ...... ");
                    break;

                case "BGMI":
                    System.out.println("BGMI Is Opening ......");
                    break;

                default:
                    System.out.println("Nothing Is Running .......");
                    break;
            }
        }

        Scan.close();
    }

}
