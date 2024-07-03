package Patterns;

import java.util.Scanner;

public class inverted_right_pyramid {
    public static void triangle_patter(int height){
        for(int i = height; i >= 1 ; i--){
            for(int j = 1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height of triangle : ");
        int h = sc.nextInt();

        triangle_patter(h);
    }
}
