import java.util.*;
public class clear_ith_Bit{
    public static int clear_Bit(int num, int i){
        int bitMask = ~(1 << i); // 0001 ----> 0100 ----> 1011 (~)
        return (num & bitMask);
    }
    public static void main(String args[]){
        System.out.println(clear_Bit(12, 2));
    }
}