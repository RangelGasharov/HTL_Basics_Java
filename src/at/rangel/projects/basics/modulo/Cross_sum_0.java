package at.rangel.projects.basics.modulo;

public class Cross_sum_0 {
    public static void main(String[] args) {
        for (int cnt = 0; cnt < 1001; cnt++) {
            String numberAsString = Integer.toString(cnt);
            char[] numbers = numberAsString.toCharArray();

            int sum = 0;
            for (char number : numbers) {
                sum = sum + Character.getNumericValue(number);
            }
            System.out.println(cnt + " - " + sum);
        }
    }
}
