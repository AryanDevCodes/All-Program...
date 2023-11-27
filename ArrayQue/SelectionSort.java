package ArrayQue;
public class SelectionSort
{
    public static void main(String[] args) {
        int[] a={38,52,9,18,6,62,13};
        int min;int temp;

        for(int i=0;i<a.length;i++)
        {
            min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(" "+a[i]+" ");
        }
    }

           //  for String

        //    public static void main(String[] args) {
        //     String[] a={"Shiv","Kali","Laxmi","Hanuman","Kartik"};
        //     int min;String temp;

        //     for(int i=0;i<a.length;i++)
        //     {
        //         min=i;
        //         for(int j=i+1;j<a.length;j++)
        //         {
        //             if(a[j].compareTo(a[min])<0)
        //             {
        //                 min=j;
        //             }
        //         }
        //         temp=a[i];
        //         a[i]=a[min];
        //         a[min]=temp;
        //     }
        //     for(int i=0;i<a.length;i++)
        //     {
        //         System.out.println(a[i]);
        //     }
        //    }






}