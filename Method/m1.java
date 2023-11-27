package Method;

class Student{
    private int age;
    private String name;
    
    public void setData(int age,String name){
        this.age = age;
        this.name = name;
    }
    public void show(){
        System.out.println(name + " "+ age);
    }
}
public class m1 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setData(15, "Aryan");
        obj.show();
    }
}
