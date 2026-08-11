import java.util.*;
public class vowels_in_String {
    public static ArrayList<ArrayList<Character>> vowels_Extract(ArrayList<String> strings) {
        // Create 2D ArrayList for answer
        ArrayList<ArrayList<Character>> str = new ArrayList<>();
        // Create a 1D ArrayList to store all vowels
        ArrayList<Character> allVowels = new ArrayList<>();
        // Add uppercase and lowercase vowels
        Collections.addAll(
            allVowels,
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U'
        );
        // Iterate over each string
        for (int i = 0; i < strings.size(); i++) {

            String s = strings.get(i);

            // Store vowels of current string
            ArrayList<Character> temp = new ArrayList<>();

            // Iterate over each character
            for (int j = 0; j < s.length(); j++) {

                char c = s.charAt(j);

                // Check whether character is a vowel
                if (allVowels.contains(c)) {
                    temp.add(c);
                }
            }

            // Add vowels of current string to final 2D list
            str.add(temp);
        }

        return str;
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Your first 1D ArrayList
        ArrayList<String> s1 = new ArrayList<String>();

        System.out.print("Enter the String 1: ");
        s1.add(sc.nextLine());

        // Your second 1D ArrayList
        ArrayList<String> s2 = new ArrayList<String>();

        System.out.print("Enter the String 2: ");
        s2.add(sc.nextLine());

        // Combine s1 and s2 into ONE 1D ArrayList
        ArrayList<String> strings = new ArrayList<>();

        strings.addAll(s1);
        strings.addAll(s2);

        // Call function
        System.out.println(vowels_Extract(strings));
    }
}