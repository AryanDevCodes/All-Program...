public class Srting{
    public static void main(String[] args) {
        String str = "Helloooo";
        System.out.println("Length of String Is : " + length(str));
    }
    public static int length(String str){
        if(str.equals(""))
        return 0;
        else
        return length(str.substring(1))+1;
    }
}