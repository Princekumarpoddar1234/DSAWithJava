import java.util.*;
public class Greedy4{
    static class job{
        int deadline;
        int profit;
        int id;

        //constructor
        job(int d, int p, int i){
            deadline=d;
            profit=p;
            id=i;
        }
    }
    public static void main(String[] args){
        int[][] jobsInfo ={{4,20},{1,10},{1,40},{1,30}};
        //store above info into new data structure
        ArrayList<job> jobs = new ArrayList<>();
        for(int i=0; i<jobsInfo.length; i++){
            jobs.add(new job(jobsInfo[i][0], jobsInfo[i][1],i));
        }
        //sort the formed data in the constructed data structure
        Collections.sort(jobs, (a,b)-> b.profit-a.profit);
        //use the sorted one to get the greedy solution and store the sequence in the arraylist
        ArrayList<Integer> result = new ArrayList<>();
        int profit=0;//initially
        int time=0;//initially
        for(int i=0; i<jobs.size(); i++){
            job curr=jobs.get(i);
            if(curr.deadline> time){
                time++;
                profit+=curr.profit;
                result.add(curr.id);
            }
        }
        System.out.println("Total Jobs done: "+result.size());
        System.out.println("Job order: "+result);
        System.out.println("MaxProfit: "+profit);
    }
}