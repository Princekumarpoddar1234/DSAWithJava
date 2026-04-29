public class RecursionQ3 {

    // Recursive method to count substrings
    public static int countSubstrings(String str, int start, int end) {
        // Base case: If the string is empty or single character
        if (start == str.length()) {
            return 0;
        }

        // Check if the current substring (from start to end) starts and ends with the same character
        int count = (str.charAt(start) == str.charAt(end)) ? 1 : 0;

        // If end has reached the end of the string, move to the next starting character
        if (end >= str.length()-1) {
            return count + countSubstrings(str, start + 1, start + 1);
        } else {
            // Recursively check for the next substring
            return count + countSubstrings(str, start, end + 1);
        }
    }

    public static void main(String[] args) {
        String str = "abcab";
        int result = countSubstrings(str, 0, 0);
        System.out.println("Number of substrings starting and ending with the same character: " + result);
    }
}
