# 💥 Strings - `geegsforgeeks1`: Check Anagram 💥

## 📁 File: `Strings/geegsforgeeks1.java`

## 🎯 Problem Statement
Determine if two given strings are anagrams of each other (contain the same characters with the same frequencies).

**LeetCode Link:** [LeetCode 242. Valid Anagram](https://leetcode.com/problems/valid-anagram/)

## 🤔 Intuition
Anagrams have identical character counts. We can use a frequency array (or map) to tally characters. Increment counts for the first string and decrement for the second. If all counts are zero at the end, they are anagrams, like **Jarvis verifying if two sets of schematics use the exact same components**.

## 🛠️ Approach
* First, check if string lengths are equal; if not, return `false`.
* Initialize a frequency array `freq` of size 26 (for 'a' through 'z').
* Iterate through both strings simultaneously:
    * Increment `freq` for characters in `s1`.
    * Decrement `freq` for characters in `s2`.
* Iterate through `freq` array: if any count is non-zero, return `false`.
* Return `true`.

## 🚀 Complexity Analysis
* **Time:** `O(N)` - Linear scan of strings (where `N` is string length).
* **Space:** `O(1)` - Fixed-size frequency array (26 characters).

### Code Explanation:
The `isAnagram` function first checks lengths. It then uses a `freq` array: `s1` characters increment counts, `s2` characters decrement them. If `s1.charAt(i) - 'a'` is used for both, `freq` effectively tracks the *difference* in character counts. Finally, it verifies if all `freq` counts are zero, indicating an anagram.