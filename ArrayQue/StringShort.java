package ArrayQue;

import java.util.Arrays;

public class StringShort{
    public static void main(String[] args) {
        String[] a={"Ashish","Sunny","Honey","Johny","Ashutosh"};
        int size = a.length;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                //for Descending Just Change
                //     > - <
                if(a[j].compareTo(a[i])>0)
                {
                   String temp= a[i];
                   a[i] = a[j];
                   a[j] = temp;
                }
            }
        }        
        
        System.out.println(Arrays.toString(a)+" ");
        
    }
}