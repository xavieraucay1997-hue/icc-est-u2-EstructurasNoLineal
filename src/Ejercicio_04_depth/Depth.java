package Ejercicio_04_depth;

import structures.node.Node;

public class Depth {

    public int maxDepth(Node root) {
        return depth(root);
    }

    private int depth(Node node) {

        if (node == null) {
            return 0;
        }

        int left = depth(node.getLeft());
        int right = depth(node.getRight());

        return Math.max(left, right) + 1;
    }
}
