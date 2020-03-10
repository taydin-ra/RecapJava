package coreJava;

import java.util.Arrays;

public class array {

    // array : we are able to store multiple variables in the array.
    // Array is not a collection.
    // array is a fixed size

    public static void main(String[] args) {

//        int[] i1 = {1, 2, 3, 4};
//        int[] i2 = new int[5];
//
////        change new york to boston
//        String[] s1 = new String[]{"new jersey", "new york", "atlanta", "new jersey", "new york", "atlanta"};
//        for (int i = 0; i < s1.length; i++) {
//            if (s1[i] == "new york") {
//                s1[i] = "boston";
//            }
//        }
//        for (int i = 0; i < s1.length; i++) {
//            System.out.println(s1[i]);
//        }
////         Count Number Of Words In The String
//
//        // first solution
//        String s2 = "Count the words in the String";
//        String[] arr = s2.split(" ");
//        System.out.println("count of the words is: " + arr.length);
//        // second solution
//        System.out.println("count of the words is: " + s2.split(" ").length);
//        System.out.println("---------------");
//
////        create one int array and store variables 2,4,5,6
//        // sum all the numbers in the array
//
//        int[] num = {2, 4, 5, 6};
//        int sum = 0;
//        for (int num1 : num) {
//            sum += num1;
//        }
//        System.out.println(sum);
//// ordering from smallest to the largest
//        int[] numbers1 = {3, 1, 5, 4};
//        int temp = 0;
//        for (int i = 0; i < numbers1.length; i++) {
//            for (int j = i + 1; j < numbers1.length; j++) {
//                if (numbers1[j] < numbers1[i]) {
//                    temp = numbers1[j];
//                    numbers1[j] = numbers1[i];
//                    numbers1[i] = temp;
//
//                }
//            }
//            System.out.println(numbers1[i]);
//
//        int[] numbers = {3, 1, 5, 4};
//        int sum1 = 0;
//        for (int k = 0; k < numbers.length; i++) {
//            if (numbers[k] % 2 != 0) {
//                sum1 += numbers[k];
//            } else if (numbers[k] % 2 == 0) {
//                sum1 -= numbers[k];
//            }
//        }
//        System.out.println(sum1);
//    }

        // create one string ="4433556"
        // sum all the numbers
        String mystr = "4433556";
        int a = Integer.parseInt(mystr);
        int remainder = 0;
        int sum = 0;
        while (a > 0) {
            remainder = a % 10;
            sum += remainder;
            a /= 10;
        }
        System.out.println(sum);

        // second way
        char[] numberChar = mystr.toCharArray();
        int total1 = 0;
        for (int i = 0; i < numberChar.length; i++) {
            total1 += Integer.parseInt(String.valueOf(numberChar[i]));
        }
        System.out.println(total1);
        // create an int array   2,5,40,70,95,98
        // print two numbers in that array whose sum equals to 100?

        int[] numbers1 = {2, 5, 40, 70, 95, 98};
        int sum3 = 0;
        for (int i = 0; i < numbers1.length; i++) {
            for (int j = i + 1; j < numbers1.length; j++) {
                sum3 = numbers1[i] + numbers1[j];
                if (sum3 == 100) {
                    System.out.println(numbers1[i] + " " + numbers1[j]);
                }
            }
        }
    }
}





