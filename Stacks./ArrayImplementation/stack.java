package ArrayImplementation;
import java.util.Scanner;

public class stack {
   
        public Scanner sc = new Scanner(System.in);
        public int size = sc.nextInt();
        public int[] arr = new int[size];
        public int index = 0 ;
          
        void push(int value){
            
            if(index==arr.length){
                System.out.println("Overflow detected");
            }
            else{
                 arr[index] = value;
                 index++;
                 }    
        }

        int peek(){
            if(index == 0){
                System.out.println("Stack is Empty : or Underflow :");
                return -1;
            }
            else{
                int top = arr[index-1];
                // arr[index-1] = 0;
                index--;
                return top;
            }
        }
        int pop(){
            if(index == 0){
                System.out.println("Stack is Empty : Underflow  : ");
                return -1;
            }
            else{
                int top = arr[index-1];
                arr[index-1] = 0;
                index--;
                return top;
            }
        }
        void printStack(){
            for(int i=0; i<=index-1;i++){
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    } 
        
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in); 
         System.out.println("Enter The Size Of Array : ");
        stack st = new stack();
        int size = st.size;
        for(int i = 0 ;i < size;i++ ){
            int ele = sc.nextInt();
            st.push(ele);
        }
       
        st.printStack();
        st.pop();
        System.out.println(st.peek());
        st.printStack();
        System.out.println(st.index);
        sc.close();
    }
}
