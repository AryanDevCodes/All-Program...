package Java_Design.Oops.Inheritance.Types_Of_Inheritance.Hierachical_Inheritance;

class College{
int Roll;
String Name;

void Display(){
}
}
class Student extends College{
void Display(){
    super.Display();
    Roll = 19;
    Name = "Aryan Raj";
    System.out.println(Roll + " "+Name);
}
}
class Student1 extends College{
void Display(){
    super.Display();
    Roll = 18;
    Name = "Aryan Kumar";
    System.out.println(Roll +" " + Name);
}
}
class Student2 extends College{
@Override
void Display() {
    super.Display();
    Roll = 7;
    Name = "Aman Kumar Chaudhary";
    System.out.println(Roll + " " + Name);
}
}
class Student3 extends College{
@Override
void Display() {
    super.Display();
    Roll = 32;
    Name = "Isha Barkhane";
    System.out.println(Roll + " " + Name);
}
}
class OopsCaseStudy extends Student2{
@Override
void Display() {
    Name = "Aman Kumar Chaudhary";
    
    System.out.println("Leader Of The Case Study Team Is " + Name);
}
}
public class Hierachical1 {

public static void main(String[] args) {
    String Branch = "AIML";
    System.out.println("Student of "+Branch+ " Present For Presentation...\n");
    Student St = new Student();
    St.Display();
//    System.out.println();
    
    Student1 St1 = new Student1();
    St1.Display();
    //System.out.println();
    
    Student2 St2 = new Student2();
    St2.Display();
    
Student3 St3 = new Student3();
St3.Display();

OopsCaseStudy Oops = new OopsCaseStudy();
Oops.Display();
}
}