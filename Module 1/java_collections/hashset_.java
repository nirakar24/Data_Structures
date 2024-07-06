package Java_collections;

import java.util.HashSet;

import Patterns.diamond_star;

public class hashset_ {
    public static void main(String[] args) {
        HashSet<Integer> number_set1 = new HashSet<>();

        //Adding elements to number_set1
        number_set1.add(1);
        number_set1.add(2);
        number_set1.add(3);
        number_set1.add(4);
        number_set1.add(5);
        number_set1.add(1);
        System.out.println(number_set1); //Output --> [1, 2, 3, 4, 5] ; 1 was added 2 times but due to set it's only displayed once

        //Creating another set to perform set operations
        HashSet<Integer> number_set2 = new HashSet<>();
        number_set2.add(4);
        number_set2.add(5);
        number_set2.add(6);
        number_set2.add(7);
        number_set2.add(8);
        System.out.println(number_set2); //Output --> [4, 5, 6, 7, 8]

        //Create a set to store intersection of two sets
        HashSet<Integer> intersection_set = new HashSet<>(number_set1);
        intersection_set.retainAll(number_set2);
        System.out.println(intersection_set); //Output --> [4, 5]

        //Create a set store Union of 2 sets
        HashSet<Integer> union_set = new HashSet<>(number_set1);
        union_set.addAll(number_set2);
        System.out.println(union_set); //Output --> [1, 2, 3, 4, 5, 6, 7, 8]

        //Create a set to store Difference of two sets
        HashSet<Integer> difference_set = new HashSet<>(number_set1);
        difference_set.removeAll(number_set2);
        System.out.println(difference_set); //Output --> [1, 2, 3]



    }
}
