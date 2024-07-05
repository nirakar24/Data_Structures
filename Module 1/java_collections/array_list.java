package java_collections;

import java.util.List;
import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList();
        System.out.println("Initialised list : " + list);

        list.add(3);
        list.add(4);
        list.add(6);
        list.add(7);

        System.out.println("List after added elements : " + list);

        list.add(1,20); //Inserting element at index 1

        System.out.println("Insereted 20 at index 1 : " + list);

        List<Integer> secondList = new ArrayList(); //Creating a new list
        // System.out.println(secondList);

        secondList.add(100);
        secondList.add(200);
        secondList.add(300);
        secondList.add(400);
        secondList.add(500);
        System.out.println("Second List : " + secondList);

        //adding elements of first list to second
        secondList.addAll(list);
        System.out.println("List after combinind both the lists : " + secondList);

        //Accessing the element at a certain index
        System.out.println("Element at index 2 : " + secondList.get(2));

        // Removing an element at a certain indexx
        secondList.remove(2);
        System.out.println("Removing the element at index 2 : " + secondList);

                //Removing an element by its value
                secondList.remove(Integer.valueOf(200));
                System.out.println("Removing the element with value 200 : " + secondList);
        
                // Clearing the complete list
                list.clear();
                System.out.println("First List is completely cleared : " + list);
        
                // Set the value of an element at certain index
                secondList.set(1, 1000);
                System.out.println("Updating element at index 1 to 1000 : " + secondList);
        
                //Checking if a certain element present in the list
                System.out.println("Does element 5000 present in second list? : " + secondList.contains(5000));
        
                System.out.println("No. of elements in the list is : " + secondList.size());
        
            }
        }