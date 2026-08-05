import java.util.*;
public class Lab_ses_2{
    public static int maxArray(ArrayList<Integer> a){
        int max = Integer.MIN_VALUE;
        //for(int i = 0; i < a.size(); i++){
        //    if(max < a[i]){
        //        max = a[i];
        //    }
        //}
        Collections.sort(a);
        System.out.println("Minimum value is: " + a.get(0));
        return max = a.get(a.size() - 1);


    }

    public static boolean sortArray(int ar[]){
        for(int i = 0; i < ar.length-1; i++){
            if(ar[i] > ar[i+1]){ // 0 > 1, 1 > 2, 2 > 3, 3 > 4
                return false;
            }
        }
        return true;
    }

    public static int countPairs(int ae[], int B){
        int count = 0;
        for(int i = 0; i < ae.length; i++){
            for(int j = i + 1; j < ae.length; j++){
                int n = ae[i] + ae[j];
                // System.out.println(ae[i] + ", " + ae[j] + " = " + n);
                if((ae[i] + ae[j]) == B){
                    System.out.println(ae[i] + ", " + ae[j]);
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Q.1)  Maximum of an array
        /* ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(6);
        arr.add(7);
        arr.add(9);
        arr.add(0);
        arr.add(3);
        System.out.println("the maximum is: "+ maxArray(arr)); */
        //Q.2) Given a array A, Check if it is sorted in non-decreasing order or not.
        // Nondecreasing order means that the numbers in sequence can stay the same or increase, but they cannot decrease
        int array[] = {5, 3, 2, 3, 6};
        // if(sortArray(array) == false){
        //    System.out.println("The Given array is not in Non-decreasing order" );
        //} else {
        //    System.out.println("The Given array is in Non-decreasing order" );
        //}

        // Q.3) You are given an integer array A and integer B. 
        // You are required to return the count of pairs having sum equal to B
        System.out.print("What is the value of B: ");
        int number = sc.nextInt();
        System.out.println("Total count are: " + countPairs(array, number));
    }
}