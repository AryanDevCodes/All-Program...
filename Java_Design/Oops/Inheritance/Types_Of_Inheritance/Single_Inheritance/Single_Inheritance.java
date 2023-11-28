package Java_Design.Oops.Inheritance.Types_Of_Inheritance.Single_Inheritance;

class Animal{
void eat(){
    System.out.println("Animal Is Eating....");
}
}
class Tiger extends Animal{
@Override
void eat() {
    super.eat();
    System.out.println("Tiger Is Eating....");
}
}
public class Single_Inheritance {
public static void main(String[] args) {
    Tiger T = new Tiger();
    T.eat();
}
}
