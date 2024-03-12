import java.util.ArrayList;

public class PrimeNumbersPractice
{
    public static void main(String[] args)
    {
        System.out.println(findPrimes(1,100));
    }
    public static ArrayList<Integer> findPrimes(int startNumber, int endNumber){

        //int givenNumber = 18;
        ArrayList<Integer> primes = new ArrayList<>();
        for(int givenNumber=startNumber; givenNumber<endNumber;givenNumber++){
            int firstPrimeNumeber=2;
            boolean prime = true;

            while(firstPrimeNumeber<givenNumber/2){
                if(givenNumber%firstPrimeNumeber==0){
                    prime = false;
                    break;
                }
                firstPrimeNumeber++;
            }
           if(prime){
               primes.add(givenNumber);
           }
        }

        return primes;
    }
}