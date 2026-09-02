import java.util.*;
public class count_setBits{
    public static int countBits(int num){
        int count = 0;
        while(num > 0){
            if((num & 1) != 0){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(countBits(13));

    }
}