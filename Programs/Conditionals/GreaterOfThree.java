package Conditionals;

public class GreaterOfThree {
    public static void main(String[] args) {
        int a =5,b=10,c=20;
        // if(a>b && a>c)
        // {
        //     System.out.println("a is greater");
        // }

        // else if (b>c && b>c)
        // {
        //     System.out.println("b is greater");
        // }

        // else
        // {
        //     System.out.println("c is greater");
        // }




        // Anoter Way

        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is greater");
            } 
            else
            {
                System.out.println(" c is greater");
            }
        }
        else if(b>c)
        {
            System.out.println("b is gretarer");
        }
        else{
            System.out.println("c is greater");
        }
       
    }
    
}
