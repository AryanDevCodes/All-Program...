package LinkedLIst;

public class Stack {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LinkedLIstStack{
        Node head = null;
        int size = 0;
        
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        public int peek(){
            if(head != null){
                return head.data;
            }
            else{
                System.out.println("Stack is Empty");
                return -1;
            }
        }
        // void displaycurr(Node h){
        //     if(h==null){
        //          return ;
        //          displaycurr(h.next);
        //          System.out.print(h.data + " ");
        //     }
        // }
        // void display(){
        //     displaycurr(head);
        //     System.out.println();
        // }
         public void pop(){
            if(head == null){
                System.out.println("Underflow");
                return ;
            }
            else{
                head = head.next;
                return ;
            }
         }
        void display(){
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.data+" ");
                temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedLIstStack ll = new LinkedLIstStack();
        ll.push(45);
        ll.push(12);
        ll.push(78);
        ll.push(48);
        ll.display();
        ll.pop();
        ll.display();
        System.out.println(ll.peek());
        System.out.println(ll.size);
    }
}
}
