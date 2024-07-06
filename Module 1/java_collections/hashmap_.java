package java_collections;

import java.util.HashMap;
import java.util.Map;

public class hashmap_ {
    public static void main(String[] args) {
        //Defining a Hashmap
        HashMap<String, Integer> data = new HashMap<String, Integer>();

        //adding Key-Value Pairs to the data
        data.put("Apple",20);
        data.put("Orange",30);
        data.put("Banana",50);
        data.put("Grapes",10);
        data.put("Blueberry",60);
        System.out.println(data);  //Output --> {Apple=20, Grapes=10, Blueberry=60,; Orange=30, Banana=50}

        //Accessing the value of an key
        int banana_quantity = data.get("Banana");
        System.out.println(banana_quantity); //Output --> 50

        //Return keys and values
        System.out.println(data.values()); //Output --> [20, 10, 60, 30, 50]
        System.out.println(data.keySet()); //Output --> [Apple, Grapes, Blueberry, Orange, Banana]
        System.out.println(data.entrySet()); //Output --> [Apple=20, Grapes=10, Blueberry=60, Orange=30, Banana=50]

        //Iterating over keys
        for(String key : data.keySet()){    
            System.out.println(key);
        }
        //Output -->
        /*
        * Apple
        * Grapes
        * Blueberry
        * Orange
        * Banana
        */

        //Iterating over values
        for(int value : data.values()){
            System.out.println(value);
        }
        //Output --> 
        /*
          * 20
          * 10
          * 60
          * 30
          * 50 
          */

        //Iterating over key-value pairs
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        //Output -->
        /* 
         * Apple = 20
         * Grapes = 10
         * Blueberry = 60
         * Orange = 30
         * Banana = 50
        */
    }
}
