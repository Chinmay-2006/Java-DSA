import java.util.*;
public class MatrixInput.java{
    public static void printWave(int a[][]) {
        int n = a.length;      // rows
        int m = a[0].length;   // columns

        for (int i = 0; i < n; i++) {

            if (i % 2 != 0) {   // Odd row -> Right to Left
                for (int j = m - 1; j >= 0; j--) {
                    System.out.print(a[i][j] + " ");
                }
            } else {            // Even row -> Left to Right
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j] + " ");
                }
            }

            System.out.println();
        }
    }
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
        /* for(int i=0; i < n; i++){
            for(int j=0; j< m; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        } */
        // Q.1) Print the matrix in wave from
        printWave(mat);
    }
}
