import java.util.*;
public class update_ith_Bit{
    public static int update_Bit(int num, int i, int newBit){
        // Approach 1
        if((newBit) == 0){
            // clear ith bit code used (update)
            int bitMask = ~(1 << i);
            return (num & bitMask);
        } else{
            // set ith bit code used
            int bitMask = 1 << i;
            return num | bitMask;
        }

        /* Approach 2 
        int n = num & (~(1 << i));
        int bitMask = newBit << i;
        return n | bitMask; */
    }
    public static void main(String args[]){
        System.out.println(update_Bit(12, 2, 1));
        System.out.println(update_Bit(12, 2, 0));

    }
}