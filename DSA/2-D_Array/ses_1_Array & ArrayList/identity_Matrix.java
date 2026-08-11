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


/*
DRY RUN:

Input:
Rows = 3
Columns = 3

Matrix:
1  0  0
0  1  0
0  0  1

First condition:
n == m
3 == 3 → true
So the matrix is eligible to be an Identity Matrix.

identity_Mat(arr):

i = 0
    j = 0 → i == j → diagonal
             arr[0][0] = 1 → correct → continue

    j = 1 → i != j → non-diagonal
             arr[0][1] = 0 → correct → continue

    j = 2 → i != j → non-diagonal
             arr[0][2] = 0 → correct → continue

i = 1
    j = 0 → i != j → non-diagonal
             arr[1][0] = 0 → correct → continue

    j = 1 → i == j → diagonal
             arr[1][1] = 1 → correct → continue

    j = 2 → i != j → non-diagonal
             arr[1][2] = 0 → correct → continue

i = 2
    j = 0 → i != j → non-diagonal
             arr[2][0] = 0 → correct → continue

    j = 1 → i != j → non-diagonal
             arr[2][1] = 0 → correct → continue

    j = 2 → i == j → diagonal
             arr[2][2] = 1 → correct → continue

All elements are correct.
No condition returned false.

return true

Output:
Your matrix is an Identity matrix
*/