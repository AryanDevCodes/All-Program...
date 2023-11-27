package ArrayQue;

public class comparison {

      static int insertSorted(int array[], int n, int key,  
                            int capacity)  
    {  
        if (n >= capacity)  
            return n;  
  
        array[n] = key;  
  
        return (n + 1);  
    }  
  
    public static void main(String[] args)  
    {  
        int[] array = new int[20];  
        array[0] = 22;  
        array[1] = 26;  
        array[2] = 30;  
        array[3] = 50;  
        array[4] = 60;  
        array[5] = 80;  
        int capacity = 20;  
        int n = 6;  
        int i, key = 34;  
  
        System.out.print("Before Insertion: ");  
        for (i = 0; i < n; i++)  
            System.out.print(array[i] + " ");  
  
        n = insertSorted(array, n, key, capacity);  
  
        System.out.print("\n After Insertion: ");  
        for (i = 0; i < n; i++)  
            System.out.print(array[i] + " ");  
    }  
}  


