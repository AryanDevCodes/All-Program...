
public class SRM {

    public static class Student {
        String Name;
        String Branch;
        int RollNo;
        Student next;

        Student(String Name, int RollNo, String Branch) {
            this.Name = Name;
            this.Branch = Branch;
            this.RollNo = RollNo;
        }
    }

    public static class StudentManagement {
        Student head;
        void  Insert(int RollNo, String Name, String Branch) {
            Student temp  = head ;
            temp.next = null;
        //    if(head==null){
        //     head = temp;
        //     return ;
        //    }
        //    else{
        //     temp.next = head;
        //     head = temp;
        //    }
        }

        void display() {
            Student temp = head;
            while (temp != null) {
                System.out.println(temp.RollNo + "\n" + temp.Name + "\n" + temp.Branch + "\n");
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {
        StudentManagement st = new StudentManagement();
        st.Insert(19, "Aryan", "AIML");
        st.Insert(18, "Aryan", "AIML");
        st.Insert(07, "Aman", "AIML");
        st.display();
    }
}
