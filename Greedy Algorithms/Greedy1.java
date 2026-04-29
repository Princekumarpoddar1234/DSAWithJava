import java.util.*;//when sorted array on basis of end is already given
public class Greedy1 {
    public static void main(String args[]){
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};//already sorted on end time basis

        int maxC=0;
        ArrayList<Integer> arr = new ArrayList<>();
        int endTime=0;

        //first time
        maxC=1;
        arr.add(0);
        endTime=end[0];

        //remaining iterations
        for(int i=1; i<start.length; i++){
            if(start[i]>=endTime){
                maxC++;
                arr.add(i);
                endTime=end[i];
            }
        }
        System.out.println("Choosen tasks: "+arr);
        System.out.println("Maximum Task Done: "+maxC);
    }
}
