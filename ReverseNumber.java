package exercise_java;

public class ReverseNumber {
    public static void main(String[] args) {
        int numbers = 566657;
        int reverse = 0;
        int check = numbers;
        while (check != 0) {
            int save = check % 10;
            reverse = reverse * 10;
            reverse = reverse + save;
            check = check / 10;
        }
        System.out.println("Reverse"+" [ " + numbers +" ] : "+ reverse);




    }
}