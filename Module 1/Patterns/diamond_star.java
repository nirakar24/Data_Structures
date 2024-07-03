package Patterns;

import java.util.Scanner;

public class diamond_star {
    public static void diamond(int height){
        //First Half
        for(int i = 1; i<=height; i++){
            // Print spaces before star
            for(int j = 0; j < height-i ; j++){
                System.out.print(" ");
            }
            // print stars
            for(int j = 1; j<=2*i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Second half
        for(int i = height; i>=1 ; i--){
            //print Spaces
            for(int j = 0; j<height-i; j++){
                System.out.print(" ");
            }
            // print stars
            for(int j = 1; j <= 2*i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height : ");
        int h = sc.nextInt();

        diamond(h);
    }
}