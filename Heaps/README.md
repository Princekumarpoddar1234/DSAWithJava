# 💥 Heaps - `Heap1`: Basic Priority Queue (Max-Heap) 💥

## 📁 File: `Heaps/Heap1.java`

## 🎯 Problem Statement
Demonstrate the basic functionality of Java's `PriorityQueue` as a max-heap (storing elements in descending order).

**LeetCode Link:** Not applicable (fundamental data structure usage).

## 🤔 Intuition
A `PriorityQueue` automatically orders elements based on their natural ordering or a custom comparator. By default, it's a min-heap. Using `Comparator.reverseOrder()` turns it into a max-heap, ensuring the largest element is always at the "top" (`peek`), like **Iron Man's suit always bringing the most powerful weapon to the forefront**.

## 🛠️ Approach
* Create a `PriorityQueue<Integer>` initialized with `Comparator.reverseOrder()` for max-heap behavior.
* Add several integer elements using `add()`.
* Loop while the queue is not empty:
    * Print the top element using `peek()`.
    * Remove the top element using `remove()`.

## 🚀 Complexity Analysis
* **Time:** `O(log N)` for `add` and `remove` (N is elements in heap).
* **Space:** `O(N)` for storing N elements.

### Code Explanation:
`new PriorityQueue<>(Comparator.reverseOrder())` creates a max-heap. `add()` inserts elements, maintaining heap property. `while(!pq.isEmpty())` loop repeatedly `peek()`s (gets top) and `remove()`s (deletes top), printing elements in descending order.





# 💥 Heaps - `Heap2`: Custom Object Priority Queue (Max-Heap) 💥

## 📁 File: `Heaps/Heap2.java`

## 🎯 Problem Statement
Demonstrate using a `PriorityQueue` with custom objects (`Student`) by defining custom sorting logic for ranking.

**LeetCode Link:** Not applicable (fundamental data structure usage).

## 🤔 Intuition
When storing custom objects in a `PriorityQueue`, we need to tell it how to compare them. Implementing the `Comparable` interface (or providing a `Comparator`) specifies the sorting order. Using `Comparator.reverseOrder()` on a `PriorityQueue` that uses natural ordering (defined by `compareTo`) makes it a max-heap, meaning the "largest" (highest rank in this case) element comes first. This is like **S.H.I.E.L.D. ranking agents**: the highest-ranked agent always comes to the top.

## 🛠️ Approach
* Define a `Student` class with `name` and `rank`, implementing `Comparable<Student>`.
* Override `compareTo` in `Student` to sort by `rank` (ascending for natural order).
* Create a `PriorityQueue<Student>` using `Comparator.reverseOrder()` to achieve max-heap behavior.
* Add `Student` objects to `pq`.
* Loop while `pq` is not empty, printing and removing the top `Student`.

## 🚀 Complexity Analysis
* **Time:** `O(log N)` for `add` and `remove` (N is elements in heap).
* **Space:** `O(N)` for storing N elements.

### Code Explanation:
The `Student` class implements `Comparable` to define its natural order based on `rank`. `pq.add()` and `pq.remove()` operations use this comparison. However, `Comparator.reverseOrder()` applied to `PriorityQueue` in `main` flips the natural order, making it a max-heap (highest rank student comes first).





# 💥 Heaps - `Heap3`: Min-Heap Implementation 💥

## 📁 File: `Heaps/Heap3.java`

## 🎯 Problem Statement
Implement a custom Min-Heap data structure from scratch, supporting `add`, `peek`, `remove`, and `isEmpty` operations.

**LeetCode Link:** Not applicable (fundamental data structure implementation).

## 🤔 Intuition
A Min-Heap maintains the property that the parent node is always smaller than its children. This is achieved by "heapifying" up (during `add`) or down (during `remove`) to restore the order. It's like **Iron Man's auto-balancing system**, ensuring the smallest (most urgent) item is always accessible at the top.

## 🛠️ Approach
* `Heap` class uses an `ArrayList` to store elements.
* `add(data)`: Appends to end, then "heapifies up" (swaps with parent if smaller) until property is restored.
* `peek()`: Returns element at index 0 (the root/minimum).
* `remove()`: Swaps root with last element, removes last, then "heapifies down" (swaps with smallest child) from root.
* `heapify(i)`: Recursive helper to restore heap property downwards from index `i`. Checks children, finds `minIdx`, swaps, and recurses.
* `isEmpty()`: Checks if `ArrayList` is empty.

## 🚀 Complexity Analysis
* **Time:** `O(log N)` for `add` and `remove` (N is elements in heap).
* **Space:** `O(N)` for storing elements in `ArrayList`.

### Code Explanation:
`add` places new data at end then `while` loop (up-heapify) bubbles it up. `peek` gets root. `remove` swaps root with last, removes last, then `heapify(0)` (down-heapify) re-establishes heap order from root. `heapify` ensures the parent is smaller than children by swapping with the smaller child and recursing.





# 💥 Heaps - `Heap4`: Max-Heap Implementation 💥

## 📁 File: `Heaps/Heap4.java`

## 🎯 Problem Statement
Implement a custom Max-Heap data structure from scratch, supporting `add`, `peek`, `remove`, and `isEmpty` operations.

**LeetCode Link:** Not applicable (fundamental data structure implementation).

## 🤔 Intuition
A Max-Heap ensures the parent is always larger than its children. This is achieved by "heapifying" up (during `add`) or down (during `remove`) to restore this property. It's like **Thor always commanding the largest and most powerful forces** to the top.

## 🛠️ Approach
* `Heap` class uses an `ArrayList`.
* `add(data)`: Appends, then "heapifies up" (swaps with parent if larger) until `arr.get(x) > arr.get(p)`.
* `peek()`: Returns element at index 0 (the root/maximum).
* `remove()`: Swaps root with last element, removes last, then "heapifies down" (swaps with largest child) from root.
* `heapify(i)`: Recursive helper to restore heap property downwards from index `i`. Checks children, finds `maxIdx`, swaps, and recurses.
* `isEmpty()`: Checks if `ArrayList` is empty.

## 🚀 Complexity Analysis
* **Time:** `O(log N)` for `add` and `remove`.
* **Space:** `O(N)` for storing elements.

### Code Explanation:
`add` places new data at end then bubbles it up (up-heapify) in a `while` loop if it's larger than its parent. `remove` swaps root with last, removes last, then `heapify(0)` (down-heapify) restores heap order from root by bubbling down the new root.





# 💥 Heaps - `Heap5`: Heap Sort 💥

## 📁 File: `Heaps/Heap5.java`

## 🎯 Problem Statement
Sort an array of integers using the Heap Sort algorithm.

**LeetCode Link:** Not a direct LeetCode problem, but heap sort is a fundamental sorting algorithm.

## 🤔 Intuition
Heap Sort leverages a binary heap. First, transform the array into a max-heap (build heap). Then, repeatedly extract the maximum element (root), place it at the end of the array, and restore the heap property on the remaining elements. This is like **Iron Man's automated sorting system**: largest components are consistently moved to their final position.

## 🛠️ Approach
* `heapify(arr, i, size)`: Helper function to maintain max-heap property. It compares `arr[i]` with its children, swaps with largest child if necessary, and recursively calls `heapify` on the swapped child.
* `heapSort(arr)`:
    * **Build Max-Heap:** Loop from `n/2` down to `0`, calling `heapify` on each node.
    * **Sort (Extract Max):** Loop from `n-1` down to `1`:
        * Swap `arr[0]` (largest) with `arr[i]` (current last unsorted element).
        * Call `heapify(arr, 0, i)` on the reduced unsorted portion to restore heap property.

## 🚀 Complexity Analysis
* **Time:** `O(N log N)` - Building heap is `O(N)`, `N` extractions are `O(log N)` each.
* **Space:** `O(1)` - In-place sorting.

### Code Explanation:
`heapify` ensures the max-heap property from a given index. `heapSort` first uses `heapify` to **transform the entire array into a max-heap**. Then, it repeatedly **extracts the largest element** (from `arr[0]`), places it at its sorted position at the end of the array, and re-heapifies the remaining unsorted part.





# 💥 Heaps - `Heap6`: Heap Sort (Descending Order using Min-Heap) 💥

## 📁 File: `Heaps/Heap6.java`

## 🎯 Problem Statement
Sort an array of integers in descending order using the Heap Sort algorithm, specifically by building a min-heap.

**LeetCode Link:** Not a direct LeetCode problem, but a variation of heap sort.

## 🤔 Intuition
Heap Sort can produce a descending order by building a min-heap. We repeatedly extract the minimum element (root), place it at the *current end of the unsorted portion*, and then re-heapify the remaining elements. This fills the array from right-to-left with increasing values, effectively sorting in descending order. It's like **Vision carefully arranging elements**: smallest first to largest last, making the sequence appear descending when read from start to end.

## 🛠️ Approach
* `heapify(arr, i, size)`: Helper for min-heap property. Compares `arr[i]` with children, swaps with *smallest* child if needed, and recurses.
* `heapSort(arr)`:
    * **Build Min-Heap:** Loop from `n/2` down to `0`, calling `heapify` for min-heap.
    * **Sort (Extract Min):** Loop from `n-1` down to `1`:
        * Swap `arr[0]` (smallest) with `arr[i]` (current last unsorted element).
        * Call `heapify(arr, 0, i)` on the reduced unsorted portion to restore min-heap property.

## 🚀 Complexity Analysis
* **Time:** `O(N log N)` - Building heap `O(N)`, `N` extractions `O(log N)` each.
* **Space:** `O(1)` - In-place sorting.

### Code Explanation:
`heapify` ensures the min-heap property. `heapSort` first **builds a min-heap** from the array. Then, it iteratively **swaps the minimum element (root) with the last element of the *unsorted part*** and re-heapifies. This places smallest elements at the end of the array first, leading to a descending sorted order when the process completes.





# 💥 Heaps - `Heap7`: K Closest Points to Origin 💥

## 📁 File: `Heaps/Heap7.java`

## 🎯 Problem Statement
Find the `k` closest points to the origin `(0,0)` in a 2D plane.

**LeetCode Link:** [LeetCode 973. K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/)

## 🤔 Intuition
To find the closest points, we need to sort them by distance from the origin. A **Min-Heap** (Priority Queue) is ideal: it keeps the smallest distance points at the top, allowing us to efficiently extract the `k` closest. This is like **Iron Man's radar identifying the `k` closest targets** instantly.

## 🛠️ Approach
* Define a `Point` class (stores `sqDist` and `index`) implementing `Comparable` to sort by `sqDist`.
* Create a `PriorityQueue<Point>` (defaults to min-heap based on `sqDist`).
* For each `point` in the input array:
    * Calculate its squared Euclidean distance from origin `(x^2 + y^2)`.
    * Add a `new Point(sqDist, original_index)` to the `pq`.
* Extract and print the `k` points from the `pq` using `remove()`.

## 🚀 Complexity Analysis
* **Time:** `O(N log N)` for adding all points; `O(K log N)` for removing `K` points. Overall `O(N log N)` or `O(N log K)` with a max-heap optimization.
* **Space:** `O(N)` for `PriorityQueue` (or `O(K)` with max-heap optimization).

### Code Explanation:
The `Point` class tracks squared distance and original index, and its `compareTo` makes `PriorityQueue` order by distance. The loop calculates `sqDist` for each point (avoiding `sqrt` for efficiency) and adds it to `pq`. The final loop extracts the `k` smallest (closest) points from the `pq`.





# 💥 Heaps - `Heap8`: Connect Ropes with Minimum Cost 💥

## 📁 File: `Heaps/Heap8.java`

## 🎯 Problem Statement
Given lengths of `N` ropes, connect them into a single rope with minimum cost. The cost of connecting two ropes is equal to their sum.

**LeetCode Link:** [LeetCode 215. Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) (though not directly this problem, it's a common application of heaps in competitive programming like [GeeksForGeeks Connect N ropes with minimum cost](https://www.geeksforgeeks.org/connect-n-ropes-minimum-cost/))

## 🤔 Intuition
To minimize the total cost, we should always combine the two smallest ropes available. This greedy strategy ensures that smaller costs are incurred more frequently. A **Min-Heap (PriorityQueue)** is perfect for this, as it always provides the two smallest elements efficiently. It's like **Iron Man optimizing resource usage**: always combining the cheapest materials first to minimize overall expenditure.

## 🛠️ Approach
* Create a `PriorityQueue<Integer>` (defaults to min-heap).
* Add all `ropes` lengths to the `pq`.
* Initialize `cost = 0`.
* While `pq.size() > 1`:
    * Remove the two smallest ropes (`a` and `b`).
    * Calculate their sum `s = a + b`.
    * Add `s` to `cost`.
    * Add `s` back to the `pq` (the new combined rope).
* Print the `cost`.

## 🚀 Complexity Analysis
* **Time:** `O(N log N)` - `N` additions and `N-1` removals/additions from heap.
* **Space:** `O(N)` - For the `PriorityQueue`.

### Code Explanation:
The `PriorityQueue` (`pq`) automatically keeps the ropes sorted by length (smallest at top). The `while` loop continuously extracts the two smallest ropes, sums their lengths (`s`), adds `s` to total `cost`, and re-inserts `s` into the `pq`. This ensures the **greedy strategy of always combining the two smallest**, leading to the minimum overall cost.





# 💥 Heaps - `Heap9`: K Weakest Rows in a Matrix 💥

## 📁 File: `Heaps/Heap9.java`

## 🎯 Problem Statement
Given a binary matrix (representing army rows where 1s are soldiers and 0s are civilians), find the `k` weakest rows. A row is weaker if it has fewer soldiers. If two rows have the same number of soldiers, the one with the smaller index is weaker.

**LeetCode Link:** [LeetCode 1337. The K Weakest Rows in a Matrix](https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/)

## 🤔 Intuition
To find the weakest rows, we need to sort them first by soldier count (ascending), then by index (ascending) as a tie-breaker. A **Min-Heap (PriorityQueue)** with a custom `Comparable` is ideal for this. We add all rows to the heap, and then simply extract the top `k` elements, which will automatically be the weakest. This is like **S.H.I.E.L.D. identifying the `k` least fortified outposts** by first checking personnel strength, then serial ID.

## 🛠️ Approach
* Define a `Row` class storing `soldiers` count and `idx` (original row index).
* Implement `Comparable<Row>` for `Row`:
    * First, compare by `soldiers` (ascending).
    * If `soldiers` are equal, then compare by `idx` (ascending).
* Create a `PriorityQueue<Row>`.
* Iterate through each row of the `army` matrix:
    * Count soldiers (`1`s) in the current row.
    * Add a new `Row` object (`soldiers`, `i`) to the `pq`.
* Loop `k` times:
    * Remove the top element from `pq`.
    * Print its `idx`.

## 🚀 Complexity Analysis
* **Time:** `O(R * C + R log R)` - `R` rows, `C` columns. Counting soldiers `O(R*C)`. Adding to PQ `O(R log R)`. Removing `K` elements `O(K log R)`.
* **Space:** `O(R)` - For the `PriorityQueue` storing all `R` rows.

### Code Explanation:
The `Row` class encapsulates soldier count and index. Its `compareTo` method defines the custom sorting: weaker by soldier count first, then by index. The main loop calculates soldiers per row and adds `Row` objects to the `pq`. The final loop extracts `k` elements from `pq`. Because of `compareTo`, these `k` elements will be the weakest (smallest soldier count, then smallest index).





# 💥 Heaps - `Heap10`: Sliding Window Maximum 💥

## 📁 File: `Heaps/Heap10.java`

## 🎯 Problem Statement
Given an array `arr` and an integer `k`, find the maximum element in each contiguous subarray (window) of size `k`.

**LeetCode Link:** [LeetCode 239. Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/)

## 🤔 Intuition
For each sliding window, we need its maximum efficiently. A **Max-Heap (PriorityQueue)** storing `(value, index)` pairs is ideal. When the window slides, elements outside its bounds are removed. The heap's top element then gives the maximum for the current window. This is like **Iron Man always knowing the highest power signature** within his current scan range.

## 🛠️ Approach
* Define a `Pair` class storing `val` and `idx`, implementing `Comparable` to sort by `val` in descending order (max-heap).
* Create a `PriorityQueue<Pair> pq`.
* **First Window (`i=0` to `k-1`):** Add `(arr[i], i)` to `pq`. The max is `pq.peek().val`.
* **Subsequent Windows (`i=k` to `n-1`):**
    * **Remove out-of-window elements:** While `pq` is not empty and its top element's index (`pq.peek().idx`) is less than or equal to `(i-k)` (outside current window), remove it.
    * Add `(arr[i], i)` to `pq`.
    * The maximum for the current window is `pq.peek().val`. Store it in `result`.

## 🚀 Complexity Analysis
* **Time:** `O(N log K)` - `N` elements, each `add`/`remove` is `log K` (heap size `K`).
* **Space:** `O(K)` - For `PriorityQueue` storing at most `K` elements.

### Code Explanation:
The `Pair` class stores value and index, ordered for a max-heap. The code first populates `pq` for the initial window. Then, for subsequent windows, the `while` loop efficiently **removes elements that have fallen out** of the current window. New elements are added, and `pq.peek().val` always provides the current window's maximum.