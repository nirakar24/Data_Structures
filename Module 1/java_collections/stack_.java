package Java_collections;

import java.util.ArrayDeque;
import java.util.Stack;

public class stack_ {
    public static void main(String[] args) {
        
        Stack<Integer> numbers = new Stack<>();

        // Defining an ArrayDeque
        // ArrayDeque<Integer> numbers = new ArrayDeque<>();

        //Pushing an element to the stack
        numbers.push(3);
        numbers.push(4);
        numbers.push(5); 
        System.out.println(numbers); //Output --> [3, 4, 5]
        
        //Pop - Removes the element fron the top and returns the value
        int top = numbers.pop();
        System.out.println(top); //Output --> 5
        System.out.println(numbers); //Output --> [3, 4]

        //Peek - Returns the top element without removing it
        int peek_top = numbers.peek();
        System.out.println(peek_top); //Output --> 4

        //Check if the stack is empty
        System.out.println(numbers.isEmpty()); //Output --> false

        //Check the position of the element in the stack
        System.out.println(numbers.search(2)); //Output --> -1 [Not found]
        System.out.println(numbers.search(3)); //Output --> 2 [2nd element from top]
    }
}
