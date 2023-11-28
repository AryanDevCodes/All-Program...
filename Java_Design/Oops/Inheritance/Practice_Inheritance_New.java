package Java_Design.Oops.Inheritance;

import java.util.Scanner;

class Animal{  //Super Class
void sound(){
    System.out.println("They Make Sound...");
}
void eat(){
    System.out.println("They Eat...");
}
}
class  Birds extends Animal{
@Override
void eat() {
    System.out.println("They Eat All Eatable Things...");}
@Override
void sound() {
    System.out.println("They Make Noise...");
}
}
class NotFlying extends Birds{
@Override
void eat() {
    System.out.println("They Are Specially Omnivores...");
}

@Override
void sound() {
    System.out.println("They Can't Fly....");
}
}
class Flying extends Birds {
    @Override
    void eat() {
        System.out.println("They Eat Grains...");
    }
    @Override
    void sound() {
        System.out.println("They Can Fly....");
    }
}
class Herbivores extends Animal{
    @Override
    void eat() {
        System.out.println("They Eat Grass And Leaf...");
    }
}
class Carnivores extends Animal{
    @Override
    void eat() {
        System.out.println("They Only Eat Flesh...");
    }
}

public class Practice_Inheritance_New {
public static void main(String[] args) {
//    Carnivores c = new Carnivores();
//    c.eat();
//    c.sound();
    
//    Birds B = new Birds();
//    B.eat();
//    B.sound();
    
    System.out.println("Herbivores"+"\nCarnivores" + "\nBirds" + "\nNotFlying"+"\nFlying");
    System.out.println("Make An Input Please From Above....");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    
    switch (str){
        case "Carnivores":
            Carnivores c = new Carnivores();
            c.sound();
            c.eat();
            break;
        case "Herbivores" :
            Herbivores H = new Herbivores();
            H.eat();
            H.sound();
            break;
        case "NotFlying" :
            NotFlying NF = new NotFlying();
            NF.eat();
            NF.sound();
            break;
        case "Flying" :
            Flying F = new Flying();
            F.eat();
            F.sound();
            break;
        case "Birds":
            Birds B = new Birds();
            B.sound();
            B.eat();
            break;
    }
    
}
}
