package coreJava;

import java.util.ArrayList;
import java.util.HashMap;

public class mapRecap {


    public static void main(String[] args) {
/*

HomeWork 1:   find a unique element in the arraylist  Apple Orange Apple Apple
                    result should be Orange

HomeWork 2:  Most frequent characters
            String a = "aasssdddd";
            answer should be d
                    and count = 4

 */
//        int ASCII_SIZE = 256;
//        String str = "aabbbbbccd";
//
//        int count[] = new int[ASCII_SIZE];
//        for (int i = 0; i < str.length(); i++) {
//            count[str.charAt(i)]++;
//        }
//        int max = 0;
//        char expcted = ' ';
//        for (int i = 0; i < str.length(); i++) {
//            if (count[str.charAt(i)] > max) {
//                max = count[str.charAt(i)];
//                expcted = str.charAt(i);
//
//            }
//        }
//        System.out.println(expcted + ": " + max);

        // hw 1

        ArrayList<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("orange");
        myList.add("apple");
        myList.add("apple");
        String result = null;
        int size = myList.size() - 1;
        outerloop:
        for (int i = 0; i < myList.size(); i++) {
            for (int j = 0; j < myList.size(); j++) {
                String i1 = myList.get(i);
                String j1 = myList.get(j);
                if (i == size && !i1.isEmpty()) {
                    result = myList.get(i);
                    break;
                } else if (i == j) {
                    continue;
                } else if (i1.equals(j1)) {
                    continue outerloop;
                } else if (!i1.equals(j1) && j == myList.size() - 1) {
                    result = myList.get(i);
                    break outerloop;
                }
            }
        }
        System.out.println(result);

    }

}
