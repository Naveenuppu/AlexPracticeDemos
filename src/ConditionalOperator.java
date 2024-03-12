public class ConditionalOperator
{
    public static void main(String[] args) {
      int givenNumber = 5;
      for(int row = 0;row < givenNumber; row++)
      {
          System.out.println(row + " row");
          for (int column = givenNumber-1; column >= 0; column--) {
              System.out.println(column + " column");
              System.out.print("*");
          }
          System.out.println("");
      }

    }

}
