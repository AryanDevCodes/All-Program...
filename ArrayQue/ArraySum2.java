package ArrayQue;
import java.util.Scanner;

public class ArraySum2 {
    // Taking Input ;
    public static int[] takingInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array = ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Array Values:");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    // Sum Equation

    public static int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = takingInput();
        int ArrSum = sum(arr);
        System.out.println("Sum = " + ArrSum);
    }
}
