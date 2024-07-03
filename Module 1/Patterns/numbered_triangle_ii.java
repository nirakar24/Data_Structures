package Patterns;

import java.util.*;

public class numbered_triangle_ii {
    public static void triangle_pattern(int height){
        for(int i = 1; i <= height ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(i + " ");
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

