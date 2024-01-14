package exercise_java;

import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] elements = new int[]{1, 5, 2, 4, 3, 4, 5, 6, 7};

        Arrays.sort(elements); // sort for array elements
        for (int numbers : elements) {
            System.out.print(numbers);
        }
        System.out.println("____________________________________");

        // search duplicate elements
        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[i] == elements[j]) {
                    System.out.println(elements[j]);

                }

            }
        }


    }
}
