package Java_Design.Oops;

interface A{
    int a = 8; // It Is default Public Static Final..
void A();   // Methods Have Not Body In Interface ..
}
public class Interface1 {
public static void main(String[] args) {
    System.out.println(A1.a);  // Called By Interface Name (Static)
//    A a = new A();    // we can't Make Object Of Interface...
}
}
