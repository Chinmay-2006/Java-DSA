import java.util.*;
public class search_sorted_2D{
    /*  1) Brute Force
    → Traverse every element of the matrix one by one.
    → Compare each element with the key.
    → If found → return/print the position.
    → If entire matrix is traversed → key not found.
    → Time Complexity: O(n × m)
    → Space Complexity: O(1)

        2) Binary Search
    → Since every row is sorted, apply binary search on each row.
    → For each row:
         low = 0
         high = number of columns - 1
    → Calculate mid.
    → If arr[row][mid] == key → key found.
    → If arr[row][mid] > key → search left.
    → If arr[row][mid] < key → search right.
    → Repeat for every row until key is found.
    → If all rows are checked → key not found.
    → Time Complexity: O(n × log m)
    → Space Complexity: O(1) */

    // 3) **** Staircase search ****
    // Time Complexity : O(n + m)
    // Space Complexity : O(1)
    public static void searchKey(int arr[][], int key){
        int i = 0;
        int j = arr[0].length - 1;
        boolean found = false;
        while(i < arr.length && j >= 0){
            if(arr[i][j] == key){
                System.out.println("Key found at: (" + i + "th ," + j + "th index )");
                found = true;
                break;
            } else if(arr[i][j] > key){ // move left
                j--;
            } else if(arr[i][j] < key){ // move down
                i++;
            }
        }
        if(found == false){
                System.out.println("Key is not found!!!");
            }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int mat[][] = {{10, 20, 30, 40}, 
                        {15, 25, 35, 45},
                        {27, 29, 37, 48},
                        {32, 33, 39, 50}};
        System.out.print("What is the key which we has to find: ");
        int key = sc.nextInt();
        searchKey(mat, key);
    }
} 

/*
DRY RUN: key = 33

Matrix:
10  20  30  40
15  25  35  45
27  29  37  48
32  33  39  50

Initial:
i = 0
j = 3

1) arr[0][3] = 40
   40 > 33 → move LEFT
   j-- → j = 2

2) arr[0][2] = 30
   30 < 33 → move DOWN
   i++ → i = 1

3) arr[1][2] = 35
   35 > 33 → move LEFT
   j-- → j = 1

4) arr[1][1] = 25
   25 < 33 → move DOWN
   i++ → i = 2

5) arr[2][1] = 29
   29 < 33 → move DOWN
   i++ → i = 3

6) arr[3][1] = 33
   33 == 33 → KEY FOUND

Position:
row = 3
column = 1

Output:
Key found at: (3th, 1th index)

40 → 30
      ↓
     35 → 25
           ↓
          29
           ↓
          33 ✓
*/