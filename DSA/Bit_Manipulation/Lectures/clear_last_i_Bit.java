import java.util.*;
// more than 1 bit into 0
public class clear_last_i_Bit{
    public static int clear_i_Bit(int num, int i){
        int bitMask = (-1) << i; // or (~0) << i 
        // -1 = 1<--(Msb) 1111111 msb = 1 (-ve)
        return num & bitMask;
    }
    public static void main(String args[]){
        System.out.println(clear_i_Bit(15, 2));

    }
}