package String;

public class String1 {
    public static void main(String[] args) {
        
        // String name = "Aryan";  // Immutable String
        // System.out.println(name);
        // name.concat("Ashish");
        // System.out.println(name);   //  No Change
        // System.out.println();


        // StringBuilder  name1 = new StringBuilder("Aryan");     // Mutable String
        // System.out.println(name1);
        // name1.append(" Ashish");
        // System.out.println(name1);          // Changed 

        //           Comparing Strings  :->

        // String s1 = "Aryan";
        // String s2 = "Aryan";
        // System.out.println(s1==s2);         // True

        // String st = new String("Aryan");
        // String st1 = new String("Aryan");
        // System.out.println(st == st1);      // False

        // String s1 = new String("Aryan");
        // String s2 = new String("Aryan");
        // System.out.println(s1.equals(s2));  // True

        // String s1 = "Aryan";
        // String s2 = "Aryan";
        // System.out.println(s1.equals(s2));     // True

        // String s1 = new String("Aryan");
        // s1.concat("Raj");   // not added because it makes another String object
        //                         //  in Heap Which is not stored In Any variable
        // System.out.println(s1);

        // String s1 = "Aryan";
        // String s2 = s1+"AryanRaj";   // AryanAryanRaj
        // System.out.println(s2);

        // String s1 = new String("Aryan");
        // String s2 = s1.concat("Raj");         //  AryanRaj
        // System.out.println(s2);
        
        String st  = new String("Aryan");
        String st1 = st.concat("Aryan raj Singh");
        System.out.println(st1);
                
    }
}
