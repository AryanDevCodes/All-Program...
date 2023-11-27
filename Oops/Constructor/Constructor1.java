package Oops.Constructor;
class Student1 {
    private int Roll;
    private String  Name;
    public Student1(){
    
    }
    Student1(int Roll, String Name){
        this.Name = Name;
        this.Roll = Roll;
    }
    public String getName() {
        return Name;
    }
    public int getRoll() {
        return Roll;
    }
}
public class Constructor1 {
    public static void main(String[] args) {
        Student1 st = new Student1(12, "Aryan");
        System.out.println(st.getRoll() + " " + st.getName());
        Student1 st2 = new Student1();
        System.out.println(st2.getName());
        System.out.println(st2.getRoll());
    }
    
}
