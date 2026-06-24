
package Ejercicio_01_insert;

import structures.node.Node;
import structures.trees.BinaryTree;

public class Ejercicio1 {

    public void insertBSTTest(int[] numeros) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        for (int numero : numeros) {
            tree.insert(numero);
        }
        System.out.println();
        posOrder(tree.getRoot());
        System.out.println();
        printTree(tree.getRoot());
        System.out.println();

    }
    public void printTree(Node<Integer> root) {
        printTreeRecursivo(root, 0);
    }

    private void printTreeRecursivo(Node<Integer> actual, int nivel) {
        if (actual == null){
            return;
        }
        printTreeRecursivo(actual.getRight(), nivel + 1);
        for (int i = 0; i < nivel; i++) {
            System.out.print("\t");
        }
        System.out.println(actual.getValue());
        printTreeRecursivo(actual.getLeft(), nivel + 1);
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
     
