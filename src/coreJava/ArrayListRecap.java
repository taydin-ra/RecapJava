package coreJava;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRecap {
    public static void main(String[] args) {

        /*
         ArrayList              vs                array
         ArrayList is dynamic size                array is fixed size
         Arraylist has objects                    array has primitive types and objects
         Arraylist is part of the collection      array is not
                                                  array is faster than arraylist

         */


//        List<Integer> list1 = new ArrayList<Integer>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//
//        List<Integer> list2 = new ArrayList<Integer>();
//        list2.add(1);
//        list2.add(5);
//        list2.add(3);
//        list2.add(7);
//        // print all the elements common in both arraylists
//
//        for (int i = 0; i < list1.size(); i++) {
//            for (int j = 0; j < list2.size(); j++) {
//                if (list1.get(i) == (list2.get(j))) {
//                    System.out.println(list1.get(i));
//                }
//            }
//        }
//
//        // create one String arraylist apple,orange,banan,orange
//        // change orange to pineapple
//        List<String> list3 = new ArrayList<String>();
//        list3.add("apple");
//        list3.add("orange");
//        list3.add("banana");
//        list3.add("orange");
//        for (int i = 0; i < list3.size(); i++) {
//            if (list3.get(i) == "orange") {
//                list3.set(i, "pineapple");
//            }
//
//        }
//        System.out.println(list3);

        // create one integer arraylist 1,4,7,6
        // second max in the arraylist

        List<Integer> list4 = new ArrayList<Integer>();
        list4.add(1);
        list4.add(4);
        list4.add(7);
        list4.add(6);

        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < list4.size(); i++) {
            if (list4.get(i) > max) {
                secondMax = max;
                max = list4.get(i);
            } else if (list4.get(i) > secondMax) {
                secondMax = list4.get(i);
            }
        }
        System.out.println(secondMax);
    }
}