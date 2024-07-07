package Basic_maths;

import java.util.Scanner;

public class armstrong_num {
    public static boolean check_armstrong(String number){
        int length = number.length();
        int sum = 0;
        int num = Integer.parseInt(number);

        for(int i = 0; i < length ; i++){
            int x = Character.getNumericValue(number.charAt(i));
            
            sum += Math.pow(x, length);
        }

        return(sum == num);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        // System.out.println(num.length());

        if(check_armstrong(num)){
            System.out.println(num + " is an Armstrong number");
        }else{
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
