package Java_Design.Oops;

interface A1 {
int a = 8; // It Is default Public Static Final...
void A();   // Methods Have No Body In Interface ...
}
class B implements A1{
public void A(){
    System.out.println("Value From Interface "+A.a);
}
}
public class Interface2 {
public static void main(String[] args) {
    System.out.println(A1.a);  // Called By Interface Name (Static)
//    A1 a = new A1();    // we can't Make Object Of Interface...
    
//    A1_ A = new A();   // A method Of Interface Defined By Class
//    A.A();
    
    A1 n = new B();  // Here B can Also be Called As A1...
    // Example :- A dog Is Animal,Living Things
    n.A();
}
}
