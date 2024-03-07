public class PatternExplanation {
    public static void main(String[] args) {
        int middleStartCount = 5;
        for(int row = 1; row <= middleStartCount; row++){
            //1<=5
            //2<=5
            //3<=5
            //4<=5
            //5<=5
            //6<=5 - Exit
            for(int column = 0; column < row; column ++){
                //0<1
                //1<1
                //0<2
                //1<2
                //2<2
                //0<3
                //1<3
                //2<3
                //3<3
                //0<4
                //1<4
                //2<4
                //3<4
                //4<4
                //1<5
                //2<5
                //3<5
                //4<5
                //5<5
                System.out.print("*");
                //prints * at column 0, row 1
                //1<1, false so it'll exit column for loop
                //prints * at column 0, row 2
                //prints * at column 1, row 2
                //2<2, fasle, so it'll exit column loop
                //prints * at column 0, row 3
                //prints * at column 1, row 3
                //prints * at column 2, row 3
                //3<3 false, so it'll exit column loop
                //prints * at column 0, row 4
                //prints * at column 1, row 4
                //prints * at column 2, row 4
                //prints * at column 3, row 4
                //4<4 false, so it'll exit column loop
                //prints * at column 0, row 5
                //prints * at column 1, row 5
                //prints * at column 2, row 5
                //prints * at column 3, row 5
                //prints * at column 4, row 5
                //5<5 false, so it'll exit column loop
            }
            System.out.println();
            //Go to next line
            //Go to next line
            //Go to next line
            //Go to next line
            //Go to next line


            //*
            //**
            //***
            //****
            //*****
        }
    }
}
