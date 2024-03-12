import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WordsPerMin
{
    static String[] words= {"word one", "word two", "word three", "word four", "word five", "word six","word seven","word eight", "word nine"};

    public static void main(String[] args) throws InterruptedException {
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        Random random = new Random();
        for(int i=0;i<words.length;i++){
            System.out.print(words[random.nextInt(words.length)]+",");
        }
        double startTime = LocalTime.now().toNanoOfDay();

        System.out.println();
        Scanner scan = new Scanner(System.in);
        String typedWords = scan.nextLine();
        double endTime = LocalTime.now().toNanoOfDay();
        double timeElapsed = endTime-startTime;
        double timeElapsedinSeconds = timeElapsed/1000000000.0;
        int numnberOfWordsEntered = typedWords.length();

        //Formulae
        //(number of words entered/5) / 1min

        int wpm = (int)((((double)numnberOfWordsEntered/5))/timeElapsedinSeconds) * 60;

        System.out.println("your words per min are: "+wpm);




    }
}
