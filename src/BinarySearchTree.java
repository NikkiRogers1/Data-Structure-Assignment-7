public class BinarySearchTree <T extends Comparable<T>> {

    private BSTNode<T> root;

public void add(T element) {
    root = recAdd(element, root);
}
private BSTNode<T> recAdd(T element, BSTNode<T> node){
    if (node == null) {
        return  new BSTNode<>(element);
    }
     if (element.compareTo(node.getInfo()) <= 0) {
        node.setLeft(recAdd(element, node.getLeft()));
    }
    else {
        node.setRight(recAdd(element, node.getRight()));
    }
    return node;
}

public int height() {
    return recHeight(root);
}
private int recHeight(BSTNode<T> node) {
    if (node == null) {
        return -1;
    }
    int leftHeight = recHeight(node.getLeft());
    int rightHeight = recHeight(node.getRight());
    return Math.max(leftHeight, rightHeight) + 1;
}

public void inOrderTraversal() {
    recInOrderTraversal(root);
}
private void recInOrderTraversal(BSTNode<T> node) {
    if (node != null) {
        recInOrderTraversal(node.getLeft());
        System.out.print(node.getInfo() + " ");
        recInOrderTraversal(node.getRight());
    }
}
public void preOrderTraversal() {
    recPreOrderTraversal(root);

}
private void recPreOrderTraversal(BSTNode<T> node) {
    if (node != null) {
        System.out.print(node.getInfo() + " ");
        recPreOrderTraversal(node.getLeft());
        recPreOrderTraversal(node.getRight());
    }
}

}