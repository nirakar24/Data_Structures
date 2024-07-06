package Language_basics;

import java.util.Scanner;

public class functions {
    public static int factorial(int n){ //Defining a function which return an int (Factorial)
        if(n==0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to calculate factorial : ");
        int y = sc.nextInt();

        int result = factorial(y);
        System.out.println("Factorial of " + y + " is : " + result);

    }
}
