package study.techno;

import java.util.HashMap;

public class FrequencyOfCharacters {
//    Write a return method that can find the frequency of
//            characters
//    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static void main(String[] args) {
        FrequencyOfChars("AAABBCDD");

    }

    public static HashMap<Character, Integer> frequency(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

//        map.put('a',1);
//        map.put('b',5);
//        map.put('c',3);
//        map.put('d',1);

        System.out.println(map.get('c'));


        char[] ch = str.toCharArray();
        int max = 0;
        for (char c : ch) {

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

        }
        return map;

    }


    public static String FrequencyOfChars(String str) {
        String expectedResult = "";
        int j = 0;

        while (j < str.length()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            expectedResult += str.charAt(j) + "" + count;
            str = str.replace("" + str.charAt(j), "");
        }
        return expectedResult;
    }
}
