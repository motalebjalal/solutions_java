package exercise_java;

public class FindSecondLeargestNumber {
    public static void main(String[] args) {

        int [] elements = {10,20,30,500,80,60,40,100};

        int firstNumber = elements[0];
        int secondNumber = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > firstNumber) {
                secondNumber = firstNumber;
                firstNumber = elements[i];
            }
            if (elements[i] < firstNumber && elements[i] > secondNumber) {
                secondNumber = elements[i];
            }

        }
        System.out.println("First Leargest Number : " + firstNumber);
        System.out.println("Second Leargest Number : " + secondNumber);



    }
}
