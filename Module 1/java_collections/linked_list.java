package Java_collections;
// It's an doubly-linked list, implementation of list and deque interfaces
// # Nodes
//  - Data : Value of node
//  - Next : reference to next node
//  - Previous : reference to previous node
// # Common Methods
//  - add() --> (Add the elements)
//  - get() --> (Access the elements)
//  - remove() --> (Remove the elements)
//  - set() --> (Modify the elements)

import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {
        
        LinkedList <Integer> numbers = new LinkedList<>(); // Defining a linked list

        //Adding elements
        numbers.add(2);
        numbers.add(3);
        numbers.add(5); 
        System.out.println(numbers);  //Output --> [2, 3, 5]

        //Adding elements to the start
        numbers.addFirst(1);
        System.out.println(numbers); //Output --> [1, 2, 3, 5]

        //Adding at certain index
        numbers.add(3, 4);
        System.out.println(numbers); //Output --> [1, 2, 3, 4, 5]

        // Accessing elements from the end of list
        int Lastnumber = numbers.getLast();
        System.out.println(Lastnumber); //Output --> 5

        // Accessing elements from the start of list
        int Firstnumber = numbers.getFirst();
        System.out.println(Firstnumber); //Output --> 1

        // removing an element from certain index
        numbers.remove(2);
        System.out.println(numbers); //Output --> [1, 2, 4, 5]

        //Removing an element fron start
        numbers.removeFirst();
        System.out.println(numbers); //Output --> [2, 4, 5]

        //Removing from end
        numbers.removeLast();
        System.out.println(numbers); //Output --> [2, 4]

        //modify the value of an element
        numbers.set(0, 200);
        System.out.println(numbers); //Output --> [200, 4]

        //Get the size of list  
        int size = numbers.size();
        System.out.println(size); //Output --> 2

        //Check if the element is present in the list
        System.out.println(numbers.contains(100)); //Output --> false
    } 
}
