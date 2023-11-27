package LinkedList1;

public class lLinkedListDemo{

    // Making Function to Find Length
    public static int Length(Node a)
    {
        int count = 0 ;
        while(a!=null)
        {
            count++;
            a= a.next;
        }
        return count;
    }

//     By Recussively
     public static void displayR(Node head ){
        if (head==null)
        return;
      // For Displaying list Ineverse Order
      //displayR(head.next);
      // just call the Function 1st Print After that
        System.out.print (head.data + " ");
        displayR(head.next);

    }

    // Creating Function
    public static void print(Node head){
        Node temp = head;
        while(temp !=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static class Node
    {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(6);
        Node b = new Node(5);
        Node c = new Node(4);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(1);
        //  6  5  4  3  2  1   

        // Linking 
        a.next = b; //  6 > 5  4  3  2  1 
        b.next = c; //  6 > 5 > 4 3  2  1  
        c.next = d; //  6 > 5 > 4 > 3  2  1 
        d.next = e; //  6 > 5 > 4 > 3 > 2  1
        e.next = f; //  6 > 5 > 4 > 3 > 2 >1
        // Linking done
        // System.out.println(f.next.data);//  Another Print like this

        // //  Printing Using For Loop : -
        // Node temp = a;
        // // // Node size = Known  ;
        // // for(int i = 1;i <=6; i++)
        // // {
        // //     System.out.println(temp.data + "");
        // //     temp = temp.next;
        // // }

        // // Size = Unknown
        // while(temp!=null)
        // {
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        //     // if(temp == null)
        //     // {
        //     //     break;
        //     // }
        // }

        // using Function/Method
        print(a);  // = 6 5 4 3 2 1 
        // print(b);  // = 5 4 3 2 1 
        System.out.println();
        // By Recussively
        displayR(a);
        System.out.println();
        // Length of List
        System.out.println(Length(a));
    }
}