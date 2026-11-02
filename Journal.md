# Journal
Phase 1 - 
I created the BSTNode class and BinarySearchTree class. The BSTNode class holds the information for each node and has references to its left or right children. When adding a new accession ID, the program compares it to the current node. If the new ID is smaller than or equal to it, it goes left, and if it's larger, it goes right. Comparable<T> is required because it allows Java to compare the accession IDs. Without it, the program wouldn't know whether to go left or right when inserting a new ID.


