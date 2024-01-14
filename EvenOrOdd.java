package exercise_java;

public class EvenOrOdd {
    public static void main(String[] args) {
        int[] number = new int[]{1,2,3,4,5,6,7,8,9,10};

        //for even
        for ( int i = 0; i < number.length; i++ ) {
            int check = number[i];

            if ( check % 2 == 0 ) {
                System.out.println( "Even number : "+check );
            }
        }

        //for odd
        for (int i = 0; i < number.length; i++) {
            int check = number[i];


            if (check % 3 == 0) {
                System.out.println("Odd number : "+check);
            }

        }


    }
}
