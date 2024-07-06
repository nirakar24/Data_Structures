package Language_basics;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of day : ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("It's Monday");
                break;
            
            case 2:
            System.out.println("It's Tuesday");
            break;

            case 3:
            System.out.println("It's Wedenesday");
            break;

            case 4:
            System.out.println("It's Thursday");
            break;

            case 5:
            System.out.println("It's Friday");
            break;

            case 6:
            System.out.println("It's Saturday");
            break;

            case 7:
            System.out.println("It's Sunday");
            break;

            default:
            System.out.println("Invalid input : enter a number between 1-7");
            break;
        }
    }
}
