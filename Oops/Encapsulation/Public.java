package Oops.Encapsulation;

class Student {
    public int Roll;
    public String Name;

    // public void show(int Roll ,String Name){
    // System.out.println(Roll + " " + Name);
    // }
    public void show() {
        System.out.println(Roll + " " + Name);
    }
}

public class Public {
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println("Roll" + " " + "Name");
        st.show();
        System.out.println(st.Roll);
    }
}
