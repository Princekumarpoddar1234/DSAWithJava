# 💥 Greedy Algorithm - `Greedy1`: Activity Selection Problem 💥

## 📁 File: `Greedy/Greedy1.java`

## 🎯 Problem Statement
Given a set of activities with start and end times, select the maximum number of non-overlapping activities.

**LeetCode Link:** [LeetCode 452. Minimum Number of Arrows to Burst Balloons](https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/) (similar greedy approach).

## 🤔 Intuition
To maximize selected activities, we greedily choose the activity that finishes earliest. This leaves the most time for subsequent activities. It's like **Iron Man picking the quickest-executing task** to free up his suit for more missions.

## 🛠️ Approach
* Assume activities are sorted by end times.
* Select the first activity.
* Iterate through remaining activities: if an activity's start time is after or equal to the previously selected activity's end time, select it.
* Count selected activities and store their indices.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Single pass through `N` activities (if already sorted).
* **Space:** `O(N)` - For storing chosen activities.

### Code Explanation:
`start` and `end` arrays define activities. The code first selects the activity ending earliest. Then, it iterates, selecting subsequent activities (`if(start[i] >= endTime)`) only if they don't overlap with the last chosen one.





# 💥 Greedy Algorithm - `Greedy2`: Activity Selection (with Sorting) 💥

## 📁 File: `Greedy/Greedy2.java`

## 🎯 Problem Statement
Select the maximum number of non-overlapping activities from a given set of activities with start and end times.

**LeetCode Link:** [LeetCode 452. Minimum Number of Arrows to Burst Balloons](https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/) (similar greedy logic).

## 🤔 Intuition
The greedy strategy is to sort activities by their finish times. Always pick the activity that ends earliest among those compatible with the last chosen one, leaving maximum time for subsequent activities. This is like **Captain America prioritizing tasks that clear the battlefield quickest**.

## 🛠️ Approach
* Create a 2D array `arr` to store `{original_index, start_time, end_time}` for each activity.
* Sort `arr` based on `end_time`.
* Select the first activity (earliest end time).
* Iterate: If an activity's start time is greater than or equal to the previous chosen activity's end time, select it.

## 🚀 Complexity Analysis
* **Time:** `O(N log N)` - Dominated by sorting `N` activities.
* **Space:** `O(N)` - For the 2D array and result list.

### Code Explanation:
`arr` stores activity details. `Arrays.sort` with `Comparator.comparingDouble(o->o[2])` **sorts by end time**. The loop then greedily picks activities: `if(arr[i][1] >= endTime)` checks for non-overlap, updating `endTime` and `maxC` if selected.





# 💥 Greedy Algorithm - `Greedy3`: Fractional Knapsack Problem 💥

## 📁 File: `Greedy/Greedy3.java`

## 🎯 Problem Statement
Given items with values and weights, and a knapsack capacity `W`, find the maximum total value by taking fractions of items.

**LeetCode Link:** Not a direct LeetCode problem, but a classic greedy problem (e.g., [GeeksForGeeks Fractional Knapsack](https://www.geeksforgeeks.org/fractional-knapsack-problem/)).

## 🤔 Intuition
Since we can take fractions, the optimal strategy is to prioritize items with the highest value-to-weight ratio. Greedily taking items with the best ratio until the knapsack is full maximizes profit. This is like **Black Widow maximizing intel gathered** per unit of effort.

## 🛠️ Approach
* Calculate the value-to-weight ratio for each item.
* Store these ratios along with original indices in a 2D array.
* Sort this array in descending order of ratios.
* Iterate through sorted items:
    * If an item's full weight fits, take it entirely, update `W` and `maximum`.
    * Else, take a fraction of the item to fill `W`, update `maximum`, and `break`.

## 🚀 Complexity Analysis
* **Time:** `O(N log N)` - Dominated by sorting `N` items.
* **Space:** `O(N)` - For storing ratios.

### Code Explanation:
`ratio` array stores `{original_index, value_per_unit_weight}`. `Arrays.sort` sorts items by ratio (descending). The loop greedily adds items: `if(weight1 <= w)` takes whole items; `else` takes a fraction to fill remaining capacity.





# 💥 Greedy Algorithm - `Greedy4`: Job Sequencing Problem 💥

## 📁 File: `Greedy/Greedy4.java`

## 🎯 Problem Statement
Given a set of jobs, each with a deadline and a profit, find the maximum profit by selecting a subset of jobs that can be completed by their deadlines. Each job takes one unit of time.

**LeetCode Link:** Not directly on LeetCode, but a classic greedy problem (e.g., [GeeksForGeeks Job Sequencing Problem](https://www.geeksforgeeks.org/job-sequencing-problem-set-1-greedy-algorithm/)).

## 🤔 Intuition
To maximize profit, we should prioritize jobs with higher profits. After sorting by profit, we greedily schedule jobs. A job is chosen if it can be completed by its deadline, ideally filling the latest possible available time slot. This is like **Iron Man prioritizing the most high-value targets** while ensuring they can be taken down within mission timeframes.

## 🛠️ Approach
* Create a `Job` class (deadline, profit, id).
* Populate an `ArrayList<Job>` from `jobsInfo`.
* Sort `jobs` in descending order of `profit`.
* Iterate through sorted jobs:
    * If `curr.deadline > time` (where `time` tracks current occupied slots), schedule the job.
    * Increment `time` and add `curr.profit` to total `profit`.
    * Add `curr.id` to `result` (sequence).

## 🚀 Complexity Analysis
* **Time:** `O(N log N)` - Dominated by sorting `N` jobs.
* **Space:** `O(N)` - For `Job` objects and result list.

### Code Explanation:
The `Job` class stores job details. `Collections.sort` sorts jobs by `profit` (descending). The loop greedily picks jobs. `if(curr.deadline > time)` determines if a job can be fit into an available slot, ensuring we don't miss out on high-profit jobs by scheduling earlier ones that aren't critical.





# 💥 Greedy Algorithm - `Greedy5`: Minimum Cost to Cut Chocolate 💥

## 📁 File: `Greedy/Greedy5.java`

## 🎯 Problem Statement
Given costs for horizontal and vertical cuts on a chocolate bar, find the minimum total cost to cut the bar into single square pieces.

**LeetCode Link:** Not a direct LeetCode problem, but a classic greedy problem (e.g., [GeeksForGeeks Minimum Cost to Cut a Board into Squares](https://www.geeksforgeeks.org/minimum-cost-cut-board-squares/)).

## 🤔 Intuition
To minimize cost, we should perform the most expensive cuts *first*. Each cut multiplies the pieces it passes through. By doing expensive cuts early, they affect fewer existing pieces, thus incurring less multiplied cost. This is like **Iron Man using his most powerful laser on the largest uncut sections** to minimize repeated effort.

## 🛠️ Approach
* Sort `costVer` and `costHor` arrays in descending order.
* Use two pointers, one for horizontal cuts (`h`) and one for vertical cuts (`v`).
* Maintain `hp` (horizontal pieces) and `vp` (vertical pieces) counters, initialized to 1.
* While both arrays have cuts:
    * If `costVer[v]` is less than or equal to `costHor[h]`: Apply horizontal cut. Add `costHor[h] * vp` to total `cost`. Increment `hp`.
    * Else: Apply vertical cut. Add `costVer[v] * hp` to total `cost`. Increment `vp`.
* Process remaining horizontal/vertical cuts (if any).

## 🚀 Complexity Analysis
* **Time:** `O(M log M + N log N)` - Dominated by sorting costs.
* **Space:** `O(1)` - (Excluding input storage).

### Code Explanation:
`costVer` and `costHor` are sorted descending. The `while` loop greedily picks the largest available cut (horizontal or vertical). `costHor[h] * vp` means the horizontal cut `h` costs `costHor[h]` but affects `vp` vertical pieces already created. This logic applies to vertical cuts too. Remaining cuts are processed in separate loops.