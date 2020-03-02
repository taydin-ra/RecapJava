package study.techno;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("aba"));

    }

    public static boolean palindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (reverse.equals(str)) {
            return true;
        } else {
            return false;
        }
    }
}