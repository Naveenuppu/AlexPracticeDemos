public class ReverseAString
{

    //Simple by navin - not from Alex
    public static void main(String[] args) {
        System.out.println(reverseString("Navin"));
    }
    public static String reverseString(String s){
        String reverse = "";
        for(int i=s.length()-1;i>=0;i--){
            char currentChar = s.charAt(i);
            reverse = reverse + currentChar;

        }
        return reverse;
    }
}