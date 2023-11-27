package LinkedList1;

public class InsertAtEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;
        void InsertAtEnd(int val)
        {
            Node temp  = new Node(val);
            if ( head == null)
            {
                head = temp;
            }
            else
            {
                tail.next = temp;
            }
            tail = temp;
        }
        void display()
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        int size()
        {
            Node temp = head;
            int count= 0; 
            while (temp!=null)
            {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.InsertAtEnd(4);
        ll.InsertAtEnd(5);
        // ll.display();
        ll.InsertAtEnd(12);
        ll.InsertAtEnd(15);
        ll.InsertAtEnd(65);
        ll.display();
        System.out.println();
    System.out.println("Size = "+ll.size()); 
   }
}
