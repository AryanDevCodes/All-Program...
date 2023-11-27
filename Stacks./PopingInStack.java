import java.util.Scanner;
import java.util.Stack;
public class PopingInStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter Size : ");
        int size  = sc.nextInt();
        for(int i = 0;i<size;i++) 
        {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.print("Stack is : "+ st);
        System.out.println("\nEnter Index : ");
        int index = sc.nextInt();
        Stack<Integer> temp = new Stack<Integer>();
          if(index == st.size()){
            System.out.println("Index is out of bounds");
          }
            else{
             while(st.size()>index){
            temp.push(st.pop());
            st.pop();
            }
        }
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
        sc.close();
    }
}
