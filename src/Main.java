public class Main {
 
public static void main(String[] args) {
    BinarySearchTree<Integer> archive = new BinarySearchTree<>();
    int[] sampleIds = {50,25,75,10,30,60,85};
    for (int id : sampleIds) {
        archive.add(id);
   }
   System.out.println("Archive initialized with sample ID's.");

   System.out.println("Tree height: " + archive.height());


    System.out.print("In-order traversal:");
    archive.inOrderTraversal();
    System.out.print("\nPre-order traversal:");
    archive.preOrderTraversal();

    BinarySearchTree<Integer> emptyArchive = new BinarySearchTree<>();
   
    System.out.println("\nEmpty archive height: " + emptyArchive.height());   
    
    emptyArchive.inOrderTraversal();

    emptyArchive.preOrderTraversal();


    BinarySearchTree<Integer> singleNodeArchive = new BinarySearchTree<>();
    singleNodeArchive.add(50);
    System.out.println("\nSingle node archive height: " + singleNodeArchive.height());


    BinarySearchTree<Integer> SkewedArchive = new BinarySearchTree<>();
    int[] skewedIds = {10,20,30,40};
    for (int id : skewedIds) {
        SkewedArchive.add(id);
    }
    System.out.println("\nSkewed archive height: " + SkewedArchive.height());

    SkewedArchive.inOrderTraversal();
    SkewedArchive.preOrderTraversal();

    
}
}