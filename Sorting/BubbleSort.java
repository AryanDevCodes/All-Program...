package Sorting;

import java.util.Scanner;

public class BubbleSort {
    
    static void Input(){ 
    
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Element : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            // for(int j = 0;j<arr.length-1;j++) || Loop Having More Time Comlexity
            int flag=0;
            for(int j = 0;j<arr.length-1-i;j++)  
            {
                if(arr[j]>arr[j+1])
                {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
        System.out.print("\nSorted Array Is : ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    public static void main(String[] args) {
       Input(); 
    }
}
