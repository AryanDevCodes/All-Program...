package Java_Design.Oops.Static;

import java.util.Scanner;

class Static{
static int a,b;
int c,d;
static {
    Scanner sc = new Scanner(System.in);
    System.out.println("In Static Block..");
    System.out.println("Enter A : ");
    a = sc.nextInt();
    System.out.println("Enter B : ");
    b = sc.nextInt();
    }

{
    System.out.println("Non - Static Block...");
     c = 20;
     d= 30;
}
static  void display(){
    System.out.println("value Of Static Var : " + a );
    System.out.println("value Of Static Var : " + b );
}
public void display1(){
    System.out.println("Value Of Non Static Member " + c);
    System.out.println("Value Of Non Static Member " + d);
    
}
}
public class Static_Vs_Non_Static {
public static void main(String[] args) {
    Static st = new Static();
   
    Static.display();
    st.display1();
    
    
}
}
