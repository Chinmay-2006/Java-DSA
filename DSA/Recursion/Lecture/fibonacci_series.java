import java.util.*;
public class fibonacci_series{
    public static int fib_series(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fbn1 = fib_series(n - 1);
        int fbn2 = fib_series(n - 2);
        int fn = fbn1 + fbn2;
        return fn;
    }
    public static void main(String args[]){
        fib_series(1);
    }
}