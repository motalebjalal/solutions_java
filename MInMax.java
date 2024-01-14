package exercise_java;

public class MInMax {
    public static void main(String[] args) {
        int[] number = new int[]{10, 20, 30, 40};
        int max = number[0];
        int min = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
            if (number[i] < min) {
                min = number[i];
            }


        }
        System.out.println("Maximum value :" + max);
        System.out.println("Minimum value :" + min);


    }
}
