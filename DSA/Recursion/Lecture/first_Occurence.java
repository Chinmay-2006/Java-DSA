import java.util.*;
public class first_Occurence{
    public static int first_Occ(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return first_Occ(arr, key, i + 1);
    }
    public static void main(String args[]){
        int x[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println("Number first occurs at : " + first_Occ(x, 5, 0) + "th index");
    }
}