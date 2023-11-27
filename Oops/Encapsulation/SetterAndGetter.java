package Oops.Encapsulation;

class Student_2 {
    int Roll;
    String Name;

    // public void setData(){
    //     Roll = 19;
    //     Name = "Aryan";
    // }
    // public void getData(){
    //     System.out.println(Roll + " " + Name);
    // }
    
    public void setname(String Name){
        this.Name = Name;
    }
    public void SetAge(int Roll){
        this.Roll = Roll;
    }
    public String getName(){
        return Name;
    }
    public int getRoll(){
        return Roll;
    }
}
public class SetterAndGetter {
    public static void main(String[] args) {
        Student_2 St = new Student_2();
        St.SetAge(12);
        St.setname("Aryan Raj");
        int Roll = St.getRoll();
        String Name = St.getName();
        System.out.println(Roll + " " + Name);
    }
}
