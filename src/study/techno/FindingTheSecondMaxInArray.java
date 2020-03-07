package study.techno;

public class FindingTheSecondMaxInArray {

    public static void main(String[] args) {
        int[] ints = {2, 3,5};
        System.out.println( max(ints));

    }

    public static int max(int[] arr) {
        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax ) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
