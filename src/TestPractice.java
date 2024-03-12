import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TestPractice {
    public static void main(String[] args) throws IOException {
        //System.out.println(primeNumberFinder(1,100));
        //Find duplicates
       /* String sentecnce = "Naveen";
        String characters = "";
        String duplicates = "";

        for(int i=0; i < sentecnce.length(); i++){
            String currentChar = Character.toString(sentecnce.charAt(i));
            String lowerCase = currentChar.toLowerCase();
            if(characters.contains(lowerCase)){
                if(!duplicates.contains(lowerCase)) {
                    duplicates += lowerCase+",";
                }
            }
            characters += lowerCase;
        }
        System.out.println(duplicates);*/

        //Reading text files in java
      /* String filepath = "/Users/idiot/Downloads/fileforjava.txt";
        File file = new File(filepath);
        Scanner scan = new Scanner(file);
        String fileContent = "";
        while (scan.hasNextLine())
        {
            fileContent = fileContent.concat(scan.nextLine()+"\n");
        }

        FileWriter writer = new FileWriter("/Users/idiot/Downloads/fileforjavaWrite.txt");
        writer.write(fileContent);
        writer.close();
*/

        //Pangram
        /* String sentence = "The quick brown fox jumps over the lazy dog";
        boolean[] mark = new boolean[26];
        boolean pangram = true;
        int index = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if(currentChar>='A'&&currentChar<='Z'){
                index = currentChar - 'A';
            }else if(currentChar>='a' && currentChar<='z') {
                index = currentChar - 'a';
            }
            mark[index] = true;
        }

        for(int j = 0; j<mark.length;j++){
            if(mark[j]==false){
               pangram = false;
            }
        }

        if(pangram){
            System.out.println("it is");
        } else{
            System.out.println("it's not");
        }

*/

        //Reverse a string
       /*String s = "Navin";
        String reverse = "";
       for(int j = s.length()-1;j>=0;j--){
           char currentChar = s.charAt(j);
           reverse = reverse+currentChar;
       }

        System.out.println(reverse);*/

        //Read from csv file
        /* String path = "/Users/idiot/Downloads/InsurenceSample.csv";
       BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String lines = "";
        while ((lines = bufferedReader.readLine())!=null){
         String[] s = lines.split(",");
            System.out.println(s[4]);
        }*/

        //Greater than
        /*int rowNumber = 9;
        for(int row = 0; row<rowNumber;row++){
            for(int columnSpace = 0; columnSpace < row;columnSpace++){
                System.out.print("   ");
            }
            for(int columnAstrick = 0; columnAstrick < rowNumber; columnAstrick++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int row = rowNumber; row>=0;row--){
            for(int columnSpace = 0; columnSpace < row;columnSpace++){
                System.out.print("   ");
            }
            for(int columnAstrick = 0; columnAstrick < rowNumber; columnAstrick++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //Just starts
        /*for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >=0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/




    //Prime number finder
    /*public static ArrayList<Integer> primeNumberFinder(int startNumber, int endNumber){


        ArrayList<Integer> primes = new ArrayList<Integer>();

        for(int GivenPrimeNumber = startNumber;GivenPrimeNumber<endNumber;GivenPrimeNumber++){
            int firstPrimeNumeber = 2;
            boolean prime = true;
            while (firstPrimeNumeber<=GivenPrimeNumber/2){
                if(GivenPrimeNumber%firstPrimeNumeber == 0)
                {
                    prime = false;
                    break;
                }
                firstPrimeNumeber++;
            }
            if(prime){
                primes.add(GivenPrimeNumber);
            }
        }
        return primes;*/




    }
}
