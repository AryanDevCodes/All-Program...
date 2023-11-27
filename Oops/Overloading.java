package Oops;

class calc{
   void Show(byte n){
    System.out.println("Byte "+n);
}
void Show(short n){
    System.out.println("Short " + n);
}
void Show(int n){
    System.out.println("int "+n);
}
void Show(double n){
    System.out.println("Double " + n);
}
} 
public class Overloading {
    public static void main(String[] args) {
        calc c = new calc();
        c.Show(0.0);
        c.Show(0);
        c.Show(0);         // default int is Accepted in java for Numbers
        c.Show(0);
        c.Show(0);
    }
}
