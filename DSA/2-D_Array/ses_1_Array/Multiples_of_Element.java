import java.util.*;
public class Multiples_of_Element{
    public static ArrayList<ArrayList<Integer>> multi_element(ArrayList<ArrayList<Integer>> arr){
        ArrayList<ArrayList<Integer>> matric = new ArrayList<>();
        ArrayList<Integer> y = arr.get(arr.size() - 1);
        ArrayList<Integer> x = arr.get(0);
        for(int i = 0; i < y.size(); i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0; j < x.size(); j++){
                if(x.get(j) % y.get(i) == 0){
                    temp.add(x.get(j));
                }
            }
            matric.add(temp);
        }
        return matric;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        // 1D arrayList
        ArrayList<Integer> d1 = new ArrayList<>();
        Collections.addAll(d1, 1, 2, 3, 4, 5);
        // 2D ArrayList
        ArrayList<Integer> d2 = new ArrayList<>();
        Collections.addAll(d2, 1, 2);
        // add 
        Collections.addAll(mat, d1, d2);
        System.out.print(multi_element(mat));
    }
}

/*
DRY RUN:

Input:
d1 = [1, 2, 3, 4, 5]
d2 = [1, 2]

mat = [
    [1, 2, 3, 4, 5],
    [1, 2]
]

Inside multi_element():

x = arr.get(0)
  = [1, 2, 3, 4, 5]

y = arr.get(arr.size() - 1)
  = arr.get(1)
  = [1, 2]


----------------------------------------
i = 0

y.get(0) = 1

j = 0 → x.get(0) = 1
1 % 1 = 0 → divisible → temp = [1]

j = 1 → x.get(1) = 2
2 % 1 = 0 → divisible → temp = [1, 2]

j = 2 → x.get(2) = 3
3 % 1 = 0 → divisible → temp = [1, 2, 3]

j = 3 → x.get(3) = 4
4 % 1 = 0 → divisible → temp = [1, 2, 3, 4]

j = 4 → x.get(4) = 5
5 % 1 = 0 → divisible → temp = [1, 2, 3, 4, 5]

matric.add(temp)

matric = [[1, 2, 3, 4, 5]]


----------------------------------------
i = 1

y.get(1) = 2

j = 0 → x.get(0) = 1
1 % 2 = 1 → not divisible

j = 1 → x.get(1) = 2
2 % 2 = 0 → divisible → temp = [2]

j = 2 → x.get(2) = 3
3 % 2 = 1 → not divisible

j = 3 → x.get(3) = 4
4 % 2 = 0 → divisible → temp = [2, 4]

j = 4 → x.get(4) = 5
5 % 2 = 1 → not divisible

matric.add(temp)

matric = [
    [1, 2, 3, 4, 5],
    [2, 4]
]


FINAL OUTPUT:

[[1, 2, 3, 4, 5], [2, 4]]
*/