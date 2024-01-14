//Displaying characters from string
package exercise_java;

import java.util.Scanner;

public class StringToCharacter {
    public static void main(String[] args) {
        char[] ch;
        System.out.print("Type your name: ");
        Scanner input = new Scanner(System.in);
        String myname = input.nextLine();
        int count = 0;
        System.out.println("Displaying characters from string");
        for (int i = 0; i < myname.length(); i++) {
            ch = new char[]{myname.charAt(i)};
            count = i+1;
            System.out.println(ch);
        }
        System.out.println("Character count : " + count);

    }
}
