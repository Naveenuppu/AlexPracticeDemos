public class JavaIsFun {
    public static void main(String[] args) {

        String originalString = "Race car";
        originalString = originalString.toLowerCase().replace(" ","");
        String reverse = "";
        boolean palindrome = true;

        for(int i=originalString.length()-1; i>=0;i--){
            char currentChar = originalString.charAt(i);
            reverse+=currentChar;
        }

        for(int i=0;i<originalString.length();i++){
            if(originalString.charAt(i)!=reverse.charAt(i)){
                palindrome = false;
            }
        }

        if(palindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a plaindrome");
        }
    }


}