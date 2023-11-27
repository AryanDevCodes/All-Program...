package Oops.Constructor;

class Student{
private int Roll;
private String Name;
private int BranchCode;
private String Branch;
private String Section;
Student(String Branch,int BranchCode , String Section){
    
    this.Branch = Branch;
    this.BranchCode = BranchCode;
    this.Section = Section;
}

Student(){

}
Student(String Name , int Roll){
    this.Name = Name;
    this.Roll = Roll;
}
public Integer GetRoll(){
    return Roll;
}
public String GetName(){
    return Name;
}
public String getBranch(){
    return Branch;
}
public  int getBranchCode(){
    return BranchCode;
}

public String getSection() {
    return Section;
}
}
public class ConstructorOverloading {
public static void main(String[] args) {
    Student st = new Student("Aryan",18);
    System.out.println(st.GetName()+ " " +st.GetRoll());
    
    Student st1 = new Student();
    int Roll = st1.GetRoll();
    String Name = st1.GetName();
    System.out.println(Roll + " " + Name);
    
    Student st2 = new Student("Aiml",1226,"A1");
    System.out.println(st2.getBranch()+ " " + st2.getBranchCode()+ " " + st2.getSection());
}
}
