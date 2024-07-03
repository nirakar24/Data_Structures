package language_basics;

import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n = sc.nextInt();
        System.out.print("Enter second number : ");
        int m = sc.nextInt();
        System.out.println();

        if(n<m){
            System.out.println(m + " is greater than " + n);
        }
        else if(m<n){
            System.out.println(n + " is greater than " + m);
        }
        else{
            System.out.println("Both numbers are equal");
        }
        
    }
}
