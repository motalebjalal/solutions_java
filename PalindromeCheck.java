package exercise_java;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "lol";
        String reverse = "";
        String check = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
            check = reverse.toString();
        }
        System.out.println("Reverse" + " [ " + str + " ] : " + reverse);

        /*if (str.equals(check)) {
            System.out.println("isPalindorm");
        } else {
            System.out.println("is not Palindrome");
        }*/



        boolean palindrom = str.equals(check) ;
        System.out.println("isPalindrom : " + palindrom);

    //with built-in method

       /* String str = "rotor";

      StringBuffer sb = new StringBuffer(str);
        String check = sb.reverse().toString();
        System.out.println(sb);


        boolean palindrom = check.equals(str);
        System.out.println(palindrom);
*/
    }
}
