package study.techno;

import java.util.Arrays;

public class HavingSameLetters {

    public static void main(String[] args) {
        same("listen","silent");


        // write your code here
    }

    public static boolean same(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String s = "";
        String s1 = "";
        for (char ch : ch1) {
            s += ch;
        }

        for (char ch : ch2) {
            s1 += ch;
        }


        return s1.equalsIgnoreCase(s);
    }
}