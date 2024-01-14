package exercise_java;

public class FactorialCalculation {

    public static void main(String[] args) {
        int numbers = 4;
        int fact = 1;
        for (int i = 1; i <= numbers; i++) {
            fact = fact *i;
        }
        System.out.println("Calculate factorial value : "+fact);
    }
}
