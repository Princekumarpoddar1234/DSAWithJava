package Leetcode;
public class Leetcode2 {
    public static void main(String args[]) {
        System.out.println(numberToRoman(437));
    }
    public static String numberToRoman(int n){
        String number[] = {"M", "DM", "D", "CD", "C", "XC","L", "XL", "X", "IX", "V", "IV", "I"};

        int value[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder roman = new StringBuilder();

        for(int i = 0; i<value.length; i++) {
            while(n >= value[i]) {
                roman.append(number[i]);
                n -= value[i];
            }
        }
        return roman.toString();
    }
}
