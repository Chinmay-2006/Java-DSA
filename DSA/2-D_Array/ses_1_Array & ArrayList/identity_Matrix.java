import java.util.*;
public class identity_Matrix{
    public static boolean identity_Mat(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                if(i == j && a[i][j] != 1){ // diagonal verification
                    return false;
                } else if(i != j && a[i][j] != 0){ // non-diagonal verification
                    return false;
                } 
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the length of columns: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        
        if(n == m){
            System.out.println("Congratlations ! Your matrix clear first default condiion");
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[0].length; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            if(identity_Mat(arr) == true){
                System.out.println("Your matrix is an Identity matrix: ");
            } else {
                System.out.println("Sorry to say, but your matrix is not a Identity matrix");
            }
        } else{
            System.out.println("Sorry to told but your matrix is not eligible for identity matrix try to enter equal no. of rows and columns");
        }
    }
}