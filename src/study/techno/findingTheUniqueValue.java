package study.techno;

import java.util.ArrayList;

public class findingTheUniqueValue {
    //    3. Write a return method that can find the unique characters from the
//            String
//    Ex: unique("AAABBBCCCDEF") ==> "DEF";

    public static void main(String[] args) {

        ArrayList<String> my=new ArrayList<>();
        my.add("England");
        my.add("USA");
        my.add("USA");
        my.add("England");
        my.add("Brzil");
       // String result = uniqueElement("AAABBBCCCDEF");
        String result = findUniqueElementFromList(my);
        System.out.println(result);
    }

    public static String uniqueElement(String str) {
        String[] arr = str.split("");

        String unique1 = "";

        for (int i = 0; i < arr.length; i++) {
            int num = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].contains(arr[i]))
                    num++;
            }
            if (num == 1)
                unique1 += arr[i];
        }
        return unique1;

    }

    public static String findUniqueElementFromList(ArrayList<String> stringList) {
        String unique1 = "";

        for (int i = 0; i < stringList.size(); i++) {
            int num = 0;
            for (int j = 0; j < stringList.size(); j++) {

                if (stringList.get(j).contains(stringList.get(i)))
                    num++;
            }
            if (num == 1)
                unique1 += stringList.get(i);
        }
        return unique1;
    }

}


