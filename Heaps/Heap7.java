import java.util.*;
public class Heap7 {
    static class Point implements Comparable<Point>{
        // int x;
        // int y;
        int sqDist;
        int index;

        public Point(int sqDist, int index){
            // this.x=x;
            // this.y=y;
            this.sqDist=sqDist;
            this.index=index;
        }
        @Override
        public int compareTo(Point p2){
            return this.sqDist-p2.sqDist;
        }
    }
    public static void main(String[] args){
        int[][] points={{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i=0; i<points.length; i++){
            int sqDist=points[i][0]*points[i][0]+points[i][1]*points[i][1];
            pq.add(new Point(sqDist,i));
        }
        for(int i=0; i<k; i++){
            System.out.println("C"+pq.remove().index);
        }

    }
}
