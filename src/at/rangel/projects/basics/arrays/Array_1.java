package at.rangel.projects.basics.arrays;

public class Array_1 {
    public static void main(String[] args) {
        int[] sampleArray = new int[10];

        sampleArray[0] = 10;

        for (int i = 0; i < sampleArray.length; i++) {
            System.out.print(sampleArray[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------");

        int[][] cellBoard = new int[3][3];

        cellBoard[0][0] = 12;
        cellBoard[2][1] = 34;

        for (int row = 0; row < cellBoard.length; row++) {
            for (int col = 0; col < cellBoard.length; col++) {
                System.out.print(cellBoard[row][col] + " ");
            }
            System.out.println();
        }

    }
}