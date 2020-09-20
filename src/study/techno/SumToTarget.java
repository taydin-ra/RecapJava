package study.techno;

import java.util.Arrays;

public class SumToTarget {

    public static String Sum(int []arr, int target){
        int [] returnN=new int[2];
//        returnN[0]=-1;
//        returnN[1]=-1;
        int i=0;
        int j=0;
        for ( i = 0; i <arr.length ; i++) {
            for( j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    returnN[0]=i;
                    returnN[1]=j;
                }
            }

        }
        return Arrays.toString(returnN);
    }

    public static void main(String[] args) {
        int arr[]={1,2,6,0,4};

        System.out.println(Sum(arr,10));
    }
}
