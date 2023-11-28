package Java_Design.Oops.Encapsulation;

class Student1{
    private int age;
    private String name;
    public void setAge(int age){
       this.age = age;
    }
    public void setName(String name){
       this.name = name;
    }
    public void Print(){
        System.out.println(name + " " + age);
        System.out.println("Aryan");
    }
}
public class Shadowing {
    public static void main(String[] args) {
        Student1 st = new Student1();
        st.setAge(18);
        st.setName("Aryan");
        st.Print();
    }
}
