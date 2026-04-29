import java.util.ArrayList;

public class arraylist9 {
    public static boolean findPair2(ArrayList<Integer> list, int target){
        //two pointer approach: Optimised Approach
        int left=0, right=list.size()-1;
        while(left<right){
            if(list.get(left)+list.get(right)==target){
                return true;
            }else if(list.get(left)+list.get(right)>target){
                right--;
            }else{
                left++;
            }
        }
        return false;
    }
    private static boolean findPair(ArrayList<Integer> list, int target){
        //Brute Force Approach
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=5;
        System.out.println("Using Brute Force: Is there any pair that has sum="+target+" ? "+findPair(list, target));
        System.out.println("Using Two Pointer Approach: Is there any pair that sums= "+target+" ? "+findPair(list,target));
        System.out.println();
    }
}
