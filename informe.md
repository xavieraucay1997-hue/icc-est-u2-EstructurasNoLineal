## Ejercicio 1

Insercion de un arbol Binario de manera vertical 

    // Crea El Arbol de enteros 
        BinaryTree<Integer> tree = new BinaryTree<>();

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

En este metodo  cree un arbol binario de busqueda y ademas insterte un arreglo de numeros en app para la salida, hice el recorrido en el metodo PosOrder que primero va por el hijo de la izquierda y despues por el derecho y final mente por la raiz 
Imprimi la estructura.



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

En este ejercicio implemente un metodo para que muestre de forma invertida el arbol binario, llama a invertRecursively para intercambiar los numeros izquierdos y derechos de cada nodo, ademas imprime el arbol invertido. Y hay un caso base donde si el nodo es null termina  
