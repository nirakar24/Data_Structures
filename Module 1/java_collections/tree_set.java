package Java_collections;

import java.util.TreeSet;

public class tree_set {
    public static void main(String[] args) {
        //Defining the tree set
        TreeSet<Integer> numbers = new TreeSet<>();

        //Adding elements to the tree set
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        numbers.add(100);
        System.out.println(numbers); //Output --> [1, 2, 3, 5, 100] ; Storing the elements in a sorted manner, with no duplicates

        //Remove a element from set
        numbers.remove(100);
        System.out.println(numbers); //output --> [1, 2, 3, 5]

        //Return highest and lowest value
        int highest = numbers.last();
        int lowest = numbers.first();
        System.out.println("Highest Integer : " + highest); //Output --> Highest Integer : 5
        System.out.println("lowest Integer : " + lowest); //Output --> lowest Integer : 1

        //Adding some more elements for further operations
        for(int i = 0; i<=20 ; i++){
            numbers.add(i);
        }
        System.out.println(numbers);

        //Lower() and higher() ; Rturns one element up and down
        int lower = numbers.lower(7);
        System.out.println(lower); //Output --> 6
        System.out.println(numbers.higher(7)); //Output --> 8

    }
}
