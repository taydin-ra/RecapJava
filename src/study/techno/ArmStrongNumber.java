package study.techno;

public class ArmStrongNumber {
    public static void main(String[] args) {
      boolean myNum=isCubesAreTheNumber(153);
        System.out.println(myNum);
    }

    public static boolean isCubesAreTheNumber(int number) {

        int sum = 0;
        int originalNum=number;
        while (originalNum > 0) {

            int remainder = originalNum % 10;
            sum += remainder * remainder * remainder;

            originalNum /= 10;
        }

        if (sum == number) {
            return true;
        } else {
            return false;
        }

    }
}
