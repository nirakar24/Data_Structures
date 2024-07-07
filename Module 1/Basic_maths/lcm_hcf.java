package Basic_maths;

import java.util.Scanner;

public class lcm_hcf {
    public static Long[] lcmAndGcd(Long A , Long B) {
        Long gcd = gcd(A, B);
        Long lcm = (A * B) / gcd;
        Long[] answer = {lcm, gcd};
        return answer;
    }

    // Helper method to calculate GCD using Euclidean algorithm
    public static Long gcd(Long A, Long B) {
        while (B != 0) {
            Long temp = B;
            B = A % B;
            A = temp;
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long number_a = sc.nextLong();
        long number_b = sc.nextLong();
        
        Long result[] = lcmAndGcd(number_a, number_b);
        for (Long value : result) {
            System.out.print(value + " ");
        }
    }
}
