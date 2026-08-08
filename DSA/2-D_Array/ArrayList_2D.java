import java.util.*;
public class ArrayList_2D{
    public static ArrayList<ArrayList<Integer>> evenArraylist(ArrayList<ArrayList<Integer>> array, int rows){
        for(int i = 0; i < rows; i++){
            int m = array.get(i).size();
            for(int j = m - 1; j >= 0; j--){
                if(array.get(i).get(j) % 2 == 0){
                    continue;
                } else {
                    array.get(i).remove(j);
                }
            }
        }
        return array;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Declaration of 2D ArrayList
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        // Creating three 1D list
        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(3);
        n1.add(10);
        n1.add(2);
        // 2nd 1D ArrayList
        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(2);
        n2.add(7);
        n2.add(6);
        n2.add(9);
        n2.add(4);
        // 3rd 1D ArrayList
        ArrayList<Integer> n3 = new ArrayList<>();
        n3.add(18);
        n3.add(20);
        // ADD all 1D ArrayList to 2D ArrayList
        arr.add(n1);
        arr.add(n2);
        arr.add(n3);
        // Print the Complete 2D ArrayList
        int x = arr.size(); // no. of rows
        for(int i = 0; i < x; i++){
            int y = arr.get(i).size();
            for(int j = 0; j < y; j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(evenArraylist(arr, x));
    }
}