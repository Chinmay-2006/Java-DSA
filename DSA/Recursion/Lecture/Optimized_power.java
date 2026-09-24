import java.util.*;
public class Optimized_power{
    public static int optimizedPow(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPowerSq = optimizedPow(x, n/2) * optimizedPow(x, n/2);

        // n is odd
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String args[]){
        System.out.println(optimizedPow(2, 10)); 
    }
}