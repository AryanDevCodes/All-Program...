package Queue;
// import java.util.Scanner;
public class Queue{
    int[] arr ;
    int front;
    int rear;
    public Queue(int size){
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
        System.out.println("Queue Is Successfully Created of Size = " + size);

    }
    public boolean isFull(){
        if(rear==arr.length-1)
        { 
            System.out.println("Overflow");
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(front == -1 || front == arr.length)
        {
            System.out.println("Underflow");
            return true;
        }
        else{
            return false;
        }
    }
///             Inserting ...........

    public void enQueue(int value)
    {   
        // Scanner sc = new Scanner(System.in);
        if(isFull()==true)
        {
            System.out.println("Queue Is Full.." + "Sorry..");
        }
        else if(isEmpty())
        {
            front = 0;
            rear++;
            arr[rear] = value;
            System.out.println("Succesfully Inserted: " + value + " In The Queue");}
            else{
                rear++;
                arr[rear] = value;
                System.out.println("Succesfully Inserted: " + value + " in the queue ");
            }
        }
             public int deQueue(){
            
                if(isEmpty()){
                    System.out.println("The Queue is empty");
                    return -1;
                }
                else{
                    int result = arr[front];
                    front++;
                    if(front>rear)
                    {
                        front = rear =-1;
                    }
                    return result;
                }
            }
         public int peek(){
            if(!isEmpty())
            {
                return arr[front];
            }
            else{
                System.out.println("The Queue Is Empty ");
                return -1;
            }
        }
          public void deleteQueue(){
            arr = null;
            System.out.println("Queue Is Deleted");
          }

    public static void main(String[] args) {
            Queue newQueue= new Queue(5);
       newQueue.enQueue(45);
       newQueue.enQueue( 4);
       newQueue.enQueue(78);
       newQueue.enQueue(78);
       newQueue.enQueue(78); 
    //    newQueue.enQueue(78); 
    //    newQueue.enQueue(78); 
    //    boolean result = newQueue.isFull() ;
    //    System.out.println(result);
    //    boolean resul = newQueue.isEmpty();
    //     System.out.println(resul);
    //    int result0= newQueue.deQueue();
    //    int result1 = newQueue.deQueue();
    //    int result2= newQueue.deQueue();
    //    int result3 = newQueue.deQueue();
    //    int result4 = newQueue.deQueue();
    //    System.out.println(result0);
    //    System.out.println(result1);
    //    System.out.println(result2);
    //    System.out.println(result3);
    //    System.out.println(result4);
    
    //      int result6 = newQueue.peek();
    //      System.out.println(result6);
       
       newQueue.deleteQueue(); 
        
    }
   
}
      
