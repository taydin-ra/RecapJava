package study.techno;

public class PalindromeInteger {
    public static void main(String[] args) {
        System.out.println(palidromeInt(121));

    }

    public static boolean palidromeInt(int num) {
        int reverse = 0;
        int remainder = 0;

        while (num != 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }

        if(reverse==num){
            return true;
        }else{
            return false;
        }
    }
}
