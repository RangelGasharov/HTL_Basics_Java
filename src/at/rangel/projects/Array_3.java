package at.rangel.projects;

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
}
