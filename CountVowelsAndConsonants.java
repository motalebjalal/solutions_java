package exercise_java;

import java.util.Arrays;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        char [] ch;
        String myname = "Jalal";
       ch = myname.toCharArray();
        int i = 0, vowels = 0, consonants = 0;
        while (ch.length>i) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                vowels++;
            } else {
                consonants++;
            }

            i++;
        }
        System.out.println("vowels :" + vowels);
        System.out.println("consonants :" + consonants);




      /*  char[] s;
        int i, vowels = 0, consonants = 0;
        String str = "myname";
        s = str.toCharArray();
        for (i = 0; i<s.length; i++) {
            if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' || s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U') {
                vowels++;
            } else {
                consonants++;
            }


        }

        System.out.println("vowels : " + vowels);
        System.out.println("consonants : " + consonants);*/
    }


}




