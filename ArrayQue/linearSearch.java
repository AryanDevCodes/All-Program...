package ArrayQue;
import java.util.Scanner;
public class linearSearch {
    public static int[] takingInput() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static void print(int[] arr )
    {
        int size = arr.length;
        for(int i = 0 ; i<size ; i++) {
            System.out.println(arr[i]);
        }
        }

    public static int LinearSearch(int[] arr ,int num) {
        for(int i = 0 ;i< arr.length;i++)
        {
            if(num==arr[i])
            {
                return arr[i];
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = takingInput();
        int element = s.nextInt();
        int result = LinearSearch(arr,element);
        System.out.print(result);
        s.close();

    }
}

