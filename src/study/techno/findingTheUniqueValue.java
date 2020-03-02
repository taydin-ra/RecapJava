package study.techno;

public class findingTheUniqueValue {
    //    3. Write a return method that can find the unique characters from the
//            String
//    Ex: unique("AAABBBCCCDEF") ==> "DEF";

    public static void main(String[] args) {
        String result = uniqueElement("AAABBBCCCDEF");
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

}