import java.util.*;
public class graph7 {
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        int n=graph.length;
        for(int i=0; i<n; i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
    }
    public static boolean isBipartite(ArrayList<Edge>[]graph){
        int color[] = new int[graph.length];
        Arrays.fill(color,-1);

        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<graph.length; i++){
            if(color[i]==-1){//if not visited before
                q.add(i);
                color[i]=0;//yellow

                while(!q.isEmpty()){
                    int curr=q.remove();//getting current or front value of queue
                    for(int j=0; j<graph[curr].size(); j++){//looking in the neighbor of current
                        Edge e = graph[curr].get(j);//taking out edge of current

                        //check for conditions
                        if(color[e.dest]==-1){
                            int nextColor=1-color[curr];//asking and setting color of neighbor
                            color[e.dest]=nextColor;//setting color  of neighbor different from current
                            q.add(e.dest);//adding neighbor of curr to queue
                        }else if(color[e.dest]==color[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        int V=5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println(isBipartite(graph));
    }
}
