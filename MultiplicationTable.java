
package exercise_java;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = input.nextInt();
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = number * i;
            System.out.println(number + " × " + i + " = " + result);
        }

    }
}
