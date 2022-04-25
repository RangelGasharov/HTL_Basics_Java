package at.rangel.projects;

public class Array_2 {
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
