package exercise_java;

import java.util.Arrays;
import java.util.Objects;

public class BinarySearch {
    public static void main(String[] args) {
        int[] elements = new int[]{35,36,10, 15, 20, 25, 30,7,9,12};

        // binary search using built-in methods
        /*System.out.println(Arrays.binarySearch(elements,50));*/

        /*its for sort array start here*/

        Arrays.sort(elements);
        for (int numbers : elements){
            System.out.print(numbers+ " , ");
        }

        /*its for sort array end here*/

        System.out.println("\n");



       int findValue = 15 ;
        int left = 0;
        int right = 4;
        int middle;
        int result = -1;

        while (left <= right) {
            middle = (left + right) / 2;
            if (elements[middle] == findValue) {
                result = middle;
                break;
            } else if (findValue < elements[middle]) {
                right = middle - 1;
            } else if (findValue > elements[middle]) {
                left = middle + 1;
            }
        }
        System.out.println(result);


    }
}

