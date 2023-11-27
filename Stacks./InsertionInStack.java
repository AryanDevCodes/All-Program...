import java.util.Scanner;
import java.util.Stack;
public class InsertionInStack {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack <Integer> st = new Stack<>();
    int size = sc.nextInt();
    for(int i = 1;i<=size ; i++){
        int x = sc.nextInt();
        st.push(x);
    }
        //Insertion// 
        System.out.print("Enter Index :");
        int index = sc.nextInt();
        System.out.print("Enter Element :");
        int Element = sc.nextInt();
        Stack<Integer> temp = new Stack<Integer>();
        while(st.size()>index){
            temp.push(st.pop());
        }
        st.push(Element);
        System.out.println(st);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.print(temp);  // Empty Temp STack
        System.out.println();
        System.out.println(st);
        System.out.println(st.size());
        st.pop(); 
        sc.close();
    }
    
}
