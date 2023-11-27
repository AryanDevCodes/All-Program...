package Array;
import java.util.Scanner;

public class Array {
    Scanner sc = new Scanner(System.in);
    
    int arr[] = null ; 
    public Array(int size)
    { 
          System.out.println("Enter Size : ");
         size = sc.nextInt();
        arr = new int[size];
        for(int i=0; i<arr.length;i++){
            arr[i] = 0;
             arr[i] = sc.nextInt();
        }
    }
    // Inserting  Element
    public void Insert(int Index,int value)
    {
        if(arr[Index] == 0){
            arr[Index] = value ;
            System.out.println("Successfully inserted : "+ value);
        }
        else{
            System.out.println("Cell is Occupied");
        }
    }
      //    Traversing

    public void traversal (){
        System.out.println("Array After Traversing : ");
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
    }
    //     Deleting 

    public int[] delete(int Index )
    {
        arr[Index]  = 0;
        System.out.println("The Value Is Deleted Succesfully At Index : "  + Index );
        return arr;
    }
    public static void main(String[] args) {
       Array arr = new Array(size());
    //    System.out.println();
    //    int Element = arr.arr[3];
    //    System.out.println("Element at Given Index : "+Element);
    //    arr.delete(3);
       arr.traversal();
    //    System.out.println();
    //   arr.Insert(3, 5);
    //   arr.traversal();
    }
    private static int size() {
        return 0;
    }
}
