package Java_Design.Oops.Static;

import java.util.Scanner;

class Farmer{
int PA;
float time;
static float rate;  // Common For All Borrower , It Saves Memory
float SI;
void Borrow(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Required Amount : ");
    PA = sc.nextInt();
    System.out.println("Enter Time Taken To Repay : ");
    time = sc.nextFloat();
    
    rate = 5f;
}
public float calculateInterest(){
    SI = (PA*rate*time)/100f;
    return SI;
    
}
void display(){
    System.out.println("SI Will Be : "+calculateInterest());
}
}
public class Static_Var_Method_Block {
public static void main(String[] args) {
    Farmer f1 = new Farmer();
    f1.Borrow();
    f1.display();
    
    Farmer F2 = new Farmer();
    F2.Borrow();
    F2.display();
    
}
}
