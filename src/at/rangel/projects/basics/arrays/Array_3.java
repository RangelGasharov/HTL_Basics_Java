package at.rangel.projects;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Array_3 {
    public static void main(String[] args) {
        int[] array = new int[50];
        int total = 0;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 101);
            System.out.println("+ " + array[i]);
            total += array[i];
        }
        System.out.println("= " + total);
    }

    public static class Array_4 {

        public static void main(String[] args) {
            int[] arrayToSort = {8, 3, 2, 22, 8, 1};
            Integer[] arrayToSort2 = {9, 212, 29, 43, 12};

            Arrays.sort(arrayToSort);
            Arrays.sort(arrayToSort2, Collections.reverseOrder());

            System.out.println("Sorted Array #1: " + Arrays.toString(arrayToSort));
            System.out.println("Reversed Array #2: " + Arrays.toString(arrayToSort2));
        }

        public static class Array_1 {
            public static void main(String[] args){
                int[] sampleArray = new int[10];

                sampleArray[0] = 10;

                for (int i = 0; i < sampleArray.length; i++){
                    System.out.print(sampleArray[i] + " ");
                }
                System.out.println();
                System.out.println("-------------------");

                int[][] cellBoard = new int[3][3];

                cellBoard[0][0] = 12;
                cellBoard[2][1] = 34;

                for (int row = 0; row < cellBoard.length; row++){
                    for (int col = 0; col < cellBoard.length; col++){
                        System.out.print(cellBoard[row][col] + " ");
                    }
                    System.out.println();
                }

            }
        }

        public static class Array_2 {
            public static void main(String[] args) {
                int[] sampleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                int total = 0;
                System.out.println("For-Loop:");
                for (int i = 0; i < sampleArray.length; i++) {
                    total += sampleArray[i];
                    System.out.println("+ " + sampleArray[i]);
                }
                System.out.println("= " + total);
                total = 0;

                System.out.println("");
                System.out.println("For-Each:");
                for(int number: sampleArray){
                    total += number;
                    System.out.println("+ " + number);
                }
                System.out.println("= " + total);
            }
        }
    }
}
