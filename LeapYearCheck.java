package exercise_java;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        System.out.print("Check Your Year : " );
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

       if (year % 400 == 0) {
            System.out.println(year + " is leap year! ");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year+" is leap year! ");
        }else {
            System.out.println("is not leap year");
        }



    }
}
