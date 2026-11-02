# Journal
Phase 1 - 
I created the BSTNode class and BinarySearchTree class. The BSTNode class holds the information for each node and has references to its left or right children. When adding a new accession ID, the program compares it to the current node. If the new ID is smaller than or equal to it, it goes left, and if it's larger, it goes right. Comparable<T> is required because it allows Java to compare the accession IDs. Without it, the program wouldn't know whether to go left or right when inserting a new ID.


Phase 2- 
In this phase, I added a height method to BinarySearchTree that returns the maximum level of any node in the tree. I also updated the driver class to call archive.height() and display the result. I used recursion to move through the left and right sides of the tree until the method reaches a null node. The method returns -1 when it reaches null so that a leaf node has a height of 0. I used Math.max() to compare the heights of the two sides and keep the bigger one. Adding 1 accounts for the current node. This allows the program to determine which branch of the tree is the deepest.

Phase 3- 
In this phase, I implemented two traversal methods that allow the program to visit and print the accession IDs in different orders. Inorder prints them from smallest to largest, while Preorder visits the parent node before moving through the left and then right subtrees. Inorder traversal naturally prints the IDs in ascending order because smaller values are stored on the left and larger values are stored on the right.

