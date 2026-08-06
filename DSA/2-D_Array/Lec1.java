import java.util.*;
public class Lec1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Creation of 2D Array
        System.out.println("What is the row size: ");
        int n = sc.nextInt(); // No. of rows
        System.out.println("What is the column size: ");
        int m = sc.nextInt(); // No. of Columns

        int[][] mat = new int[n][m]; // Declare the Matrix
        for(int i=0; i < n; i++){
            for(int j=0; j< m; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        
        // Output
        for(int i=0; i < n; i++){
            for(int j=0; j< m; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }

        // 0th row
        for(int j = 0; j < m; i++){
            System.out.print(mat[0][j] + " ");
        } 
    }
}