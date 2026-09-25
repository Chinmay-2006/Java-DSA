import java.util.*;
public class Last_Occurence{
    public static int last_Occ(int arr[], int key, int i){
        // THIS ONLY WORKS WHEN i is given as arr.length -1 value
        // if(i < 0){
        //     return -1;
        // }
        // if(arr[i] == key){
        //     return i;
        // }
        // return last_Occ(arr, key, i - 1);
        if(i == arr.length){
            return -1;
        }
        int isFound = last_Occ(arr, key, i + 1); // goes at the end
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
        int x[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println("Number last occurs at : " + last_Occ(x, 5, 0) + "th index");
    }
}