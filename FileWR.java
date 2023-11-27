import java.io.FileWriter;
public class FileWR {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("JNCT.txt");
            fw.write("Hellooo JNCT : ");
            fw.close();
            System.out.println("\n File Is Created ");
        } catch (Exception e) {
            System.out.println("There is IOException : ");
        }
    }
}
