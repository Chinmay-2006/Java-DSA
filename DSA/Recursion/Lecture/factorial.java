import java.util.*;
public class factorial{
    public static int factorial_no(int n){
        if(n == 0){
            return 1;
        }
        // int fnm1 = fact(n-1);
        int fn = n * factorial_no(n - 1);
        return fn;
    }
    public static void main(String args[]){
        System.out.println(factorial_no(5));
    }
}