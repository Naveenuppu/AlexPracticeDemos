import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class AccPattern {
    public static void main(String[] args) throws IOException {
        //reverseAString("Navin");
        //accenturePattern();
        //readACsvFile();
        //readATextFile();
    }


    //Reverse a string
    public static String reverseAString(String s)
    {

       char[] lettersOfGivenString = new char[s.length()];
       int indexOfLettersString = 0;
       for(int i = s.length()-1;i >= 0; i--)
       {
           lettersOfGivenString[indexOfLettersString] = s.charAt(i);
           indexOfLettersString++;
       }
       String reverse = "";
       for(int j = 0;j < s.length();j++)
       {
           reverse = reverse+lettersOfGivenString[j];
       }
        System.out.println(reverse);
      return reverse;
    }
    //patters
    public static void accenturePattern()
    {
        int rowNumber = 6;
        for(int row = 0; row < rowNumber; row ++)
        {
         //for loop for column space
         for(int columnSpace = 0; columnSpace < row; columnSpace++)
         {
             System.out.print("   ");
         }
         //for loop for column astrick
         for(int columnAstrick = 0; columnAstrick < rowNumber; columnAstrick++)
         {
             System.out.print("*");
         }
         System.out.println();
        }

        //reverse
        for(int j = rowNumber; j >= 0; j--)
        {
            //for loop for column space
            for(int columnSpace = 0; columnSpace < j; columnSpace++)
            {
                System.out.print("   ");
            }
            //for loop for column astrick
            for(int columnAstrick = 0; columnAstrick < rowNumber; columnAstrick++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //another type of pattern
        for(int rowk = 0; rowk <= 6; rowk++)
        {
            for(int column=0; column < rowk; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //read a csv file
    public static void readACsvFile() throws IOException
    {
        String path = "/Users/idiot/Downloads/InsurenceSample.csv";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String lines = "";
        while((lines = bufferedReader.readLine())!=null)
        {
            String[] someThinhg = lines.split(",");
            System.out.println(someThinhg[2]);
        }
    }
    public static void readATextFile() throws IOException
    {
        File file = new File("/Users/idiot/Documents/ReadingText.txt");
        Scanner scan = new Scanner(file);
        String lines = "";
        while(scan.hasNextLine())
        {
            lines = lines.concat(scan.nextLine()+"\n");
        }
         FileWriter writer = new FileWriter("/Users/idiot/Documents/WritingText.txt");
         writer.write(lines);
         writer.close();
    }


}
