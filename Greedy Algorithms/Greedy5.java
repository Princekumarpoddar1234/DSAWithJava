import java.util.*;
public class Greedy5 {
    public static void main(String[] args){
        //problem statement:
        // The problem is to find the minimum cost to cut a chocolate bar into single square pieces.
        // The chocolate bar is represented as a grid with vertical and horizontal cuts, and each cut has a specific cost.
        // The goal is to determine the minimum cost required to make all the cuts needed to separate the chocolate into individual pieces.
        // The approach involves sorting the costs of vertical and horizontal cuts in descending order and then calculating the total cost based on the number of pieces created by each cut.
        // The algorithm uses a greedy strategy to always choose the cut with the lower cost, considering the number of pieces already created.
        // The input consists of the number of vertical and horizontal cuts, along with their respective costs.
        // The output is the minimum cost to cut the chocolate into single square pieces.
        //Approach:
        Integer[] costVer = {2,1,3,1,4};//m-1
        Integer[] costHor = {4,1,2};//n-1

        //1. Sort the given cost in descending order
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        //minCost finding
        //2. Take two pointers for horizontal and vertical cuts
        int hp=1, vp=1;
        int h=0, v=0;
        int cost=0;
        while(h<costHor.length && v<costVer.length){
            if(costVer[v]<=costHor[h]){
                
                cost+=(costHor[h]*vp);
                hp++;
                h++;
            }else{
                
                cost+=(costVer[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<costHor.length){
            
            cost+=(costHor[h]*vp);
            hp++;
            h++;
        }
        while(v<costVer.length){
            
            cost+=(costVer[v]*hp);
            vp++;
            v++;
        }
        System.out.println("Minimum cost to cut given chocolate into single square pieces: "+cost);
    }
}
