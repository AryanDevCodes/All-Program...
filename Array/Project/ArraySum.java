package Array.Project;
import java.util.*;
import java.util.Scanner;

// import Programs.userinput;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = sc.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] array3 = new int[array1.length];
        System.out.println("Enter 1st Array : ");
        for(int i = 0;i<size;i++) {
            array1[i] = sc.nextInt();
        }
    
        for(int i = 0;i<size ; i++){            
            System.out.print(array1[i] + " ");
        }
        
        System.out.println("\nEnter 2nd Array : " );
        for(int j = 0;j<size;j++) {
            array2[j] = sc.nextInt();
        }
        for(int j =0;j<size;j++){
            System.out.print(array2[j]+" ");
        }
        System.out.println();
        if(array1.length==array2.length){
            for(int i = 0,j=0,k=0;i<array1.length;i++,j++,k++){
                array3[k] = array1[i]+array2[j];
            }
        
        System.out.println("Sum Of Arrays : ");
        System.out.println(Arrays.toString(array3));
    }
    else{
        System.out.println("length of both Array is Same : ");
    }
    sc.close();
}

    
}
