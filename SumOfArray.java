package exercise_java;

public class SumOfArray {

    public static void main(String[] args) {

        int sum = 0;
        int [] sumOfArray = new int[]{1,2,3,4,5,6,7};

        for (int i = 0; i < sumOfArray.length; i++) {
            sum = sum+sumOfArray[i];
        }

        System.out.println("Sum of array : " + sum);

    }

}
