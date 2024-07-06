package Java_collections;

import java.util.PriorityQueue;

public class priority_queue {
    public static void main(String[] args) {
        //DEfining a priority Queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        //Adding some elements
        for(int i = 1; i <= 10; i++){
            numbers.add(i);
        }
        System.out.println(numbers); //Output --> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //Element with highest priority removed first (i.e. The head)
        int removed_number = numbers.poll();
        System.out.println(removed_number); //Output --> 1
        System.out.println(numbers); //Output --> [2, 4, 3, 8, 5, 6, 7, 10, 9]

        //peek() returns head without removing it from Queue
        int head = numbers.peek();
        System.out.println(head); //Output --> 2
        System.out.println(numbers); //Output --> [2, 4, 3, 8, 5, 6, 7, 10, 9]
    }
}
