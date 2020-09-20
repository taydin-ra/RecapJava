package study.techno;

import java.util.Arrays;

public class IsNot {
    public static void main(String[] args) {
        String str = "this is cool";
        System.out.println(myNewString(str));
    }

    public static String myNewString(String str) {

        String[] my = str.split(" ");


        for (int i = 0; i < my.length; i++) {
            if (my[i].equals("is")) {
                my[i] = my[i].replace("is", "is not");
            } else if (my[i].contains("is")) {
                my[i] = my[i];
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my.length; i++) {
            sb.append(my[i] + " ");
        }
        return sb.toString();
    }

}

