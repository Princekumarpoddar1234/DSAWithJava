package Leetcode;
public class Leetcode7 {
    public static void main(String agrs[]) {
        String nums1 ="123";
        String nums2 = "489";
        System.out.println(sum(nums1, nums2));
    }



    public static String sum(String nums1, String nums2){
        int l1 = nums1.length()-1;
        int l2 = nums2.length()-1;
        StringBuilder result = new StringBuilder("");
        int carry = 0;
        while(l1>=0 || l2>=0 || carry>0){
            int sum = carry;
            if(l1>=0){
                sum+= nums1.charAt(l1)-'0';
                l1--;
            }
            if(l2>=0){
                sum+= nums2.charAt(l2)-'0';
                l2--;
            }
            result.append(sum%10);
            carry = sum/10;
        }
        return result.reverse().toString();
        
    }
}
