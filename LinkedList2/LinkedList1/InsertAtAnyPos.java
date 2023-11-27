package LinkedList1;

public class InsertAtAnyPos {
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static class LinkedList
    {
        Node head = null;
        Node tail = null;

//            Inserting Element ...

        void InsertAt(int index , int val)
        {
            Node t = new Node(val);
            Node temp = head;
            if(index==size())
            {
                InsertAtEnd(val);
                return;
            }
            else if(index == 0)
            {
                InsertAtHead(val);
                return ;
            }
            for(int i = 1;i<=index-1;i++)
            {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

//         For Getting An Element From Linked List  

         int getAt(int index)   // Get Element With Index
        {
            Node temp = head;
            if(index<0 || index>size())
            {
                System.out.print("Wrong Index = ");
                return index;
            }
            for(int i = 1;i<=index;i++)
            {
                temp = temp.next;
            }
            return temp.data;
        }

//           For Deletion ..... 

         void DeleteAtIndex(int index)
         {
            if (index == 0)
            {
                head = head.next;
                return;
            }
            Node temp = head;
            for (int i =1;i<=index-1;i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp.next;
         }

//           For Displaying .....

        void display()
        {
            Node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }

//            For Inserting At Head .....

        void InsertAtHead(int val)
        {
            Node temp = new Node(val);
            
                if (head == null)
                {
                    head = tail = temp;
                }
                else{
                    temp.next = head;
                    head = temp;
                }
            
        }

//            For Inserting At End  ......       

        void InsertAtEnd(int val)
        {
            Node temp = new Node(val);
            if(head==null)
            {
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }

        // for size . .. 
        int size()
        {
            Node temp =head;
            int count = 0;
            while(temp!=null)
            {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.InsertAtHead(45);
        ll.InsertAtHead(50);
        ll.InsertAtHead(48);
        ll.InsertAtHead(90);
        ll.InsertAtHead(65);
        System.out.println();
        ll.InsertAt(1, 49);   
        ll.InsertAt(4, 69);
        ll.InsertAt(0, 25);
        ll.InsertAt(8, 0);
        ll.display(); 
        System.out.println();
        // System.out.println(ll.getAt(-2));
        // ll.DeleteAtIndex(8);
        // ll.DeleteAtIndex(0);
        // ll.DeleteAtIndex(0);
        ll.InsertAt(1,98);
        System.out.print("\nNew List = ");
        ll.display();
        System.out.println();
        System.out.println(ll.head.data);
        System.out.println();
    
        System.out.println(ll.getAt(4));
        ll.display();
    }
}
