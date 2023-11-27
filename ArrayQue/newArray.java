package ArrayQue;

import java.util.Arrays;

public class newArray {
    
    public static void main(String[] args)
    {
        int[] marks = {45,78,36,45,89};
        // Arrays.fill(marks,90);  // to fill Numbers in array using package

           Arrays.sort(marks);
        int sum = 0;
        for(int i = 0;i<marks.length;i++){
            sum = sum+marks[i];
            System.out.print(marks[i]+" ");
             
        }
        
     
        System.out.print("\nsum : " + sum + "\nsize : " + marks.length );
    }
    
}
