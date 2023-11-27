package Oops;
public class CreateObject {
    int Roll;
    String Name;
    public static void main(String[] args) {
        CreateObject Co = new CreateObject();
        Co.Roll = 8;
        Co.Name = "Aryan";
        System.out.print(Co.Roll + " " + Co.Name + Co.hashCode());
    }
}
