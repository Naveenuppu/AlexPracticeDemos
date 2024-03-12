public class Palindrome {

    public static void main(String[] args) {
        String originalText = "race car";
        originalText = originalText.replace(" ","");
        boolean palindrome = true;

        String reverseString = "";
        for(int i = originalText.length()-1; i>=0; i--)
        {
            reverseString+=originalText.charAt(i);
        }

        for(int i = 0; i<originalText.length(); i++){
            if(originalText.charAt(i) != reverseString.charAt(i)){
                palindrome = false;
            }
        }
        if(palindrome){
            System.out.println("it is");
        }else{
            System.out.println("it's not");
        }
    }
}