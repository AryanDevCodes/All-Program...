package Java_Design.Oops.Inheritance.Types_Of_Inheritance.Single_Inheritance;
class Student{
int Roll;
String Name;
void Working(){
    Roll = 19;
    Name = "Aryan Raj";
    System.out.println(Name + " " + Roll +" Working On Case Study....");
}
}
class AIML extends Student{
@Override
void Working() {
    super.Working();
    Roll = 18;
    Name = "Aryan Kumar";
    System.out.println(Name + " " + Roll +" Working On Case Study....");
}
}
public class Single_Inheritance2 {
public static void main(String[] args) {
    AIML AI = new AIML();
    AI.Working();
}
}
