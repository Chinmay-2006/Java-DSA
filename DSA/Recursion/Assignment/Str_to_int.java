public class Str_to_int {

    static void printWords(int n, String[] arr) {
        // If number ends with 0
        if (n % 10 == 0) {
            System.out.println(-1);
            return;
        }
        // Base case
        if (n == 0) {
            return;
        }
        printWords(n / 10, arr);
        int digit = n % 10;
        System.out.println(arr[digit]);
    }
    public static void main(String[] args) {
        String[] arr = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        };
        printWords(2019, arr);
    }
}