import java.util.*;
public class even_Odd{
    public static void even_odd(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            // even number
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String args[]){
        even_odd(3);
        even_odd(9);
        even_odd(14);

    }
}