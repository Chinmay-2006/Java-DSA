import java.util.*;
public class main_Diagonal {
    public static void main_diag(int[][] arr) {
        int sum = 0;
        System.out.print("Main diagonal elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
            sum += arr[i][i];
        }

        System.out.println("\n Sum of Diagonal element is: "+ sum);
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        main_diag(mat);
    }
}