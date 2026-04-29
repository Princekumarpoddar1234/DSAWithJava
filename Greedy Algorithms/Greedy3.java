import java.util.*;
public class Greedy3 {
    public static void main(String args[]){
        int[] val = {60,100,120};
        int[] weight = {10,20,30};
        int w=50;
        double ratio[][] = new double[val.length][2];
        for(int i=0; i<val.length; i++){
            ratio[i][0]=i;
            ratio[i][1]=(double)val[i]/weight[i];
        }
        Arrays.sort(ratio, (a,b)->Double.compare(b[1],a[1]));
        int maximum=0;
        for(int i=0; i<val.length; i++){
            int weight1=weight[(int)ratio[i][0]];
            if(weight1<=w){
                w-=weight1;
                maximum+=val[(int)ratio[i][0]];
            }else{
                maximum+=(ratio[i][1])*w;
                break;
            }
        }
        System.out.println("Knapsack maxProfit: "+maximum);
    }
}
