package study.techno;

import java.util.ArrayList;
import java.util.Arrays;

public class TheUniqueElementInArrayList {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("a");
        myList.add("a");
        myList.add("c");
        myList.add("b");
        myList.add("b");
        System.out.println(findUniqueElementFromList(myList));


    }

    public static String findUniqueElementFromList(ArrayList<String> stringList) {
        String result = "";

        int size = stringList.size() - 1;

       // System.out.println(size);
        outerloop:
        for (int i = 0; i < stringList.size(); i++) {

            for (int j = 0; j < stringList.size(); j++) {

                String i1 = stringList.get(i);
                String j1 = stringList.get(j);

               // System.out.println(i1 + " " + j + " " + result + " --" + j1);

               // System.out.println(i1.isEmpty());

                if (i == size && !i1.isEmpty()) {
                    result = stringList.get(i);
                    break;
                } else if (i == j) {
                    continue;
                } else if (i1.equals(j1)) {
                    continue outerloop;
                } else if (!i1.equals(j1) && j == size) {
                    result = stringList.get(i);
                    break outerloop;
                }

            }

        }


        return result;
    }
}
