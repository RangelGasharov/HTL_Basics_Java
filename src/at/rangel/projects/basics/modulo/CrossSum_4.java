package at.rangel.projects;

public class CrossSum_4 {
    public static void main(String[] args) {
        int number = 684564;

        System.out.println("\nThe one digit checksum of the number " + number + " is " + oneDigitCheckSum(number) + ".\n");
    }

    public static int oneDigitCheckSum(int number) {
        if (number <= 9) {
            return number;
        }

        int checkSum = number % 10 + oneDigitCheckSum(number / 10);

        if (checkSum > 9) {
            return oneDigitCheckSum(checkSum);
        } else {
            return checkSum;
        }
    }
}



