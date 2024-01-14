package exercise_java;

public class ReverseInString {
    public static void main(String[] args) {
        String str = "Bangladesh";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Reverse"+" [ " + str +" ] : "+ reverse);

    }

}
