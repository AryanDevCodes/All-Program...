import java.util.*;
public class PrefixToInfix {
    public static void main(String[] args) {
           
        String Infix = "9-(5+3)*4/6";
        /* 9-(5+3)*4/6
         * -9/*+5346    
         *  */
         
        System.out.println(":"+Infix);
        Stack<String> value = new Stack<>();
        Stack<Character> opr = new Stack<>();
        for(int i =0;i<Infix.length();i++){
            char ch = Infix.charAt(i);
            int ascii = (int)ch;
            // '0' ->48 , '9'->57
            if(ascii>=48 && ascii<=57){
                String s = "" + ch;
                value.push(s);
                // value.push(ascii-48);
            } 
            else if(opr.size()==0 || ch=='(' || opr.peek()=='(') 
            opr.push(ch);
            else if (ch==')'){
                while(opr.peek()!='('){
                    //work
                    String v2 = value.pop();
                    String v1 = value.pop();
                   char o = opr.pop();
                   String t = o + v1+v2;
                   value.push(t);
                }
                opr.pop(); // removing '('
            }
            else{
                if(ch=='+' || ch=='-'){
                    String v2 = value.pop();
                    String v1 = value.pop();
                   char o = opr.pop();
                   String t = o + v1+v2;
                   value.push(t);
                   opr.push(ch);
                }
                if(ch=='*' || ch=='/') {
                    if(opr.peek()=='*' || opr.peek()=='/'){
                        //working operator
                        String v2 = value.pop();
                    String v1 = value.pop();
                   char o = opr.pop();
                   String t = o + v1+v2;
                   value.push(t);
                          opr.push(ch);
                    }
                    else{
                        opr.push(ch);
                    }
                }
            }
            
        }
        //loop finisshed

        // value.stacksize()>1
        while(value.size()>1){
            String v2 = value.pop();
                    String v1 = value.pop();
                   char o = opr.pop();
                   String t = o + v1+v2;
                   value.push(t);
        }
        System.out.println("Solution : "+value.peek());
    }
    }
