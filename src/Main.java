import model.Vertix;
import utilities.BreadthFirstSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Vertix<Integer> v0 = new Vertix<>(0), v1 = new Vertix<>(1);
        Vertix<Integer> v2 = new Vertix<>(2), v3 = new Vertix<>(3);
        Vertix<Integer> v4 = new Vertix<>(4), v5 = new Vertix<>(5);
        Vertix<Integer> v6 = new Vertix<>(6);

        v0.setNeighbors(Arrays.asList(v1, v2));
        v1.setNeighbors(Arrays.asList(v3));
        v2.setNeighbors(Arrays.asList(v4));
        v3.setNeighbors(Arrays.asList(v5));
        v5.setNeighbors(Arrays.asList(v6));
        v6.setNeighbors(Arrays.asList(v0));
        v4.setNeighbors(Arrays.asList(v1));

        //v0 will be our starting vertix or node

        BreadthFirstSearch<Integer> bfs = new BreadthFirstSearch<>(v0);

        bfs.search();

    }

}
