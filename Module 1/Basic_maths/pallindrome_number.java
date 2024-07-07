package Basic_maths;

import java.util.Scanner;

public class pallindrome_number {
    public static boolean pallindrome_check(int num){
        if(num<0){
            return false;
        }

        int rev = 0;
        int x = num;

        while(x != 0){
            int last_digit = x%10;
            x = x/10;

            rev = rev * 10 + last_digit;
        }

        if(rev == num){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean result = pallindrome_check(number);
        System.out.println(result);

    }
}
