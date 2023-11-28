package Oops.Inheritance;
class Human{ // Parent Class , Base
int age;
void sleep(){
    age=10;
    System.out.println("Human Needs To Sleep... of Age : ");
    System.out.print(age);
}
//class Student{  // Independent
//}
}
class Student extends Human{ // Child Class, Sub Class, Derived Class

}
public class Inheritance {
public static void main(String[] args) {
    Student st = new Student();
    st.sleep();
}
}
