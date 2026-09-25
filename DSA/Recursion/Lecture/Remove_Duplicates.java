import java.util.*;
// only lowercase character
public class Remove_Duplicates{
    // Remove duplicate characters using recursion
    // Logic:
    // 1. Check the current character.
    // 2. Use the boolean array to check if the character appeared before.
    // 3. If it is a duplicate, skip it.
    // 4. If it is new, mark it as visited and add it to newStr.
    // 5. Move to the next character using idx + 1.
    // map[]:
    // map[0] -> 'a', map[1] -> 'b', ..., map[25] -> 'z'
    // Base case:
    // When idx reaches the string length, all characters have been processed.
    // Print the final StringBuilder and stop the recursion.
    public static void duplicate_Char(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        // work
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            // duplicate
            duplicate_Char(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            duplicate_Char(str, idx + 1, newStr.append(currChar), map);
        }
    }
    public static void main(String args[]){
        String str = "appnnacollege";
        duplicate_Char(str, 0, new StringBuilder(""), new boolean[26]);
    }
}

// Converts character to an index:
// 'a' - 'a' = 0
// 'b' - 'a' = 1
// ...
// 'z' - 'a' = 25