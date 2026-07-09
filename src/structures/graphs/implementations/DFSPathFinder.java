package structures.graphs.implementations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import structures.graphs.Graph;
import structures.graphs.PathFinder;
import structures.graphs.PathResult;
import structures.node.Node;

public class DFSPathFinder<T> implements PathFinder<T> {

    @Override
    public PathResult<T> find(Graph<T> graph, T start, T end) {
      //lINKED HASHSET
      //BACKTRANKING
      //A=>F  A=>J A=>K
       
        //List<Node<T>> visited = new ArrayList<>();
        Set<Node<T>> visited = new LinkedHashSet<>();
        Set<Node<T>> path = new LinkedHashSet<>();

        boolean encontrado = dfs(graph, start, end, visited, path);
        if(!encontrado){
            path.clear();

        }
        return new PathResult<>(visited, path);
    }

    private boolean dfs(Graph<T> graph, T current, T end, Set<T> visited, Set<T> path) {
        visited.add(current);
        path.add(current);

        //Caso base
        Node<T> nC = new Node<T>(current);
        Node<T> nE = new Node<T>(end);
        if(nC.equals(nE)){
            return true; 

        }
        for(Node<T> vecino : graph.getVecinos(current)){
            if(!visited.contains(vecino.getValue())){
                boolean encon = dfs(graph, vecino.getValue(), end, visited, path);
                if(encon){
                    return true;

                }
            }
        }

        path.remove(path.size() - 1);
        return false; 

        
    }
    




}
