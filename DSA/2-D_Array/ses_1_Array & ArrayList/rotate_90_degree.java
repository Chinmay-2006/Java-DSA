import java.util.*;
public class rotate_90_degree{
    public static ArrayList<ArrayList<Integer>> rotate_mat(ArrayList<ArrayList<Integer>> ar){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i = 0; i < ar.size(); i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = ar.get(0).size() - 1; j >= 0; j--){
                temp.add(ar.get(j).get(i));
            }
            result.add(temp);
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> original = new ArrayList<>();
        ArrayList<Integer> d1 = new ArrayList<>();
        Collections.addAll(d1, 1, 2, 3);
        ArrayList<Integer> d2 = new ArrayList<>();
        Collections.addAll(d2, 4, 5, 6);
        ArrayList<Integer> d3 = new ArrayList<>();
        Collections.addAll(d3, 7, 8, 9);
        Collections.addAll(original, d1, d2, d3); // add 1d's lists to 2d list
        System.out.println("The 90 degree rotated matrix is: " + rotate_mat(original));
    }
}



/*
DRY RUN:

Original Matrix:

1  2  3
4  5  6
7  8  9

Rows = ar.size() = 3
Columns = ar.get(0).size() = 3

Goal: Rotate the matrix 90 degrees clockwise.

The logic:
Outer loop  → columns
Inner loop → rows from bottom to top


result = []


i = 0

    temp = []

    j = 2
        ar.get(2).get(0) = 7
        temp = [7]

    j = 1
        ar.get(1).get(0) = 4
        temp = [7, 4]

    j = 0
        ar.get(0).get(0) = 1
        temp = [7, 4, 1]

    result.add(temp)

    result = [[7, 4, 1]]


i = 1

    temp = []

    j = 2
        ar.get(2).get(1) = 8
        temp = [8]

    j = 1
        ar.get(1).get(1) = 5
        temp = [8, 5]

    j = 0
        ar.get(0).get(1) = 2
        temp = [8, 5, 2]

    result.add(temp)

    result = [[7, 4, 1], [8, 5, 2]]


i = 2

    temp = []

    j = 2
        ar.get(2).get(2) = 9
        temp = [9]

    j = 1
        ar.get(1).get(2) = 6
        temp = [9, 6]

    j = 0
        ar.get(0).get(2) = 3
        temp = [9, 6, 3]

    result.add(temp)

    result = [[7, 4, 1], [8, 5, 2], [9, 6, 3]]


Outer loop ends.

return result;


Final Matrix:

7  4  1
8  5  2
9  6  3


Output:
The 90 degree rotated matrix is:
[[7, 4, 1], [8, 5, 2], [9, 6, 3]]


Important:
For 90 degree clockwise rotation:

Outer loop → columns from left to right
Inner loop → rows from bottom to top

Element access:
ar.get(j).get(i)

So we take each column from bottom to top
and make it a new row.
*/