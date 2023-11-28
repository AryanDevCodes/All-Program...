package Java_Design.Oops;
interface A2{
    void show();
}
interface X{
    void display();
}
class B1 implements A2,X {
public void show(){
    System.out.println("Showing.....");
}
public void display() {
    System.out.println("Displaying.....");
}
}
public class Multiple_Interfaces {
public static void main(String[] args) {
    B1 B = new B1();   // Implements A1,X Interface...
    B.display();
    B.show();
}
}
