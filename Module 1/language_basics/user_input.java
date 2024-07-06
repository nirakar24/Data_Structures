package Language_basics;

import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner object to get user input

        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Your age is : " + age);
    }
}
