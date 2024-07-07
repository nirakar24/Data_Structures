package Recursion;

public class print_n_numbers {
    public static void printnos(int N){
        if(N>0){
            printnos(N-1);
            System.out.println(N + " ");
        }

        return;
    }

    public static void main(String[] args) {
        printnos(5);
    }
}
 