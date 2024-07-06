// Memory in bytes occupied by each data type

package Language_basics;

import java.util.Scanner;

public class data_types {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Data Type : ");
        String datatype = sc.next();

        switch (datatype) {
            case "byte":
            System.out.println("Size is 1");
            break;

            case "short integer":
            System.out.println("Size (short) = 2");
            break;

            case "integer":
            System.out.println("Size(int) = 4");
            break;

            case "float":
            System.out.println("Size(float) = 4");
            break;

            case "long integer":
            System.out.println("Size(long) = 8");
            break;

            case "double":
            System.out.println("Size(double) = 8");
            break;

            case "character":
            System.out.println("Size(char) = 2");
            break;

            case "boolean":
            System.out.println("Size(bool) = 1");
            break;

            default:
            System.out.println("Invalid input");
        }
    }
}
