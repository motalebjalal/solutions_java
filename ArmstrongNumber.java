package exercise_java;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.print("Enter value : ");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        int numbers = value;
      /*  int numbers = 370;*/
        int check = 0;
        int values = numbers;
        while (values != 0) {
            int lastValue = values % 10;
            check = check + lastValue * lastValue * lastValue;
            values = values / 10;

        }
        if (check == numbers) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
