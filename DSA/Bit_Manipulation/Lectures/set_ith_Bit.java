import java.util.*;
public class set_ith_Bit{
    public static int set_Bit(int num, int i){ // 1010 
            int bitMask = 1 << i;
            return (num | bitMask);
    }
    public static void main(String args[]){
        System.out.println(set_Bit(10, 2));
        System.out.println(set_Bit(10, 3));

    }
}