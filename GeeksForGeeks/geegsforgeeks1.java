public class geegsforgeeks1 {
    public static void main(String args[]){
        System.out.println(isAnagram("geeksforgeeks","forgeeksgeeks"));
    }
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        
        int freq[] = new int[26];
        // int freq2[] = new int[26];
        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        
        for(int count:freq){
            if(count!=0){
                return false;
            }
        }
        return true;
        
        
        // Your code here
    }
}
