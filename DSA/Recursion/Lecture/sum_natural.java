import java.util.*;
public class sum_natural{
    public static int sumNat(int n){
        if(n == 1){
            return 1;
        }
        int sum = n + sumNat(n - 1);
        return sum;
    }
    public static void main(String args[]){
        System.out.print(sumNat(5));
    }
}