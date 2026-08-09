import java.util.*;
public class min_in_Array{
    public static int minArray(int a[][]){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] < min){
                    min = a[i][j];
                }
            }
        }
        return min;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the size of coulmns:, ");
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        System.out.println("Enter the values : ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        //return max of mat[][]
        System.out.println("Maximum Value in the array is: " +  minArray(mat));
    }
}
// *********************************************************** //
// MINIMUM IN ARRAYLIST
// int min = Collections.min(mat);