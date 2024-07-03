// How to define an array
package language_basics;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        String cars[] = new String[3]; //Creating an array of length 3 ; String cars[] = {"BMW", "Ford", "Camero"};

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<3; i++){
            System.out.print("Enter name of car " + (i+1) + " : ");
            cars[i] = sc.next();
        }

        System.out.println("Entered cars are : ");
        for (String car : cars) {
            System.out.println(car);
        }


    }
}