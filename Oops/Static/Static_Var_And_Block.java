package Oops.Static;

public class Static_Var_And_Block {

static int a;

static {
    System.out.println("Static Block...");
    a = 20;
    System.out.println("Static Var : "+a);
}
public static void main(String[] args) {
    System.out.println("Static Block Executed First...");
}
}
