import java.util.*;
public class Stack11 {
    public static int getMaxArea(int[] heights){
        Stack<Integer> s1=new Stack<>();
        int[] minRight=new int[heights.length];
        for(int i=heights.length-1; i>=0; i--){
            while(!s1.isEmpty() && heights[i]<=heights[s1.peek()]){
                s1.pop();
            }
            if(s1.isEmpty()){
                minRight[i]=heights.length;
            }else{
                minRight[i]=s1.peek();
            }
            s1.push(i);
        }
        int[] minLeft= new int[heights.length];
        Stack<Integer> s2 = new Stack<>();
        for(int i=0; i<heights.length; i++){
            while(!s2.isEmpty() && heights[i]<=heights[s2.peek()]){
                s2.pop();
            }
            if(s2.isEmpty()){
                minLeft[i]=-1;
            }else{
                minLeft[i]=s2.peek();
            }
            s2.push(i);
        }
        int maxArea=Integer.MIN_VALUE;
        for(int i=0; i<heights.length; i++){
            maxArea=Math.max(maxArea, heights[i]*(minRight[i]-minLeft[i]-1));
        }
        return maxArea;
    }
    public static void main(String[] args){
        int[] heights={2,1,5,6,2,3};
        System.out.println(getMaxArea(heights));
    }
}
