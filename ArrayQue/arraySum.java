package ArrayQue;

import java.util.Scanner;
// import java.util.*;

public class arraySum{
    static Scanner sc = new Scanner(System.in);
    static int size = sc.nextInt();
     arraySum(int size,Scanner sc){
        arraySum.size = size;
        arraySum.sc = sc;
    }
    
    public static int[] takingInput(int size , Scanner sc){
        System.out.print("Enter Size = ");
        int arr[] = new int[size];
        System.out.println("Enter Values : ");
        for(int i =0 ; i<size ; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static int sum(int arr[]){
          int sum = 0;
              for(int i = 0 ; i<arr.length;i++)
            sum = sum+arr[i];
            return sum;
        }
        public static int sum2(int[] arr1){
            int sum = 0;
            for(int i=0;i<arr1.length;i++){
                sum = sum+arr1[i];
            }
            return sum;
        }

    
    public static void main(String[] args) {
            int arr[] = takingInput(size, sc);
            int arr1[] = takingInput(size,sc);
            int arraySum = sum(arr)+ sum2(arr1);
            System.out.print("Sum = " + arraySum);
        }
    }