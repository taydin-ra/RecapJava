package study.techno;

public class ReverseString {
//    Write a return method that can reverse String
//    Ex: Reverse("ABCD"); ==> DCBA

    public static void main(String[] args) {
        String myReverse = reverse("ABCD");
        System.out.println(myReverse);
    }

    public static String reverse(String str) {
        String[] arr = str.split("");
        String reverse = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            reverse += arr[i];
        }
        return reverse;
    }
    // 2nd way
//for(int i=str.length()-1; i >= 0; i--)
//    reverse += str.toCharArray()[i];
}
