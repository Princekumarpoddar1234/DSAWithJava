# 🌲 Binary Tree – Java Implementations

Welcome to the **Binary Tree** section!  
This directory explores essential binary tree techniques including construction, traversal, and analysis. Each file demonstrates core logic behind tree-based data structures—crucial in competitive programming and system design.

---

## 📄 `BinaryTree1.java`

> **🎯 Purpose:**  
Constructs a binary tree from a **preorder array** (using `-1` for `null`) and performs:

- 🔁 Preorder Traversal  
- 🔁 Inorder Traversal  
- 🔁 Postorder Traversal

> **🧱 Tree Input Format:**  
An array like `{1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}` represents the tree:

```
     1
    / \
   2   3
  / \    \
 4   5    6
```

> **⚙️ Key Components:**
- `buildTree()`: Recursively builds the binary tree
- `preorder()`, `inorder()`, `postorder()`: Implements tree traversals

> **📌 Output Example:**  
Postorder output for the above input:  
`4 5 2 6 3 1`

> **💡 Tip:**  
Reset `idx = -1` before calling `buildTree()` again, since index is static.

---

## 📄 `BinaryTree2.java`

> **🎯 Purpose:**  
Builds a binary tree from a preorder array (`-1` as null marker) and performs **Level Order Traversal** using a queue.

> **🧱 Tree Input Format:**  
```text
{1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}
```

> **🛠 Traversal:**  
Prints all nodes **level-by-level** (BFS)

---

## 📄 `BinaryTree3.java`

> **📝 Description:**  
Builds a binary tree from a preorder array (`-1` as null) and calculates:

- 📏 **Height** of the tree  
- 🔢 **Total number of nodes**  
- ➕ **Sum** of all node values

> **🔧 Key Methods:**
- `treeFormation()`: Recursively constructs the tree  
- `height()`: Calculates max depth  
- `count()`: Total number of nodes  
- `sumOfNodes()`: Total sum of all values

> **⏱️ Time & Space Complexity:**
```
treeFormation:   O(n) time | O(h) space  
height:          O(n) time | O(h) space  
count:           O(n) time | O(h) space  
sumOfNodes:      O(n) time | O(h) space  
```

> _"Build and analyze faster than a NullPointerException can surprise you 😵‍💫"_

---

## 📄 `BinaryTree4.java`

> **📝 Description:**  
Constructs a binary tree (from preorder with `-1` as null) and performs:

- 🔁 Level Order Traversal (line-by-line)  
- 📏 Calculates **Height**  
- 📐 Calculates **Diameter** using:
  - Naive O(n²) approach  
  - Optimized O(n) using custom `Info` class

> **🔧 Key Methods:**
- `createTree()`: Builds the tree recursively  
- `levelOrder()`: BFS traversal line-by-line  
- `height()`: Computes tree depth  
- `diameter()`: Basic O(n²) diameter  
- `diameter2()`: Optimized O(n) diameter

> **⏱️ Complexity Chart:**
```
createTree:   O(n)     | O(h)  
levelOrder:   O(n)     | O(n)  
height:       O(n)     | O(h)  
diameter:     O(n^2)   | O(h)  
diameter2:    O(n)     | O(h)  
```

> _"Binary tree diameters are like friendships — it’s all about the longest meaningful connections 🌳💬"_

---

## 📄 `BinaryTree5.java`

> **📝 Description:**  
Constructs two binary trees from preorder arrays and checks if one is a **subtree** of the other.

> **🛠️ Features:**
- Builds trees with `treeFormation()`  
- Performs `levelOrder()` traversal  
- Checks subtree using `isSubtree()` and `isIdentical()`

> **⏱️ Time & Space:**
```
treeFormation:  O(n)         | O(h)  
levelOrder:     O(n)         | O(n)  
isSubtree:      O(m * n)     | O(h)  
isIdentical:    O(min(m,n))  | O(h)  
```

> _"Subtrees are like secrets — you never know where one might be hiding in a bigger story 🌳🔍"_

---




## 📄 `BinaryTree6.java`

> **🎯 Purpose:**  
Builds a binary tree from a preorder array (`-1` as null), and performs:  
- Level Order Traversal (line-by-line)  
- Prints the **Top View** of the tree (nodes visible from above)

> **🔧 Key Methods:**  
- `createTree(int[], int[])`: Recursive tree builder  
- `levelOrder(Node)`: Prints nodes level-wise  
- `topView(Node)`: Prints top view using horizontal distance mapping

> **📝 Notes:**  
Uses a helper `Info` class to track nodes with their horizontal distances in the queue.

## ⏱️ Time and Space Complexities

### `BinaryTree6.java`
| Method         | Time Complexity | Space Complexity  |
|----------------|-----------------|------------------|
| `createTree()` | O(n)            | O(h) (recursion) |
| `levelOrder()` | O(n)            | O(n) (queue)     |
| `topView()`    | O(n)            | O(n) (queue + map)|

---

## 📄 `BinaryTree7.java`

> **🎯 Purpose:**  
Constructs a binary tree and prints nodes at the **k-th level** using:  
- Modified Level Order Traversal with level tracking  
- Recursive traversal targeting the k-th level

> **🔧 Key Methods:**  
- `levelOrderTraversal(Node, int)`: Prints all nodes at level `k` using BFS  
- `kLevel(Node, int, int)`: Recursively prints nodes at level `k`

### `BinaryTree7.java`
| Method               | Time Complexity | Space Complexity  |
|----------------------|-----------------|------------------|
| `createTree()`       | O(n)            | O(h)             |
| `levelOrderTraversal()` | O(n)         | O(n)             |
| `kLevel()`           | O(n)            | O(h)             |

---

## 📄 `BinaryTree8.java`

> **🎯 Purpose:**  
Finds the **Lowest Common Ancestor (LCA)** of two nodes in a binary tree using two methods:  
- Path comparison method (`getPath()`)  
- Optimized recursive approach (`LCA()`)

> **🔧 Key Methods:**  
- `getPath(Node, int, ArrayList<Node>)`: Stores path from root to given node  
- `lca(Node, int, int)`: LCA via path comparison  
- `LCA(Node, int, int)`: Optimized recursive LCA finder

### `BinaryTree8.java`
| Method           | Time Complexity | Space Complexity  |
|------------------|-----------------|------------------|
| `createTree()`   | O(n)            | O(h)             |
| `getPath()`      | O(n)            | O(h) + O(h) for path lists |
| `lca()` (path-based) | O(n)         | O(h)             |
| `LCA()` (optimized) | O(n)          | O(h)             |

---

## 📄 `BinaryTree9.java`

> **🎯 Purpose:**  
Calculates the **minimum distance** between two nodes by:  
- Finding their LCA  
- Summing the distance from LCA to each node

> **🔧 Key Methods:**  
- `lca(Node, int, int)`: Finds lowest common ancestor  
- `minDist(Node, int)`: Distance from a node to a target  
- `minDistance(Node, int, int)`: Computes minimum distance between two nodes

### `BinaryTree9.java`
| Method           | Time Complexity | Space Complexity  |
|------------------|-----------------|------------------|
| `createTree()`   | O(n)            | O(h)             |
| `lca()`          | O(n)            | O(h)             |
| `minDist()`      | O(n)            | O(h)             |
| `minDistance()`  | O(n)            | O(h)             |

---

## 📄 `Binarytree10.java`

> **🎯 Purpose:**  
Demonstrates:  
- Finding the **k-th ancestor** of a node  
- **Transforming** the tree into a sum tree where each node contains sum of values in its subtree  
- Preorder traversal printing before and after transformation

> **🔧 Key Methods:**  
- `kthDistance(Node, int, int)`: Finds and prints the k-th ancestor  
- `transform(Node)`: Converts tree nodes into sum tree values  
- `preorder(Node)`: Prints preorder traversal

### `Binarytree10.java`
| Method           | Time Complexity | Space Complexity  |
|------------------|-----------------|------------------|
| `create()`       | O(n)            | O(h)             |
| `kthDistance()`  | O(n)            | O(h)             |
| `transform()`    | O(n)            | O(h)             |
| `preorder()`     | O(n)            | O(h)             |
---

Yeah! that's all huh..!