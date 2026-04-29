# 💥 Segment Trees - `SegmentTrees1`: Range Sum Query & Point Update 💥

## 📁 File: `SegmentTrees/SegmentTrees1.java`

## 🎯 Problem Statement
Implement a Segment Tree data structure to efficiently handle two types of operations on an array:
1.  **Range Sum Query:** Find the sum of elements within a given range `[qi, qj]`.
2.  **Point Update:** Update the value of a single element at a given index `idx` and reflect this change in the sums.

**LeetCode Link:** [LeetCode 303. Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-immutable/) (basic sum query), [LeetCode 307. Range Sum Query - Mutable](https://leetcode.com/problems/range-sum-query-mutable/) (direct application of Segment Tree).

## 🤔 Intuition
Imagine you're **Iron Man managing a vast network of energy conduits**. You need to quickly know the total energy flowing through any segment (`range sum query`) or update the output of a single generator (`point update`). A naive approach would be slow.

A Segment Tree is a binary tree used for storing information about intervals or segments. Each node in the tree represents an interval `[start, end]` of the original array. The root represents the entire array `[0, N-1]`. Its children represent `[0, mid]` and `[mid+1, N-1]`. Leaf nodes represent single elements `[i, i]`. By storing pre-calculated sums (or other aggregate values) in each node, we can answer range queries and perform point updates in logarithmic time. It's like having a **hierarchical data system**: instead of checking every single generator, you check the sum of energy from larger sections, then drill down only where needed.

## 🛠️ Approach
The Segment Tree is implemented as an array. Node `i` has left child `2*i+1` and right child `2*i+2`.

1.  **Initialization (`init`):** Creates the `tree` array with a size of `4*N` (a common safe upper bound for segment tree array size for `N` elements).
2.  **Building the Segment Tree (`buildST`):**
    * This is a recursive, bottom-up process.
    * **Base Case:** If `start == end` (a leaf node), `tree[i] = arr[start]`.
    * **Recursive Step:** Recursively build the left child (`buildST(..., 2*i+1, start, mid)`) and the right child (`buildST(..., 2*i+2, mid+1, end)`).
    * **Combine:** The current node `tree[i]` stores the sum of its children's values.
3.  **Range Sum Query (`getSum` / `getSumUtil`):**
    * This is a recursive, top-down process.
    * `getSumUtil(i, si, sj, qi, qj)`: `i` is current tree node index, `[si, sj]` is its range, `[qi, qj]` is query range.
    * **Cases:**
        * **No Overlap:** If `[si, sj]` and `[qi, qj]` have no intersection (`sj < qi` or `si > qj`), return 0.
        * **Total Overlap:** If `[si, sj]` is completely inside `[qi, qj]`, return `tree[i]`.
        * **Partial Overlap:** Recursively query left and right children. Sum their results.
4.  **Point Update (`update` / `updateUtil`):**
    * This is a recursive, top-down process that then propagates changes upwards.
    * `updateUtil(i, si, sj, idx, diff)`: `idx` is the index to update, `diff` is the change in value.
    * **Base Case:** If `idx` is outside `[si, sj]`, return.
    * **Update Current Node:** Add `diff` to `tree[i]`.
    * **Recursive Step:** If not a leaf node (`si != sj`), recursively call `updateUtil` for the child that contains `idx`.

## 🚀 Complexity Analysis
* **Initialization (`init`):** `O(1)`
* **Building (`buildST`):** `O(N)` - Each node in the segment tree is visited and computed once.
* **Range Sum Query (`getSum` / `getSumUtil`):** `O(log N)` - The query path goes down `log N` levels, and at each level, at most 2 nodes are visited.
* **Point Update (`update` / `updateUtil`):** `O(log N)` - The update path goes down `log N` levels.
* **Space Complexity:** `O(N)` - The `tree` array has a size proportional to `N` (typically `4*N`).

### Code Explanation:
* `static int[] tree;`: The **central data repository** for our segment tree.
* `init(int n)`: Sets up the `tree` array.
* `buildST(int[] arr, int i, int start, int end)`: This function **constructs the hierarchical sum network**. It's a recursive process:
    * `if(start==end)`: Reaches a leaf node, directly stores the `arr` value.
    * `tree[i]=buildST(arr,2*i+1, start,mid) + buildST(arr,2*i+2,mid+1,end);`: This line is key. It recursively builds the left and right subtrees, then **combines their results (sums)** into the current node `tree[i]`.
* `getSumUtil(int i, int si, int sj, int qi, int qj)`: This is the **efficient range query engine**.
    * `if(sj<=qi || si>=qj) return 0;`: **No overlap** with query range, so this path contributes nothing.
    * `else if(si>=qi && sj<=qj) return tree[i];`: **Total overlap**, the entire segment tree node's sum is relevant.
    * `else { ... return left + right; }`: **Partial overlap**, so recursively query both children and sum their results. This is like **Jarvis intelligently navigating the energy grid to sum specific sections**.
* `update(int[] arr, int idx, int newVal)`: This is the **point update orchestrator**. It calculates the `diff` and calls `updateUtil`.
* `updateUtil(int i, int si, int sj, int idx, int diff)`: This function **propagates changes up the tree**.
    * `if(idx<si || idx>sj) return;`: If the update index is outside the current node's range, stop.
    * `tree[i]+=diff;`: The current node's sum is directly updated by `diff`.
    * `if(si!=sj) { ... updateUtil(...); }`: If it's not a leaf node, it recursively calls `updateUtil` on the relevant child, ensuring the change propagates all the way down to the leaf and then bubbles back up through the `tree[i]+=diff` calls. This is like **Iron Man instantly recalibrating all affected power conduits** after a single generator's output changes.

This Segment Tree implementation provides a powerful and fast way to query and update ranges on an array, essential for many competitive programming and real-world data analysis tasks.





# 💥 Segment Trees - `SegmentTrees2`: Range Maximum Query & Point Update 💥

## 📁 File: `SegmentTrees/SegmentTrees2.java`

## 🎯 Problem Statement
Implement a Segment Tree data structure to efficiently handle two types of operations on an array:
1.  **Range Maximum Query (RMQ):** Find the maximum element within a given range `[qi, qj]`.
2.  **Point Update:** Update the value of a single element at a given index `idx` and reflect this change in the stored maximums.

**LeetCode Link:** [LeetCode 303. Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-immutable/) (conceptual similarity to RMQ), [LeetCode 307. Range Sum Query - Mutable](https://leetcode.com/problems/range-sum-query-mutable/) (conceptual similarity for mutable range queries). [LeetCode 239. Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) (could be solved by RMQ on a segment tree, though deque is more common).

## 🤔 Intuition
Just like a sum segment tree helps manage energy totals, a max segment tree helps find peak values. Imagine you're **Captain America analyzing a tactical map of enemy forces**. You need to quickly identify the **maximum troop concentration** in any given sector (`range maximum query`) or update the strength of a single unit (`point update`). A naive scan would be too slow.

A Segment Tree for maximums also uses a binary tree structure where each node represents an interval `[start, end]` of the original array. The difference is that instead of storing the sum, each node stores the *maximum value* found within its corresponding interval. This allows for rapid querying of maximums and efficient updates. It's like having a **network of surveillance outposts**: each outpost reports the highest threat level in its sector, allowing you to quickly find the overall max threat in any larger region.

## 🛠️ Approach
The Segment Tree is implemented as an array. Node `i` has left child `2*i+1` and right child `2*i+2`.

1.  **Initialization (`init`):** Creates the `tree` array with a size of `4*N` (a common safe upper bound for segment tree array size for `N` elements).
2.  **Building the Segment Tree (`createST`):**
    * This is a recursive, bottom-up process.
    * **Base Case:** If `si == sj` (a leaf node), `tree[i] = arr[si]`.
    * **Recursive Step:** Recursively build the left child (`createST(..., 2*i+1, si, mid)`) and the right child (`createST(..., 2*i+2, mid+1, sj)`).
    * **Combine:** The current node `tree[i]` stores the `maximum` of its children's values (`Math.max(tree[2*i+1], tree[2*i+2])`).
3.  **Range Maximum Query (`getMax` / `getMaxUtil`):**
    * This is a recursive, top-down process.
    * `getMaxUtil(i, si, sj, qi, qj)`: `i` is current tree node index, `[si, sj]` is its range, `[qi, qj]` is query range.
    * **Cases:**
        * **No Overlap:** If `[si, sj]` and `[qi, qj]` have no intersection (`sj < qi` or `si > qj`), return `Integer.MIN_VALUE` (as it won't affect the true maximum).
        * **Total Overlap:** If `[si, sj]` is completely inside `[qi, qj]`, return `tree[i]`.
        * **Partial Overlap:** Recursively query left and right children. Return the `maximum` of their results.
4.  **Point Update (`update` / `updateUtil`):**
    * This is a recursive, top-down process that then propagates changes upwards.
    * `updateUtil(i, si, sj, idx, newVal)`: `idx` is the index to update, `newVal` is the new value.
    * **Base Case:** If `idx` is outside `[si, sj]`, return.
    * **Update Current Node:** `tree[i]` needs to be updated with the `maximum` of its old value and `newVal` if `idx` is in its range, or by propagating max from children if it's an internal node. (The provided code updates `tree[i]` with `Math.max(newVal, tree[i])`, but for internal nodes, it should actually be `tree[i] = Math.max(tree[2*i+1], tree[2*i+2])` after children are updated to accurately reflect the max). The current implementation might only update `tree[i]` if `newVal` is greater than `tree[i]` from *before* children are potentially fully updated, which is a subtle point. The standard way is to update `tree[i]` as the maximum of its children *after* they are recursively updated.
    * **Recursive Step:** If not a leaf node (`si != sj`), recursively call `updateUtil` for the child that contains `idx`. After recursive calls, re-calculate `tree[i] = Math.max(tree[2*i+1], tree[2*i+2])`.

## 🚀 Complexity Analysis
* **Initialization (`init`):** `O(1)`
* **Building (`createST`):** `O(N)` - Each node in the segment tree is visited and computed once.
* **Range Maximum Query (`getMax` / `getMaxUtil`):** `O(log N)` - The query path goes down `log N` levels, and at each level, at most 2 nodes are visited.
* **Point Update (`update` / `updateUtil`):** `O(log N)` - The update path goes down `log N` levels.
* **Space Complexity:** `O(N)` - The `tree` array has a size proportional to `N` (typically `4*N`).

### Code Explanation:
* `static int[] tree;`: The **central data repository** for our max segment tree.
* `createST(int[] arr, int i, int si, int sj)`: This function **constructs the hierarchical maximum-finding network**.
    * `if(si==sj)`: Reaches a leaf node, directly stores the `arr` value.
    * `tree[i]=Math.max(tree[2*i+1],tree[2*i+2]);`: This line is key. It recursively builds the left and right subtrees, then **combines their results by taking the maximum** into the current node `tree[i]`.
* `getMaxUtil(int i, int si, int sj, int qi, int qj)`: This is the **efficient range maximum query engine**.
    * `if(sj < qi || si > qj) return Integer.MIN_VALUE;`: **No overlap** with query range, so this path contributes `MIN_VALUE` (to not affect the overall max).
    * `else if(si>=qi && sj<=qj) return tree[i];`: **Total overlap**, the entire segment tree node's maximum is relevant.
    * `else { ... return Math.max(left,right); }`: **Partial overlap**, so recursively query both children and take the maximum of their results. This is like **Iron Man quickly scanning sectors for the highest threat level**.
* `update(int[] arr, int idx, int newVal)`: This is the **point update orchestrator**. It updates `arr[idx]` and calls `updateUtil`.
* `updateUtil(int i, int si, int sj, int idx, int newVal)`: This function **propagates changes up the tree**.
    * `if(idx<si || idx>sj) return;`: If the update index is outside the current node's range, stop.
    * `tree[i]=Math.max(newVal,tree[i]);`: **(Self-correction/Note):** For a correct max segment tree update, after recursively updating children, the parent node `tree[i]` should be re-calculated as `Math.max(tree[2*i+1], tree[2*i+2])` to ensure it reflects the true maximum of its children. The provided `Math.max(newVal,tree[i])` might not fully propagate the maximum if `newVal` is smaller than a pre-existing max in another child's range or if it's not a leaf node being updated.
    * `if(si!=sj) { ... updateUtil(...); }`: If it's not a leaf node, it recursively calls `updateUtil` on the relevant child, ensuring the change is applied. After the recursive call(s), `tree[i]` should be re-computed as `Math.max(tree[2*i+1], tree[2*i+2])` to accurately reflect the maximum. This would be like **Captain America re-evaluating the overall force strength** in a sector after a single unit's power changes.

This Segment Tree implementation provides a powerful and fast way to query maximums and update single elements in an array, critical for competitive programming and various optimization problems.