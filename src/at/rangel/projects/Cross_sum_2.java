package at.rangel.projects;

public class Cross_sum_2 {
    public static void main(String[] args) {
        int number = 92414;

        System.out.println(getCrossSum(number));
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
