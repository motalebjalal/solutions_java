package exercise_java;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] numbers = new int[]{10, 20, 30, 40, 50};
        System.out.print("Reverse numbers : ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(" " + numbers[i]);
        }
    }
}