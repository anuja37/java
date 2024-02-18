import java.util.Scanner;

public class fibonacci {
    static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
        // subproblem-recursive work
        // int prev = fib(n - 1);
        // int prevprev = fib(n - 2);

        //  self work
        // return prev + prevprev;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(fib(i));
        }
    }

}
