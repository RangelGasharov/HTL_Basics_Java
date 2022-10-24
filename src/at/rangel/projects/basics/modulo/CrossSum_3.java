package at.rangel.projects.basics.modulo;

public class CrossSum_3 {
    public static void main(String[] args) {

        int[] array = new int[1001];
        for (int i = 0; i < array.length; i++) {
            array[i] = getCrossSum(i);
        }

        int[] count = new int[array.length];
        int temp;
        for (int j : array) {
            temp = j;
            count[temp]++;
        }

        for (int i = 1; i < count.length; i++) {
            if (count[i] == 1) {
                System.out.printf("%d occurs %d times\n", i, count[i]);
            } else if (count[i] >= 2) {
                System.out.printf("%d occurs %d times\n", i, count[i]);
            }
        }
    }

    public static int getCrossSum(int number) {
        int crossSum = 0;
        while (number > 0) {
            int last = number % 10;
            crossSum += last;
            number = number / 10;
        }
        return crossSum;
    }
}
