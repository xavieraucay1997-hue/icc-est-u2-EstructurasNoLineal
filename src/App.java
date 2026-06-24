
import java.util.List;

import Ejercicio_01_insert.Ejercicio1;
import Ejercicio_02_invert.Ejercicio2;
import Ejercicio_03_listLevels.ListLevels;
import Ejercicio_04_depth.Depth;
import models.Person;
import structures.node.Node;
//import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.IntTree;
public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        runPersonTree();
        runEjercicios();
        runEjercicio2();
        runEjercicio3(); 
        runEjercicio4();
    }
    private static void runPersonTree(){
        BinaryTree<Person> personTree = new BinaryTree<>();
        personTree.insert(new Person("Alice", 30));
        personTree.insert(new Person("Bob", 25));
        personTree.insert(new Person("Diego", 35));
        personTree.insert(new Person("Rafael", 35));    
        personTree.insert(new Person("Ana", 35));

        //personTree.inOrder();
        //personTree.preOrder();
        personTree.inOrder();


    }

    private static void runIntTree() {
        IntTree arbolNumeros = new IntTree(); /// CLASE ARBOL


        // Node<Integer> node3 = new Node<>(30);
        // Node<Integer> node4 = new Node<>(40);
        // Node<Integer> node5 = new Node<>(50);

        // Node<Integer> root = arbolNumeros.getRoot();

        // root.setLeft(node2);
        // root.setRight(node3);

        // node2.setLeft(node4);
        // node4.setRight(node5);

        //// ERROR GENERA CLICLOS
        // node5.setLeft(root);

        arbolNumeros.insert(10);
        arbolNumeros.insert(5);
        arbolNumeros.insert(3);
        arbolNumeros.insert(8); /// INORDER 3, 5, 8, 10, 15, 20
        arbolNumeros.insert(20); /// POSTORDER 3 8 5 15 20 10
        arbolNumeros.insert(15); // ANCHURA O NIVELES: 10 5 20 3 8 15

        System.out.println("pre Order");
        arbolNumeros.preOrder();
        System.out.println();

        System.out.println("Pos Order");
        arbolNumeros.posOrder();
        System.out.println();

        System.out.println("In order");
        arbolNumeros.inOrder();
        System.out.println();

        System.out.println("niveles");
        arbolNumeros.niveles();
        System.out.println();

        System.out.println("altura");
        System.out.println(arbolNumeros.altura());

        System.out.println("Peso");
        System.out.println(arbolNumeros.getPeso());
        //System.out.println(arbolNumeros.peso());
        

    }
    private static void runEjercicios() {
        Ejercicio1 ejercicio = new Ejercicio1();
        int[] numeros = {4, 7, 2, 9, 6, 3, 1};
        ejercicio.insertBSTTest(numeros);
}
    private static void runEjercicio2() {
        Ejercicio2 ejercicio2 = new Ejercicio2();
        BinaryTree<Integer> tree = new BinaryTree<>();
        int[] datos = {4, 7, 2, 9, 6, 3, 1};
        for (int n : datos) {
            tree.insert(n);
        }
        ejercicio2.invertBinaryTree(tree.getRoot());
    }

    
    private static void runEjercicio3() {
        BinaryTree<Integer> tree = new BinaryTree<>();
        int[] datos = {4, 2, 7, 1, 3, 6, 9};
        for (int n : datos) {
            tree.insert(n);
        }

        ListLevels listador = new ListLevels();
        List<List<Node<Integer>>> niveles = listador.listLevels(tree.getRoot());
        listador.printLevels(niveles);
    
    }
    private static void runEjercicio4() {

        BinaryTree<Integer> tree = new BinaryTree<>();

        int[] datos = {4, 2, 7, 1, 3, 8};

        for (int n : datos) {
            tree.insert(n);
        }

        Depth depth = new Depth();

        int resultado = depth.maxDepth(tree.getRoot());

        System.out.println("Profundidad maxima: " + resultado);
    }
  
}