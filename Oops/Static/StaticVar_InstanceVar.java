package Oops.Static;

class Num{
static int a,b;

int m,n;
static {
    System.out.println("Static Block...");
    a = 10;
    System.out.println("Static Var : " + a);
    b = 20;
    System.out.println("Static Var : " + b);
}
{
    System.out.println("Non Static Block...");
    m = 30;
    n = 50;
    System.out.println("Non-Static Var : " + m);
    System.out.println("Non-Static Var : " + n);
    
}
}
public class StaticVar_InstanceVar {
public static void main(String[] args) {
    Num n = new Num();
    System.out.println();
    System.out.println("2nd Object ... ");
    Num n1 = new Num();
    
}
}
