package exercise_java;

public class LargestElementInArray {
    public static void main(String[] args) {

        int[] elementInArray = new int[]{10, 20, 300, 40, 50, 60, 70};

        int largest = elementInArray[0];
        int smallest = elementInArray[0];
        for (int i = 0; i < elementInArray.length; i++) {
            if (elementInArray[i] > largest)
                largest = elementInArray[i];
            if (elementInArray[i] < smallest)
                largest = elementInArray[i];
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
