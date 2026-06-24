package Ejercicio_02_invert;

import structures.node.Node;

public class Ejercicio2 {
    public Node<Integer> invertBinaryTree(Node<Integer> root){
        if (root == null){
            return null;
        } 

        System.out.println("arbol original:");
        printTree(root, 0);
        invertRecursively(root);

        System.out.println("Arbol invertido:");
        printTree(root, 0);
        return root;
    }

    private void invertRecursively(Node<Integer> root){
        if (root == null){
            return;
        } 
        Node<Integer> temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);
        invertRecursively(root.getLeft());
        invertRecursively(root.getRight());
    }
    private void printTree(Node<Integer> actual, int nivel) {
        if (actual == null) return;
        printTree(actual.getRight(), nivel + 1);
        for (int i = 0; i < nivel; i++) {
            System.out.print("\t");
        }
        System.out.println(actual.getValue());
        printTree(actual.getLeft(), nivel + 1);
    }
}

