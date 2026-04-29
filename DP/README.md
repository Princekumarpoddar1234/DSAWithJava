# 💥 Dynamic Programming - `DP`: Fibonacci (Memoization & Tabulation) 💥

## 📁 File: `DynamicProgramming/DP1.java`

## 🎯 Problem Statement
Calculate the Nth Fibonacci number using two Dynamic Programming techniques: memoization (top-down) and tabulation (bottom-up).

**LeetCode Link:** [LeetCode 509. Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)

## 🤔 Intuition
Fibonacci involves redundant calculations. DP optimizes this **"repetitive task" problem**.
* **Memoization (Top-Down):** Recursion with a **memory chip**. Compute and store only if not already cached.
* **Tabulation (Bottom-Up):** Build solution from base cases up in a table. Like **Iron Man building his suit piece by piece**.

## 🛠️ Approach
* **Memoization (`fib` method):** Base cases `0` and `1`. If `f[n]` is known, return it. Else, compute `f[n] = fib(n-1) + fib(n-2)` and store.
* **Tabulation (`fibTabular` method):** Create `dp` array. Initialize `dp[0]=0`, `dp[1]=1`. Loop `i=2` to `n`, `dp[i] = dp[i-1] + dp[i-2]`. Return `dp[n]`.

## 🚀 Complexity Analysis
* **Time Complexity (Both):** `O(N)` - Each Fibonacci number computed once. **Quicksilver speed!**
* **Space Complexity (Both):** `O(N)` - Array for memoization/tabulation. **S.H.I.E.L.D. database efficiency!**

### Code Explanation:
* **`fib(int n, int[] f)` (Memoization):** `if(f[n] != 0)` is the **memory check**. Computes `f[n]` recursively and **stores results** for reuse.
* **`fibTabular(int n)` (Tabulation):** `dp` array is the **results table**. Loop `i=2` to `n` **fills the table bottom-up**, like **Jarvis building a simulation from known facts**.
* Both methods provide `Nth` Fibonacci, showcasing **Avenger-level optimization!**




# 💥 Dynamic Programming - `DP2`: Climbing Stairs (Memoization & Tabulation) 💥

## 📁 File: `DynamicProgramming/DP2.java`

## 🎯 Problem Statement
Find the number of distinct ways to climb `n` stairs, where you can climb either 1 or 2 steps at a time.

**LeetCode Link:** [LeetCode 70. Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)

## 🤔 Intuition
This problem is a classic example of overlapping subproblems, like **Doctor Strange seeing multiple, similar futures**. The number of ways to reach `n` stairs is the sum of ways to reach `n-1` stairs (then take 1 step) and ways to reach `n-2` stairs (then take 2 steps). DP avoids redundant computations.

## 🛠️ Approach
* **Recursive (`countWays` - provided for context, but not run):** Directly applies the recursive relation `countWays(n-1) + countWays(n-2)`. Leads to `O(2^N)` complexity due to re-calculations.
* **Memoization (`countWaysUsingMemo`):**
    * Base cases: `n=0` returns 1 way, `n<0` returns 0 ways.
    * If `ways[n]` (memoization array) is not `-1`, return stored value.
    * Else, compute `ways[n] = countWaysUsingMemo(n-1) + countWaysUsingMemo(n-2)` and store.
* **Tabulation (`countWaysUsingTabulation`):**
    * Create `dp` array of size `n+1`. Set `dp[0]=1` (one way to climb 0 stairs).
    * Loop `i=1` to `n`: `dp[i] = dp[i-1] + dp[i-2]` (for `i=1`, `dp[1]=dp[0]=1`).
    * Return `dp[n]`.

## 🚀 Complexity Analysis
* **Time Complexity (Memoization & Tabulation):** `O(N)` - Each subproblem `dp[i]` is computed once. **Faster than Quicksilver on a staircase!**
* **Space Complexity (Memoization & Tabulation):** `O(N)` - For the `ways` or `dp` array. **As compact as Ant-Man's Pym particles!**

### Code Explanation:
* **`countWaysUsingMemo(int n, int ways[])`:**
    * `if(ways[n] != -1)`: This is the **cache check**. If the result is already computed, use it.
    * `ways[n] = ...`: Stores the result of `n-1` and `n-2` computations, preventing **redundant mission planning**.
* **`countWaysUsingTabulation(int n)`:**
    * `dp[0] = 1;`: Sets the **base of operations** (one way to be at stair 0).
    * `for(int i=1; i<=n; i++){ ... }`: **Builds the solution step-by-step**, filling the `dp` array.
    * `dp[i] = dp[i - 1] + dp[i - 2];`: Each step's ways are sum of ways from previous 1 or 2 steps, like **assembling a powerful combination from known forces**.
* Both DP methods provide efficient solutions, avoiding the brute force `O(2^N)` recursive approach, showcasing **Avengers-level tactical planning**!




# 💥 Dynamic Programming - `DP3`: 0/1 Knapsack Problem 💥

## 📁 File: `DynamicProgramming/DP3.java`

## 🎯 Problem Statement
Given items with weights and values, and a knapsack with a maximum weight capacity `W`, find the maximum total value that can be placed in the knapsack. Each item can either be entirely included or entirely excluded (0/1 choice).

**LeetCode Link:** [LeetCode 416. Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/) (related to subset sum, which is a variation of knapsack), or more directly, common variations of the 0/1 Knapsack Problem.

## 🤔 Intuition
This is a classic "choose or don't choose" problem with constraints. Pure recursion is slow due to recalculating same subproblems. DP makes it efficient:
* **Recursive (`knapsack`):** Explores all possibilities, leading to `O(2^N)` complexity.
* **Memoization (`knapsackMemo` - Top-Down):** Adds a `dp` table (cache) to recursion. Before computing for `(n, W)`, check if `dp[n][W]` is already solved. If so, return; else, compute and store. This prunes redundant branches, like **Doctor Strange pruning timelines**.
* **Tabulation (`knapsackTabulation` - Bottom-Up):** Builds the solution iteratively. A 2D `dp` table `dp[i][j]` stores the max value for `i` items with capacity `j`. It systematically fills this table, starting from small subproblems, like **S.H.I.E.L.D. building a database of threats, starting from the lowest level**.

## 🛠️ Approach
* **Recursive (`knapsack`):**
    * Base case: `W=0` or `n=0` returns 0 value.
    * If `wt[n-1] <= W` (current item fits):
        * `include` current item: `val[n-1] + knapsack(..., W - wt[n-1], n-1)`
        * `exclude` current item: `knapsack(..., W, n-1)`
        * Return `max(include, exclude)`.
    * Else (current item doesn't fit): Exclude it: `knapsack(..., W, n-1)`.
* **Memoization (`knapsackMemo`):** Same logic as recursive, but stores `dp[n][W]` to avoid re-computation.
* **Tabulation (`knapsackTabulation`):**
    * Create `dp[n+1][W+1]` table, initialized to 0.
    * Iterate `i` (items from 1 to `n`) and `j` (weights from 1 to `W`).
    * For each `(i, j)`:
        * Get current item's `value (v)` and `weight (w)` (`val[i-1]`, `wt[i-1]`).
        * If `w <= j` (item fits current capacity `j`):
            * `incProfit = v + dp[i-1][j-w]` (include item, take profit + profit from remaining capacity with previous items).
            * `excProfit = dp[i-1][j]` (exclude item, profit is same as with previous items for same capacity).
            * `dp[i][j] = max(incProfit, excProfit)`.
        * Else (item doesn't fit): `dp[i][j] = dp[i-1][j]` (same as excluding it).
    * Return `dp[n][W]`.

## 🚀 Complexity Analysis
* **Time Complexity (Memoization & Tabulation):** `O(N * W)` - Each state `(n, W)` is computed once. `N` is number of items, `W` is max weight. This is a huge leap from exponential, like **Captain Marvel warping through space instead of flying**.
* **Space Complexity (Memoization & Tabulation):** `O(N * W)` - For the 2D `dp` table. **Efficient storage for crucial intel!**

### Code Explanation:
* **`knapsack(val, wt, W, n)`:** This is the **brute-force Avenger smash**, exploring every possibility without memory.
* **`knapsackMemo(val, wt, W, n, dp)`:**
    * `if(dp[n][W] != -1)`: The **cache hit!** If already computed, return it.
    * `dp[n][W] = Math.max(ans1, ans2);`: Stores the best outcome for this specific `(n, W)` state, like **Jarvis saving a strategic plan**.
* **`knapsackTabulation(val, wt, W)`:**
    * `dp[i][j]`: Represents the **maximum value for the first `i` items with a knapsack capacity of `j`**.
    * `if(w <= j)`: Checks if the current item `i` can actually **fit into the knapsack's current capacity `j`**.
    * `incProfit = v + dp[i-1][j-w];`: If included, add its value `v` to the maximum profit from the previous `i-1` items using the *remaining* capacity `(j-w)`. This is the **strategic 'take this item!' decision**.
    * `excProfit = dp[i-1][j];`: If excluded, the profit is simply whatever was possible with the previous `i-1` items at the *same* capacity `j`. This is the **tactical 'leave this item!' choice**.
    * `dp[i][j] = Math.max(incProfit, excProfit);`: Stores the optimal choice for the current item/capacity pair.
    * The loops systematically fill the `dp` table, ultimately giving the `MaxProfit` at `dp[val.length][W]`. This approach demonstrates **precision engineering for optimal resource allocation**, a truly **Stark-level solution!**




    # 💥 Dynamic Programming - `DP4`: Target Sum Subset 💥

## 📁 File: `DynamicProgramming/DP4.java`

## 🎯 Problem Statement
Given a set of non-negative integers and a target sum, determine if there exists a subset of the given set whose elements sum up to the target sum.

**LeetCode Link:** [LeetCode 416. Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/) (This problem is a direct application/variation)

## 🤔 Intuition
This is another classic DP problem. We build a 2D table `dp[i][j]`, where `dp[i][j]` is `true` if a sum `j` can be formed using the first `i` elements of the array, and `false` otherwise. For each element, we have two choices: include it or exclude it. This process is like **Iron Man considering whether to equip a specific upgrade**: does it help reach the objective, or is it better to proceed without it?

## 🛠️ Approach
* Create a 2D boolean DP table `dp[n+1][sum+1]`.
* **Initialization:** `dp[i][0] = true` for all `i` (sum 0 is always possible with an empty subset). All other `dp[0][j]` (first row for `j > 0`) remain `false` by default (positive sum not possible with 0 items).
* **Fill the table iteratively:**
    * Iterate through items `i` from 1 to `n`.
    * Iterate through target sums `j` from 1 to `sum`.
    * Get the value `v` of the `i-1`-th item (`arr[i-1]`).
    * **Include case:** If `v <= j` AND `dp[i-1][j-v]` is `true` (meaning the remaining sum `j-v` was possible with previous items), then `dp[i][j]` becomes `true`.
    * **Exclude case:** OR `dp[i][j]` with `dp[i-1][j]` (meaning sum `j` was possible with previous `i-1` items without considering the current item `i`).
* The final answer is `dp[n][sum]`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(N * Sum)` - Nested loops iterate `N` times for items and `Sum` times for possible sums. This makes it efficient for reasonable sums, like **Captain America swiftly coordinating a large team**.
* **Space Complexity:** `O(N * Sum)` - For the 2D boolean `dp` table. **A precise database for all subset sum possibilities!**

### Code Explanation:
* `boolean[][] dp = new boolean[n+1][sum+1];`: Our **battle map**, where `dp[i][j]` marks if sum `j` is possible with `i` items.
* `for(int i=0; i<n+1; i++){ dp[i][0]=true; }`: **Base case:** Sum 0 is always possible. This is the **foundation of our strategy**.
* `for(int i=1; i<n+1; i++){ for(int j=1; j<sum+1; j++){ ... } }`: These nested loops **systematically build up our solution**, considering each item and each possible sum.
* `int v = arr[i-1];`: The current item's value we're considering.
* `if(v <= j && dp[i-1][j-v] == true){ dp[i][j] = true; }`: This is the **"include" decision**. If the item fits (`v <= j`) and the *remaining sum* was possible *without* this item, then we can form the current sum `j`.
* `else if(dp[i-1][j] == true){ dp[i][j] = true; }`: This is the **"exclude" decision**. If the sum `j` was already possible *without* the current item, then it's still possible.
* The explicit `dp[i][j]=true` within both `if` and `else if` covers the logical OR `dp[i][j] = (v <= j && dp[i-1][j-v]) || dp[i-1][j]`.
* `return dp[n][sum];`: The **final verdict**: Can the target sum be achieved using all available items? This is our **ultimate mission objective status**!




# 💥 Dynamic Programming - `DP5`: Unbounded Knapsack Problem 💥

## 📁 File: `DynamicProgramming/DP5.java`

## 🎯 Problem Statement
Given items with values and weights, and a knapsack capacity `W`, find the maximum total value. Unlike 0/1 Knapsack, each item can be taken *multiple times*.

**LeetCode Link:** [LeetCode 322. Coin Change](https://leetcode.com/problems/coin-change/) (similar structure, often solved with unbounded knapsack logic), [GeeksForGeeks Unbounded Knapsack](https://www.geeksforgeeks.org/unbounded-knapsack-repetition-of-items-allowed/)

## 🤔 Intuition
The core difference from 0/1 Knapsack is the "unbounded" nature. If we decide to include an item, we can potentially include it *again* to reach the current capacity. This subtle change means when calculating the "include" profit for `dp[i][j]`, instead of looking back at `dp[i-1][...]` (previous item), we can look at `dp[i][...]` (current item *again*) with reduced capacity. This is like **Thor smashing Mjolnir, then picking it up for another smash** – the same powerful tool can be used repeatedly!

## 🛠️ Approach
* Create a 2D `dp` table `dp[n+1][W+1]`, where `n` is the number of items.
* **Initialization:** `dp[i][0] = 0` (0 value for 0 weight), `dp[0][j] = 0` (0 value for 0 items).
* **Fill the table iteratively:**
    * Iterate through items `i` from 1 to `n`.
    * Iterate through capacities `j` from 1 to `W`.
    * Get current item's `value (v)` and `weight (w)` (`val[i-1]`, `wt[i-1]`).
    * **If `w <= j` (current item fits):**
        * `dp[i][j] = Math.max(v + dp[i][j - w], dp[i-1][j])`.
        * The `v + dp[i][j - w]` term represents including the current item AND considering it *again* for the remaining capacity.
        * `dp[i-1][j]` represents excluding the current item.
    * **Else (`w > j`, current item doesn't fit):**
        * `dp[i][j] = dp[i-1][j]` (just take the value from not including it).
* Return `dp[n][W]`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(N * W)` - Nested loops iterate `N` times for items and `W` times for capacities. Efficient for the given constraints, like **Black Panther's forces systematically clearing a threat**.
* **Space Complexity:** `O(N * W)` - For the 2D `dp` table. Can be optimized to `O(W)` with 1D array.

### Code Explanation:
* `int[][] dp = new int[n+1][W+1];`: Our **strategic planning board**, storing max value for `i` items and `j` capacity.
* **Initialization loops:** Set the base cases where no items or no weight capacity yield 0 profit. This is the **mission's starting point**.
* `for(int i=1; i<=n; i++){ for(int j=1; j<=W; j++){ ... } }`: These loops systematically **evaluate every item for every possible capacity**.
* `if(wt[i-1] <= j)`: Checks if the current item's weight allows it to be considered for the current capacity `j`.
* `dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]], dp[i-1][j]);`: This is the **key difference from 0/1 Knapsack**.
    * `val[i-1] + dp[i][j - wt[i-1]]`: Represents taking the current item `(i-1)` and then looking into `dp[i]` (meaning we can **take the *same item* again**) for the *remaining* capacity `(j - wt[i-1])`. This is the "unbounded" part.
    * `dp[i-1][j]`: Represents not taking the current item, so we rely on the best solution from previous items `(i-1)` with the same capacity `j`.
* The `else` case handles items that are too heavy.
* `return dp[n][W];`: The **maximum profit obtainable**, found at the bottom-right of the table, represents the **optimal loot from our unbounded expedition!**




# 💥 Dynamic Programming - `DP6`: Coin Change (Ways to Make Sum) 💥

## 📁 File: `DynamicProgramming/DP6.java`

## 🎯 Problem Statement
Given a set of coins of different denominations and a target sum, find the total number of distinct ways to make up that sum. Coins can be used multiple times (unbounded supply).

**LeetCode Link:** [LeetCode 518. Coin Change II](https://leetcode.com/problems/coin-change-ii/)

## 🤔 Intuition
This is a classic variation of the unbounded knapsack problem, asking for *counts* of ways, not max value. It's like **Doctor Strange exploring all possible timelines** to achieve a specific outcome using available 'tools' (coins).
* **2D DP:** `dp[i][j]` represents the number of ways to make sum `j` using the first `i` coins. For each coin, we can either include it (and potentially re-use it for the remaining amount) or exclude it.
* **1D DP (Space Optimization):** Notice that `dp[i][j]` only depends on `dp[i][...]` and `dp[i-1][...]`. This allows reducing space to a 1D array, where `dp[j]` represents ways to make sum `j`. Iterate through coins, and for each coin, update `dp[j]` for all sums it can contribute to. This is **Ant-Man compacting a huge machine into a tiny case**!

## 🛠️ Approach
* **`coinChange` (2D Tabulation):**
    * Create `dp[n+1][sum+1]`.
    * **Initialization:** `dp[i][0]=1` for all `i` (one way to make sum 0: by taking no coins).
    * **Fill table:** Iterate `i` (coins) and `j` (sums).
        * If `coins[i-1] <= j` (coin can be included): `dp[i][j] = dp[i][j - coins[i-1]] + dp[i-1][j]`.
            * `dp[i][j - coins[i-1]]`: Ways if current coin *is* included (can use current coin again).
            * `dp[i-1][j]`: Ways if current coin is *not* included.
        * Else (`coins[i-1] > j`): `dp[i][j] = dp[i-1][j]` (cannot include coin, so same as previous row).
    * Return `dp[n][sum]`.
* **`coinChange1D` (1D Space Optimization):**
    * Create `dp[sum+1]` and set `dp[0]=1`.
    * For each `coin` in `coins`:
        * Iterate `j` from `coin` to `sum`.
        * `dp[j] += dp[j - coin]` (add ways to make `j - coin` using current/previous coins).
    * Return `dp[sum]`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(N * Sum)` (for 2D) / `O(N * Sum)` (for 1D) - `N` coins, `Sum` target. Each state is calculated once. **Efficient as Vision's rapid processing!**
* **Space Complexity:** `O(N * Sum)` (for 2D) / `O(Sum)` (for 1D) - 1D is significantly better for larger `N`.

### Code Explanation:
* **`coinChange(coins, sum)` (2D):**
    * `dp[i][j]` tracks ways to get sum `j` using first `i` coins.
    * `dp[i][0] = 1;`: **Base case:** One way to make 0 sum.
    * `if(coins[i-1] <= j) { dp[i][j] = dp[i][j - coins[i-1]] + dp[i-1][j]; }`: The **core DP relation**. It adds ways from "including current coin" (using `dp[i]` because we can use it again) and "excluding current coin" (using `dp[i-1]`). This is like **Captain America combining tactical maneuvers (include/exclude) for maximum impact**.
* **`coinChange1D(coins, sum)` (1D):**
    * `dp[0] = 1;`: Same base case.
    * `for(int coin:coins){ for(int j=coin; j<=sum; j++){ dp[j]+=dp[j-coin]; } }`: This is the **space-optimized magic**. For each coin, it updates `dp[j]` by adding ways from `dp[j-coin]`. This implies `dp[j-coin]` already includes possibilities with the *current* `coin`, allowing reuse. It's like **Black Widow's precision strike, optimizing resources to achieve the same result with less overhead.**




# 💥 Dynamic Programming - `DP7`: Rod Cutting Problem 💥

## 📁 File: `DynamicProgramming/DP7.java`

## 🎯 Problem Statement
Given a rod of a certain length and a list of prices for different smaller pieces, find the maximum profit by cutting the rod into pieces. Pieces can be reused (unbounded cuts).

**LeetCode Link:** Not directly on LeetCode, but a classic DP problem found on platforms like [GeeksForGeeks Rod Cutting](https://www.geeksforgeeks.org/cutting-a-rod-dp-13/)

## 🤔 Intuition
This is a variation of the Unbounded Knapsack problem, where the "items" are rod pieces, "weights" are their lengths, and "values" are their prices. The "knapsack capacity" is the `totalLength` of the rod. Since we can cut a rod into multiple pieces of the same length, it's "unbounded." We use DP to track the maximum value for every possible length up to `totalLength`, considering each piece available. It's like **Tony Stark maximizing profit from Vibranium ingots** by finding the most valuable way to cut them into components.

## 🛠️ Approach
* Create a 2D `dp` table `dp[n+1][totalLength+1]`, where `n` is the number of distinct piece lengths.
* **Initialization:** `dp[i][0]=0` (0 value for 0 length), `dp[0][j]=0` (0 value for 0 pieces).
* **Fill the table iteratively:**
    * Iterate through `i` (pieces from 1 to `n`).
    * Iterate through `j` (current lengths from 1 to `totalLength`).
    * Get current piece's `length (L)` and `price (P)` (`length[i-1]`, `price[i-1]`).
    * **If `L <= j` (current piece fits current length `j`):**
        * `dp[i][j] = Math.max(P + dp[i][j - L], dp[i-1][j])`.
        * `P + dp[i][j - L]`: Value from including current piece, then maximize profit for remaining length `(j-L)` *using current piece again* (unbounded).
        * `dp[i-1][j]`: Value from *excluding* current piece, taking best from previous `(i-1)` pieces for length `j`.
    * **Else (`L > j`, piece doesn't fit):**
        * `dp[i][j] = dp[i-1][j]` (cannot include, so same as previous row).
* Return `dp[n][totalLength]`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(N * TotalLength)` - `N` is number of piece types, `TotalLength` is target. Each state computed once. **As efficient as Shuri optimizing a Wakandan tech build!**
* **Space Complexity:** `O(N * TotalLength)` - For the 2D `dp` table. Can be optimized to `O(TotalLength)` with a 1D array.

### Code Explanation:
* `int[][] dp = new int[n+1][totalLength+1];`: Our **value grid**, `dp[i][j]` stores max value for length `j` using first `i` types of pieces.
* **Initialization loops:** Set `dp[i][0]` and `dp[0][j]` to `0`. **Base conditions: no length, no value; no pieces, no value.**
* `if(length[i-1] <= j)`: Checks if the current piece `(i-1)` can actually **fit into the rod's current segment `j`**.
* `dp[i][j] = Math.max(price[i-1] + dp[i][j - length[i-1]], dp[i-1][j]);`: This is the **core decision point**.
    * `price[i-1] + dp[i][j - length[i-1]]`: Represents taking the current piece and then maximizing profit for the *remaining length* `(j - length[i-1])`, importantly, still using **the same current piece type (`dp[i]`)** for the remaining capacity. This is the "unbounded" aspect.
    * `dp[i-1][j]`: Represents not taking the current piece, so we inherit the best value from considering only the previous piece types `(i-1)` for the same length `j`.
* The `else` case means the current piece is too long to fit, so we just carry over the best value from previous piece types.
* `return dp[n][totalLength];`: The **final maximized profit**, located at the bottom-right of our `dp` table, represents the **most valuable way to utilize our Vibranium rod!**




# 💥 Dynamic Programming - `DP8`: Longest Common Subsequence (LCS) 💥

## 📁 File: `DynamicProgramming/DP8.java`

## 🎯 Problem Statement
Given two strings, find the length of their longest common subsequence (LCS). A subsequence keeps relative order but not necessarily contiguous.

**LeetCode Link:** [LeetCode 1143. Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)

## 🤔 Intuition
LCS is about finding the longest "shared pattern" between two sequences. Pure recursion re-computes heavily. DP tackles this by storing results of subproblems.
* **Recursive:** Explores all match/mismatch possibilities.
* **Memoization (Top-Down):** Adds caching to recursion. If a subproblem `(n, m)` is solved, retrieve it; otherwise, compute and store. Like **Doctor Strange using the Eye of Agamotto to instantly recall past outcomes**.
* **Tabulation (Bottom-Up):** Builds a 2D `dp` table where `dp[i][j]` is the LCS of `str1[0...i-1]` and `str2[0...j-1]`. It systematically fills the table from smallest subproblems. This is **Jarvis meticulously building a data model from raw inputs**.

## 🛠️ Approach
* **Recursive (`lcs`):**
    * Base case: If either string is empty, LCS is 0.
    * If `str1[n-1] == str2[m-1]`: Characters match, so add 1 to `lcs(n-1, m-1)`.
    * Else (characters mismatch): Take `max(lcs(n-1, m), lcs(n, m-1))`.
* **Memoization (`lcsMemo`):** Same logic as recursive, but uses `dp[n][m]` to store and retrieve results, initializing `dp` array with -1.
* **Tabulation (`lcsTabulation`):**
    * Create `dp[n+1][m+1]` table. Initialize `dp[i][0]=0` and `dp[0][j]=0`.
    * Iterate `i` (for `str1`) and `j` (for `str2`):
        * If `str1.charAt(i-1) == str2.charAt(j-1)`: `dp[i][j] = dp[i-1][j-1] + 1` (match, take diagonal + 1).
        * Else: `dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1])` (mismatch, take max of above or left).
    * Return `dp[n][m]`.

## 🚀 Complexity Analysis
* **Time Complexity (Memoization & Tabulation):** `O(N * M)` - `N` and `M` are string lengths. Each `dp` state computed once. **Efficient as Black Widow analyzing a target's moves!**
* **Space Complexity (Memoization & Tabulation):** `O(N * M)` - For the 2D `dp` table.

### Code Explanation:
* **`lcs(str1, str2, n, m)`:** The basic recursive setup; intuitive but inefficient for large inputs.
* **`lcsMemo(str1, str2, n, m, dp)`:**
    * `if(dp[n][m] != -1)`: The **"already computed" check**, preventing redundant calculations.
    * `return dp[n][m] = ...`: Stores the result of subproblems, ensuring **optimal re-use of intel**.
* **`lcsTabulation(str1, str2)`:**
    * `dp[i][j]` stores LCS for prefixes.
    * `if(str1.charAt(i-1) == str2.charAt(j-1))`: When characters match, it's a **"hit!"**. We take the LCS of the shorter prefixes and add 1.
    * `else { ... Math.max(dp[i-1][j], dp[i][j-1]); }`: When characters don't match, it's a **"miss."** We explore two paths: either drop `str1`'s last char or `str2`'s last char, taking the best result. This methodical table filling is like **Captain America devising a strategy layer by layer**, ensuring all options are covered.





# 💥 Dynamic Programming - `DP9`: Longest Common Substring (LCSUB) 💥

## 📁 File: `DynamicProgramming/DP9.java`

## 🎯 Problem Statement
Given two strings, find the length of their longest common *substring*. A substring must be contiguous (unlike a subsequence).

**LeetCode Link:** Not directly on LeetCode as a standalone problem, but a common variant of LCS. (Can be found on [GeeksForGeeks Longest Common Substring](https://www.geeksforgeeks.org/longest-common-substring-dp-27/))

## 🤔 Intuition
The key difference from LCS is *contiguity*. If characters mismatch, the common substring "breaks," and our current length resets to 0. If they match, we simply extend the common substring found so far. We track the overall maximum length found anywhere in the DP table, like **Spider-Man trying to find the longest unbroken web-line** between two skyscrapers.

## 🛠️ Approach
* Create a 2D `dp` table `dp[n+1][m+1]`, where `n` and `m` are string lengths.
* **Initialization:** `dp` table is implicitly filled with `0`s (Java default), representing no common substring if either string or no characters match.
* Initialize `maxLength = 0` to store the maximum common substring length found.
* **Fill the table iteratively:**
    * Iterate `i` (for `str1`) and `j` (for `str2`).
    * If `str1.charAt(i-1) == str2.charAt(j-1)`: Characters match. `dp[i][j] = dp[i-1][j-1] + 1` (extend the common substring).
    * Else (characters mismatch): `dp[i][j] = 0` (the common substring breaks here).
    * In each iteration, update `maxLength = Math.max(maxLength, dp[i][j])`.
* Return `maxLength`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(N * M)` - Nested loops iterate `N` times for `str1` and `M` times for `str2`. **As fast as Falcon navigating a complex urban landscape!**
* **Space Complexity:** `O(N * M)` - For the 2D `dp` table.

### Code Explanation:
* `int[][] dp = new int[n+1][m+1];`: Our **match-tracking grid**. `dp[i][j]` stores the length of the common substring *ending* at `str1[i-1]` and `str2[j-1]`.
* `int maxLength = 0;`: This variable is our **personal best tracker**, keeping tabs on the longest substring found across the entire table.
* `if(str1.charAt(i-1) == str2.charAt(j-1))`: The **character match detector**.
    * `dp[i][j] = dp[i-1][j-1] + 1;`: If characters match, the length of the common substring grows by 1 from the previous diagonal match. It's like **Avengers seamlessly extending a combo attack**.
* `else { dp[i][j] = 0; }`: If characters mismatch, the **contiguous common substring breaks**, so we reset the length for this cell to `0`. This is crucial for *substrings* vs. *subsequences*.
* `maxLength = Math.max(maxLength, dp[i][j]);`: After each cell's `dp` value is calculated, we update `maxLength` if a new record is set.
* `return maxLength;`: The final `maxLength` holds the answer, unlike LCS where `dp[n][m]` would hold the result. This indicates the **ultimate shared sequence of continuous efforts** between the two strings.





# 💥 Dynamic Programming - `DP10`: Longest Increasing Subsequence (LIS) 💥

## 📁 File: `DynamicProgramming/DP10.java`

## 🎯 Problem Statement
Given an unsorted array of integers, find the length of the longest subsequence such that all elements of the subsequence are in strictly increasing order.

**LeetCode Link:** [LeetCode 300. Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/)

## 🤔 Intuition
A key insight for LIS is that if you find the Longest Common Subsequence (LCS) between the *original array* and a *sorted, unique version of that array*, the result is the LIS. Why? Because the common elements will inherently be in increasing order due to the sorted nature of the second array. It's like **Captain America finding his disciplined soldiers within a chaotic battle** – they naturally form a strong, ordered line.

## 🛠️ Approach
1.  **Create a unique, sorted array:**
    * Use a `HashSet` to extract unique elements from the original array.
    * Convert the `HashSet` back into an array.
    * Sort this new array. This becomes `sortedArr`.
2.  **Apply LCS logic:**
    * Create a 2D `dp` table `dp[n+1][m+1]` (where `n` is `arr.length`, `m` is `sortedArr.length`).
    * Iterate `i` (for `arr`) and `j` (for `sortedArr`).
    * If `arr[i-1] == sortedArr[j-1]`: `dp[i][j] = dp[i-1][j-1] + 1` (match, extend LCS).
    * Else: `dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1])` (mismatch, take max from previous states).
3.  Return `dp[n][m]`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(N log N + N*M)` where `N` is original array length, `M` is unique sorted array length (`M <= N`). Sorting takes `O(M log M)`. LCS takes `O(N*M)`. Overall `O(N^2)` in worst case. This is like **Iron Man's suit processing complex target data quickly but systematically.**
* **Space Complexity:** `O(N + M + N*M)` - For `HashSet`, `sorted` array, and `dp` table. Overall `O(N^2)`.

### Code Explanation:
* **`HashSet<Integer> set = new HashSet<>(); for(int num:arr) set.add(num);`**: This is the **data deduplication phase**, like **removing unnecessary intel from a dossier**.
* **`int[] sorted = new int[set.size()]; ... Arrays.sort(sorted);`**: Converts unique elements to an array and sorts it. This creates our **ordered reference sequence**.
* **`int[][] dp = new int[n+1][m+1];`**: Our **comparison grid**, where `dp[i][j]` tracks the LCS between prefixes of `arr` and `sorted`.
* **`if(arr[i-1] == sorted[j-1]) { dp[i][j] = dp[i-1][j-1] + 1; }`**: If elements match, they are part of the increasing subsequence, so we increment the count from the diagonal, like **assembling a perfect combo attack**.
* **`else { dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]); }`**: If they don't match, we take the maximum from excluding either the current element of `arr` or `sorted`. This ensures we keep building the longest possible increasing sequence, even with mismatches.
* **`return dp[n][m];`**: The final result is the length of the LCS, which is our LIS. It's the **ultimate testament to order emerging from chaos!**





# 💥 Dynamic Programming - `DP11`: Edit Distance (Levenshtein Distance) 💥

## 📁 File: `DynamicProgramming/DP11.java`

## 🎯 Problem Statement
Given two strings (`str1` and `str2`), find the minimum number of operations (insertions, deletions, or replacements) required to transform `str1` into `str2`. Each operation costs 1.

**LeetCode Link:** [LeetCode 72. Edit Distance](https://leetcode.com/problems/edit-distance/)

## 🤔 Intuition
This problem is about finding the most efficient path to transform one string into another. DP is perfect here because we're looking for an *optimal* value (minimum operations) by combining solutions to smaller subproblems. `dp[i][j]` represents the minimum operations to transform `str1[0...i-1]` into `str2[0...j-1]`.
* If characters match, no operation needed for this step.
* If they mismatch, we consider 3 operations: insert, delete, or replace, and pick the cheapest. This is like **Doctor Strange exploring minimal-cost pathways** through the multiverse to fix a broken reality.

## 🛠️ Approach
* Create a 2D `dp` table `dp[n+1][m+1]`, where `n` and `m` are string lengths.
* **Initialization:**
    * `dp[i][0] = i`: To transform `str1[0...i-1]` into an empty string, `i` deletions are needed.
    * `dp[0][j] = j`: To transform an empty string into `str2[0...j-1]`, `j` insertions are needed.
* **Fill the table iteratively:**
    * Iterate `i` (for `str1`) from 1 to `n`.
    * Iterate `j` (for `str2`) from 1 to `m`.
    * **If `str1.charAt(i-1) == str2.charAt(j-1)` (characters match):**
        * `dp[i][j] = dp[i-1][j-1]` (no operation needed for current characters).
    * **Else (characters mismatch):**
        * `add = dp[i][j-1] + 1` (cost of inserting char into `str1` to match `str2[j-1]`).
        * `delete = dp[i-1][j] + 1` (cost of deleting char from `str1[i-1]`).
        * `update = dp[i-1][j-1] + 1` (cost of replacing `str1[i-1]` with `str2[j-1]`).
        * `dp[i][j] = Math.min(add, Math.min(delete, update))`.
* Return `dp[n][m]`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(N * M)` - Nested loops iterate `N` times for `str1` and `M` times for `str2`. **Efficient as Jarvis optimizing power output!**
* **Space Complexity:** `O(N * M)` - For the 2D `dp` table.

### Code Explanation:
* `int[][] dp = new int[n+1][m+1];`: Our **transformation cost grid**. `dp[i][j]` stores the minimum operations for `str1` prefix of length `i` and `str2` prefix of length `j`.
* **Initialization loops (`i==0` or `j==0`):** These handle base cases where one string is empty, requiring full insertions or deletions. This is the **cost of starting from nothing**.
* `if(str1.charAt(i-1) == str2.charAt(j-1)) { dp[i][j] = dp[i-1][j-1]; }`: If characters match, there's **no cost incurred** for this pair; we simply take the cost from transforming the previous prefixes.
* `else { ... dp[i][j] = Math.min(add, Math.min(delete, update)); }`: If characters mismatch, we consider the three operations:
    * `add = dp[i][j-1] + 1`: Represents **inserting a character** into `str1` (cost +1), then matching `str1[0...i-1]` with `str2[0...j-2]`.
    * `delete = dp[i-1][j] + 1`: Represents **deleting a character** from `str1` (cost +1), then matching `str1[0...i-2]` with `str2[0...j-1]`.
    * `update = dp[i-1][j-1] + 1`: Represents **replacing a character** (cost +1), then matching `str1[0...i-2]` with `str2[0...j-2]`.
* We take the `Math.min` of these three, because we want the **cheapest path of transformation**, much like **Captain America finding the most effective way to breach an enemy stronghold**.





# 💥 Dynamic Programming - `DP12`: String Conversion (Insertions/Deletions) 💥

## 📁 File: `DynamicProgramming/DP12.java`

## 🎯 Problem Statement
Given two strings, `str1` and `str2`, find the minimum number of character insertion and deletion operations required to transform `str1` into `str2`.

**LeetCode Link:** This is a common application of Longest Common Subsequence (LCS), often seen in interviews or as a sub-problem.

## 🤔 Intuition
To convert `str1` to `str2` with minimum operations, we should identify the longest part that's *common* between them (their LCS). Characters in the LCS don't need any changes. The characters in `str1` *not* part of the LCS must be **deleted**. The characters in `str2` *not* part of the LCS must be **inserted**. It's like **Iron Man streamlining his tech**: keep the essential core (LCS), remove unnecessary old parts (deletions from `str1`), and add new necessary features (insertions for `str2`).

## 🛠️ Approach
1.  **Calculate LCS Length:** Use the standard Longest Common Subsequence (LCS) dynamic programming approach (tabulation) to find the length of the LCS between `str1` and `str2`.
2.  **Calculate Deletions:** The number of characters to delete from `str1` is `str1.length() - LCS_length`.
3.  **Calculate Insertions:** The number of characters to insert into `str1` (to become `str2`) is `str2.length() - LCS_length`.
4.  Print the counts of insertions and deletions.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(N * M)` - Dominated by the LCS calculation, where `N` and `M` are string lengths. **As efficient as Captain Marvel's flight path!**
* **Space Complexity:** `O(N * M)` - For the 2D `dp` table used in LCS.

### Code Explanation:
* **`lcsForStringConversion(String str1, String str2)`:** This method is essentially the **standard LCS tabulation algorithm** (as seen in `DP8`).
    * `int[][] dp = new int[n+1][m+1];`: Our `dp` table for LCS lengths.
    * **Initialization:** `if(i==0 || j==0) dp[i][j]=0;`: Crucially, the base cases for LCS are `0` when either string is empty. (The prior `if(i==0)dp[i][j]=j; else if(j==0) dp[i][j]=i;` lines are typical for Edit Distance, but are correctly overridden by the subsequent `dp[i][j]=0` for LCS here).
    * **Main loop:** `if(str1.charAt(i-1)==str2.charAt(j-1)) { dp[i][j]=dp[i-1][j-1]+1; }`: If characters match, increment LCS length from diagonal.
    * `else { dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]); }`: If characters mismatch, take max from skipping either `str1`'s or `str2`'s current character.
* **`stringConversion(String str1, String str2)`:** This orchestrates the conversion.
    * `int z = lcsForStringConversion(str1, str2);`: First, it **identifies the common core** (`z` is LCS length).
    * `int insertions = str2.length() - z;`: The characters *remaining* in `str2` after accounting for LCS must be inserted. This is our **"new features needed" count**.
    * `int deletions = str1.length() - z;`: The characters *remaining* in `str1` after accounting for LCS must be deleted. This is our **"old parts to remove" count**.
* The function then prints these two counts, providing the **minimal operations plan** to morph `str1` into `str2`.





# 💥 Dynamic Programming - `DP13`: Wildcard Matching 💥

## 📁 File: `DynamicProgramming/DP13.java`

## 🎯 Problem Statement
Given a string `s` and a pattern `p` (containing `?` for any single character and `*` for any sequence), determine if `s` matches `p`.

**LeetCode Link:** [LeetCode 44. Wildcard Matching](https://leetcode.com/problems/wildcard-matching/)

## 🤔 Intuition
This problem is about finding if one sequence (string) conforms to a flexible blueprint (pattern). Dynamic Programming is perfect for handling the ambiguity of `?` and `*`. We build a `dp[i][j]` table where `dp[i][j]` is `true` if `s[0...i-1]` matches `p[0...j-1]`. The `*` wildcard is particularly tricky: it can either match *nothing* or *one or more characters*. This requires considering both possibilities, like **Doctor Strange exploring branching timelines for a successful outcome**.

## 🛠️ Approach
* Create a 2D boolean `dp` table `dp[n+1][m+1]`.
* **Initialization:**
    * `dp[0][0] = true` (empty string matches empty pattern).
    * `dp[i][0] = false` for `i > 0` (non-empty string cannot match empty pattern).
    * `dp[0][j]` for `j > 0`: `true` only if `p[0...j-1]` consists entirely of `*` characters.
* **Fill the table iteratively:**
    * Iterate `i` (for `s`) and `j` (for `p`).
    * **If `s[i-1] == p[j-1]` or `p[j-1] == '?'`:** Match! `dp[i][j] = dp[i-1][j-1]` (take result from previous match).
    * **Else if `p[j-1] == '*'`:** Wildcard! `dp[i][j] = dp[i][j-1] || dp[i-1][j]`.
        * `dp[i][j-1]`: `*` matches an *empty sequence*.
        * `dp[i-1][j]`: `*` matches *one or more characters*.
    * **Else (no match, no wildcard):** `dp[i][j] = false`.
* Return `dp[n][m]`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(N * M)` - Nested loops over string and pattern lengths. **Efficient as Black Panther's tactical assessment!**
* **Space Complexity:** `O(N * M)` - For the 2D `dp` table.

### Code Explanation:
* `boolean[][] dp = new boolean[n+1][m+1];`: Our **match-status grid**. `dp[i][j]` tells if `s` up to `i-1` matches `p` up to `j-1`.
* **Initialization:**
    * `dp[0][0]=true;`: The **base condition** – an empty string matches an empty pattern.
    * Row/Column zero initialization handles cases where one string/pattern is empty and contains `*` or not. This is setting up our **initial intelligence report**.
* `if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){ dp[i][j]=dp[i-1][j-1]; }`: This is the **direct match or 'any character' match**. If current characters align or `p` has `?`, then the result depends on previous subproblem `dp[i-1][j-1]`.
* `else if(p.charAt(j-1)=='*') { dp[i][j]=dp[i][j-1] || dp[i-1][j]; }`: This is the **wildcard's power!**
    * `dp[i][j-1]`: Represents `*` matching an **empty sequence** (e.g., "ab" matches "ab*").
    * `dp[i-1][j]`: Represents `*` matching **one or more characters** (e.g., "abc" matches "a*c").
    * We `OR` these possibilities, as either scenario leads to a match. This is like **Hulk's adaptability: able to smash or... just stand there menacingly**.
* `else { dp[i][j]=false; }`: If no direct match and no wildcard, it's a **definite mismatch**.
* `return dp[n][m];`: The **final verdict** from our table, indicating if the full string matches the full pattern.





# 💥 Dynamic Programming - `DP14`: Catalan Numbers (Rec, Memo, Tab) 💥

## 📁 File: `DynamicProgramming/DP14.java`

## 🎯 Problem Statement
Calculate the Nth Catalan number using pure recursion, memoization (top-down DP), and tabulation (bottom-up DP).

**LeetCode Link:** Not a direct LeetCode problem, but Catalan numbers appear in many combinatorial problems (e.g., [LeetCode 96. Unique Binary Search Trees](https://leetcode.com/problems/unique-binary-search-trees/)).

## 🤔 Intuition
Catalan numbers represent counting problems with recursive structures, like **Doctor Strange exploring valid multiversal configurations**. The recursive definition `C(n) = Σ (C(i) * C(n-i-1))` shows overlapping subproblems, making DP ideal.
* **Recursive:** Simple translation of the formula, but re-computes heavily.
* **Memoization:** Uses a cache to store `C(n)` values, avoiding re-calculation. It's **Jarvis remembering complex calculations** to speed up future requests.
* **Tabulation:** Builds the `C(n)` sequence from base cases `C(0), C(1)` upwards, filling an array iteratively. This is **Iron Man building up his suit's components in a structured sequence**.

## 🛠️ Approach
* **Recursive (`catalanRec`):**
    * Base cases: `n=0` or `n=1` return 1.
    * Iterate `i` from `0` to `n-1`, sum `catalanRec(i) * catalanRec(n-i-1)`.
* **Memoization (`catalanMemo`):**
    * Same as recursive, but uses `dp` array. If `dp[n]` is known (`!= -1`), return it.
    * Store `ans` in `dp[n]` before returning.
* **Tabulation (`catalanTabulation`):**
    * Create `dp[n+1]` array. `dp[0]=1`, `dp[1]=1`.
    * Outer loop `i` from `2` to `n`.
    * Inner loop `j` from `0` to `i-1`.
    * `dp[i] += dp[j] * dp[i-j-1]`.
    * Return `dp[n]`.

## 🚀 Complexity Analysis
* **Time Complexity (Recursive):** `O(Exponential)` - Highly inefficient for larger `n`.
* **Time Complexity (Memoization & Tabulation):** `O(N^2)` - Nested loops or recursive calls with caching. **Efficient as Quicksilver on a loop!**
* **Space Complexity (Memoization & Tabulation):** `O(N)` - For the `dp` array.

### Code Explanation:
* **`catalanRec(n)`:** Directly implements the **combinatorial summation**. Good for understanding, bad for performance (like **Hulk's brute force method**).
* **`catalanMemo(n, dp)`:**
    * `if(dp[n]!=-1) return dp[n];`: The **cache lookup**. If we've computed `C(n)` before, use the stored value.
    * `ans+=catalanMemo(i,dp)*catalanMemo(n-i-1,dp);`: Recursive calls are made, and results are stored, avoiding recalculations. This is **Jarvis optimizing computation by remembering previous results**.
* **`catalanTabulation(n)`:**
    * `dp[0]=dp[1]=1;`: Initializes the **base values for the sequence**.
    * `for(int i=2; i<=n; i++) { for(int j=0; j<=i-1; j++) { dp[i]+=dp[j]*dp[i-j-1]; } }`: This nested loop systematically fills the `dp` array. `dp[i]` is computed by summing products of previously calculated `dp[j]` values, essentially **building the complex structure of a Catalan number from its fundamental building blocks**, like **assembling a powerful team from known heroes**.
* Both DP methods provide `O(N^2)` efficiency, turning an otherwise impossible calculation into a manageable one, showcasing **true dynamic programming power!**





# 💥 Dynamic Programming - `DP15`: Count Unique Binary Search Trees (BSTs) 💥

## 📁 File: `DynamicProgramming/DP15.java`

## 🎯 Problem Statement
Given `n` nodes (from 1 to `n`), find the number of structurally unique Binary Search Trees (BSTs) that can be formed using these `n` nodes.

**LeetCode Link:** [LeetCode 96. Unique Binary Search Trees](https://leetcode.com/problems/unique-binary-search-trees/)

## 🤔 Intuition
This problem is a direct application of **Catalan Numbers**. For any given node `i` (from 1 to `n`) chosen as the root of a BST, all nodes smaller than `i` must form the left subtree, and all nodes larger than `i` must form the right subtree. The number of ways to form these subtrees is independent. The total number of BSTs with `n` nodes is the sum of (ways to form left subtree * ways to form right subtree) for each possible root. This decomposition and summation mirrors the recursive definition of Catalan numbers, like **Doctor Strange exploring all possible configurations of time** to find unique stable realities.

## 🛠️ Approach
* Recognize that `countBST(n)` is the `n`-th Catalan number `C(n)`.
* Use dynamic programming (tabulation) to calculate Catalan numbers:
    * Create a `dp` array of size `n+1`.
    * **Base Cases:** `dp[0]=1` (one way to form an empty BST) and `dp[1]=1` (one way to form a BST with 1 node).
    * Iterate `i` from `2` to `n` (representing the number of nodes for which we are calculating BSTs).
    * For each `i`, iterate `j` from `0` to `i-1` (representing `j` nodes in the left subtree):
        * `left = dp[j]` (number of BSTs for the `j` nodes in the left subtree).
        * `right = dp[i-1-j]` (number of BSTs for the `i-1-j` nodes in the right subtree; `i-1` accounts for the current root).
        * `dp[i] += left * right`.
* Return `dp[n]`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(N^2)` - Nested loops, where the outer loop goes `N` times and the inner loop up to `N` times. **Efficient as Iron Man's rapid prototyping system!**
* **Space Complexity:** `O(N)` - For the 1D `dp` array.

### Code Explanation:
* `int[] dp = new int[n+1];`: Our **BST count registry**. `dp[i]` will store the number of unique BSTs with `i` nodes.
* `dp[0]=dp[1]=1;`: **Base cases**: One way for 0 nodes (empty tree) and one way for 1 node. These are the **fundamental building blocks** for all BSTs.
* `for(int i=2; i<=n; i++){ ... }`: Outer loop iterates to calculate `dp[i]` for increasing number of nodes.
* `for(int j=0; j<=i-1; j++){ ... }`: Inner loop iterates through all possibilities for the *number of nodes in the left subtree* (`j`).
    * `int left = dp[j];`: Gets the count of BSTs possible with `j` nodes on the left side.
    * `int right = dp[i-1-j];`: Gets the count of BSTs possible with the remaining `i-1-j` nodes on the right side (where `i-1` is total nodes excluding the current root).
    * `dp[i] += left * right;`: The product `left * right` gives total ways if `j` nodes are on left. Summing these products for all possible `j` gives `dp[i]`. This is the **recursive Catalan summation formula in action**, representing all ways to partition the nodes between left and right subtrees.
* `return dp[n];`: The final `dp[n]` value gives the total unique BSTs for `n` nodes, showcasing the **elegant solution derived from combinatorics and DP!**





# 💥 Dynamic Programming - `DP16`: Mountain Ranges 💥

## 📁 File: `DynamicProgramming/DP16.java`

## 🎯 Problem Statement
Given `n` pairs of 'up' and 'down' strokes, find the total number of distinct "mountain ranges" that can be formed. A valid mountain range starts and ends at the same horizontal level, and never goes below the starting level.

**LeetCode Link:** Not a direct LeetCode problem, but a classic combinatorial problem often solved using Catalan Numbers.

## 🤔 Intuition
This problem is another fascinating application of **Catalan Numbers**. Think of an 'up' stroke as an opening parenthesis `(` and a 'down' stroke as a closing parenthesis `)`. A valid mountain range corresponds to a valid sequence of `n` pairs of parentheses. For example, `()()` and `(())` are valid. The recursive structure for counting these valid sequences is identical to that of Catalan numbers: `C(n) = Σ (C(i) * C(n-i-1))`. Each term represents choosing `i` pairs for the first 'peak' (inside the first up/down) and `n-i-1` for the rest. This is like **Doctor Strange visualizing all valid magical sequences** that maintain balance.

## 🛠️ Approach
* Recognize that the number of mountain ranges for `n` pairs is the `n`-th Catalan number `C(n)`.
* Use dynamic programming (tabulation) to calculate Catalan numbers:
    * Create a `dp` array of size `n+1`.
    * **Base Cases:** `dp[0]=1` (one way to form an empty range) and `dp[1]=1` (one way to form a range with one peak `/\`).
    * Iterate `i` from `2` to `n` (representing the number of pairs).
    * For each `i`, iterate `j` from `0` to `i-1`:
        * `canBeInside = dp[j]` (ways to form the inner part of the first peak).
        * `canBeOutside = dp[i-1-j]` (ways to form the remaining ranges after the first peak).
        * `dp[i] += canBeInside * canBeOutside`.
* Return `dp[n]`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(N^2)` - Nested loops, where both iterate up to `N` times. **Efficient as the Hulk's focused smash!**
* **Space Complexity:** `O(N)` - For the 1D `dp` array.

### Code Explanation:
* `int[] dp = new int[n+1];`: Our **range-counting registry**. `dp[i]` will store the number of valid mountain ranges with `i` pairs.
* `dp[0]=dp[1]=1;`: **Base cases**: One way for 0 pairs (flat line) and one way for 1 pair (`/\`). These are the **foundational structures** from which more complex ranges are built.
* `for(int i=2; i<=n; i++){ ... }`: Outer loop calculates `dp[i]` for increasing number of pairs.
* `for(int j=0; j<=i-1; j++){ ... }`: Inner loop considers `j` pairs to be used for the first "mountain" (an outer `/\` enclosure).
    * `int canBeInside = dp[j];`: Ways to form a valid mountain range using `j` pairs *inside* the first pair's `/\`.
    * `int canBeOutside = dp[i-1-j];`: Ways to form valid mountain ranges using the remaining `i-1-j` pairs *outside* the first peak.
    * `dp[i] += canBeInside * canBeOutside;`: The product represents combinations for one `j` split. Summing these products for all possible `j` gives `dp[i]`. This applies the **Catalan summation formula**, mirroring how **Captain America strategizes to break down a large problem into smaller, solvable tactical units**.
* `return dp[n];`: The final `dp[n]` value provides the total count of valid mountain ranges for `n` pairs, demonstrating the **power of recognizing underlying mathematical patterns**!





# 💥 Dynamic Programming - `DP17`: Matrix Chain Multiplication (MCM) 💥

## 📁 File: `DynamicProgramming/DP17.java`

## 🎯 Problem Statement
Given a sequence of matrix dimensions, find the minimum number of scalar multiplications required to multiply these matrices. The order of multiplication can be varied.

**LeetCode Link:** Not directly on LeetCode as a problem, but a classical DP problem found on platforms like [GeeksForGeeks Matrix Chain Multiplication](https://www.geeksforgeeks.org/matrix-chain-multiplication-dp-8/)

## 🤔 Intuition
Matrix multiplication is associative, meaning `(A*B)*C` is the same as `A*(B*C)`, but the number of scalar multiplications (cost) can differ vastly. We need to find the optimal parenthesization. This problem has **optimal substructure** (optimal solution contains optimal solutions to subproblems) and **overlapping subproblems**. DP tackles this by breaking it into finding the min cost for `i` to `j` matrices. The choice is where to make the final split, like **Captain America strategizing the best point to break an enemy formation**.

## 🛠️ Approach
* **Recursive (`mcmRec`):**
    * Base case: `i == j` (single matrix), cost is 0.
    * Iterate `k` from `i` to `j-1` (possible split points).
    * `totalCost = mcmRec(i, k) + mcmRec(k+1, j) + cost_of_multiplying_final_two_matrices`.
    * Return `minCost` from all `k`.
* **Memoization (`mcmMemo`):**
    * Same as recursive, but uses a 2D `dp` array initialized to -1.
    * If `dp[i][j]` is not -1, return it.
    * Store `minCost` in `dp[i][j]` before returning.
* **Tabulation (`mcmTabulation`):**
    * Create a 2D `dp` table `dp[n][n]`. `dp[i][i]=0` (single matrix cost 0).
    * Iterate `len` (chain length) from 2 to `n-1`.
    * Iterate `i` (start index) from 1 to `n-len`.
    * Calculate `j = i + len - 1` (end index).
    * Initialize `dp[i][j]` to `Integer.MAX_VALUE`.
    * Iterate `k` from `i` to `j-1` (split point):
        * `cost = dp[i][k] + dp[k+1][j] + arr[i-1]*arr[k]*arr[j]`.
        * `dp[i][j] = Math.min(dp[i][j], cost)`.
    * Return `dp[1][n-1]` (cost for full chain).

## 🚀 Complexity Analysis
* **Time Complexity (Recursive):** `O(Exponential)` - Highly inefficient.
* **Time Complexity (Memoization & Tabulation):** `O(N^3)` - Three nested loops (`len`, `i`, `k`). Each state `(i,j)` is computed once, and each computation takes `O(N)` time. **Efficient as Iron Man's supercomputer for complex calculations!**
* **Space Complexity (Memoization & Tabulation):** `O(N^2)` - For the 2D `dp` table.

### Code Explanation:
* **`mcmRec(arr, i, j)`:** The **brute-force exploration** of all possible parenthesizations, leading to high redundant work.
* **`mcmMemo(arr, i, j, dp)`:**
    * `if(dp[i][j] != -1) return dp[i][j];`: The **cache lookup**, preventing repeated subproblem calculations.
    * `return dp[i][j] = minCost;`: Stores the computed minimum cost for `(i,j)` in the `dp` table.
* **`mcmTabulation(arr)`:**
    * `dp[i][i]=0;`: **Base cases**: No cost for multiplying a single matrix.
    * `for(int len=2; len<=n-1; len++){ ... }`: Outer loop for the **chain length**, building solutions for progressively longer matrix sequences.
    * `for(int i=1; i<=n-len; i++){ ... }`: Inner loop for the **starting index** of the current sub-chain.
    * `int j=i+len-1;`: Calculates the **ending index** for the current sub-chain.
    * `for(int k=i; k<j; k++){ ... }`: Innermost loop iterates through all **possible split points `k`**. This is where the core optimization happens.
    * `int cost3=arr[i-1] * arr[k] * arr[j];`: Calculates the **cost of the *final* multiplication** if the chain is split at `k`. `arr` contains dimensions: `(arr[i-1] x arr[i]), (arr[i] x arr[i+1]), ..., (arr[j-1] x arr[j])`. The two resulting matrices after split `k` are `(arr[i-1] x arr[k])` and `(arr[k] x arr[j])`.
    * `dp[i][j]=Math.min(dp[i][j], totalCost);`: Updates `dp[i][j]` with the **minimum cost found so far** for multiplying matrices from `i` to `j`. This careful accumulation of minimums ensures we find the overall optimal solution, much like **Captain America finding the most efficient battle plan among many possibilities**.





# 💥 Dynamic Programming - `DP18`: Minimum Partitioning Difference 💥

## 📁 File: `DynamicProgramming/DP18.java`

## 🎯 Problem Statement
Given an array of non-negative integers, divide it into two subsets such that the absolute difference between their sums is minimized.

**LeetCode Link:** [LeetCode 416. Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/) (This problem is a direct extension of Subset Sum and shares similar logic).

## 🤔 Intuition
To minimize the difference between two subset sums (let's call them `S1` and `S2`), the ideal scenario is when `S1` and `S2` are as close as possible, ideally `S1 = S2 = TotalSum / 2`.
This problem can be transformed into a variation of the **0/1 Knapsack problem or Subset Sum problem**. We calculate the `totalSum` of all elements. Our goal is to find a subset `S1` whose sum is as close as possible to `totalSum / 2` without exceeding it. If we find such a `S1`, then `S2` will be `totalSum - S1`. The difference will then be `|S1 - (totalSum - S1)|`. This is like **Captain America needing to split his team into two balanced squads** for a mission, ensuring minimal disparity in strength.

## 🛠️ Approach
1.  Calculate the `totalSum` of all elements in the input array `arr`.
2.  Define `target = totalSum / 2`.
3.  Use a 2D `dp` table `dp[n+1][target+1]` to solve a variation of the 0/1 Knapsack/Subset Sum problem. `dp[i][j]` will store the *maximum sum* achievable using the first `i` items that does not exceed sum `j`.
4.  **Initialization:** `dp[i][0] = 0` (0 sum possible with any number of items for target 0). `dp[0][j] = 0` (no items, no positive sum).
5.  **Fill the table iteratively:**
    * Iterate `i` (items) from 1 to `n`.
    * Iterate `j` (current target sum) from 1 to `target`.
    * Let `val = arr[i-1]` (current item's value).
    * **If `val <= j` (item fits current target sum):**
        * `include = val + dp[i-1][j-val]` (max sum by including current item).
        * `exclude = dp[i-1][j]` (max sum by excluding current item).
        * `dp[i][j] = Math.max(include, exclude)`.
    * **Else (`val > j`, item doesn't fit):**
        * `dp[i][j] = dp[i-1][j]` (cannot include, take value from excluding).
6.  The `sum1 = dp[n][target]` will be the maximum sum achievable for one subset, which is closest to `totalSum / 2`.
7.  Calculate `sum2 = totalSum - sum1`.
8.  Return `Math.abs(sum1 - sum2)`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(N * Sum)` - Where `N` is the number of items and `Sum` is the total sum of all elements. The DP table size dictates this. **As efficient as Ant-Man finding a key frequency in a vast signal!**
* **Space Complexity:** `O(N * Sum)` - For the 2D `dp` table.

### Code Explanation:
* `int sum=0; for(int num:arr) sum+=num;`: Calculates the **total power level** of all elements.
* `int target = sum / 2;`: Our **ideal balanced power level** for one subset.
* `int[][] dp = new int[n+1][target+1];`: Our `dp` table. `dp[i][j]` stores the *maximum sum* we can achieve using the first `i` elements without exceeding `j`. This is conceptually similar to a 0/1 Knapsack to maximize value.
* **Initialization loops:** Set base cases where 0 items or 0 target sum result in 0 achievable sum. This is our **foundation for calculation**.
* `if(val <= j) { ... } else { ... }`: This is the **decision logic** for each item:
    * `include = val + dp[i-1][j-val];`: Represents the max sum if we **take the current item**, adding its value to the best sum achievable for the *remaining target* with *previous items*.
    * `exclude = dp[i-1][j];`: Represents the max sum if we **don't take the current item**, taking the best sum achievable for the *same target* with *previous items*.
    * `dp[i][j] = Math.max(include, exclude);`: We always choose the **most valuable subset sum** for the current item/target combination.
* `int sum1 = dp[n][target];`: After filling the table, `sum1` holds the largest sum we could form that is `less than or equal to half the total sum`. This is the **closest we can get to perfect balance** for one subset.
* `int sum2 = sum - sum1;`: The sum of the other subset is simply the total sum minus `sum1`.
* `return Math.abs(sum1 - sum2);`: The final difference. This provides the **minimum possible imbalance** between the two subsets, ensuring the most balanced split possible, just like **Vision calculating the most stable distribution of his mass**.





# 💥 Dynamic Programming - `DP19`: Partition Equal Subset Sum 💥

## 📁 File: `DynamicProgramming/DP19.java`

## 🎯 Problem Statement
Given an array of non-negative integers, determine if it can be partitioned into two subsets such that the sum of elements in both subsets is equal.

**LeetCode Link:** [LeetCode 416. Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/)

## 🤔 Intuition
If an array can be partitioned into two subsets with equal sums, say `S1` and `S2`, then `S1` must equal `S2`, and `S1 + S2` must equal the `totalSum` of the array. This implies `2 * S1 = totalSum`, so `totalSum` must be even, and `S1` (and `S2`) must be `totalSum / 2`.
Thus, the problem reduces to: **Can we find a subset of the given array that sums up to `totalSum / 2`?** This is a classic **Subset Sum Problem**, which can be solved using dynamic programming, much like **Iron Man trying to find if a specific power output can be achieved** from a set of available energy sources.

## 🛠️ Approach
1.  Calculate the `totalSum` of all elements in the array.
2.  If `totalSum` is odd, return `false` immediately (cannot be partitioned into two equal sums).
3.  Set `target = totalSum / 2`.
4.  Use a 2D `dp` table `dp[n+1][target+1]`. `dp[i][j]` will store the *maximum sum* achievable using the first `i` items that does not exceed sum `j`. (Alternatively, `dp[i][j]` can be a boolean indicating if sum `j` is possible with `i` items, but this code uses the max sum approach from knapsack).
5.  **Initialization:** `dp[i][0] = 0` and `dp[0][j] = 0` (Java default for `int` arrays handles this).
6.  **Fill the table iteratively:**
    * Iterate `i` (items) from 1 to `n`.
    * Iterate `j` (current target sum) from 1 to `target`.
    * Let `val = arr[i-1]`.
    * **If `val <= j` (item fits current target sum):**
        * `include = val + dp[i-1][j-val]` (max sum by including current item).
        * `exclude = dp[i-1][j]` (max sum by excluding current item).
        * `dp[i][j] = Math.max(include, exclude)`.
    * **Else (`val > j`, item doesn't fit):**
        * `dp[i][j] = dp[i-1][j]`.
7.  After filling the table, check if `dp[n][target]` is equal to `target`. If it is, then a subset with `totalSum / 2` was found, so return `true`. Otherwise, return `false`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(N * Sum)` - Where `N` is the number of elements and `Sum` is the total sum of the array. **As fast as Quicksilver searching for a specific energy signature!**
* **Space Complexity:** `O(N * Sum)` - For the 2D `dp` table.

### Code Explanation:
* `int sum=0; ... if(sum%2!=0) return false;`: First, we calculate the `totalSum`. If it's odd, **mission aborted** immediately – equal partition is impossible.
* `int w = sum / 2;`: This is our **target sum for one subset**.
* `int[][] dp = new int[n+1][w+1];`: Our `dp` table, where `dp[i][j]` will store the maximum sum achievable using the first `i` items that is less than or equal to `j`.
* **Nested loops (filling `dp`):** This section is identical to the 0/1 Knapsack problem (maximizing value for a given weight). Here, "value" is the item's own number, and "weight" is also the item's number.
    * `if(arr[i-1] <= j)`: If the current item `arr[i-1]` can fit into the current "knapsack" capacity `j`.
    * `include = arr[i-1] + dp[i-1][j-arr[i-1]];`: Max sum if we **take the current item**.
    * `exclude = dp[i-1][j];`: Max sum if we **don't take the current item**.
    * `dp[i][j] = Math.max(include, exclude);`: We always choose the path that yields the **maximum sum** for the current `(item, target)` combination.
* `int sum1 = dp[n][w];`: After the table is filled, `sum1` holds the largest sum we could achieve using all items (`n`) that is less than or equal to our `target` (`w`).
* `return sum1 == sum / 2;`: The **final verdict**. If the maximum sum we could achieve (`sum1`) is exactly equal to `totalSum / 2`, then we found such a subset, and thus the array can be partitioned equally. This is the **ultimate check for balance**, much like **Thanos ensuring perfect equilibrium in the universe**.





# 💥 Dynamic Programming - `DP20`: Minimum Jumps to Reach End 💥

## 📁 File: `DynamicProgramming/DP20.java`

## 🎯 Problem Statement
Given an array where each element `arr[i]` represents the maximum number of steps one can take forward from index `i`, find the minimum number of jumps required to reach the last index of the array.

**LeetCode Link:** [LeetCode 45. Jump Game II](https://leetcode.com/problems/jump-game-ii/)

## 🤔 Intuition
This problem seeks the *minimum* jumps, suggesting a shortest path. DP is suitable because solutions for smaller subproblems (min jumps to reach `n-1` from `i+1`, `i+2`, etc.) contribute to larger ones. We build our solution **from the end of the array backwards**. `dp[i]` stores the minimum jumps from index `i` to the end. For each `i`, we explore all possible next steps (`i+1` to `i+arr[i]`) and pick the one that leads to the end with the fewest total jumps. This is like **Captain America finding the most efficient path through an obstacle course** by looking at the shortest route from each possible step.

## 🛠️ Approach
1.  Create a 1D `dp` array of size `n` (array length), initialized with `-1` (or a sentinel indicating uncomputed).
2.  **Base Case:** `dp[n-1] = 0` (0 jumps needed from the last index to reach itself).
3.  **Iterate Backwards:** Loop `i` from `n-2` down to `0`.
4.  For each `i`:
    * `steps = arr[i]` (maximum jump from `i`).
    * Initialize `ans = Integer.MAX_VALUE`.
    * **Explore next reachable indices:** Loop `j` from `i+1` up to `i+steps`, ensuring `j < n`.
    * If `dp[j]` is a valid (computed) value (`!= -1`):
        * `ans = Math.min(ans, dp[j] + 1)` (take the minimum of current `ans` or 1 jump from `i` plus `dp[j]` jumps from `j`).
    * If `ans` is not `Integer.MAX_VALUE` (meaning a path was found), set `dp[i] = ans`.
5.  Return `dp[0]` (minimum jumps from the start).

## 🚀 Complexity Analysis
* **Time Complexity:** `O(N^2)` - Outer loop runs `N` times. Inner loop (for `j`) can run up to `N` times in the worst case (if `arr[i]` is large). **Like Thor repeatedly smashing, potentially many small targets before moving on.**
* **Space Complexity:** `O(N)` - For the 1D `dp` array.

### Code Explanation:
* `int[] dp = new int[n]; Arrays.fill(dp,-1);`: Our **jump logbook**. `dp[i]` stores min jumps from `i` to end. Initialized to `-1` to indicate "not yet known."
* `dp[n-1]=0;`: **Base condition**: From the final position, 0 jumps are needed to reach the end. This is our **"finish line" marker**.
* `for(int i=n-2; i>=0; i--){ ... }`: This **iterates backward**, calculating `dp` values from right to left, using already computed values.
* `int steps = arr[i];`: The **maximum leap** possible from the current position `i`.
* `for(int j=i+1; j<=i+steps && j<n; j++){ ... }`: This inner loop explores all **reachable landing spots** from `i`.
* `if(dp[j] != -1){ ans = Math.min(ans, dp[j]+1); }`: If a landing spot `j` has a known minimum jumps value (`dp[j] != -1`), we update `ans` with `dp[j] + 1` (1 jump from `i` to `j`, plus `dp[j]` jumps from `j` to end). We pick the minimum, like **Spider-Man choosing the quickest swing path**.
* `if(ans != Integer.MAX_VALUE) dp[i] = ans;`: If a path to the end was found from `i`, store its minimum jumps.
* `return dp[0];`: The final result, the minimum jumps from the **starting point to the end**, much like **successfully navigating a treacherous alien landscape!**





# 💥 Dynamic Programming - `DP21`: Tribonacci Sequence 💥

## 📁 File: `DynamicProgramming/DP21.java`

## 🎯 Problem Statement
Generate the first `n` terms of the Tribonacci sequence. The Tribonacci sequence is similar to Fibonacci, but each number is the sum of the three preceding ones.

**LeetCode Link:** [LeetCode 1137. N-th Tribonacci Number](https://leetcode.com/problems/n-th-tribonacci-number/)

## 🤔 Intuition
Just like Fibonacci, directly calculating Tribonacci numbers recursively would lead to massive redundant computations. Dynamic Programming, specifically **tabulation (bottom-up)**, is the perfect strategy. By building a `dp` array from the base cases upwards, we ensure each Tribonacci number `T(i)` is computed only once by simply summing its three predecessors, much like **Jarvis compiling a complex report by referencing the three most recent data points**.

## 🛠️ Approach
1.  Create a `dp` array of size `n+1`.
2.  **Base Cases:** Initialize `dp[0]=0`, `dp[1]=0`, and `dp[2]=1`. (Note: standard Tribonacci usually starts `T(0)=0, T(1)=1, T(2)=1`. The provided code uses `T(0)=0, T(1)=0, T(2)=1` effectively making `T(3)=1`, `T(4)=2`, etc., based on this initial set).
3.  **Fill the table iteratively:** Loop `i` from `3` up to `n`.
4.  For each `i`, calculate `dp[i] = dp[i-1] + dp[i-2] + dp[i-3]`.
5.  Print all computed `dp` values.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(N)` - A single loop runs `N` times, performing constant-time operations inside. **As fast as Quicksilver counting every step!**
* **Space Complexity:** `O(N)` - For the 1D `dp` array to store all `N` terms.

### Code Explanation:
* `int[] dp = new int[n+1];`: Our **sequence registry**. `dp[i]` will store the `i`-th Tribonacci number.
* `dp[0]=dp[1]=0; dp[2]=1;`: These are the **foundational values** that kick off the sequence generation. (Based on the code's output, these base cases define the sequence `0, 0, 1, 1, 2, 4, ...` where `T(3)=T(2)+T(1)+T(0)=1+0+0=1`).
* `for(int i=3; i<=n; i++){ dp[i]=dp[i-1]+dp[i-2]+dp[i-3]; }`: This loop is the **engine of the Tribonacci sequence**. Each number is calculated by summing the three preceding numbers already stored in the `dp` array. This systematic computation is like **Captain America chaining together three precise moves** for a powerful attack.
* The final loop prints all the computed Tribonacci numbers, showcasing the **growth pattern of this unique numerical series**.





# 💥 Dynamic Programming - `DP22`: Generate Well-Formed Parentheses 💥

## 📁 File: `DynamicProgramming/DP22.java`

## 🎯 Problem Statement
Given `n` pairs of parentheses, generate all combinations of well-formed parentheses.

**LeetCode Link:** [LeetCode 22. Generate Parentheses](https://leetcode.com/problems/generate-parentheses/)

## 🤔 Intuition
This problem involves exploring all valid arrangements of parentheses. It's a classic backtracking or recursive generation problem. We build the string character by character (`(` or `)`), making sure to always maintain the "well-formed" property:
1.  The number of open parentheses never exceeds `n`.
2.  The number of close parentheses never exceeds the number of open parentheses.
3.  The total length of the string is `2 * n`.
This is like **Doctor Strange exploring all valid magical incantations** – each step must follow specific rules to create a coherent spell.

## 🛠️ Approach
* Use a recursive function `generateParentheses` with parameters:
    * `str`: The character array to build the current parenthesis combination.
    * `pos`: Current position in `str` to place a character.
    * `n`: Total number of pairs.
    * `open`: Count of currently used open parentheses.
    * `close`: Count of currently used close parentheses.
* **Base Case:** If `close == n` (all `n` closing parentheses have been placed), a valid combination is formed, print `str`.
* **Recursive Steps:**
    * **If `close < open`:** We can add a closing parenthesis `)`. Place `')'` at `str[pos]` and make a recursive call `generateParentheses(str, pos+1, n, open, close+1)`.
    * **If `open < n`:** We can add an opening parenthesis `(`. Place `'('` at `str[pos]` and make a recursive call `generateParentheses(str, pos+1, n, open+1, close)`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(4^N / sqrt(N))` - Each valid sequence has length `2N`. At each step, we have 2 choices (open/close). This is bounded by the `N`th Catalan number, as this problem is directly related to Catalan numbers. **Vastly explores possibilities like Rocket Raccoon scanning all enemy weaknesses!**
* **Space Complexity:** `O(N)` - For the character array `str` and recursion stack depth.

### Code Explanation:
* `char[] str = new char[n*2];`: Our **"spell parchment"** to write down the parenthesis sequence. Total length `2*n`.
* `generateParentheses(str, pos, n, open, close)`: The **recursive spellcaster** function.
* `if(close == n) { System.out.println(String.valueOf(str)); return; }`: This is the **completion check**. If we've placed all `n` closing parentheses, the sequence is well-formed, so we print it and return.
* `if(close < open) { str[pos]=')'; generateParentheses(str, pos+1, n, open, close+1); }`: This is the rule for **placing a closing parenthesis**. We can only do this if we have an unmatched open parenthesis (`close < open`), ensuring our sequence remains valid so far.
* `if(open < n) { str[pos]='('; generateParentheses(str,pos+1,n,open+1,close); }`: This is the rule for **placing an opening parenthesis**. We can always add an open one as long as we haven't used all `n` available open parentheses.
* The combined logic ensures that the generated sequences always meet the well-formed criteria, creating **perfectly balanced constructs**, much like **Thanos's vision for the universe!**





# 💥 Dynamic Programming - `DP23`: Max Profit with Transaction Fee 💥

## 📁 File: `DynamicProgramming/DP23.java`

## 🎯 Problem Statement
Given an array of stock prices and a transaction fee, find the maximum profit achievable by buying and selling stocks. You can complete as many transactions as you like, but each transaction (buy and sell) incurs a fee. Additionally, track the specific buy and sell days for the *last* profitable transaction.

**LeetCode Link:** [LeetCode 714. Best Time to Buy and Sell Stock with Transaction Fee](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/)

## 🤔 Intuition
This problem can be optimized using a greedy approach, akin to a simplified Dynamic Programming. At any point, we track two states:
1.  `cash`: The maximum profit we can have if we *don't* currently hold any stock.
2.  `hold`: The maximum profit we can have if we *do* currently hold a stock (this value will be negative or less than previous cash if we just bought).
When iterating through prices, we decide whether to buy (if `cash - price[i]` is better than `hold`), or sell (if `hold + price[i] - fee` is better than `cash`). This is like **Iron Man constantly optimizing his energy usage**: deciding whether to activate a system (buy) or shut it down (sell) to maximize efficiency, always accounting for the power cost (transaction fee).

## 🛠️ Approach
* Initialize `cash = 0` (start with no profit, no stock) and `hold = -price[0]` (if we buy on day 0, our profit is negative the price).
* Initialize `buyDay=0`, `sellDay=0`, `currentBuyDay=0`, `maxDayDiff=0` to track days.
* Iterate through `price` array from day 1:
    * **Decision to Buy (or re-buy):** If `cash - price[i]` (profit if we buy today) is greater than `hold` (current max profit while holding), update `hold = cash - price[i]` and record `currentBuyDay = i`.
    * **Decision to Sell:** If `hold + price[i] - transactionFee` (profit if we sell today) is greater than `cash` (current max profit while having no stock), update `cash = hold + price[i] - transactionFee`.
        * Also update `buyDay = currentBuyDay`, `sellDay = i`, and `maxDayDiff = sellDay - buyDay` to track the most recent profitable transaction's days.
* After the loop, `cash` will hold the maximum profit. The `buyDay` and `sellDay` variables will hold the days for the *last* transaction that updated `cash` to its maximum.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(N)` - A single pass through the `price` array. **As fast as Quicksilver making a quick decision!**
* **Space Complexity:** `O(1)` - Only a few variables are used.

### Code Explanation:
* `int hold = -price[0]; int cash = 0;`: `hold` starts with the cost of buying on day 0. `cash` starts at 0 profit. These are our **financial trackers**.
* `for(int i=1; i<n; i++){ ... }`: Loop through each day's price to make buy/sell decisions.
* `if(cash - price[i] > hold){ hold = cash - price[i]; currentBuyDay = i; }`: This is the **"buy" logic**. If the profit by buying *now* (previous `cash` minus current `price`) is better than our current `hold` state, we update our `hold` value and mark this as the potential `buyDay`. It's like **Captain America finding a tactical advantage to recruit a new ally.**
* `if(hold + price[i] - transactionFee > cash){ cash = hold + price[i] - transactionFee; buyDay = currentBuyDay; sellDay = i; maxDayDiff = sellDay - buyDay; }`: This is the **"sell" logic**. If selling the stock we `hold` now (current `hold` value plus current `price` minus `fee`) yields more `cash` than we currently have, we execute the sell! We also record the `buyDay`, `sellDay`, and their difference, effectively logging the **most recent profitable mission**.
* The final print statements provide the **ultimate profit report and the key operational days** of the last significant transaction.





# 💥 Dynamic Programming - `DP24`: Longest Increasing Path in Matrix (Down/Right) 💥

## 📁 File: `DynamicProgramming/DP24.java`

## 🎯 Problem Statement
Given a matrix of integers, find the length of the longest increasing path starting from a specified cell (here, `(0,0)`), where moves are restricted to only **down** or **right**. Each step must lead to a strictly greater value.

**LeetCode Link:** [LeetCode 329. Longest Increasing Path in a Matrix](https://leetcode.com/problems/longest-increasing-path-in-a-matrix/) (This is a simplified version with limited movement directions).

## 🤔 Intuition
This problem involves finding the longest sequence in a grid with a strict increasing order and limited movement. Pure recursion would re-evaluate many paths. Dynamic Programming with **memoization (top-down)** is ideal: `dp[x][y]` stores the longest increasing path starting from cell `(x, y)`. When we need to find `lip(x, y)`, we recursively check paths going down and right. If a neighbor is valid (within bounds and larger), we add 1 to its `lip` value and take the maximum. We store results to avoid re-computing, like **Doctor Strange strategically mapping out the most extended possible magical ley lines** while avoiding dead ends.

## 🛠️ Approach
1.  Define a recursive function `lip(dp, mat, n, m, x, y)`:
    * **Base Case:** If `dp[x][y]` is already computed (`!= -1`), return it.
    * Initialize `result = 1` (the path always includes the current cell).
    * **Explore Down:** If `(x+1, y)` is valid and `mat[x+1][y]` is greater than `mat[x][y]`, update `result = max(result, 1 + lip(dp, mat, n, m, x+1, y))`.
    * **Explore Right:** If `(x, y+1)` is valid and `mat[x][y+1]` is greater than `mat[x][y]`, update `result = max(result, 1 + lip(dp, mat, n, m, x, y+1))`.
    * Store and return `dp[x][y] = result`.
2.  Define a `wrapper` function to initialize the `dp` table with `-1`s and call `lip` starting from `(0,0)`.

## 🚀 Complexity Analysis
* **Time Complexity:** `O(N * M)` - Each cell `(x, y)` is visited and computed exactly once. **As efficient as Jarvis scanning an entire grid in an instant!**
* **Space Complexity:** `O(N * M)` - For the 2D `dp` memoization table. Plus `O(N*M)` for recursion stack in worst case.

### Code Explanation:
* `static int lip(int[][] dp, int[][] mat, int n, int m, int x, int y)`: Our **recursive pathfinder**. `(x, y)` is the current cell.
* `if (dp[x][y] != -1) return dp[x][y];`: The **memoization check**. If this cell's longest path is already known, return it, avoiding redundant **timeline simulations**.
* `int result = 1;`: The **starting point** for any path is at least the cell itself.
* `if (x + 1 < n && mat[x][y] < mat[x + 1][y]) { ... }`: Checks the **"move down" path**. If valid (within bounds) and strictly increasing, recursively find `lip` from the next cell and add 1.
* `if (y + 1 < m && mat[x][y] < mat[x][y + 1]) { ... }`: Checks the **"move right" path**. Similar logic to "move down."
* `result = Math.max(result, 1 + lip(...));`: Updates `result` with the best (longest) path found so far from current cell.
* `return dp[x][y] = result;`: Stores the computed result in `dp` before returning, ensuring future calls to `lip(x, y)` are instant. This makes the exploration efficient, much like **S.H.I.E.L.D. logging all successful mission routes**.
* `wrapper(int[][] mat, int n, int m)`: This function is the **mission launcher**, setting up the `dp` table and initiating the `lip` process from `(0,0)`.