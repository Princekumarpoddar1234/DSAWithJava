import java.util.Arrays;
public class strques4 {
    public static void isAnagram(String str1, String str2) {
        if (str1.length()==str2.length()) {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            char str1Array[] = str1.toCharArray();
            char str2Array[] = str2.toCharArray();
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);
            boolean result = Arrays.equals(str1Array, str2Array);
            if (result) {
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }

        else{
            System.out.println("False");
        }
    }

    public static void main(String args[]) {
        String str1 = "race";
        String str2 = "care";
        isAnagram(str1, str2);
    }
}