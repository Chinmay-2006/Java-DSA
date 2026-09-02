import java.util.*;
public class get_ith_Bit{
    public static int get_Bit(int n, int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.println(get_Bit(10, 2));
    }
}