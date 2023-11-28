package Java_Design.Oops;

interface Computer{
    void CompileCode();
}
class Laptop implements Computer{
@Override
public void CompileCode() {
    System.out.println("Found 5 Errors , Slow");
}
}
class Desktop implements Computer{
@Override
public void CompileCode() {
    System.out.println("Found 7 Errors , Faster..");
}
}
class Developer {
public void buidApp(Computer c){
    System.out.println("Building Apps...");
    c.CompileCode();
}

}

public class Interface3 {
public static void main(String[] args) {
Computer c = new Desktop();
Computer c1 = new Laptop();
Developer D = new Developer();
D.buidApp(c);
D.buidApp(c1);
}
}
