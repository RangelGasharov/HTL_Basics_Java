package at.rangel.projects;

public class Cross_sum_1 {
    public static void main(String[] args) {
        for (int cnt = 0; cnt < 1001; cnt++) {
            String numberAsString = Integer.toString(cnt);
            char[] numbers = numberAsString.toCharArray();

            int sum = 0;
            for (char number : numbers) {
                sum = sum + Character.getNumericValue(number);
            }

            int rest = sum % 7;
            if (rest == 0) {
                System.out.println(cnt + " - " + sum + " --> Cross-sum is divisible by 7!");
            }

            if (sum == 15) {
                System.out.println(cnt + " - " + sum + " --> Cross-sum is 15!");
            }
        }
    }
}


