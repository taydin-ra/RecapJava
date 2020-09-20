package study.techno;

import java.util.Arrays;

public class AsterixPassword {
    public static void main(String[] args) {
        String s = Password("12345");
        System.out.println(s);

        System.out.println(returningPass("wwe"));
    }


    public static String Password(String pass) {
        int length = pass.length();
        char[] charArray = new char[length];
        Arrays.fill(charArray, '*');
        pass = new String(charArray);
        return pass;
    }

    public static String returningPass(String name) {
        int len = name.length();
        StringBuilder sb = new StringBuilder();
        String result = "";
        for (int i = 0; i < len; i++) {
            result = result.concat("*");
        }
        return result;
    }
}