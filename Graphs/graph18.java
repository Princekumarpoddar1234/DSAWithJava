import java.util.*;
/*what are we going to do with this algo
 * so we are first storing date in terms of edges which will have src, dest and wt associated
 * then we are going to use init function which will initialize the parent array which will be static
 * then we are going to override compareTo finction for ascending order
 * then it is time for kruskals algo which is below stated
 * where we are going to look for count until it is v-1 as v-1 edges are minimum to be needed for graph
 * then we will use loop and check for parent of src and dest as if they are same then this will form cycle if union take place
 * then we will to union and add weight of src--dest weight to finalCost and increment the count
 * 
 * in the meanwhile in above algo we will need find function which will give us parent of x
 * and other function which we are going to use is union function which finds parent of a and b and
 * if same then it makes one as parent of other and increase rank of parent
 * otherwise it makes parent which has higher rank and thus update the parent of element out of both with higher rank one out of two
 */
public class graph18 {
    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
        @Override
        public int compareTo(Edge e2){
           return this.wt-e2.wt;
        }
    }
    static void createGraph(ArrayList<Edge> edges){
        edges.add(new Edge(0,1,10));
        edges.add(new Edge(0,2,15));
        edges.add(new Edge(0,3,30));
        edges.add(new Edge(1,3,40));
        edges.add(new Edge(2,3,50));
    }
    static int n=4;
    static int par[] = new int[n];
    static int[] rank = new int[n];

    public static void init(){
        for(int i=0; i<n; i++){
            par[i]=i;
        }
    }
    public static int find(int x){
        if(x==par[x]) return x;
        return par[x]=find(par[x]);/*for faster execution other wise we were returning the parent directly which would need extra time everytime*/
    }
    public static void union(int a, int b){
        int parA=find(a);
        int parB=find(b);

        if(rank[parA]==rank[parB]){
            par[parB]=parA;
            rank[parA]++;
        }else if(rank[parA]<rank[parB]){
            par[parA]=parB;
        }else{
            par[parB]=parA;
        }
    }
    public static void kruskalsMST(ArrayList<Edge> edges, int v){
        init();
        Collections.sort(edges);

        int mstCost=0;//this is what we need at last which will be minimum
        int count=0;//because i can iterate number of times but still we may not have v-1 edges, hence we needed separate variable for same
        for(int i=0; count<v-1; i++){
            Edge e = edges.get(i);
            
            int parA=find(e.src);//src=a;
            int parB=find(e.dest);//dest=b;

            if(parA!=parB){//this ensures cycle will not form
                union(e.src,e.dest);
                mstCost+=e.wt;
                count++;
            }
        }
        System.out.println(mstCost);
    }
    public static void main(String[] args){
        int v=4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        kruskalsMST(edges, v);
    }
}