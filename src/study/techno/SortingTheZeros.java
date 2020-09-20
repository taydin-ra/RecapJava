package study.techno;

import java.util.Arrays;

public class SortingTheZeros {
    public static void main(String[] args) {
        int arr[]={1,2,0,0,6,0,4};
        int counter=0;
        int counter2=arr.length-1;

        int []arr2=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==0){
                arr2[counter]=0;
                counter++;
            }else{
                arr2[counter2]=arr[i];
                counter2--;

            }

        }
        System.out.println(Arrays.toString(arr2));
    }
}
