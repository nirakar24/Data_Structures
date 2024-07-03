package Patterns;

import java.util.Scanner;

public class rectangle {
    public static void rectangle_patter(int n, int m){
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        int n = sc.nextInt();
        System.out.print("Enter breadth : ");
        int m = sc.nextInt();

        System.out.println();
        rectangle_patter(n, m);
    }
}
