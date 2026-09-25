public class Tiling_Problem{
    // Tiling Problem using Recursion
    //
    // Idea:
    // A tile of size 2 x 1 can be placed in two ways:
    // 1. Vertically  -> remaining space = n - 1
    // 2. Horizontally -> remaining space = n - 2
    //
    // Therefore:
    // total ways = ways(n - 1) + ways(n - 2)
    //
    // Base case:
    // n == 0 or n == 1 → only 1 way

    public static int tilingProblem(int n) {

        // Base case:
        // For 0 or 1 column, there is only 1 possible arrangement.
        if(n == 0 || n == 1) {
        return 1;
        }

        // Choose vertical placement first.
        // After placing one vertical tile, n - 1 columns remain.
        int ver = tilingProblem(n - 1);

        // Choose horizontal placement.
        // Two horizontal tiles occupy 2 columns, so n - 2 remain.
        int hor = tilingProblem(n - 2);

        // Add the ways from both choices.
        int totWays = ver + hor;

        return totWays;
    }
    public static void main(String args[]){
        System.out.println(tilingProblem(4));
    }
}
