package study.techno;

import java.util.Arrays;

public class DescendingArray {
    //    Write a return method that can sort an int array in Descending
//    order without using the sort method of the Arrays class
    public static void main(String[] args) {
        int []a={4,3,9,8};
       ascArray(a);

    }

    public static String ascArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }



        }
        return Arrays.toString(arr);
    }
}
