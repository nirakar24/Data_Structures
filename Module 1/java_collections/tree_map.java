package Java_collections;

import java.util.TreeMap;

public class tree_map {
    public static void main(String[] args) {
        //Defining a Treemap
        TreeMap<String, Integer> data = new TreeMap<>();

        String fruits[] = {"Apple", "Banana", "Grapes", "Blueberry", "Orange"};
        int quantity[] = {20,30,10,90,50};

        //Putting the elements from above 2 arrays to the treemap
        for(int i = 0; i < fruits.length ; i++){
            String fruit = fruits[i];
            int fruit_quantity = quantity[i];
            data.put(fruit, fruit_quantity);
        }

        System.out.println(data); //Output --> {Apple=20, Banana=30, Blueberry=90, Grapes=10, Orange=50} ; Sorted alphabetically
        //Get the first and last entry
        System.out.println(data.firstEntry()); //Output --> Apple=20 ; Similarly, firstKey() and firstValue()
        System.out.println(data.lastEntry()); //Output --> Orange=50

        //Get a higher and a lower entry
        System.out.println(data.lowerEntry("Grapes")); //Output --> Blueberry=90
        System.out.println(data.higherEntry("Grapes")); //Output --> Orange = 50

        //Clear the treemap
        data.clear();
        System.out.println(data); //Output --> {}


    }
}
