public class PatternPractice {
    public static void main(String[] args) {
      int middleStartCount = 5;
      for(int row = 1; row <= middleStartCount; row++){
          /*
          row, column
          1<=5
          2<=5
          3<=5
          4<=5
          5<=5
          6<=5
           */
          for(int column = 0; column < row; column ++){
              /*
              column, row
              0<1 *
                1<1
                    0<2 * *
                    1<2
                        2<2
                            0<3 ***
                            1<3
                            2<3
                                3<3
                                    0<4 ****
                                    1<4
                                    2<4
                                    3<4
                                        4<4
                                            0<5 *****
                                            1<5
                                            2<5
                                            3<5
                                            4<5
                                                5<5

               */
              System.out.print("*");


          }
          System.out.println();
         }
    }
}
