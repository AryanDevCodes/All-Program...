package ArrayQue;

import java.util.Scanner;
public class LinearSerch {
    public static void main(String[] args)
    {
		  Scanner sc = new Scanner(System.in);
        String[] arr = {"Ram","Shyam","Sita","Ravan","Hanuman","Laxman"};
//        int size = sc.nextInt();
        String item = sc.next();
//        String[] arr = new String[size];
        
	          int temp = 0;
	     for(int i = 0 ; i<arr.length ; i++)
	      {
			   if (arr[i].equals(item))
         {
             temp = temp+1;
				 System.out.println("Name Present At" + i + "Idex");
			}
			sc.close();
			
	  }
	  if(temp==0)
	  {
			System.out.println("Item Not Found ..... ");
	  }
    }
}
