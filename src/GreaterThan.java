public class GreaterThan {
    public static void main(String[] args) {
        int rowNumber = 5;
        for (int row = 0; row < rowNumber; row++) {
                 for (int columnSpace = 0; columnSpace < row; columnSpace++) {
                        System.out.print(" ");
        }
        for (int coulmnAstrick = 0; coulmnAstrick < rowNumber; coulmnAstrick++) {
            System.out.print("*");
        }
        System.out.println();
        }


        for (int row = rowNumber; row > 0; row--) {
            for (int columnSpace = 0; columnSpace < row; columnSpace++) {
                System.out.print(" ");
            }
            for (int coulmnAstrick = 0; coulmnAstrick < rowNumber; coulmnAstrick++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    /*
    *                   *****
    *                       *****
    *                           *****
    *                               *****
    *                                   *****
    *                                       *****
    *                                   *****
    *                               *****
    *                           *****
     */
}

