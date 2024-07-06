package language_basics;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the multiplying factor : ");
        int x = sc.nextInt();

        int i = 0;                  //Initialisation

        while(i<=10){                //Condition
            System.out.println(i + " --> "+ (i*x)); 
            i++;                    //Updation
        }
    }
}
