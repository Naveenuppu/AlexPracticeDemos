import java.sql.PseudoColumnUsage;

public class RollingDice
{
    public static void main(String[] args)
    {
        String s = "The quick brown fox jumps over the lay dog";
        boolean[] mark = new boolean[26];
        boolean paligram = true;
        int index = 0;

        //use for loop and - '-A' to get num values and store it in mark array(false or true)
        for(int i=0;i<s.length();i++){
           char currentChar = s.charAt(i);
           if(currentChar>='A'&&currentChar<='Z'){
               index = currentChar - 'A';
           } else if(currentChar>='a'&&currentChar<='z'){
               index = currentChar - 'a';
           }
           mark[index] = true;
        }

        for(int j = 0; j<mark.length;j++){
            if(mark[j]==false){
                paligram = false;
            }
        }

        if(paligram){
            System.out.println("it is");
        }else{
            System.out.println("it's not");
        }
    }
}


