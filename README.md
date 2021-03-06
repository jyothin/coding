# Coding practice

## Asymptotic Analysis
### Notation
* Big O: <= expression iterations
	* O(f(n)) = { g(n): there exists a c>0 and n_0 such that f(n) <= c*g(n_0) for all n>n_0}
* Big Omega: >= expression iterations
	* Omega(f(n)) >= { g(n): there exists a c>0 and n_0 such that g(n) <= c*f(n_0)
* Big Theta: = expression iterations
	* Theta(f(n)) = { g(n) if and only if g(n) = O(f(n)) and g(n) = Omega(f(n)) for all n>n_0 }
* Little Oh: < expression iterations
* Little Omega: > expression iterations
* Theta: lie in both Big Oh and Big Omega

## Common Asymptotic Notations
* O(1) -> constant
* O(logn) -> logarithmic
* O(n) -> linear
* O(nlogn) -> nlogn
* O(n^2) -> quadratic
* O(n^3) -> cubic
* n^O(1) -> polynomial
* 2^O(n) -> exponential

O(1) < O(logn) < O(n) < O(nlogn) < O(n^2) < O(2^n) < O(e^n) < O(n!) < O(n^n)

## Greedy Algorithms
* Travelling Salesman problem
* Prim's minimal spanning tree
* Kruskal's minimum spanning tree
* Dijkstra's minimal spanning tree
* Graph - map coloring
* Graph - Vertex cover
* Knapsack problem
* Job scheduling problem

## Divide and Conquer Algorithms
* Merge sort
* Quick sort
* Binary search
* Strassen's matrix multiplication
* Closest pair

## Dynamic Programming
* The problem should be able to be divided into smaller overlapping sub-problem
* An optimum solution can be achieved by using an optimum solution of smaller sub-problem
* Dynamic algorithms use memorization
* Can be done in top-down or bottom-up manner

### Examples
+ Fibonacci number series
+ Knapsack problem
+ Tower of Hanoi
+ All pair shortest path by Floyd-Warshall
+ Shortest path by Dijkstra
+ Project scheduling

## Data Structures
### Data Definition
- Atomic
- Traceable
- Accurate
- Clear and concise

### Data Object

### Data Type
#### Built-in
* Integers
* Boolean
* Float
* Char
* String

#### Derived
They are implementation independent
* Array
* Linked List
* Stack
* Queue

#### Data Operations
* Traversing
* Searching
* Insertion
* Deletion
* Sorting
* Merging

## Resources
* https://www.tutorialspoint.com/java/util/java_util_priorityqueue.htm
* https://www.tutorialspoint.com/data_structures_algorithms/data_structures_basics.htm
* http://www.glassdoor.ca
* http://www.careercup.com/
* http://www.geeksforgeeks.org/
* http://leetcode.com/
* https://www.hackerrank.com/
* http://www.topcoder.com/
* https://www.tutorialspoint.com/data_structures_algorithms
* http://www.studytonight.com/data-structures/merge-sort
* http://www.studytonight.com/data-structures/introduction-to-sorting
* https://leetcode.com
