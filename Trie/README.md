# 🌐 Trie - Word Break using Trie (`trie1.java`)

## 📁 File: `trie1.java`

## 🎯 Problem Statement
Implement a **Trie-based solution** to the classic **Word Break problem**.  
Given a list of words (dictionary) and a string `key`, determine if the string can be **segmented into a sequence of dictionary words**.

---

## 🧠 Intuition
The **Word Break Problem** asks whether a string can be broken into valid dictionary words.  
Instead of checking the entire dictionary repeatedly (brute-force), we use a **Trie (Prefix Tree)** to:
- Efficiently insert and store all words.
- Search any prefix in `O(L)` time (where L is word length).

This allows recursive breakdown of the `key` string while validating each prefix using Trie.

---

## 🛠️ Approach

### ✅ Trie Structure
- Each node contains:
  - `children[26]` → references for each lowercase letter.
  - `eow` (end of word) → boolean flag to mark word termination.

### ✅ Insert Function (`insert(word)`)
- Start from the root.
- For each character, find index using `ch - 'a'`.
- If the corresponding child is `null`, create a new node.
- After inserting all characters, mark `eow = true`.

### ✅ Search Function (`search(key)`)
- Traverse through the Trie using character indices.
- If at any point the path breaks (child is `null`), return `false`.
- After the loop, return `true` only if the node marks end of a valid word.

### ✅ Word Break Function (`wordBreak(key)`)
- Base Case: If `key` is empty → return `true`.
- For every prefix of the string:
  - If the prefix is found in Trie **and** the remaining suffix can also be broken → return `true`.
- Else, after trying all prefixes → return `false`.

---




## 📁 File: `trie2.java`

Each prefix is the **smallest possible substring** that uniquely identifies its word in the list.

---

## 🤔 Intuition
Think of a **Trie** as a branching tree of characters. If we track how often a character node is shared, we can stop the traversal at the **first unique branch point**.

- If a prefix is used by multiple words, its frequency will be >1.
- Once a node has frequency `== 1`, it means this prefix is **unique** to a single word.

---

## 🛠️ Approach

### 🔹 Trie Node Structure:
- `children[26]`: Array for 26 lowercase English letters.
- `eow`: Boolean flag to mark the end of a word.
- `freq`: Frequency counter — how many words passed through this node.

### 🔹 Insertion (`insert(String word)`):
1. Traverse character by character.
2. For each character:
   - If the child node doesn't exist → create it.
   - If it exists → increment its frequency.
3. After the loop, mark `eow = true`.

### 🔹 Prefix Finder (`findPrefix(Node root, String ans)`):
- Perform a **DFS traversal** of the Trie.
- If a node’s frequency becomes `1`, print the accumulated string (`ans`): it’s a unique prefix.
- Recur for all child nodes, appending the corresponding character.

---





# 🌱 Trie - `trie3`: Prefix Search using startsWith()

## 📁 File: `trie3.java`

## 🎯 Problem Statement
Implement a basic prefix search using Trie. Given a list of words, check whether a given string is a **prefix** of any word stored in the Trie.

### Example:
```java
Input Words: ["apple", "app", "mango", "man", "woman"]
Check: startsWith("moon")
Output: false

🤔 Intuition
To check if any word starts with a given prefix, we do not care whether the whole word matches — we only care whether the prefix path exists in the Trie.

A Trie (prefix tree) efficiently stores all words in a tree structure where:

Each node represents a character.

A path from root to a node represents a prefix.

If we can follow the path of characters in the prefix without missing any node, the prefix exists.

🛠️ Approach
🧱 Node Structure:
java
Copy
Edit
static class Node {
    Node[] children = new Node[26];
    Node() {
        for (int i = 0; i < 26; i++) children[i] = null;
    }
}
Each node stores references to 26 possible lowercase letters.
##🔧 Insert Function:##
public static void insert(String word) {
    Node curr = root;
    for (char c : word.toCharArray()) {
        int idx = c - 'a';
        if (curr.children[idx] == null)
            curr.children[idx] = new Node();
        curr = curr.children[idx];
    }
}
Insert all words into the Trie by creating nodes for each character.

🔍 Prefix Search (startsWith):

public static boolean startsWith(String word) {
    Node curr = root;
    for (char c : word.toCharArray()) {
        int idx = c - 'a';
        if (curr.children[idx] == null) return false;
        curr = curr.children[idx];
    }
    return true;
}
Traverse the prefix from the root.

If a node is missing at any point, return false.
🔗 Related Problems
Leetcode 208. Implement Trie (Prefix Tree)

Leetcode 648. Replace Words

-------





# 🌳 Trie - `trie4`: Count Total Nodes in a Suffix Trie

## 📁 File: `trie4.java`

## 🎯 Problem Statement
Given a string, construct a **Suffix Trie** (insert all suffixes of the string into a Trie) and **count the total number of nodes** in the resulting Trie.

### Example:
```java
Input:  "ababa"
Output: 10
Each unique path (or shared prefix) in the suffixes contributes to a unique node in the Trie. The number of nodes indicates the number of distinct substrings + 1 (for the root).

🤔 Intuition
To count the number of distinct substrings, we can insert all suffixes of a string into a Trie. This captures all possible substrings because:

Every substring of a string is a prefix of one of its suffixes.

The total number of nodes (excluding the root) is equal to the number of unique substrings.

Think of each node as representing a unique character extension — if we share prefixes between suffixes, we reduce space but still capture uniqueness.

🛠️ Approach
Step 1: Node Structure
static class Node {
    Node[] child = new Node[26];
    Node() {
        for (int i = 0; i < 26; i++)
            child[i] = null;
    }
}
Step 2: Insert Suffixes into Trie
Loop through the string.

-For each index i, take the substring str.substring(i) and insert it into the Trie.

-This ensures all suffixes like "ababa", "baba", "aba", "ba", "a" are inserted.

-Step 3: Count Nodes in Trie
-Use recursion to visit each node.

-For every non-null child, recursively count its children.

-Add 1 for the current node.

-Code Summary:
for (int i = 0; i < str.length(); i++) {
    insert(str.substring(i));
}
System.out.println(countNode(root));
##🚀 **Complexity Analysis**
Operation	Time
Insertion	O(n²)
Count Nodes	O(total nodes)

----





# 🌟 Trie - `trie5`: Longest Word Built One Character at a Time

## 📁 File: `trie5.java`

## 🎯 Problem Statement
You are given an array of strings. Find the **longest word** in the dictionary that can be **built one character at a time** by other words in the array.

> If there are multiple answers, return the word that is lexicographically smallest.

### 🔍 Example:
```java
Input: ["a", "banana", "app", "appl", "ap", "apply", "apple"]
Output: "apple"

🤔 Intuition
Each valid word must be incrementally buildable — i.e., all its prefixes must also be present as words.

For example:

"apple" is valid only if "a", "ap", "app", and "appl" are also present.

-To check this efficiently, a Trie is perfect:

-Insert all words.
-Use DFS to find the deepest path where each node marks eow=true (end of a valid word).
-Think of this as climbing a tree — you can only go deeper if there is a strong branch (a valid word so far).