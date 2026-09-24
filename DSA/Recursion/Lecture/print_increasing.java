import java.util.*;
public class print_increasing{
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printInc(n - 1);
    }
    public static void main(String args[]){
        printInc(5);
    }
}