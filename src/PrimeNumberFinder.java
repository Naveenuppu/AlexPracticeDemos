public class PrimeNumberFinder
{
    public static void main(String[] args) {
        //Pangram
        String s = "The quick brown fox jumps over the lazy dog";
        boolean[] mark = new boolean[26];
        boolean pangram = true;
        int index = 0;

        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            if(currentChar >= 'A' && currentChar <= 'Z'){
                index = currentChar - 'A';
            }else if(currentChar >='a' && currentChar <= 'z'){
                index = currentChar - 'a';
            }
            mark[index] = true;
        }
        for (int j = 0; j < mark.length; j++) {
            if(mark[j]==false){
                pangram = false;
            }
        }

        if(pangram){
            System.out.println("it is");
        } else {
            System.out.println("it's not");
        }

        String result = pangram ? "it is" : "it's not";
        System.out.println(result);



    }
}