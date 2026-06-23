
package structures.trees;

import structures.node.Node;

public class Ejercicio1 {

    public void insert(int[] numeros) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        for (int numero : numeros) {
            tree.insert(numero);
        }
        posOrder(tree.getRoot());
        System.out.println();

        printTree(tree.getRoot());
    }
    public void printTree(Node<Integer> root) {
        printTreeRecursivo(root, 0);
    }

    private void printTreeRecursivo(Node<Integer> actual, int nivel) {
        if (actual == null){
            return;
        }
        for (int i = 0; i < nivel; i++) {
            System.out.print(" ");
        }
        System.out.println(actual.getValue());
        printTreeRecursivo(actual.getLeft(), nivel + 1);
        printTreeRecursivo(actual.getRight(), nivel + 1);
    }
    public void posOrder(Node<Integer> root) {
        if (root == null){
            return;
        }
        posOrder(root.getLeft());
        posOrder(root.getRight());
        System.out.print(root.getValue() + " ");
    }
}
     
