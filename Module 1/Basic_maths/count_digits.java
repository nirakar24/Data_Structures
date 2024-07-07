package Basic_maths;

//Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.

import java.util.Scanner;

public class count_digits {
    public static int digit_counter(int num){
        int counter = 0;
        int x = num;

        while(x != 0){
            int last_digit = x%10;
            // System.out.println(last_digit);
            x = x/10;
            // System.out.println(x);

            if(last_digit == 0){
                continue;
            }else if(num%last_digit == 0){
                counter++;
            }
        }

        return counter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int result = digit_counter(number);
        System.out.println(result);
    }
}
