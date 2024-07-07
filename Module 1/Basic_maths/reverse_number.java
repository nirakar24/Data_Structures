package Basic_maths;

import java.util.Scanner;

public class reverse_number {
    public static int reversing(int num){
        int rev = 0;
        int x = num;

        while(x != 0){
            int last_digit = x%10;
            x = x/10;

            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && last_digit > 7)){
                return 0;
            }else if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && last_digit < -8)){
                return 0;
            }

            rev = rev * 10 + last_digit;
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int reversed_number = reversing(number);
        System.out.println(reversed_number);
    }
}
