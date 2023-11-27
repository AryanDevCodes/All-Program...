package Conditionals;
import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        
    // Given Marks   A=(marks<=90) , B(marks b/w 80 and 90) , C(marks b/w 70 and 80) , Fail(marks<30) .

    System.out.println("Enter The Marks ");
    Scanner s = new Scanner(System.in);

    int marks = s.nextInt();
    {
    if (marks>=90){
        System.out.println("You Aquire Rank A ");
    }

else if (marks >= 60 && marks <= 90){
    System.out.println("You Aquire Rank B ");
}
}

if (marks >= 30 && marks <= 60){
    System.out.println("You Aquire Rank C");
}

else if (marks<30){
    System.out.println("You Failed");
}
         s.close();
    }
}
