package at.rangel.projects;

import java.util.Arrays;
import java.util.Collections;

public class Array_4 {

    public static void main(String[] args) {
        int[] arrayToSort = {8, 3, 2, 22, 8, 1};
        Integer[] arrayToSort2 = {9, 212, 29, 43, 12};

        Arrays.sort(arrayToSort);
        Arrays.sort(arrayToSort2, Collections.reverseOrder());

        System.out.println("Sorted Array #1: " + Arrays.toString(arrayToSort));
        System.out.println("Reversed Array #2: " + Arrays.toString(arrayToSort2));
    }

}
