import java.util.Scanner;
import java.util.Stack;

public class TakingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st  = new Stack<>();
        System.out.println("Enter the size of Stack : ");
        int n = sc.nextInt();
        System.out.println("Enter the Element : ");
        for(int i = 1; i<=n; i++)
        {
             int x = sc.nextInt();
             st.push(x);
        }
        System.out.println(st);
       sc.close();
    }
}
