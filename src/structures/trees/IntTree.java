package structures.trees;
import java.util.LinkedList;
import java.util.Queue;

import structures.node.Node;

public class IntTree {

    private Node<Integer> root;
    private int peso;

    /// Constructor SIEMPRE inicializa LAS VARIABLES (ROOT)
    public IntTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> node) {
        root = node;
    }

    public void setRoot(Integer value) {
        Node<Integer> node = new Node<Integer>(value);
        root = node;
    }

    public void insert(Integer value) { // 10
        Node<Integer> node = new Node<Integer>(value);
        root = insertRecursivo(root, node);
        peso++;
    }

    public void insert(Node<Integer> value) { // 10
        root = insertRecursivo(root, value);
        peso++;
    }
    public int getPeso(){
        return peso;
    }

    // recursivo para insertar valores ARBOL BINARIO
    private Node<Integer> insertRecursivo(Node<Integer> actual, Node<Integer> nodeInsertar) {
        if (actual == null) {
            return nodeInsertar;
        }

        // validar si es mayoy o nenor y decidir si lo ingerso a la der o izq
        if (actual.getValue() > nodeInsertar.getValue()) {
            actual.setLeft(insertRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nodeInsertar));
        }

        return actual;
    }

    public void preOrder() {
        preOrderRecursivo(root);
    }

    private void preOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;
        System.out.print(actual + " ");
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
    }

    public void posOrder() {
        posOrderRecursivo(root);
    }

    private void posOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;
        posOrderRecursivo(actual.getLeft());
        posOrderRecursivo(actual.getRight());
        System.out.print(actual + " ");

    }
    public void inOrder() {
        inOrderRecursivo(root);
    }

    private void inOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;

        inOrderRecursivo(actual.getLeft());
        System.out.print(actual + " ");
        inOrderRecursivo(actual.getRight());
    }

    // niveles
    public void niveles() {
        if (root == null)
            return;

        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
        //    int levelSize = queue.size();
      //      for(int i = 0; i < levelSize; i++)
            Node<Integer> actual = queue.poll();
            System.out.print(actual + " ");

            if (actual.getLeft() != null)
                queue.offer(actual.getLeft());

            if (actual.getRight() != null)
                queue.offer(actual.getRight());
        }
    }

    // altura
    public int altura() {
        return alturaRecursiva(root);
    }

    private int alturaRecursiva(Node<Integer> actual) {
        if (actual == null)
            return 0;

        int izquierda = alturaRecursiva(actual.getLeft());
        int derecha = alturaRecursiva(actual.getRight());

        return Math.max(izquierda, derecha) + 1;
    } 
    /* Genera llamadas recursivAS, algo que devuelva el valor del peso O(1)

    public int peso() { 
        return pesoRecursiva(root);
    }

        private int pesoRecursiva(Node<Integer> actual) {
        if (actual == null)
            return 0;

        int izquierda = alturaRecursiva(actual.getLeft());
        int derecha = alturaRecursiva(actual.getRight());

        return izquierda + derecha + 1;
    }

    */



    //height
}
