package coreJava;

import java.util.Scanner;

public class reol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String:");

        String str = sc.nextLine();

        String org_str = str;

        String rev = "";
        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (org_str.contentEquals(rev)) {
            System.out.println(org_str + "   is Palindrome String");
        } else {
            System.out.println(org_str + "   is not Palindrome String");
        }

        sc.close();

    }

}

