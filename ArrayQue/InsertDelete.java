package ArrayQue;
// import java.util.ArrayList;
// import java.util.Scanner;

public class InsertDelete {
    static int InsertElement(int array[],int size,int Element,int capacity )
    {
        if(size>=capacity)
        {
            array[size] = Element;
        }
        return (size+1);
    }
    public static void main(String[] args)
    {
        // Scanner sc= new Scanner(System.in);
        int[]array = new int[20];
        array[0] = 21;
        array[1]  =22;
        array[2] = 23;
        array[3] = 24;
        array[4] = 25;
        array[5] = 26;
        int capacity = 20;
        int size= 6;
        int i,Element = 65;
        System.out.println("Before Insertion = ");
        for(i = 0;i<size;i++)
        {
            
            System.out.print(array[i]+ " ");
           
        }
         size = InsertElement(array, size, Element, capacity);
        System.out.println("After Insertion = ");
        for(i = 0;i<size;i++)
        {
            System.out.print(array[i] +" ");
        }

    }
}