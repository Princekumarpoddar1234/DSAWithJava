import java.util.*;
public class Greedy2 {
    public static void main(String[] args){
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};

        //creating 2d array for storing and sorting above array on basis of end
        int[][] arr = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            arr[i][0]=i;
            arr[i][1]=start[i];
            arr[i][2]=end[i];
        }
        Arrays.sort(arr, Comparator.comparingDouble(o->o[2]));

        int maxC=0;
        ArrayList<Integer> result = new ArrayList<>();
        int endTime=0;

        //first iteration
        maxC++;
        result.add(arr[0][0]);//index which can be anything 0 to length-1
        endTime=arr[0][2];
        for(int i=1; i<start.length; i++){
            if(arr[i][1]>=endTime){
                endTime=arr[i][1];
                result.add(arr[i][0]);
                maxC++;
            }
        }
        System.out.println(result);
        System.out.println("Max Count: "+maxC);

    }
}
