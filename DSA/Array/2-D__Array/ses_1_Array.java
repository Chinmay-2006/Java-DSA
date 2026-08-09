import java.util.*;
public class ses_1_Array{
    public static void maxArray(int a[][]){
        int max = Integer.MIN_VALUE;
        fo(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                if(a[i][j] > max){
                    max = a[i][j];
                }
            }
        }
        return max;
    }
    public static int main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the size of coulmns: ");
        int[][] mat = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        //return max of mat[][]
        System.out.println(maxArray(mat));
    }
}