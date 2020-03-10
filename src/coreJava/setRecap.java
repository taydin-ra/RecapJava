package coreJava;

import java.util.HashSet;

public class setRecap {
    public static void main(String[] args) {
        /*
        arraylist                          vs                             set
        arraylist duplicates                                   set doesn't accept duplicate
        list is ordered collection                            hashset is not ordered collection
                                                           set doesn't have a get method(we can use a for each loop to get data from the set)

         */
        HashSet<Integer> h1 = new HashSet<Integer>(  );

        h1.add( 1 );
        h1.add( 2 );
        h1.add( 3 );
        h1.add( 4 );
        h1.add( -1 );
        h1.add( 0 );
        h1.add( -2 );
        h1.add( -1 );
        h1.add( 0 );
        h1.add( -2 );

        System.out.println(h1.size()); // size is not counting the duplicates in the set


//        System.out.println(h1.get(3));    IS NOT ALLOWED IN SET

        for(Integer values:h1){

            System.out.println(values);

        }

//      HashSet vs linkedhashset
/*
        hashset doesnt maintain any order of elements
        linkedhashset maintain insertion order of elements
*/

    }
}
