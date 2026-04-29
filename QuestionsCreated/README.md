# 💥 Graphs - `RescueNavigation`: Shortest Time to Reach Any Hospital 💥

## 📁 File: `Graphs/RescueNavigation.java`

## 🎯 Problem Statement
Given a network of `n` locations, travel times between them (`edges`), a starting location `S`, and a list of `hospitals`, find the minimum time to reach *any* hospital from `S`.

**LeetCode Link:** Similar to shortest path problems with multiple destinations. (e.g., [LeetCode 743. Network Delay Time](https://leetcode.com/problems/network-delay-time/) or [LeetCode 1514. Path with Maximum Probability](https://leetcode.com/problems/path-with-maximum-probability/), but adapted for multiple targets).

## 🤔 Intuition
We need the *shortest time* to *any* of a set of target nodes in a weighted graph. Dijkstra's algorithm is perfect for finding shortest paths from a single source. We can adapt it by stopping as soon as the first hospital is extracted from the Priority Queue, as that hospital will guarantee the minimum time. This is like **Doctor Strange searching for the quickest way to an emergency room**: he only cares about the first one he can reach, regardless of how many others exist.

## 🛠️ Approach
* **Graph Representation:** Build an adjacency list `Map<Integer, List<int[]>>` from the `edges`.
* **Dijkstra's Adaptation:**
    * Use a `PriorityQueue<int[]>` to store `{node, time_taken}` (min-heap based on time).
    * Initialize `dist` array (`n+1` size, `MAX_VALUE` for all except `dist[S]=0`).
    * Add `{S, 0}` to `pq`.
    * Use a `HashSet` for `hospitals` for `O(1)` lookup.
    * Loop while `pq` is not empty:
        * Extract `{node, time}` with minimum `time` from `pq`.
        * If `node` is a hospital, return `time`. (This is the earliest reachable hospital).
        * Explore neighbors: If `time + travelTime < dist[nextNode]`, update `dist[nextNode]` and add `{nextNode, dist[nextNode]}` to `pq`.
* If `pq` becomes empty and no hospital found, return `-1`.

## 🚀 Complexity Analysis
* **Time:** `O(E log V)` - Standard Dijkstra's complexity, where `V` is `n` locations and `E` is `edges.length`. (Worst case, might explore entire graph).
* **Space:** `O(V + E)` - For adjacency list, `dist` array, `PriorityQueue`, and `hospitalSet`.

### Code Explanation:
`graph` builds the adjacency list. `dist` array stores minimum times. `pq` prioritizes nodes by travel time. `hospitalSet` allows quick check for targets. The `while` loop is Dijkstra's. The key optimization is `if (hospitalSet.contains(node)) { return time; }`. This makes the algorithm **greedy by time**: the first hospital reached in the priority queue's order is guaranteed to be the closest. This makes the rescue mission **as swift as Quicksilver!**