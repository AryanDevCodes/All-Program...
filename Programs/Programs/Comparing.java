package Programs;

import java.util.Scanner;

public class Comparing {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Enter First Value = \n");
    int i = s.nextInt();
    System.out.println("Enter Second Value = \n");
    int j = s.nextInt();
    boolean isEq = (i == j);
    System.out.println(isEq + "\n");

    boolean nk = (i > j);
    boolean nek = (i >= j);
    boolean net = (i < j);
    boolean nem = (i <= j);
    boolean nen = (i != j);

    System.out.println("(i > j)" + "=" + nk);
    System.out.println("(i >= j)" + "=" + nek);
    System.out.println("(i < j)" + "=" + net);
    System.out.println("(i <= j)" + "=" + nem);
    System.out.println("(i != j)" + "=" + nen);

    s.close();
  }

}
