public class length_of_String {
    static int findLength(String str, int i) {
        // Base case
        if (i == str.length()) {
            return 0;
        }
        // Count current character + rest of string
        return 1 + findLength(str, i + 1);
    }
    public static void main(String[] args) {
        String str = "Hello";
        int length = findLength(str, 0);
        System.out.println("Length = " + length);
    }
}