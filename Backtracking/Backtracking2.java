public class Backtracking2 {
    public static void main(String args[]) {
        String str = "abc";
        findSubSets(str, "", 0);
    }

    public static void findSubSets(String str, String ans, int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
                return;
            }
            else{
                System.out.println(ans);
                return;
            }
        }

        //recursion
        //Yes
        findSubSets(str, ans+str.charAt(i), i+1);
        //No
        findSubSets(str, ans, i+1);
    }
}
