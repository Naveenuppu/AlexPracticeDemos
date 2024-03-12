/*
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AllProgramsPractice {
    public static void main(String[] args) throws IOException {
        //System.out.println(findPrimes(1, 1000));
        //pattern
        */
/*Scanner scanner = new Scanner(System.in);
        int GivenNumber = scanner.nextInt();
        System.out.println("You entered "+ GivenNumber+" stars, so here is your patter, ENJOY :)");
        for(int row = 0; row <= GivenNumber; row++)
        {
            for(int column = 0; column < row; column++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int row = GivenNumber-1; row >= 0; row--)
        {
            for(int column = 0; column < row; column++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }*//*

        //Acc pattern
        */
/*Scanner scanner = new Scanner(System.in);
        int GivenNumber = scanner.nextInt();

        for(int row = 0; row < GivenNumber; row++)
        {
            //set space for column
            for (int columnSpace = 0; columnSpace < row; columnSpace++) {
                System.out.print("   ");
            }

            //Set asterisk
            for (int columnAsterisk = 0; columnAsterisk < GivenNumber; columnAsterisk++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int row = GivenNumber; row >= 0; row--)
        {
            //set space for column
            for (int columnSpace = 0; columnSpace < row; columnSpace++) {
                System.out.print("   ");
            }

            //Set asterisk
            for (int columnAsterisk = 0; columnAsterisk < GivenNumber; columnAsterisk++) {
                System.out.print("*");
            }
            System.out.println("");
        }*//*

        //palindrome
        */
/*String originalText = "race car";
        originalText = originalText.replace(" ", "");
        boolean palindrome = true;
        String reverseText = "";
        for (int i = originalText.length() - 1; i >= 0; i--) {
            char currentChar = originalText.charAt(i);
            reverseText += currentChar;
        }
        for (int i = 0; i < originalText.length(); i++) {
            if (originalText.charAt(i) != reverseText.charAt(i)) {
                palindrome = false;
            }
        }
        if(palindrome){
            System.out.println("it is");
        }else {
            System.out.println("it's not");
        }
*//*

        //pangram
        */
/*String givenSentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(givenSentence.length());
        boolean pangram = true;
        boolean[] mark = new boolean[26];
        int index = 0;
        for(int i = 0; i<givenSentence.length(); i++){
            char currentChar = givenSentence.charAt(i);
            if(currentChar >= 'A' && currentChar <= 'Z'){
                index = currentChar - 'A';
            } else if (currentChar >= 'a' && currentChar <= 'z'){
                index = currentChar - 'a';
            }
            mark[index] = true;
        }
        System.out.println(givenSentence.length());
        for(int j = 0; j<mark.length; j++){
            if(mark[j] == false){
                pangram = false;
                break;
            }
        }
        if(pangram){
            System.out.println("it is a pangram");
        }
       *//*

        //prime number finder
        public static ArrayList<Integer> findPrimes (int startNum, int endNum){

            ArrayList<Integer> primes = new ArrayList<Integer>();
            for (int givenNumber = startNum; givenNumber < endNum; givenNumber++) {
                int firstPrimeNum = 2;
                boolean prime = true;
                while (firstPrimeNum < givenNumber / 2) {
                    if (givenNumber % firstPrimeNum == 0) {
                        prime = false;
                        break;
                    }
                    firstPrimeNum++;
                }
                if (prime) {
                    primes.add(givenNumber);
                }
            }
            return primes;
        }
    }
        //reverse a string
        */
/* String name = "Navin";
        String reverse = "";
        for(int i = name.length()-1; i>=0; i--){
            char currentChar = name.charAt(i);
            reverse+=currentChar;
        }
        System.out.println(reverse);*//*

        //duplicates in string
        */
/*String sentence = "How many duplicates are there in here??";
        sentence = sentence.toLowerCase();
        String characters = "";
        String dupliucates = "";
        for(int i=0;i<sentence.length();i++){
            String currentChar = Character.toString(sentence.charAt(i));
            if(characters.contains(currentChar)){
                if(!dupliucates.contains(currentChar)){
                    dupliucates+=currentChar+',';
                }
            }
            characters+=currentChar;
        }
        System.out.println(dupliucates);*//*

        //read a text file
        */
/*String path =  "/Users/idiot/Downloads/fileforjava.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String fileContent = "";
        while (scanner.hasNextLine()){
            fileContent = fileContent+scanner.nextLine()+"\n";
        }
        FileWriter writer = new FileWriter("/Users/idiot/Downloads/fileforwriting.txt");
        writer.write(fileContent);
        writer.close();*//*

        //read a csv file
        */
/*  String path = "/Users/idiot/Downloads/InsurenceSample.csv";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String lines = "";
        while ((lines = bufferedReader.readLine())!=null){
         String[] s = lines.split(",");
            System.out.println(s[0]);
        }*//*





    }*/
