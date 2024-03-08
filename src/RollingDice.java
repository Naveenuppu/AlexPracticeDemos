import java.io.*;

public class RollingDice
{
    public static void main(String[] args)
    {
       //Setting variables
        String s = "The quick brown fox jumps over the lazy dog";
        boolean[] mark = new boolean[26];
        int index = 0;
        boolean pangram = true;

        //Getting numeric values and mark it down in boolean string
        for(int i=0;i<s.length();i++){
            char curChar = s.charAt(i);
            if(curChar>='A'&&curChar<='Z'){
                index = curChar-'A';
            }else if(curChar>='a'&&curChar<='z'){
                index = curChar-'a';
            }
            mark[index] = true;
        }

        for(int j=0;j<mark.length;j++){
            if(mark[j]==false){
                pangram = false;
            }
        }

        if(pangram){
            System.out.println("it is");
        }else{
            System.out.println("it's  not");
        }

    }
}


