package AiQuesttions;

import java.io.*;
class Vowels   
 {
    public static void main(String[] args) {
        
    }
    void Input()throws IOException
         {
             BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter your Sentence");
             String b = a.readLine();
              int c = b.length();
              int d=0,f=0;
              char e ; 
              for(;d<c;d++)
                 {
                    e = b.charAt(d);
                     if((e=='A')||(e=='E')||(e=='I')||(e=='O')||(e=='U'))  //Used for letters at beginning of Sentence 
                          ++f;
                      if(((e=='a')||(e=='e')||(e=='i')||(e=='o')||(e=='u'))&&((d-1)==' ')&(d!=0))
                           ++f;
                   }
                System.out.print(f);
            }
      }

