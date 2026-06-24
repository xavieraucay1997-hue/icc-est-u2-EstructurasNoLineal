## Ejercicio 1

    //Crea El Arbol de enteros 
        BinaryTree<Integer> tree = new BinaryTree<>();
        //inserta cada numero
        for (int numero : numeros) {
            tree.insert(numero);
        }
        //imprime el arbol
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

En este metodo  cree un arbol binario de busqueda y ademas insterte un arreglo de numeros en app para la salida, hice el recorrido con el metodo PosOrder que primero va por el hijo de la izquierda y despues por el derecho y finalmente por la raiz.
Llame al metodo printTree para imprimir el como se ve el arbol en la consola. 



## Ejercicio 2 


    public Node<Integer> invert(Node<Integer> root){
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

En este ejercicio implemente un metodo para que muestre de forma invertida el arbol binario. Si el nodo actual es null el metodo termina.
Por otra parte primero imprimo el arbol original, despues llamo a un metodo auxiliar invertRecursively el que utiliza una variable temp para que intercambie hijos izquierdos y derechos de cada nodo en forma recursiva.
Despues vuelvo a llamar a printTree para mostrar como quedo el arbol ahora invertido.  



## Ejercicio 3

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


En este ejercicio implemente un metodo que agrupe los nodos de un arbol por niveles, recorre el arbol y si el arbol esta vacio es null, el metodo termina y devuelve una lista vacia. Utilizo colas para que el orden de visita sea controlado y empiezo la raiz en la cola, eso mientras la cola no este vacia mido los elementos usando queue.size().
Despues un bucle for para sacar los nodos y guardarlos en una lista level y agrego a la cola a sus hijps izquierdo y derecho. Al terminar guardo la sublista en el resultado final. 
Para la impresión el metodo printLevels recorre la lista para mostrar los nodos.

## Ejercicio 4

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

En este ejercicio implemente un metodo para calcular la profundidad maxima del arbol, funciona de manera recursiva de abajo hacia arriba. 
Si el nodo es null eso significa que llego al final de la rama por lo que el metodo devuelve 0. Seguido el metodo se divide para calcular por separado la profundidad de la rama izquierda y la derecha, cada una baja recursivamente hasta null. 
Cuando las respuestas suben el metodo usa math.max(left, right) para comparar las ramas y quedarse con la mas larga, al resultado se le suma 1 para contar el nivel del nodo en el que está. 




