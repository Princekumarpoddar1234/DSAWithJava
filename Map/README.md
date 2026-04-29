# 💥 Hashing - `Hashing1`: Basic HashMap Operations 💥

## 📁 File: `Hashing/Hashing1.java`

## 🎯 Problem Statement
Demonstrate fundamental operations of Java's `HashMap`, including insertion, retrieval, checking for keys, size, and clearing.

**LeetCode Link:** Not applicable (fundamental data structure usage).

## 🤔 Intuition
A `HashMap` stores key-value pairs, providing average `O(1)` time complexity for basic operations like `put`, `get`, and `containsKey`. It uses hashing to quickly locate elements, like **Jarvis instantly pulling up a file** given its unique identifier.

## 🛠️ Approach
* Create a `HashMap<String, Integer>`.
* Use `put(key, value)` to insert.
* Use `get(key)` to retrieve value.
* Use `containsKey(key)` to check for key existence.
* Use `size()` to get number of entries.
* Use `isEmpty()` to check if map is empty.
* Use `clear()` to remove all entries.

## 🚀 Complexity Analysis
* **Time:** `O(1)` (average) for `put`, `get`, `containsKey`, `remove`. `O(N)` for `clear`.
* **Space:** `O(N)` for `N` key-value pairs.

### Code Explanation:
`hm.put()` adds pairs. `hm.get()` retrieves. `hm.containsKey()` checks for key presence. `hm.size()` and `hm.isEmpty()` query state. `hm.clear()` empties the map. The comments show example usage of `get`, `containsKey`, `remove`.





# 💥 Hashing - `Hashing2`: Iterating HashMap 💥

## 📁 File: `Hashing/Hashing2.java`

## 🎯 Problem Statement
Demonstrate various ways to iterate over the key-value pairs of a `HashMap`.

**LeetCode Link:** Not applicable (fundamental data structure usage).

## 🤔 Intuition
Iterating a `HashMap` allows processing all its entries. We can get a set of keys and iterate, or get a set of `Map.Entry` objects for direct access to both key and value. This is like **S.H.I.E.L.D. doing a full audit of all agent dossiers**, systematically reviewing each file.

## 🛠️ Approach
* Create and populate a `HashMap`.
* **Method 1 (commented):** Get `keySet()` and iterate through keys, using `map.get(key)` to retrieve values.
* **Method 2 (active):** Get `entrySet()` and iterate through `Map.Entry` objects, using `entry.getKey()` and `entry.getValue()`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Iterates through all `N` entries.
* **Space:** `O(N)` - For `keySet` or `entrySet` (or `O(1)` for iterators).

### Code Explanation:
`map.keySet()` returns a `Set` of all keys. `map.entrySet()` returns a `Set` of `Map.Entry` objects, each representing a key-value pair. The `for-each` loop on `entrySet()` is generally preferred for efficiency as it directly accesses both key and value without a second lookup.





# 💥 Hashing - `Hashing3`: Custom HashMap Implementation (Separate Chaining) 💥

## 📁 File: `Hashing/Hashing3.java`

## 🎯 Problem Statement
Implement a custom `HashMap` data structure from scratch using separate chaining for collision resolution and dynamic resizing (re-hashing).

**LeetCode Link:** Not applicable (fundamental data structure implementation).

## 🤔 Intuition
A `HashMap` uses an array of "buckets." Each key is mapped to a bucket index using a `hashFunction`. Collisions (multiple keys mapping to the same bucket) are handled by storing elements in a `LinkedList` within each bucket (separate chaining). When the load factor (`n/N`) exceeds a threshold, the map **rehashes** to a larger array to maintain average `O(1)` performance, like **S.H.I.E.L.D. expanding its intelligence database** when it gets too crowded.

## 🛠️ Approach
* **`Node` class:** Inner class to store key-value pair.
* `HashMap` class variables: `n` (total entries), `N` (number of buckets), `bucket[]` (array of `LinkedList<Node>`).
* **`hashFunction(K key)`:** Converts key's `hashCode()` to a valid bucket index.
* **`SearchInLL(K key, int bi)`:** Searches for `key` within a specific bucket's `LinkedList`, returns index or -1.
* **`rehash()`:** Doubles `N`, creates a new `bucket` array, re-distributes all existing `Node`s from `oldBuck` to `newBucket` using the new `hashFunction`.
* **`put(K key, V value)`:** Calculates `bi`, searches `ll`. If `key` exists, update value; else, add `newNode`. Triggers `rehash()` if `n/N` (load factor) is too high.
* `containsKey`, `get`, `remove`: Use `hashFunction` to find `bi`, then `SearchInLL` and `LinkedList` methods.
* `keySet`, `isEmpty`: Utility methods.

## 🚀 Complexity Analysis
* **Time:** `O(1)` (average) for `put`, `get`, `containsKey`, `remove` (assuming good hash function and load factor). `O(N)` for `rehash`.
* **Space:** `O(N)` for storing N entries.

### Code Explanation:
The `HashMap` class manages an array of `LinkedList`s (buckets). `hashFunction` maps keys to buckets. `SearchInLL` finds elements in a bucket's list. `put` inserts or updates; it calls `rehash` if the `n/N` load factor exceeds `2.0`. `rehash` doubles the number of buckets and re-distributes all elements, crucial for maintaining `O(1)` average time.





# 💥 Hashing - `Hashing4`: Majority Element (N/3) 💥

## 📁 File: `Hashing/Hashing4.java`

## 🎯 Problem Statement
Find all elements that appear more than `N/3` times in an array of size `N`.

**LeetCode Link:** [LeetCode 229. Majority Element II](https://leetcode.com/problems/majority-element-ii/)

## 🤔 Intuition
A `HashMap` is ideal for counting frequencies. We can store each element as a key and its count as the value. After counting all frequencies, a simple pass through the map identifies elements whose counts exceed `N/3`. This is like **S.H.I.E.L.D. tallying up all agents** from different departments to identify dominant factions.

## 🛠️ Approach
* Create a `HashMap<Integer, Integer>` to store element frequencies.
* Iterate through the array `arr`: `map.put(num, map.getOrDefault(num, 0) + 1)` to count occurrences.
* Calculate the threshold `freq = arr.length / 3`.
* Iterate through `map.entrySet()`: if `entry.getValue()` is greater than `freq`, print `entry.getKey()`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Single pass to populate map, single pass to iterate map (worst case `N` distinct elements).
* **Space:** `O(N)` - In worst case, all `N` elements are distinct and stored in map.

### Code Explanation:
The `HashMap` `map` is used for **frequency counting** (`getOrDefault` simplifies incrementing). `freq` calculates the `N/3` threshold. The `for-each` loop on `map.entrySet()` directly accesses and checks each element's count against `freq`, printing the majority elements.





# 💥 Hashing - `Hashing5`: Check Anagram (Using HashMap) 💥

## 📁 File: `Hashing/Hashing5.java`

## 🎯 Problem Statement
Determine if two given strings (`s` and `t`) are anagrams of each other (contain the same characters with the same frequencies).

**LeetCode Link:** [LeetCode 242. Valid Anagram](https://leetcode.com/problems/valid-anagram/)

## 🤔 Intuition
Anagrams are permutations of each other, meaning they must have identical character counts. Using `HashMaps` to store character frequencies for both strings allows for easy comparison. If the maps (after counting) are equivalent, the strings are anagrams. This is like **Jarvis verifying if two code sequences have the exact same instruction set**, regardless of order.

## 🛠️ Approach
* First, check if string lengths are equal; if not, return `false`.
* Create two `HashMaps`, `map1` for `s` and `map2` for `t`.
* Populate `map1` with character frequencies from `s`.
* Populate `map2` with character frequencies from `t`.
* Iterate through `map1`'s keys: if `map1.get(key)` is not equal to `map2.get(key)` (or `map2` doesn't contain `key`), return `false`.
* Return `true`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Linear scan to populate maps (N is string length) and then iterate keys (at most 26 characters).
* **Space:** `O(1)` - Maps store at most 26 character frequencies.

### Code Explanation:
The function checks lengths first. It then uses two `HashMaps` (`map1`, `map2`) to count frequencies for `s` and `t` separately. Finally, it iterates through `map1.keySet()` to compare corresponding frequencies in both maps. If any count differs, it's not an anagram.





# 💥 Hashing - `Hashing6`: Check Anagram (Single HashMap) 💥

## 📁 File: `Hashing/Hashing6.java`

## 🎯 Problem Statement
Determine if two given strings (`s` and `t`) are anagrams of each other (contain the same characters with the same frequencies), using a single `HashMap`.

**LeetCode Link:** [LeetCode 242. Valid Anagram](https://leetcode.com/problems/valid-anagram/)

## 🤔 Intuition
Instead of two maps, we can use one. Populate the map with frequencies from the first string (`s`). Then, iterate through the second string (`t`), decrementing counts. If any character in `t` isn't found or its count goes below zero, it's not an anagram. Finally, the map should be empty or all counts zero. This is like **Iron Man using one suit to track both allies and threats**: incrementing counts for allies, decrementing for threats, and checking for balance.

## 🛠️ Approach
* First, check if string lengths are equal; if not, return `false`.
* Create a single `HashMap<Character, Integer>`.
* Populate the map with character frequencies from `s` (increment counts).
* Iterate through `t`:
    * If a character `c` from `t` exists in map:
        * If its count is 1, `remove` it from map.
        * Else, `decrement` its count.
    * Else (character `c` not in map): return `false`.
* After iterating through `t`, return `true` (if the map is now empty, all characters matched).

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Linear scan for both strings.
* **Space:** `O(1)` - Map stores at most 26 character frequencies.

### Code Explanation:
The `HashMap` `map` stores frequencies from `s`. Then, for each character in `t`, it attempts to "consume" a count from the map. If a character is missing or its count becomes insufficient, `false` is returned. If `t` is processed without issues, it implies all characters matched.