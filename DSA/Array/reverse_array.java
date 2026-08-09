import java.util.*;
public class reverse_array{
    public static int[] reverse_arr(int[] a){
        int start = 0;
        int end = a.length - 1;
        while(start < end){
            int temp = a[end];
            a[end] = a[start];
            a[start] = temp;
            start++;
            end--;
        }
        return a;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i = 0; i < x; i++){
            arr[i] = sc.nextInt();
        }
        int array[] = reverse_arr(arr);
        for(int i = 0; i < x; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}

// Reverse an ArrayList
// int reverse = Collections.reverse();