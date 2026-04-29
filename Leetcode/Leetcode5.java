package Leetcode;
public class Leetcode5 {
    public static int countPrimes(int n) {
        int count = 0;
        if (n<=2){
            return 0;
        }
        boolean arr[] = new boolean[n];
        for(int i=2; i<n; i++){
            arr[i]= true;
        }
           
        for(int i=2; i*i<n; i++){
            for(int j=i*i; j<n; j+=i){
                if (arr[i]){
                    arr[j] = false;
                }
            }
           }

            for(int i=0; i<n; i++){
                if (arr[i]){
                    count++;
                }
           }
        return count;
        
    }
    public static void main(String args[]) {
        System.out.println(countPrimes(7));
    }
}