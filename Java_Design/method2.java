package Java_Design;

   class Arithmetic{
     int add(int x,int y )
    {
        
        int answer = x+y;
        return answer;
    }   

    int multiply(int x,int y ){
        int result = x*y;
        return result;
    }
}
public class method2 {
 
     public static void main(String[] args) {
      Arithmetic ar = new Arithmetic();
      System.out.println(ar.add(4, 5));
    }
}
