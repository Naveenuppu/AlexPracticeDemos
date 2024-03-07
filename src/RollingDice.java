import java.io.*;

public class RollingDice {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/idiot/Downloads/InsurenceSample.csv"));

        String lines = "";
        while((lines =bufferedReader.readLine())!=null){
            String[] values = lines.split(",");
            System.out.println(values[1]);
        }
    }
}


