import java.util.*;
public class spiral_matrix{
    //------------ Time Complexity:  O(n × m) -------------
    //------------ Space Complexity: O(1) -------------
    public static void spiral_mat(int arr[][]){
        int start_row = 0;
        int end_row = arr.length - 1;
        int start_col = 0;
        int end_col = arr[0].length - 1;
        while(start_row <= end_row && start_col <= end_col){
            // top side
            for(int j = start_col; j  <= end_col; j++){ // j = 0, 1
                System.out.print(arr[start_row][j] + " ");
            }

            // Right side
            for(int i = start_row + 1; i <= end_row; i++){
                System.out.print(arr[i][end_col] + " ");
            }

            // bottom side
            for(int j = end_col - 1; j >= start_col; j--){
                // special condition ---> for odd n * m matrics
                if(start_row == end_row){
                    break;
                }
                System.out.print(arr[end_row][j] + " ");
            }

            // left side
            for(int i = end_row - 1; i >= start_row + 1; i--){
                if(start_col == end_col){
                    break;
                }
                System.out.print(arr[i][start_col] + " ");
            }
            start_row++;
            start_col++;
            end_col--;
            end_row--;
        }
    }
    public static void main(String args[]){
        int mat[][] = {{1, 2, 3, 4}, 
                        {5, 6, 7, 8}, 
                        {9, 10, 11, 12}, 
                        {13, 14, 15, 16}};
        spiral_mat(mat);
    }
}

/*
DRY RUN:

Matrix:
1   2   3   4
5   6   7   8
9   10  11  12
13  14  15  16

Initial:
start_row = 0, end_row = 3
start_col = 0, end_col = 3

while:
0 <= 3 && 0 <= 3 → true

1st iteration:
Top    → 1 2 3 4
Right  → 8 12 16
Bottom → 15 14 13
Left   → 9 5

Output:
1 2 3 4 8 12 16 15 14 13 9 5

Update boundaries:
start_row++ → 1
start_col++ → 1
end_row--   → 2
end_col--   → 2

2nd iteration:
1 <= 2 && 1 <= 2 → true

Top    → 6 7
Right  → 11
Bottom → 10
Left   → no element

Output:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

Update boundaries:
start_row++ → 2
start_col++ → 2
end_row--   → 1
end_col--   → 1

3rd iteration:
2 <= 1 && 2 <= 1 → false

while loop stops.

Final output:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
*/