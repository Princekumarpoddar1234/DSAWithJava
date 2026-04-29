# 💥 Graphs - `graph1`: Adjacency List Representation 💥

## 📁 File: `Graphs/graph1.java`

## 🎯 Problem Statement
Represent a graph using an adjacency list and demonstrate how to access its neighbors.

**LeetCode Link:** Not applicable (fundamental data structure representation).

## 🤔 Intuition
An adjacency list is an efficient way to represent graphs, especially sparse ones. Each node has a list of its directly connected neighbors (edges). This is like **S.H.I.E.L.D. maintaining a dossier for each Avenger**, listing their direct team affiliations.

## 🛠️ Approach
* Define an `Edge` class to store source, destination, and weight.
* Create an array of `ArrayList<Edge>` to represent the graph's adjacency lists.
* Initialize each `ArrayList` for every vertex.
* Add `Edge` objects to the respective `ArrayList`s to build the graph.
* Demonstrate accessing neighbors by iterating through a specific vertex's list.

## 🚀 Complexity Analysis
* **Time:** `O(V+E)` for building (V vertices, E edges); `O(degree)` for neighbor access.
* **Space:** `O(V+E)` - Stores all vertices and edges.

### Code Explanation:
The `Edge` class defines connections. `ArrayList<Edge>[] graph` is the **adjacency list structure**. Edges are added to represent connections (e.g., `graph[0].add(new Edge(0,1,5))`). The final loop iterates through `graph[2]` to print the destinations of edges from vertex 2, showing its direct neighbors.





# 💥 Graphs - `graph2`: BFS and DFS Traversal 💥

## 📁 File: `Graphs/graph2.java`

## 🎯 Problem Statement
Implement Breadth-First Search (BFS) and Depth-First Search (DFS) algorithms for graph traversal.

**LeetCode Link:** [LeetCode 200. Number of Islands](https://leetcode.com/problems/number-of-islands/) (often uses BFS/DFS), [LeetCode 797. All Paths From Source to Target](https://leetcode.com/problems/all-paths-from-source-to-target/) (uses DFS).

## 🤔 Intuition
Graph traversals are systematic ways to visit every node.
* **BFS:** Explores layer by layer using a Queue, finding shortest paths in unweighted graphs, like **Iron Man's initial wide-area scan for threats**.
* **DFS:** Explores as deep as possible along each branch using recursion (or Stack), like **Hawkeye meticulously scouting a single path through enemy territory**. Both use a `visited` array to prevent cycles.

## 🛠️ Approach
* Define an `Edge` class.
* `createGraph` function: Builds the graph using an adjacency list.
* `bfs` function: Uses a `Queue` and `visited` array; adds source to queue, then processes current node, marks visited, and adds unvisited neighbors to queue.
* `dfs` function: Recursive; prints current node, marks visited, then recursively calls DFS for unvisited neighbors.

## 🚀 Complexity Analysis
* **Time:** `O(V+E)` for both BFS and DFS (V vertices, E edges).
* **Space:** `O(V)` for `visited` array and Queue/Recursion Stack.

### Code Explanation:
`createGraph` sets up the graph. `bfs` explores level-by-level, using a queue to manage nodes. `dfs` explores depth-first via recursion. Both employ a `boolean visited[]` array to track visited nodes, preventing infinite loops in cyclic graphs.





# 💥 Graphs - `graph3`: Check for Path (DFS based) 💥

## 📁 File: `Graphs/graph3.java`

## 🎯 Problem Statement
Determine if a path exists between a given source and destination node in a graph.

**LeetCode Link:** [LeetCode 1971. Find if Path Exists in Graph](https://leetcode.com/problems/find-if-path-exists-in-graph/)

## 🤔 Intuition
We can explore the graph starting from the source node using a traversal algorithm like DFS. If we encounter the destination node during our exploration, a path exists. This is like **Spider-Man swinging through a city**: if he eventually reaches the target building, a path exists!

## 🛠️ Approach
* Use a recursive Depth-First Search (`hasPath`) function.
* Base case: If `src` is `dest`, return `true`.
* Mark `src` as visited.
* For each neighbor of `src`: If unvisited and a path exists from neighbor to `dest`, return `true`.
* If no path found from any neighbor, return `false`.

## 🚀 Complexity Analysis
* **Time:** `O(V+E)` - Traverses all reachable vertices and edges.
* **Space:** `O(V)` - For `visited` array and recursion stack.

### Code Explanation:
`createGraph` sets up the graph. `hasPath` is a recursive DFS that checks if `src` is `dest`. It marks `src` visited and then recursively calls itself for unvisited neighbors. If any recursive call finds the `dest`, it bubbles `true` up.





# 💥 Graphs - `graph4`: BFS for Disconnected Graphs 💥

## 📁 File: `Graphs/graph4.java`

## 🎯 Problem Statement
Perform Breadth-First Search (BFS) traversal on a graph, including handling disconnected components, to ensure all nodes are visited.

**LeetCode Link:** [LeetCode 200. Number of Islands](https://leetcode.com/problems/number-of-islands/) (requires handling disconnected components).

## 🤔 Intuition
Standard BFS works for connected graphs. For disconnected graphs, we need to iterate through all nodes, and if an unvisited node is found, start a new BFS from there. This is like **S.H.I.E.L.D. launching multiple search parties** to cover all potential threat locations, even if they're separated.

## 🛠️ Approach
* Define `Edge` and `createGraph`.
* `bfs` function: Outer loop iterates `i` from 0 to `V-1`. If `i` is unvisited, call `bfsUtil` starting from `i`.
* `bfsUtil` function: Standard BFS logic using a `Queue` and `visited` array, processing a single connected component.

## 🚀 Complexity Analysis
* **Time:** `O(V+E)` - Each node and edge visited once across all components.
* **Space:** `O(V)` - For `visited` array and queue.

### Code Explanation:
`bfs` now has an outer loop that ensures if any node is unvisited, a `bfsUtil` (a standard BFS for a component) is triggered. This guarantees **complete graph exploration**, even when components are separate.





# 💥 Graphs - `graph5`: DFS for Disconnected Graphs 💥

## 📁 File: `Graphs/graph5.java`

## 🎯 Problem Statement
Perform Depth-First Search (DFS) traversal on a graph, including handling disconnected components, to ensure all nodes are visited.

**LeetCode Link:** [LeetCode 200. Number of Islands](https://leetcode.com/problems/number-of-islands/) (often solved using DFS for disconnected components).

## 🤔 Intuition
DFS explores deeply along paths. For graphs with disconnected parts, a single DFS starting from one node won't visit all nodes. We need an outer loop that iterates through all potential starting nodes, initiating a new DFS whenever an unvisited node is found. This is like **Captain America leading individual reconnaissance missions** to uncover all hidden enemy cells, even if they're isolated.

## 🛠️ Approach
* Define `Edge` and `createGraph`.
* `dfs` function: Outer loop iterates `i` from 0 to `V-1`. If `i` is unvisited, call `dfsUtil` starting from `i`.
* `dfsUtil` function: Standard recursive DFS logic, printing current node, marking visited, and recursively calling DFS for unvisited neighbors.

## 🚀 Complexity Analysis
* **Time:** `O(V+E)` - Each node and edge visited once across all components.
* **Space:** `O(V)` - For `visited` array and recursion stack.

### Code Explanation:
`createGraph` sets up the graph. The `dfs` function now has an outer loop that intelligently checks `vis[i]`. If a node `i` hasn't been visited, it means it's part of a new, undiscovered component, so `dfsUtil` is called. This ensures **complete graph exploration**, even for fragmented networks.





# 💥 Graphs - `graph6`: Cycle Detection in Undirected Graph 💥

## 📁 File: `Graphs/graph6.java`

## 🎯 Problem Statement
Detect if a cycle exists in a given undirected graph.

**LeetCode Link:** [LeetCode 207. Course Schedule](https://leetcode.com/problems/course-schedule/) (for directed graphs, but related concept), [LeetCode 261. Graph Valid Tree](https://leetcode.com/problems/graph-valid-tree/) (requires cycle detection for undirected).

## 🤔 Intuition
In an undirected graph, a cycle exists if, during a DFS traversal, we encounter a node that has already been visited *and* is not the immediate parent of the current node. This is like **S.H.I.E.L.D. finding a closed loop in a conspiracy**: if an agent traces back to a previously visited point without going through their direct superior, it's a cycle.

## 🛠️ Approach
* Define `Edge` and `createGraph`.
* `detectCycleUtil(graph, vis, curr, parent)`: Recursive DFS helper.
    * Mark `curr` as visited.
    * For each neighbor `e.dest`:
        * If `e.dest` is unvisited, recursively call `detectCycleUtil`. If it returns `true`, propagate `true`.
        * Else if `e.dest` is visited AND `e.dest` is *not* `parent`, a cycle is found, return `true`.
* `detectCycle(graph)`: Outer loop to handle disconnected components, calling `detectCycleUtil` for unvisited nodes.

## 🚀 Complexity Analysis
* **Time:** `O(V+E)` - Standard DFS traversal.
* **Space:** `O(V)` - For `visited` array and recursion stack.

### Code Explanation:
`createGraph` builds the graph. `detectCycle` ensures all components are checked. `detectCycleUtil` performs DFS. The core `if-else if` condition identifies cycles: it checks if a visited neighbor is *not* the parent, confirming a back-edge to an ancestor (a cycle).





# 💥 Graphs - `graph7`: Check for Bipartite Graph 💥

## 📁 File: `Graphs/graph7.java`

## 🎯 Problem Statement
Determine if a given graph is bipartite. A bipartite graph's vertices can be divided into two disjoint sets such that every edge connects a vertex in one set to one in the other.

**LeetCode Link:** [LeetCode 785. Is Graph Bipartite?](https://leetcode.com/problems/is-graph-bipartite/)

## 🤔 Intuition
A graph is bipartite if it's 2-colorable (no two adjacent vertices have the same color). We can use BFS to try and color the graph. Start a node with one color; its neighbors must be the other. If we ever find an adjacent node with the *same* color, it's not bipartite. This is like **Captain America dividing his team into two distinct tactical squads**, where allies must never be in the same squad.

## 🛠️ Approach
* Define `Edge` and `createGraph`.
* `isBipartite` function:
    * Initialize a `color` array (`-1` for uncolored, `0` for one color, `1` for another).
    * Use a loop to iterate through all vertices (to handle disconnected components).
    * Inside the loop, if a vertex is uncolored:
        * Start a BFS from it: add to queue, color it.
        * While queue is not empty:
            * Dequeue current node.
            * For each neighbor:
                * If uncolored, color it opposite to current and enqueue.
                * If already colored AND has same color as current, return `false` (cycle with odd length detected).
* If BFS completes without conflict, return `true`.

## 🚀 Complexity Analysis
* **Time:** `O(V+E)` - Standard BFS traversal.
* **Space:** `O(V)` - For `color` array and Queue.

### Code Explanation:
`createGraph` builds the graph. `isBipartite` uses a `color` array and BFS. It attempts to color nodes (0 or 1). `if(color[e.dest]==color[curr])` is the **conflict detection**: if a neighbor already has the same color, the graph isn't bipartite, like **two Avengers accidentally wearing the same uniform in different squads**!





# 💥 Graphs - `graph8`: Cycle Detection in Directed Graph 💥

## 📁 File: `Graphs/graph8.java`

## 🎯 Problem Statement
Detect if a cycle exists in a given directed graph.

**LeetCode Link:** [LeetCode 207. Course Schedule](https://leetcode.com/problems/course-schedule/) (direct application), [LeetCode 210. Course Schedule II](https://leetcode.com/problems/course-schedule-ii/).

## 🤔 Intuition
In a directed graph, a cycle exists if, during a DFS traversal, we encounter a node that is currently in the recursion stack (meaning we're actively exploring its path). This indicates a back edge to an ancestor within the current path. We use two `visited` arrays: one for overall visited nodes and one for nodes currently in the recursion stack. This is like **S.H.I.E.L.D. detecting a closed loop in a dependency chain**, where a task requires itself indirectly.

## 🛠️ Approach
* Define `Edge` and `createGraph`.
* `isCycleUtil(graph, curr, vis, stack)`: Recursive DFS helper.
    * Mark `curr` as visited (`vis[curr]=true`) and in current recursion stack (`stack[curr]=true`).
    * For each neighbor `e.dest`:
        * If `stack[e.dest]` is `true`, a cycle is found, return `true`.
        * If `e.dest` is unvisited (`!vis[e.dest]`) and `isCycleUtil` from `e.dest` finds a cycle, propagate `true`.
    * Before returning, remove `curr` from the current recursion stack (`stack[curr]=false`).
* `isCycle(graph)`: Outer loop to handle disconnected components, calling `isCycleUtil` for unvisited nodes.

## 🚀 Complexity Analysis
* **Time:** `O(V+E)` - Standard DFS traversal.
* **Space:** `O(V)` - For `vis` and `stack` arrays, and recursion stack.

### Code Explanation:
`createGraph` builds the directed graph. `isCycle` initiates DFS for all components. `isCycleUtil` uses `vis` to track all visited nodes and `stack` to track nodes in the current DFS path. The critical check `if(stack[e.dest])` detects a cycle: if a neighbor is already in the current recursion stack, it means a back edge forms a cycle. `stack[curr]=false` on return is crucial for backtracking.





# 💥 Graphs - `graph9`: Topological Sort (DFS) 💥

## 📁 File: `Graphs/graph9.java`

## 🎯 Problem Statement
Perform a Topological Sort on a Directed Acyclic Graph (DAG), arranging its vertices in a linear order such that for every directed edge `u -> v`, `u` comes before `v` in the ordering.

**LeetCode Link:** [LeetCode 207. Course Schedule](https://leetcode.com/problems/course-schedule/) (finding if top sort is possible), [LeetCode 210. Course Schedule II](https://leetcode.com/problems/course-schedule-ii/) (returns the ordering).

## 🤔 Intuition
Topological sort is possible only for DAGs. It means arranging tasks with dependencies so prerequisites come first. A DFS-based approach works by pushing nodes onto a stack *after* all their dependencies have been visited. This ensures that when popped, a node comes *before* any node it points to. It's like **Iron Man's build sequence for a new suit**: components must be fabricated in a specific order based on what depends on what.

## 🛠️ Approach
* Define `Edge` and `createGraph`.
* `topSortUtil(graph, curr, vis, s)`: Recursive DFS helper.
    * Mark `curr` as visited.
    * For each neighbor `e.dest`: If unvisited, recursively call `topSortUtil` for `e.dest`.
    * After all neighbors and their subtrees are visited, `push curr` onto a `Stack s`.
* `topSort(graph)`: Outer loop to handle disconnected components. Calls `topSortUtil` for unvisited nodes. Finally, pops elements from stack to print the sorted order.

## 🚀 Complexity Analysis
* **Time:** `O(V+E)` - Standard DFS traversal.
* **Space:** `O(V)` - For `visited` array and recursion `Stack`.

### Code Explanation:
`createGraph` sets up the DAG. `topSort` initiates DFS for all components. `topSortUtil` performs the DFS. The crucial part is `s.push(curr)`: a node is pushed onto the stack *only after* all its dependent nodes have been processed. Popping from the stack then yields the topological order.





# 💥 Graphs - `graph10`: Topological Sort (Kahn's Algorithm/BFS) 💥

## 📁 File: `Graphs/graph10.java`

## 🎯 Problem Statement
Perform a Topological Sort on a Directed Acyclic Graph (DAG) using Kahn's algorithm, which is based on Breadth-First Search (BFS) and in-degrees.

**LeetCode Link:** [LeetCode 210. Course Schedule II](https://leetcode.com/problems/course-schedule-ii/) (returns the ordering using this algorithm).

## 🤔 Intuition
Kahn's algorithm relies on the fact that any DAG must have at least one vertex with an in-degree of zero (no incoming edges). These nodes can be the start of a topological sort. Once processed, we "remove" them and decrement in-degrees of their neighbors, potentially creating new nodes with in-degree zero. This repeats, like **Iron Man's assembly line**: start with components that have no dependencies, and as they're built, more components become available.

## 🛠️ Approach
* Define `Edge` and `createGraph`.
* `calcInDeg(graph, indeg)`: Calculates the in-degree for every vertex.
* `topSort(graph)`:
    * Call `calcInDeg`.
    * Initialize a `Queue` and add all vertices with in-degree 0.
    * While `Queue` is not empty:
        * Dequeue a `curr` vertex and print it.
        * For each neighbor `e.dest` of `curr`: Decrement `indeg[e.dest]`.
        * If `indeg[e.dest]` becomes 0, enqueue `e.dest`.

## 🚀 Complexity Analysis
* **Time:** `O(V+E)` - Each edge and vertex processed once.
* **Space:** `O(V)` - For `indeg` array and `Queue`.

### Code Explanation:
`calcInDeg` pre-computes incoming edge counts. `topSort` adds initial zero-in-degree nodes to the queue. The `while` loop simulates "removing" nodes: dequeuing a node processes it, and decrementing its neighbors' in-degrees (`indeg[e.dest]--`) unlocks new nodes (`if(indeg[e.dest]==0)`) to be added to the queue, maintaining the topological order.





# 💥 Graphs - `graph11`: Print All Paths (Naive) 💥

## 📁 File: `Graphs/graph11.java`

## 🎯 Problem Statement
Print all possible paths from a given source node to a destination node in a graph.

**LeetCode Link:** [LeetCode 797. All Paths From Source to Target](https://leetcode.com/problems/all-paths-from-source-to-target/)

## 🤔 Intuition
This is a pathfinding problem. We can use a recursive Depth-First Search (DFS) to explore every possible path from the source. When the destination is reached, the current path is complete. It's like **Doctor Strange exploring all possible timelines** to reach a specific future.

## 🛠️ Approach
* Define `Edge` and `createGraph`.
* `printAllPath(graph, src, dest, path)`: Recursive DFS function.
    * Base case: If `src` is `dest`, print the accumulated `path` + `dest`.
    * For each neighbor `e.dest` of `src`: Recursively call `printAllPath` from `e.dest`, appending `src` to the `path`.

## 🚀 Complexity Analysis
* **Time:** `O(V^V)` in worst case (exponential) - Explores all possible paths, including those with cycles, for dense graphs.
* **Space:** `O(V)` - For recursion stack depth.

### Code Explanation:
`createGraph` sets up the graph. `printAllPath` recursively explores all connections. The `path+src` accumulates the path string. **Crucially, this implementation lacks a `visited` array**, meaning it will enter **infinite loops in graphs with cycles** and print paths that revisit nodes. For "all simple paths" (no repeated vertices), a `visited` array is necessary.





# 💥 Graphs - `graph12`: Dijkstra's Algorithm 💥

## 📁 File: `Graphs/graph12.java`

## 🎯 Problem Statement
Find the shortest path from a single source vertex to all other vertices in a weighted graph with non-negative edge weights.

**LeetCode Link:** [LeetCode 743. Network Delay Time](https://leetcode.com/problems/network-delay-time/), [LeetCode 1514. Path with Maximum Probability](https://leetcode.com/problems/path-with-maximum-probability/) (modified Dijkstra).

## 🤔 Intuition
Dijkstra's algorithm is a greedy approach using a **Priority Queue**. It always explores the unvisited vertex with the smallest known distance from the source. It relaxes edges, meaning it tries to find a shorter path to a neighbor through the current vertex. This is like **Iron Man plotting the most fuel-efficient route** to multiple distant targets.

## 🛠️ Approach
* Define `Edge` (with `wt`) and `createGraph`.
* `Pair` class: Stores (node, path_distance), implements `Comparable` for priority queue.
* `dijkistra(graph, src)`:
    * Initialize `dist` array with `MAX_VALUE` for all nodes except `src` (0).
    * `boolean vis[]` to track visited nodes.
    * `PriorityQueue<Pair> pq`: Add `(src, 0)`.
    * While `pq` is not empty:
        * Dequeue `curr` (node with min path).
        * If `curr` is not visited: Mark visited.
        * For each neighbor `e` of `curr`: If `dist[u] + w < dist[v]`, update `dist[v]` and add `(v, dist[v])` to `pq`.

## 🚀 Complexity Analysis
* **Time:** `O(E log V)` (using Binary Heap Priority Queue) - `E` edge relaxations, each `log V`.
* **Space:** `O(V+E)` for graph, `O(V)` for `dist`, `vis`, `pq`.

### Code Explanation:
`createGraph` sets up the weighted graph. `Pair` allows priority queue to sort by path distance. `dijkistra` initializes distances and uses a `PriorityQueue` to always extract the unvisited node with the smallest distance. `if(dist[u]+w<dist[v])` is the **edge relaxation step**: if a shorter path to `v` is found via `u`, `dist[v]` is updated and `v` is re-added to PQ.





# 💥 Graphs - `graph13`: Bellman-Ford Algorithm 💥

## 📁 File: `Graphs/graph13.java`

## 🎯 Problem Statement
Find the shortest paths from a single source vertex to all other vertices in a weighted graph, even with negative edge weights. Also, detect negative-weight cycles.

**LeetCode Link:** [LeetCode 743. Network Delay Time](https://leetcode.com/problems/network-delay-time/) (can be solved with Bellman-Ford for negative weights).

## 🤔 Intuition
Dijkstra's fails with negative weights. Bellman-Ford addresses this by repeatedly "relaxing" all edges `V-1` times. In each iteration, it finds shorter paths that might involve more edges. After `V-1` iterations, all shortest paths are found (if no negative cycles). A `V`-th iteration can detect negative cycles, like **S.H.I.E.L.D. iteratively refining an intelligence report** to ensure all possible routes and hidden loops are found.

## 🛠️ Approach
* Define `Edge` (with `wt`) and `createGraph`.
* `bellmanFord(graph, src)`:
    * Initialize `dist` array with `MAX_VALUE` (`dist[src]=0`).
    * Loop `V-1` times (iterations):
        * For each edge `(u, v, w)` in the graph:
            * If `dist[u]` is reachable and `dist[u] + w < dist[v]`, update `dist[v] = dist[u] + w` (relax edge).
    * **Negative Cycle Detection:** Loop through all edges one more time (`V`-th iteration). If any edge can still be relaxed, a negative-weight cycle exists.
    * Print `dist` values.

## 🚀 Complexity Analysis
* **Time:** `O(V * E)` - `V` iterations, each iterating through `E` edges.
* **Space:** `O(V)` - For `dist` array.

### Code Explanation:
`createGraph` sets up the graph including negative weights. `dist` array tracks shortest distances. The outer `for(int i=0; i<V-1; i++)` loop performs `V-1` **relaxation phases**, ensuring paths with up to `V-1` edges are optimized. The subsequent loop explicitly checks for **negative cycles**: if a path can still be shortened after `V-1` relaxations, a negative cycle is present, as it allows infinitely decreasing path costs.





# 💥 Graphs - `graph14`: Prim's Algorithm (MST) 💥

## 📁 File: `Graphs/graph14.java`

## 🎯 Problem Statement
Find the Minimum Spanning Tree (MST) of a connected, undirected, weighted graph using Prim's algorithm, and calculate its total minimum cost.

**LeetCode Link:** [LeetCode 1584. Min Cost to Connect All Points](https://leetcode.com/problems/min-cost-to-connect-all-points/) (can be solved with Prim's or Kruskal's).

## 🤔 Intuition
Prim's algorithm is a greedy algorithm that builds an MST edge by edge. It starts from an arbitrary vertex and continuously adds the cheapest edge that connects a vertex in the MST to a vertex outside the MST, without forming a cycle. A **Priority Queue** efficiently helps pick the minimum weight edge. This is like **Captain America assembling his team for a new base**: always picking the most essential (cheapest connection) member first to expand their network.

## 🛠️ Approach
* Define `Edge` (with `wt`) and `createGraph`.
* `Pair` class: Stores (vertex, cost), implements `Comparable` for priority queue (min-heap by `cost`).
* `prims(graph)`:
    * `boolean vis[]` to track visited vertices (in MST).
    * `PriorityQueue<Pair> pq`: Add `(src, 0)` (start from vertex 0 with 0 cost).
    * `finalCost = 0`.
    * While `pq` is not empty:
        * Dequeue `curr` (edge with min cost).
        * If `curr.v` is not visited:
            * Mark `curr.v` as visited.
            * Add `curr.cost` to `finalCost`.
            * For each edge `e` from `curr.v`: Add `(e.dest, e.wt)` to `pq`.
    * Print `finalCost`.

## 🚀 Complexity Analysis
* **Time:** `O(E log V)` (using Binary Heap Priority Queue) - Similar to Dijkstra, each edge processed.
* **Space:** `O(V+E)` for graph, `O(V)` for `vis`, `O(V)` for `pq`.

### Code Explanation:
`createGraph` sets up the graph. `Pair` ensures the `PriorityQueue` sorts by edge weight. `prims` starts at a source, iteratively extracts the minimum-cost unvisited edge using the `PriorityQueue`. When a vertex is visited, its incident edges are added to `pq`, and its cost is added to `finalCost`. This greedy process builds the MST.





# 💥 Graphs - `graph15`: Cheapest Flights Within K Stops 💥

## 📁 File: `Graphs/graph15.java`

## 🎯 Problem Statement
Find the cheapest price from a source city to a destination city with at most `k` stops.

**LeetCode Link:** [LeetCode 787. Cheapest Flights Within K Stops](https://leetcode.com/problems/cheapest-flights-within-k-stops/)

## 🤔 Intuition
This problem is a variation of shortest path where the number of edges (stops) is also a constraint. A modified Breadth-First Search (BFS) or Bellman-Ford-like approach works. Instead of just distance, we track (vertex, cost, stops). We prioritize exploring paths that keep `stops <= k`. This is like **Iron Man planning a flight route with strict fuel and layover limits**.

## 🛠️ Approach
* Define `Edge` (with `wt`) and `createGraph`.
* `Info` class: Stores (vertex `v`, `cost`, `stops`).
* `cheapestFlight(n, flights, src, dest, k)`:
    * Build graph from `flights` array.
    * Initialize `dist` array for costs to `MAX_VALUE` (`dist[src]=0`).
    * Use a `Queue<Info>`: Add `(src, 0, 0)`.
    * While `Queue` is not empty:
        * Dequeue `curr`. If `curr.stops > k`, `break` (exceeded stops).
        * For each neighbor `e` of `curr.v`:
            * If `curr.cost + e.wt < dist[e.dest]` (found cheaper path for destination) AND `curr.stops <= k` (still within stop limit):
                * Update `dist[e.dest] = curr.cost + e.wt`.
                * Enqueue `(e.dest, dist[e.dest], curr.stops + 1)`.
    * Return `dist[dest]` if reachable, else `-1`.

## 🚀 Complexity Analysis
* **Time:** `O(V + E * K)` in worst case - `K` layers of BFS-like expansion, visiting edges at each layer.
* **Space:** `O(V + E)` for graph, `O(V * K)` or `O(V)` for queue and `dist`.

### Code Explanation:
`createGraph` builds the flight network. `cheapestFlight` initializes distances and a queue of `Info` objects (`vertex`, `cost`, `stops`). The `while` loop simulates BFS. `if(curr.stops > k) break;` acts as the **stop constraint enforcer**. The relaxation `if(curr.cost+wt < dist[v] && curr.stops<=k)` is key: it updates `dist[v]` only if a cheaper path is found *and* the stop limit isn't yet exceeded.





# 💥 Graphs - `graph16`: Connect Cities (MST using Prim's) 💥

## 📁 File: `Graphs/graph16.java`

## 🎯 Problem Statement
Given connections and costs between cities (represented as an adjacency matrix), find the minimum cost to connect all cities.

**LeetCode Link:** [LeetCode 1584. Min Cost to Connect All Points](https://leetcode.com/problems/min-cost-to-connect-all-points/) (direct application, but uses points/Manhattan distance).

## 🤔 Intuition
This is a classic Minimum Spanning Tree (MST) problem. We want to connect all cities with minimum total cost, ensuring no cycles. Prim's algorithm is perfect here: it greedily adds the cheapest edge that expands the connected network of cities without forming redundant connections. This is like **S.H.I.E.L.D. setting up the most cost-effective communication network** across all their hidden bases.

## 🛠️ Approach
* Define `Edge` class (stores `dest`, `cost`) implementing `Comparable` for a `PriorityQueue`.
* `connectCities(cities)`:
    * `PriorityQueue<Edge> pq`: Add `(start_city, 0_cost)`.
    * `boolean vis[]`: To track cities already included in the MST.
    * `finalCost = 0`.
    * While `pq` is not empty:
        * Dequeue `curr` (city with min cost edge to MST).
        * If `curr.dest` is not visited:
            * Mark `curr.dest` as visited.
            * Add `curr.cost` to `finalCost`.
            * For each neighbor `i` of `curr.dest` in `cities` matrix: If `cities[curr.dest][i]` is non-zero (there's an edge), add `(i, cities[curr.dest][i])` to `pq`.
* Return `finalCost`.

## 🚀 Complexity Analysis
* **Time:** `O(V^2)` (for adjacency matrix input) or `O(E log V)` (if converted to adjacency list and sparse graph) - For Prim's algorithm.
* **Space:** `O(V)` - For `vis` array and `PriorityQueue`.

### Code Explanation:
The `Edge` class with `compareTo` allows the `PriorityQueue` to sort edges by cost. `connectCities` uses Prim's algorithm: it iteratively picks the **cheapest unvisited city** from the `pq`, adds its cost to `finalCost`, marks it visited, and then adds all its valid (non-zero cost) outgoing edges to the `pq`. This ensures the **minimal total cost to link all cities**.





# 💥 Graphs - `graph17`: Union-Find (Disjoint Set Union) 💥

## 📁 File: `Graphs/graph17.java`

## 🎯 Problem Statement
Implement the Union-Find (Disjoint Set Union) data structure with path compression and union by rank optimizations to manage disjoint sets and their merging.

**LeetCode Link:** [LeetCode 547. Number of Provinces](https://leetcode.com/problems/number-of-provinces/), [LeetCode 1202. Smallest String With Swaps](https://leetcode.com/problems/smallest-string-with-swaps/) (common DSU applications).

## 🤔 Intuition
Union-Find manages a collection of disjoint sets, where each element belongs to exactly one set. It efficiently performs two operations: finding the representative (root) of an element's set, and uniting (merging) two sets. Optimizations like **path compression** (flattening the tree during `find`) and **union by rank** (attaching smaller trees to roots of larger ones) ensure near-constant time operations. This is like **S.H.I.E.L.D. organizing its agents into distinct, interconnected teams** for rapid deployment.

## 🛠️ Approach
* `init()`: Initializes each element to be its own parent (`par[i]=i`) and rank to 0.
* `find(x)`: Recursively finds the root of `x`'s set. **Path compression** happens here by directly connecting `x` to its root (`par[x]=find(par[x])`).
* `union(a, b)`: Merges sets of `a` and `b`.
    * Find roots `parA` and `parB`.
    * **Union by rank:** Attach the root of the smaller rank tree to the root of the larger rank tree. Increment rank of the new root if ranks were equal.

## 🚀 Complexity Analysis
* **Time:** `O(α(N))` per operation (amortized) - Effectively constant time, where α is the inverse Ackermann function, growing extremely slowly.
* **Space:** `O(N)` - For `par` and `rank` arrays.

### Code Explanation:
`init` sets up each element as its own set. `find(x)` recursively traces up to the root, while simultaneously **compressing the path** by making all intermediate nodes point directly to the root. `union(a, b)` merges sets by linking roots, optimizing with `rank` to keep trees flat. This efficient set management is crucial for problems like checking connected components or Kruskal's MST algorithm.





# 💥 Graphs - `graph18`: Kruskal's Algorithm (MST) 💥

## 📁 File: `Graphs/graph18.java`

## 🎯 Problem Statement
Find the Minimum Spanning Tree (MST) of a connected, undirected, weighted graph using Kruskal's algorithm.

**LeetCode Link:** [LeetCode 1584. Min Cost to Connect All Points](https://leetcode.com/problems/min-cost-to-connect-all-points/) (can be solved with Kruskal's or Prim's).

## 🤔 Intuition
Kruskal's algorithm is a greedy approach that builds the MST by considering edges in increasing order of weight. It uses the **Union-Find data structure** to efficiently check if adding an edge would form a cycle. If an edge connects two already-connected components, it forms a cycle and is skipped. Otherwise, it's added to the MST. This is like **Captain America meticulously expanding his alliance by recruiting the most influential individuals first**, ensuring no redundant connections.

## 🛠️ Approach
* Define `Edge` (with `src`, `dest`, `wt`), implementing `Comparable` to sort by weight.
* Implement `init`, `find`, `union` functions for Union-Find (with path compression and union by rank).
* `createGraph`: Populates an `ArrayList` of all edges.
* `kruskalsMST(edges, v)`:
    * Initialize Union-Find.
    * Sort all `edges` by weight in ascending order.
    * Initialize `mstCost = 0` and `count = 0`.
    * Iterate through sorted `edges` (while `count < v-1`):
        * Get `parA = find(e.src)` and `parB = find(e.dest)`.
        * If `parA != parB` (no cycle): `union(e.src, e.dest)`, add `e.wt` to `mstCost`, increment `count`.
    * Print `mstCost`.

## 🚀 Complexity Analysis
* **Time:** `O(E log E)` (for sorting edges) or `O(E log V)` (since `E <= V^2`, `log E` is `log V^2 = 2 log V`), plus `O(E α(V))` for DSU operations. Dominated by sorting.
* **Space:** `O(V+E)` for graph, `O(V)` for Union-Find arrays.

### Code Explanation:
The `Edge` class with `compareTo` enables sorting edges by weight. `init`, `find`, `union` provide the Union-Find logic. `kruskalsMST` **sorts all edges first**, then iterates through them. `if(parA != parB)` is the **critical cycle check** using Union-Find's `find` operations: if `src` and `dest` are already in the same set, adding the edge creates a cycle. `union` merges components, and `mstCost` accumulates valid edge weights.





# 💥 Graphs - `graph19`: Flood Fill Algorithm 💥

## 📁 File: `Graphs/graph19.java`

## 🎯 Problem Statement
Given a 2D image, fill a contiguous area of the same color starting from a given pixel `(sr, sc)` with a `newColor`.

**LeetCode Link:** [LeetCode 733. Flood Fill](https://leetcode.com/problems/flood-fill/)

## 🤔 Intuition
This is a connected component problem. A recursive DFS explores all directly connected pixels of the `originalColor` and changes them. A `visited` array prevents infinite loops/reprocessing. This is like **Hulk smashing all contiguous walls** of the same material.

## 🛠️ Approach
* `floodFill`: Initializes a `boolean vis[][]` array and calls `helper`.
* `helper(image, sr, sc, color, vis, orgCol)`: Recursive DFS.
    * Base Case: If out of bounds, already visited, or not `orgCol`, return.
    * Set `image[sr][sc] = color` and `vis[sr][sc] = true`.
    * Recursively call `helper` for all 4 neighbors (up, down, left, right).

## 🚀 Complexity Analysis
* **Time:** `O(R * C)` - Visits each cell at most once (R rows, C columns).
* **Space:** `O(R * C)` - For `vis` array and recursion stack in worst case.

### Code Explanation:
The `floodFill` function sets up the `visited` array. The `helper` function is the core recursive DFS. Its base case handles boundaries, already visited cells, and color mismatches. For valid, unvisited, and same-colored cells, it changes the color, marks visited, and then recursively explores its 4 neighbors.





# 💥 Graphs - `graph19`: Flood Fill Algorithm 💥

## 📁 File: `Graphs/graph19.java`

## 🎯 Problem Statement
Given a 2D image, fill a contiguous area of the same color starting from a given pixel `(sr, sc)` with a `newColor`.

**LeetCode Link:** [LeetCode 733. Flood Fill](https://leetcode.com/problems/flood-fill/)

## 🤔 Intuition
This is a connected component problem. A recursive DFS explores all directly connected pixels of the `originalColor` and changes them. A `visited` array prevents infinite loops/reprocessing. This is like **Hulk smashing all contiguous walls** of the same material.

## 🛠️ Approach
* `floodFill`: Initializes a `boolean vis[][]` array and calls `helper`.
* `helper(image, sr, sc, color, vis, orgCol)`: Recursive DFS.
    * Base Case: If out of bounds, already visited, or not `orgCol`, return.
    * Set `image[sr][sc] = color` and `vis[sr][sc] = true`.
    * Recursively call `helper` for all 4 neighbors (up, down, left, right).

## 🚀 Complexity Analysis
* **Time:** `O(R * C)` - Visits each cell at most once (R rows, C columns).
* **Space:** `O(R * C)` - For `vis` array and recursion stack in worst case.

### Code Explanation:
The `floodFill` function sets up the `visited` array. The `helper` function is the core recursive DFS. Its base case handles boundaries, already visited cells, and color mismatches. For valid, unvisited, and same-colored cells, it changes the color, marks visited, and then recursively explores its 4 neighbors.

---

# 💥 Graphs - `graph20`: Kosaraju's Algorithm (Strongly Connected Components) 💥

## 📁 File: `Graphs/graph20.java`

## 🎯 Problem Statement
Find all Strongly Connected Components (SCCs) in a directed graph. An SCC is a maximal set of vertices where every vertex is reachable from every other vertex within the set.

**LeetCode Link:** [LeetCode 1192. Critical Connections in a Network](https://leetcode.com/problems/critical-connections-in-a-network/) (related to bridge/articulation points but same underlying graph theory, Tarjan's/Kosaraju's are common).

## 🤔 Intuition
Kosaraju's algorithm uses two DFS passes and a graph transpose to identify SCCs.
1.  First DFS fills a stack in decreasing order of finishing times.
2.  Transpose the graph (reverse all edges).
3.  Second DFS on the *transposed* graph, starting from nodes popped from the stack. Each DFS traversal in this step explores exactly one SCC. This is like **S.H.I.E.L.D. profiling interconnected criminal organizations**: first, prioritize based on influence; then, analyze reversed connections to find true, unbreakable cells.

## 🛠️ Approach
1.  **Step 1: Get Nodes in Order of Finishing Times (DFS):** Perform DFS on the original graph. Push nodes onto a stack *after* visiting all their neighbors (topological sort like).
2.  **Step 2: Create Transposed Graph:** Reverse all edges of the original graph to create `transpose` graph. Reset `visited` array.
3.  **Step 3: DFS on Transposed Graph (using stack order):** Pop nodes from the stack. If a node is unvisited, perform DFS from it on the `transpose` graph. All nodes visited in this DFS form one SCC. Print them.

## 🚀 Complexity Analysis
* **Time:** `O(V+E)` - Two DFS traversals and one graph transposition.
* **Space:** `O(V+E)` - For graph, transpose graph, `visited` array, and stack.

### Code Explanation:
`createGraph` sets up the graph. `kosaraju` implements the 3 steps:
1.  **Topological sort (DFS-based):** `topSort` fills `s` with nodes in order of decreasing finishing times.
2.  **Transpose Graph:** `transpose` graph is built by reversing all edges, and `vis` is reset.
3.  **Final DFS:** It pops nodes from `s`. If `curr` is unvisited, it runs `dfs` on the `transpose` graph starting from `curr`. All nodes visited in this `dfs` call belong to the same SCC.





# 💥 Graphs - `graph21`: Tarjan's Bridge Algorithm 💥

## 📁 File: `Graphs/graph21.java`

## 🎯 Problem Statement
Find all "bridges" (critical connections) in an undirected graph. A bridge is an edge whose removal increases the number of connected components.

**LeetCode Link:** [LeetCode 1192. Critical Connections in a Network](https://leetcode.com/problems/critical-connections-in-a-network/)

## 🤔 Intuition
Bridges are identified during a DFS traversal. For an edge `(u, v)`, if `v` has no back-edge to `u` or any ancestor of `u`, then `(u, v)` is a bridge. We track `dt` (discovery time) and `low` (lowest discovery time reachable from subtree). An edge `(u,v)` is a bridge if `dt[u] < low[v]`. This is like **S.H.I.E.L.D. identifying single points of failure** in a network.

## 🛠️ Approach
* Define `Edge` and `createGraph`.
* `dfs(graph, curr, par, dt, low, vis, time)`: Recursive DFS helper.
    * Mark `curr` visited, set `dt[curr]` and `low[curr]` to `time++`.
    * For each neighbor `neigh`:
        * If `neigh` is `par`, skip.
        * If `neigh` is unvisited: Recurse `dfs(neigh)`. After call, `low[curr] = min(low[curr], low[neigh])`. If `dt[curr] < low[neigh]`, print `curr-neigh` as a bridge.
        * Else (back-edge to visited `neigh`): `low[curr] = min(low[curr], dt[neigh])`.
* `tarjanBridge(graph, V)`: Initializes `dt`, `low`, `vis` arrays, and `time`. Loops through all nodes to handle disconnected components.

## 🚀 Complexity Analysis
* **Time:** `O(V+E)` - Standard DFS traversal.
* **Space:** `O(V)` - For `dt`, `low`, `vis` arrays, and recursion stack.

### Code Explanation:
`createGraph` sets up the graph. `tarjanBridge` initiates DFS for all components. The `dfs` function computes `dt` (discovery time) and `low` (lowest reachable ancestor). The condition `dt[curr] < low[neigh]` is the **bridge detection logic**: if `curr` cannot reach a "higher" node than `neigh` (via its subtree), then `curr-neigh` is a bridge.





# 💥 Graphs - `graph22`: Articulation Points (Cut Vertices) 💥

## 📁 File: `Graphs/graph22.java`

## 🎯 Problem Statement
Find all "articulation points" (cut vertices) in an undirected graph. An articulation point is a vertex whose removal increases the number of connected components.

**LeetCode Link:** [LeetCode 1192. Critical Connections in a Network](https://leetcode.com/problems/critical-connections-in-a-network/) (related to bridges/articulation points, often solved with Tarjan's algorithm or similar DFS-based approaches).

## 🤔 Intuition
Articulation points are critical nodes that, if removed, break the graph into more pieces. Similar to bridge finding, this is done with a DFS. For a node `u` and its child `v` in the DFS tree: `u` is an articulation point if `v` or any node in `v`'s subtree (excluding `u`) cannot reach an ancestor of `u` (or `u` itself) via a back-edge. The root of the DFS tree is a special case. This is like **S.H.I.E.L.D. identifying key command centers**: if one is destroyed, the network fragments.

## 🛠️ Approach
* Define `Edge` and `createGraph`.
* `dfs(graph, curr, par, dt, low, time, vis)`: Recursive DFS helper.
    * Mark `curr` visited, set `dt[curr]` and `low[curr]` to `time++`.
    * Count `children` of `curr` in DFS tree.
    * For each neighbor `neigh`:
        * If `neigh` is `par`, skip.
        * If `neigh` is visited (`else if` in code): `low[curr] = min(low[curr], dt[neigh])` (back-edge).
        * Else (`neigh` is unvisited): Recurse `dfs(neigh, curr)`. After call, `low[curr] = min(low[curr], low[neigh])`.
            * If `par != -1 && dt[curr] <= low[neigh]`, then `curr` is an AP.
            * Increment `children`.
    * If `curr` is root (`par == -1`) AND has `children > 1`, then `curr` is an AP.
* `getAP(graph, V)`: Initializes `dt`, `low`, `vis` arrays, and `time`. Loops through all nodes to handle disconnected components.

## 🚀 Complexity Analysis
* **Time:** `O(V+E)` - Standard DFS traversal.
* **Space:** `O(V)` - For `dt`, `low`, `vis` arrays, and recursion stack.

### Code Explanation:
`createGraph` sets up the graph. `getAP` initiates DFS for all components. The `dfs` function computes `dt` (discovery time) and `low` (lowest reachable time via back-edge).
* `low[curr]=Math.min(low[curr],dt[neigh]);`: Updates `low[curr]` using back-edges to already visited ancestors.
* `low[curr]=Math.min(low[curr],low[neigh]);`: Updates `low[curr]` from its children's low-link values.
* `if(par!=-1 && dt[curr]<=low[neigh])`: This is the **AP condition for non-root nodes**. If a child `neigh` cannot reach `curr`'s ancestor (or `curr` itself) without going through `curr`, then `curr` is an AP.
* `if(par==-1 && children>1)`: **AP condition for the root node**. Root is an AP if it has more than one child in the DFS tree. This effectively identifies all **critical single points of failure** in the graph's connectivity.