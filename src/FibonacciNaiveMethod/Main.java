package FibonacciNaiveMethod;

public class Main {
    static int fib(int n)
    {
        if (n <=1)
            return 1; // n
        else
            return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {

        int n = 13;
        System.out.println(fib(n));

    }
}
