package exercise_java;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] list1;
        int[][] list2;
        int result[][] = new int[5][5];
        list1 = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {25, 26, 27, 28, 29}
        };
        list2 = new int[][]{
                {5, 1, 3, 4, 5},
                {6, 7, 8, 9, 50},
                {55, 51, 53, 54, 55},
                {56, 57, 58, 59, 10},
                {15, 16, 27, 28, 29}
        };

        //Add two lists
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                result[i][j] = list1[i][j] + list2[i][j];
                System.out.println("[" + i + "]\t" + "[" + j + "]\t" + list1[i][j] + " + " + list2[i][j]);

            }
            System.out.println();
        }

        //display result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.println("[" + i + "]\t" + "[" + j + "]\t" + " = " + result[i][j]);
            }
            System.out.println();
        }
    }
}
