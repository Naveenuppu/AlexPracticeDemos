public class PatterProgramExplanation {
    public static void main(String[] args) {
        for(int row=1;row<=5;row++){
            for(int column=0;column<row;column++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
/*
row =1, 1<=5 - true
    enter i loop
        column = 0, 0<1 - true
              enter j loop
                    (print *)
                        column increment
                            column = 1, 1<1 - false
                                exit j loop
                                    (print a line)

Second iteration:
row = 2, 2<5 - true
    enter i loop
        column = 0, 0<2 - true
            enter j loop
                (print *)
                    column increment
                        column = 1, 1<2 - true
                            enter j loop
                                (print *)
                                    column increment
                                        column = 2, 2<2 - false
                                            exit j loop
                                                (print a line)

         *
         * *
third iteration:
row = 3, 3<5 - true
    column = 0; 0<3 - true
        print *
            column = 1, 1<3 - true
                print *
                    column = 2, 2<3 - true
                        print *
                            column 3<3 - false
                                exit
                                    print line
    * * *

 */

}
