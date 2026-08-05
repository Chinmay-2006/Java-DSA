import java.util.*;
public class Lab_ses_1{
    public static void shiftArray(int ar[]){
        int x = ar.length;
        int start = ar[x-1];
        System.out.println(start);
        for(int i= x-1; i > 0; i--){
            ar[i] = ar[i-1]; // 4 = 3, 3 = 2, 2 = 1, 1 = 0
        }
        ar[0] = start;
        System.out.print("{ ");
        for(int i= 0; i < x; i++){
            System.out.print(ar[i] + ", ");
        }
        System.out.print(" }");
    }



    public static int frequency_arr(int a[],int key){
        int count = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i] == key){
                count++;
            }
        }
        return count;
    }


    public static ArrayList<Integer> increment(ArrayList<Integer> a){
        for(int i = 0; i < a.size(); i++ ){
            a.set(i, a.get(i) + 1);
        }
        return a;
    }


    public static void increasingOrder(int x){
        System.out.print("{");
        int ar[] = new int[x];
        for(int i = 0; i< x; i++){
            ar[i] = i+1;
            System.out.print(ar[i] + " ");
        }
        System.out.print("}");
    }
    public static ArrayList<Integer> evenNumber(ArrayList<Integer> a){
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.print("{");
        for(int i = 0; i < a.size(); i++){
            int val = a.get(i);
            if(val%2 == 0){
                al.add(val);
            }
        }
        return al;
    }
    public static void main(String args[]){
        // Given an array of size N, shift all the elements to the right by 1 and move the last element to the beginning
        Scanner sc = new Scanner(System.in);
        /*System.out.print("What is Lenght of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + ", " );
        }
        shiftArray(arr); 
        // Given an array and k. write the function or return the frequency of k in array
        int arr[] = {3, 6, 7, 6, 11, 6, 14};
        System.out.print("for what value of k: ");
        int k = sc.nextInt();
        System.out.println(frequency_arr(arr, k)); 

        ArrayList<Integer> aerry = new ArrayList<Integer>();
        aerry.add(1);
        aerry.add(2);
        aerry.add(3);
        aerry.add(4);
        System.out.println("ARRAY: "+ increment(aerry)); 

        // Given N, create an array of size N, which should contain all elements in increasing order from 1 to N.
        System.out.println("What is size of array: ");
        int n = sc.nextInt();
        increasingOrder(n); */

        // Return all the even numbers Given an ArrayList of integers, return all the even numbers in the ArrayList.
        System.out.println("What is size of arrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        // Automatically add 1,2,3,...,n
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        System.out.println("Original List : " + list);

        ArrayList<Integer> even = evenNumber(list);

        System.out.println("Even Numbers : " + even);
    }
}
