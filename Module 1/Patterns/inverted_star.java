package Patterns;

import java.util.Scanner;

public class inverted_star {
    public static void pyramid(int height){
        for(int i = height; i>=1; i--){
            //Printing spaces
            for(int j = 0; j< height-i ; j++){
                System.out.print(" ");
            }

            //Printing stars
            for(int j = 1 ; j <= 2*(i)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height of pyramid : ");
        int h = sc.nextInt();

        pyramid(h);
    }
}