package exercise_java;

public class CalculateAvarage {
    public static void main(String[] args) {
        int[][] list1;
        int[][] list2;
        int sum = 0;
        list1 = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {25, 26, 27, 28, 29}
        };
        list2 = new int[][]{
                {1, 2, 3, 4, 6},
                {6, 7, 8, 9, 16},
                {11, 12, 13, 14, 17},
                {16, 17, 18, 19, 18},
                {25, 26, 27, 28, 19}
        };
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                sum += list1[i][j] + list2[i][j];
            }
        }
        float avarage =  (float) sum / 25;
        System.out.println("Total : " + sum);
        System.out.println("Avarage : " + avarage);


    }
}
