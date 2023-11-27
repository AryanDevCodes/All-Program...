package ArrayQue;
import java.util.Scanner;

public class arrayFunction {

       // Method for Largest In Array : 
    public static int largestInArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int Smallest(int[] arr){
      int max = Integer.MAX_VALUE;
      for(int i = 0;i<arr.length;i++){
        if(arr[i]<max){
          max = arr[i];
        }
      }
      return max;
    }
       // Method for Taking Array Input :
       public static int[] takeInput(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Size = ");
       int size = sc.nextInt();
       int[] arr = new int[size];
       for(int i = 0 ; i<size ; i++)
         {
          arr[i] = sc.nextInt();
         }
       sc.close();
       return arr;
       }

         // Method for Printing The Array : 
       public static void print(int[] arr){
        int size = arr.length;
        for(int i = 0; i < size ; i++)
        
            System.out.println("Values = " + arr[i] +" ");
        }

        // Calling All Methods In Main :
           public static void main(String[] args) 
         { 
            int[] arr = takeInput();
            print(arr);
            int largest = largestInArray(arr);
            int Smallest = Smallest(arr);
            System.out.print("Largest Will  Be = " +largest);
            System.out.println("Smallest Will Be ; " + Smallest);
         }
    }

    
