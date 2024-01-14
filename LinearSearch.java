package exercise_java;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        int[] elements = new int[]{10, 20, 30, 15, 50, 55, 60, 70, 75};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int userValue = input.nextInt();
        int search = 0;
        for (int i = 0; i < elements.length; i++) {
            search = elements[i];
            if (userValue == search) {
                break;
            }


        }
        boolean result = userValue == search;
        System.out.println(" Result : " + result);
    }
}
