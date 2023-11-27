package ArrayQue;

public class bubbleSort {
public static void main(String[] args) {
    System.out.println("Aryan Raj"+ "0131CL221019"+"\nBubble Sort");
    int[] a = {8,7,10,12,2,4,6};
    int temp;
    for(int i =0;i<a.length;i++)
    {
        int flag =0;
        for(int j = 0;j<a.length-1-i;j++)
        {
            if(a[j]<a[j+1])
            {
                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                flag=1;
            }
        } 
        if(flag==0)
        {
            break;
        }
    }
    System.out.print( "Sorted Array : ");
    for(int i=0;i<a.length;i++)
    {
        System.out.print(a[i]+" ");
    }
}
}