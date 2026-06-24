package Ejercicio_03_listLevels;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import structures.node.Node;

public class ListLevels {

    public List<List<Node<Integer>>> listLevels(Node<Integer> root) {

        List<List<Node<Integer>>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }
        
        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Node<Integer>> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {

                Node<Integer> actual = queue.poll();
                level.add(actual);
                if (actual.getLeft() != null) {
                    queue.add(actual.getLeft());
                }
                if (actual.getRight() != null) {
                    queue.add(actual.getRight());
                }
            }
            result.add(level);
        }
        return result;
    }
    public void printLevels(List<List<Node<Integer>>> niveles) {
        for (List<Node<Integer>> nivel : niveles) {
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i).getValue());
                if (i < nivel.size() - 1) {
                 System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }
}