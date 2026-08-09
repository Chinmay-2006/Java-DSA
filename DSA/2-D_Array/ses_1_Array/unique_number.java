import java.util.*;

public class unique_number {
    public static int freq(ArrayList<Integer> row, int ele) {
        int count = 0;
        for (int i = 0; i < row.size(); i++) {
            if (row.get(i) == ele) {
                count++;
            }
        }
        return count;
    }

    public static ArrayList<ArrayList<Integer>> unique_num(
            ArrayList<ArrayList<Integer>> A) {
        int n = A.size(); // rows
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int m = A.get(i).size(); // columns
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                int ele = A.get(i).get(j);
                if (freq(A.get(i), ele) == 1) {
                    temp.add(ele);
                }
            }
            res.add(temp);
        }
        return res;
    }
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(1);
        n1.add(3);
        n1.add(2);
        n1.add(4);
        n1.add(1);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(5);
        n2.add(8);
        n2.add(7);
        n2.add(8);
        n2.add(8);

        ArrayList<Integer> n3 = new ArrayList<>();
        n3.add(9);
        n3.add(4);
        n3.add(2);
        n3.add(3);
        n3.add(4);

        arr.add(n1);
        arr.add(n2);
        arr.add(n3);

        // Original ArrayList
        System.out.println("Original:");

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
        // Calling function
        ArrayList<ArrayList<Integer>> result = unique_num(arr);
        // Printing result
        System.out.println("Unique elements:");
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}