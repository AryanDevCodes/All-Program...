package Sorting;

import java.util.*;

public class LinearSearch{
    public static void main(String[] args) {
        Search();   
    }
    static void Search(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number Of Element : ");
        int size = sc.nextInt();
        System.out.println("Enter Element : ");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
           arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Element To Search : ");
        int item = sc.nextInt();
        
        int i= 0;
        while (i!=size) {
            if(arr[i]==item){
            System.out.println("Element Found At Index :" + i);
            }
            i++;
        }
        sc.close();
}
}

