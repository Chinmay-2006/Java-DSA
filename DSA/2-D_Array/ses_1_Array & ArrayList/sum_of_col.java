import java.util.*;
public class sum_of_col{

    public static void sumColum(int arr[][]){
        for(int j = 0; j < arr[0].length; j++){  
            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                sum += arr[i][j]; 
            }
            System.out.println("sum of " + j + "th column is: "+ sum);
        }
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
        // Given a mat[][] return sum of each column
        sumColum(mat);
    }
}