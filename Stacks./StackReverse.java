import java.util.*;
public class StackReverse{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter Size :");
        int size = sc.nextInt();
        for(int i=1 ; i<=size;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.print("Main Stack : "+st);
        Stack<Integer> temp1 = new Stack<Integer>();
        while(st.size()>0){
            temp1.push(st.pop());
        }
        System.out.println("\nPopped Stack : " + st);
        System.out.println("Reversed Stack : " + temp1);
        // Creating 3rd Stack
        Stack<Integer> temp2 = new Stack<>();
        while(temp1.size()>0){
            temp2.push(temp1.pop());
        }
        while(temp2.size()>0){
            st.push(temp2.pop());
        }
        temp2.clear();
        System.out.print("Temp2 is cleared : "+ temp2);
        System.out.println();
        System.out.print("Reversed Stack Stored in Main Stack : "+st);
        sc.close();
    }
}