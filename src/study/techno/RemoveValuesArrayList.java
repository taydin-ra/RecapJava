package study.techno;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveValuesArrayList {
    public static void main(String[] args) {
//        Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values
//        greater than 100.
//        Solution 1:
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
//        ArrayList<Integer> list2 = new ArrayList<>();
//        for(int each : list1)
//            if( each < 100)
//                list2.add(each);
//        list1=list2;
//        System.out.println(list1);

        System.out.println(myList(list1));

    }


    public static ArrayList<Integer> myList(ArrayList<Integer> list1){
        ArrayList<Integer> list2=new ArrayList<>();

        for(int each:list1){
            if(each<100){
                list2.add(each);
            }
        }
        return list2;
    }
}
