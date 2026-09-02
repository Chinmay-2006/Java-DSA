import java.util.*;
public class power_of_2{
    public static boolean checkPower(int num){
        return (num & (num -1)) == 0;
    }
    public static void main(String args[]){
        System.out.println(checkPower(10));
    }
}