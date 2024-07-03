package Patterns;

import java.util.Scanner;

public class inverted_number_triangle {
    public static void triangle_pattern(int height){
        for(int i = height; i>=1 ; i--){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height : ");
        int h = sc.nextInt();

        triangle_pattern(h);
    }
}
