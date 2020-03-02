package study.techno;

public class RemovingtheduplicateElements {

    //    Write a return method that can remove the duplicated values
//    from String
//    Ex: removeDup("AAABBBCCC") ==> ABC
    public static void main(String[] args) {
       String s= removeDup("AAABBBCCCC");
        System.out.println(s);

    }

    public static String removeDup(String str) {

        String result="";
        for (int i = 0; i < str.length(); i++)
            if (!result.contains("" + str.charAt(i)))
                result += "" + str.charAt(i);
        return result;
    }
}