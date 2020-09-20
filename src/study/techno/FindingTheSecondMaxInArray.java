package study.techno;

public class FindingTheSecondMaxInArray {

    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 8,10,10,10};
        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax  && arr[i]!=max) {
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }


}

