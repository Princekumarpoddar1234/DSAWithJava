# 💥 Sets - `Set1`: Basic HashSet Operations 💥

## 📁 File: `Sets/Set1.java`
## 🔁 Java HashSet 101: No Clones Allowed (a.k.a. The Set Saga Begins)

### 💡 Intuition (Why use HashSet here?)
You're building a superhero registry where each hero must be listed **once** — no clones, no time-travel duplicates, not even Multiverse variants (looking at you, Spider-Men 🕷️🕷️🕷️).

So what do you use?  
👉 `HashSet` — the Java Collection that **only allows unique elements** and performs operations **super fast (almost O(1))**.

---

### 🧠 What This Code Does
- Creates a `HashSet<Integer>`
- Adds a few integers — **duplicates are silently rejected**
- Performs basic set operations:
  - `add()`  
  - `remove()`  
  - `contains()` check  
  - `size()`  
  - `clear()`  
  - `isEmpty()`

---

### 🧪 Sample Output
```java
[1, 2, 4]   // order may vary
4
false       // because 2 was removed
2           // size before clearing
true        // set is empty after clear






## 📁 File: `Sets/Set2.java`
## 🏙️ Java Collections: `HashSet` to the Rescue (a.k.a. "The No-Duplicates Club")

### 💡 Intuition (What's going on here?)
Imagine you're organizing a superhero meetup and **you don’t want any duplicate entries** (because you don’t want Iron Man showing up twice and stealing all the limelight 💥).

That’s where `HashSet` comes in — it’s like the **bouncer of the Java Collection world**, allowing only **unique** entries and **no particular order**.

---

### 🧠 Code Summary
This Java code demonstrates how to:
- Create a `HashSet` of strings
- Add city names (like Delhi, Mumbai, etc.)
- Iterate over the set using an **enhanced for loop** (you can also use an `Iterator`, but that’s commented out)

---

### 🔧 Approach
1. Create a `HashSet<String>` to store unique city names.
2. Add several cities (no duplicates allowed).
3. Loop through the set using:
   - Enhanced for loop (shown)
   - Iterator (commented out, but equally useful for interviews)

---

### 🧮 Time & Space Complexity

| Operation        | Time Complexity | Space Complexity |
|------------------|------------------|------------------|
| `add()`          | O(1) average     | O(n)             |
| Iteration        | O(n)             | O(1)             |
| `HashSet` Storage| —                | O(n)             |

> 💥 *Note:* HashSet **does not maintain insertion order** — it's like the Avengers showing up randomly.

---

### 🤓 Java Nuggets
- `HashSet` is backed by a `HashMap`.
- Duplicate values are **ignored** silently.
- Iteration order is **not predictable**.
- Ideal for lookups, uniqueness checks.

---
### 🧪 Bonus Practice:
Try adding `"Delhi"` again and watch it silently get rejected like Loki at the gates of Asgard.

```java
cities.add("Delhi"); // Won't be added again




## 📁 File: `Sets/Set3.java`
# 🏙️ HashSet vs LinkedHashSet in Java — The Multiverse of Sets

### 💡 Intuition (Set with or without Order?)
You have your city-level Avengers reporting for duty... but some of them like to show up in **random order** (looking at you, `HashSet`), while others politely follow the **order in which they were invited** (hello, `LinkedHashSet`!).

This code demonstrates the difference between:
- `HashSet` – chaotic neutral.
- `LinkedHashSet` – organized superhero squad.

---

### 🧠 What the Code Does
1. Adds four cities to a `HashSet` and prints them:
   - `HashSet` shows elements in **no guaranteed order**.
2. Then does the same using a `LinkedHashSet`:
   - Maintains the **insertion order** of cities.

---

### 🔍 Output Preview (Order Matters!)


> ⚠️ Note: The order of `HashSet` output may vary across runs, like Loki’s mischief — always unexpected.

---

### 🔄 Time & Space Complexity

| Operation           | `HashSet`      | `LinkedHashSet` |
|---------------------|----------------|------------------|
| `add()`             | O(1) average   | O(1) average     |
| `contains()`        | O(1) average   | O(1) average     |
| `remove()`          | O(1) average   | O(1) average     |
| Maintains order?    | ❌             | ✅               |
| Extra memory usage  | Low            | Slightly higher  |

> 🧠 Why? `LinkedHashSet` internally maintains a **doubly linked list** to remember insertion order — kind of like having a clipboard of who came in first.

---

### 🧪 Core Java Learnings:
- ✅ Use `HashSet` when you only care about uniqueness & performance.
- ✅ Use `LinkedHashSet` when you also care about **preserving order**.
- ❌ Never use `Set` if duplicates are allowed — choose `List` instead.

---

### 🔥 Marvel Analogy:
- **HashSet** is like Deadpool in a team meeting — unpredictable entrance, same firepower.
- **LinkedHashSet** is like Captain America — comes in order, still packs a punch.

---

### 🧙 Final Wisdom:
> “HashSet gives you power. LinkedHashSet gives you power with order.”  
> — Java Master Wong

So next time you're assembling your team of data (cities, heroes, tasks…), choose your Set wisely. 🛡️

---





# 💥 Sets - `Set4`: TreeSet Basics 💥

## 📁 File: `Sets/Set4.java`

## 🎯 Problem Statement
Demonstrate the basic functionality of Java's `TreeSet`, which stores unique elements in sorted order.

**LeetCode Link:** Not applicable (fundamental data structure usage).

## 🤔 Intuition
A `TreeSet` stores unique elements and maintains them in a sorted (ascending) order, either naturally or by a custom comparator. This is achieved using a self-balancing Binary Search Tree (typically a Red-Black Tree) under the hood. It's like **S.H.I.E.L.D. maintaining an alphabetical roster of agents**: every new agent is immediately placed in their correct sorted position.

## 🛠️ Approach
* Create a `TreeSet<String>`.
* Use `add(element)` to insert elements.
* Print the `TreeSet` to observe its sorted output.

## 🚀 Complexity Analysis
* **Time:** `O(log N)` for `add`, `remove`, `contains` (N is number of elements).
* **Space:** `O(N)` for storing `N` elements.

### Code Explanation:
`new TreeSet<>()` creates the set. `set.add()` inserts strings. When `System.out.println(set)` is called, the `TreeSet` automatically displays its elements in their natural sorted order (alphabetical for strings).





# 💥 Sets - `Set5`: Counting Distinct Elements with HashSet 💥

## 📁 File: `Sets/Set5.java`

## 🎯 Problem Statement
Given an array of integers (with possible duplicates), count how many **unique** elements it contains using a `HashSet`.

**LeetCode Link:** Not applicable (fundamental usage of Set collection).

---

## 🤔 Intuition
When Thanos snapped, **duplicates didn't matter**, only distinct lives did.  
Likewise, in programming, when you want to count **distinct elements**, you need a structure that ignores duplicates. That’s where `HashSet` comes in.

A `HashSet`:
- Stores only unique elements.
- Discards duplicates **automatically**.
- Has average O(1) time complexity for insertion and lookup.

Think of it as your very own **Infinity Gauntlet of Uniqueness**. ✨

---

## 🛠️ Approach
- Create a `HashSet<Integer>`.
- Traverse the array and insert each element into the set.
- The size of the set after the loop gives the **count of distinct elements**.

### Input:
```java
int[] nums = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
"HashSet doesn’t care how many copies of Loki show up — only one gets in.” — Odin, probably.





# 💥 Sets - `Set6`: Union & Intersection using LinkedHashSet 💥

## 📁 File: `Sets/Set6.java`

## 🎯 Problem Statement
Given two integer arrays, print their:
- **Union** (all unique elements from both arrays)
- **Intersection** (common elements between the two)

**LeetCode Link:** Not applicable (classic data structure operation using Set).

---

## 🤔 Intuition
Imagine two squads of Avengers from different timelines. We need:
- **Union**: A combined multiverse squad with no duplicate heroes.
- **Intersection**: Heroes that exist in **both** timelines.

To solve this, we use:
- `LinkedHashSet`: maintains insertion order and uniqueness.
- A second set to track and check membership for intersection.

---

## 🛠️ Approach

### Union
- Add all elements of `arr1` and `arr2` into one `LinkedHashSet`.
- Duplicates are auto-rejected. Order is preserved.

### Intersection
- Add all elements of `arr1` into a temp set.
- Traverse `arr2`, and if an element exists in the temp set, it's added to the intersection set.

---

### 🧪 Example Input:

```java
arr1 = {7, 3, 9}
arr2 = {6, 3, 9, 2, 9, 4}
Output:
union: [7, 3, 9, 6, 2, 4]
Intersection: [3, 9]

Union: Nick Fury’s global initiative — everyone’s invited as long as they’re unique.
Intersection: Only the elite members who served in both timelines — the real multiverse MVPs. 🌀






# 💥 Sets - `Set7`: Find Itinerary from Tickets 💥

## 📁 File: `Sets/Set7.java`

## 🎯 Problem Statement
Given a list of airline tickets (origin-destination pairs), reconstruct the itinerary in order. Assume there's always one valid itinerary.

**LeetCode Link:** [LeetCode 332. Reconstruct Itinerary](https://leetcode.com/problems/reconstruct-itinerary/) (more complex with lexicographical order and multiple valid paths).

## 🤔 Intuition
The starting point of the itinerary is the city that is an origin but never a destination. Once we find this starting city, we can simply follow the chain of tickets (using the map) to reconstruct the entire path. This is like **tracing Captain America's mission log**: finding his first deployment, then following each subsequent mission's destination.

## 🛠️ Approach
* Define `getStart(Map<String, String> map)`:
    * Create a `rev` (reverse) map to store `destination -> origin`.
    * Iterate through the original `map`'s keys (origins).
    * For each origin `key`, if `key` is NOT found in `rev`'s keys (meaning it's never a destination), return `key` as the start.
* In `main`:
    * Populate the `map` with tickets.
    * Call `getStart` to find the starting city.
    * Print the `start` city.
    * Loop through the `map`'s keys, each time printing `->destination` and updating `start` to the next city, until the itinerary is complete.

## 🚀 Complexity Analysis
* **Time:** `O(N)` for `getStart` (N is number of tickets). `O(N)` for printing.
* **Space:** `O(N)` for `rev` map.

### Code Explanation:
`getStart` efficiently finds the unique starting city by identifying the one that only appears as an origin (`!rev.containsKey(key)`). The `main` method then uses this `start` city and the `map` to iteratively print the full itinerary, following the `origin -> destination` chain until all tickets are used.





# 💥 Sets - `Set8`: Longest Subarray with Sum Zero 💥

## 📁 File: `Sets/Set8.java`

## 🎯 Problem Statement
Given an integer array, find the **length of the longest subarray whose sum is 0**. The subarray can include positive, negative, or zero elements. This is a common problem in interviews and competitive coding.

**LeetCode Link:** Closely related to [LeetCode 525 - Contiguous Array](https://leetcode.com/problems/contiguous-array/), though not identical.

## 🤔 Intuition
Think of the **Hulk’s anger level** fluctuating over time. If he returns to the same anger level after smashing and calming down, the difference in time between these two moments is a subarray with net zero effect. Similarly, we track cumulative sums — and if the same sum is seen again, it means the subarray between the two occurrences **has a net sum of zero**.

## 🛠️ Approach
* Use a **HashMap** to store the first index where each **cumulative sum** occurred.
* Traverse the array while keeping a running sum:
  * If `sum == 0`, update `length = max(length, current_index + 1)`.
  * If `sum` already exists in the map:
    * Update `length = max(length, current_index - previous_index)`.
  * Otherwise, store the sum with the current index.
* The result is the maximum length of such a zero-sum subarray.

## 🚀 Complexity Analysis
* **Time:** `O(N)` — Single traversal of the array.
* **Space:** `O(N)` — HashMap stores cumulative sum to index mapping.

### Code Explanation:
The code leverages a **prefix sum technique**:

Balance is not something you find, it’s something you build — like Banner controlling Hulk.
Each time Banner comes back to the same emotional state (sum), a zero-sum subarray is formed. 🧠💪





# 💥 Sets - `Set9`: Count Subarrays with Sum K 💥

## 📁 File: `Sets/Set9.java`

## 🎯 Problem Statement
Given an integer array `arr[]` and an integer `k`, **count the total number of continuous subarrays whose sum equals `k`**.

**LeetCode Link:** [LeetCode 560. Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/)

## 🤔 Intuition
Imagine you’re **Tony Stark tracking energy spikes** in J.A.R.V.I.S.’s logs. If two spikes have the same difference from a target (`k`), there’s a pattern. Similarly, if the difference between two prefix sums is `k`, then the subarray in between has a sum of `k`.

This uses **prefix sum + hashmap** to track how many times a particular cumulative sum has occurred. If `sum - k` has occurred before, then all such instances can form a valid subarray ending at the current index.

## 🛠️ Approach
* Initialize a HashMap to store `prefix_sum -> frequency`.
  * Start with `map.put(0,1)` to handle subarrays starting from index 0.
* For each element in the array:
  * Update cumulative `sum`.
  * If `sum - k` exists in map, increment count by its frequency.
  * Update map with current `sum`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` — Single pass through array.
* **Space:** `O(N)` — For storing prefix sums in map.