import java.util.*;
public class transpose_Matrix{
    public static ArrayList<ArrayList<Integer>> trans_mat(ArrayList<ArrayList<Integer>> arr){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i = 0; i < arr.get(0).size(); i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0; j < arr.size(); j++){
                temp.add(arr.get(j).get(i));
            }
            result.add(temp);
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        ArrayList<Integer> d1 = new ArrayList<>();
        Collections.addAll(d1, 1, 2, 3);
        ArrayList<Integer> d2 = new ArrayList<>();
        Collections.addAll(d2, 4, 5, 6);
        Collections.addAll(al, d1, d2); // add 1d's lists to 2d list
        System.out.println("The Transpose of the matrix is: " + trans_mat(al));
    }
}


/*
DRY RUN:

Original ArrayList matrix:

arr = [
    [1, 2, 3],
    [4, 5, 6]
]

Rows = arr.size() = 2
Columns = arr.get(0).size() = 3

We need transpose:
Original:          Transpose:

1  2  3             1  4
4  5  6             2  5
                    3  6

result = []

Outer loop:
i = 0
    temp = []

    Inner loop:
    j = 0
        arr.get(0).get(0) = 1
        temp = [1]

    j = 1
        arr.get(1).get(0) = 4
        temp = [1, 4]

    Inner loop ends.
    result.add(temp)

    result = [[1, 4]]


i = 1
    temp = []

    Inner loop:
    j = 0
        arr.get(0).get(1) = 2
        temp = [2]

    j = 1
        arr.get(1).get(1) = 5
        temp = [2, 5]

    Inner loop ends.
    result.add(temp)

    result = [[1, 4], [2, 5]]


i = 2
    temp = []

    Inner loop:
    j = 0
        arr.get(0).get(2) = 3
        temp = [3]

    j = 1
        arr.get(1).get(2) = 6
        temp = [3, 6]

    Inner loop ends.
    result.add(temp)

    result = [[1, 4], [2, 5], [3, 6]]


Outer loop ends.

return result;

Final Output:
[[1, 4], [2, 5], [3, 6]]

Important:
Original element:
arr.get(i).get(j)

Transpose:
arr.get(j).get(i)

So the row and column indexes are swapped.
*/