import java.util.*;
public class powerOfx{
    public static int power(int x, int n){
        // this only works for positive n
        // if(n == 1){
        //     return x;
        // }
        if(n <= 0){
            return 1;
        }
        x = x * (power(x, n-1));
        return x;
    }
    public static void main(String args[]){
        System.out.println(power(2, 10));
    }
}