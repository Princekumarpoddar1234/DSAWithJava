import java.util.*;

public class RescueNavigation {
    public static int rescueNavigation(int n, int[][] edges, int S, List<Integer> hospitals) {
        // Step 1: Build the adjacency list for the graph
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int time = edge[2];
            graph.get(u).add(new int[]{v, time});
        }
        
        // Step 2: Use Dijkstra's Algorithm to find shortest paths from S
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]); // Min-heap based on time
        pq.offer(new int[]{S, 0}); // {node, travelTime}
        
        int[] dist = new int[n + 1]; // Store the minimum distance to each node
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[S] = 0;
        
        Set<Integer> hospitalSet = new HashSet<>(hospitals); // Use a set for O(1) hospital lookup

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int time = current[1];

            // If the current node is a hospital, return the time
            if (hospitalSet.contains(node)) {
                return time;
            }

            // Explore neighbors
            for (int[] neighbor : graph.get(node)) {
                int nextNode = neighbor[0];
                int travelTime = neighbor[1];

                if (time + travelTime < dist[nextNode]) {
                    dist[nextNode] = time + travelTime;
                    pq.offer(new int[]{nextNode, dist[nextNode]});
                }
            }
        }

        // If no hospital is reachable, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Example 1
        int n1 = 6;
        int[][] edges1 = {
            {1, 2, 4}, {1, 3, 2}, {3, 2, 1}, {3, 4, 7},
            {2, 5, 3}, {4, 6, 1}, {5, 6, 5}
        };
        int S1 = 1;
        List<Integer> hospitals1 = Arrays.asList(5, 6);
        System.out.println(rescueNavigation(n1, edges1, S1, hospitals1)); // Expected Output: 7

        // Example 2
        int n2 = 5;
        int[][] edges2 = {
            {1, 2, 5}, {1, 3, 10}, {3, 4, 2}, {4, 5, 3}
        };
        int S2 = 1;
        List<Integer> hospitals2 = Arrays.asList(4, 5);
        System.out.println(rescueNavigation(n2, edges2, S2, hospitals2)); // Expected Output: 10

        // Example 3
        int n3 = 4;
        int[][] edges3 = {
            {1, 2, 3}, {3, 4, 4}
        };
        int S3 = 1;
        List<Integer> hospitals3 = Arrays.asList(4);
        System.out.println(rescueNavigation(n3, edges3, S3, hospitals3)); // Expected Output: -1
    }
}
