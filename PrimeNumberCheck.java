package exercise_java;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.print("Enter number :");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        if (value % 2 == 0) {
            System.out.println("It's prime number : " + value);
        } else if (value % 2 == 1) {
            System.out.println("It's Not prime number : " + value);
        }
    }
}
