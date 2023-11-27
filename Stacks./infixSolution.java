
import java.util.*;
public class infixSolution {
    public static void main(String[] args) {
        
        String str = "9-(5+3)*4/6";
        Stack<Integer> value = new Stack<>();
        Stack<Character> opr = new Stack<>();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            // '0' ->48 , '9'->57
            if(ascii>=48 && ascii<=57){
                value.push(ascii-48);
            } 
            else if(opr.size()==0 || ch=='(' || opr.peek()=='(') 
            opr.push(ch);
            else if (ch==')'){
                while(opr.peek()!='('){
                    //work
                    int v2 = value.pop();
                    int v1 = value.pop();
                    if(opr.peek()=='-') value.push(v1-v2);
                    if(opr.peek()=='+') value.push(v1+v2);
                    if(opr.peek()=='*') value.push(v1*v2);
                    if(opr.peek()=='/') value.push(v1/v2);
                    opr.pop();
                }
                opr.pop(); // removing '('
            }
            else{
                if(ch=='+' || ch=='-'){
                    int v2 = value.pop();
                    int v1 = value.pop();
                    if(opr.peek()=='-') value.push(v1-v2);
                    if(opr.peek()=='+') value.push(v1+v2);
                    if(opr.peek()=='*') value.push(v1*v2);
                    if(opr.peek()=='/') value.push(v1/v2);
                    opr.pop();
                    opr.push(ch);
                }
                if(ch=='*' || ch=='/') {
                    if(opr.peek()=='*' || opr.peek()=='/'){
                        //working operator
                        int v2 = value.pop();
                        int v1 = value.pop();
                          if(opr.peek()=='*') value.push(v1*v2);
                          if(opr.peek()=='/') value.push(v1/v2);
                          opr.pop();
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
            int v2 = value.pop();
            int v1 = value.pop();
                if(opr.peek()=='-') value.push(v1-v2);
                if(opr.peek()=='+') value.push(v1+v2);
                if(opr.peek()=='*') value.push(v1*v2);
                if(opr.peek()=='/') value.push(v1/v2);
                opr.pop();
        }
        System.out.println("Solution : "+value.peek());
    }
}
