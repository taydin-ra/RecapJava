package study.techno;

public class MaxElementinArray {
//    Write a method that can find the maximum number from an int
//            Array

    public static void main(String[] args) {
        int[] ints ={2,4,6} ;
        System.out.println(max(ints));

    }

    public static int max(int[]arr){
        int max=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
