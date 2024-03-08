
public class WordsPerMin
{
    /*public static void main(String[] args)
    {
        String sentence = "Naveen";
        String characters = "";
        String duplicates = "";

        for(int i = 0; i<sentence.length(); i++)
        {
            String currentChar = Character.toString(sentence.charAt(i));
            if(characters.contains(currentChar))
            {
                if(!duplicates.contains(currentChar))
                {
                    duplicates+=currentChar+",";
                }
            }
            characters+=currentChar;
        }
        System.out.println(duplicates);
    }*/

    public static void main(String[] args) {
        String sentence = "Naveen";
        String characters = "";
        String duplicates = "";

        for (int i = 0; i < sentence.length(); i++) {
            char curentChar = Character.toLowerCase(sentence.charAt(i));
            String currentCharString = Character.toString(curentChar);


            if (characters.contains(currentCharString)) {
                if (!duplicates.contains(currentCharString)) {
                    duplicates += currentCharString + ",";
                }
            }else{
                characters += currentCharString;
            }
        }
        System.out.println(duplicates);
    }
}
