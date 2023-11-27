package LinkedList1;

public class ReverseList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;

        public void ReverseList(){
            Node temp = head;
            Node previous = null,current = null;
            while(temp!=null){
                current = temp;
                temp = temp.next;
                // reversing
                current.next = previous;
                previous=current;
                head = current;
            }
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
        }
    }
    void InsertAtHead(int value){
        Node temp = new Node(value);
        temp.next = head;
        head = temp;
    }
}
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.InsertAtHead(56);
        ll.InsertAtHead(45);
        ll.InsertAtHead(12);
        ll.InsertAtHead(78);
        ll.InsertAtHead(40);
       
        ll.display();
        System.out.println();
         ll.ReverseList();
         ll.display();
    }
}
