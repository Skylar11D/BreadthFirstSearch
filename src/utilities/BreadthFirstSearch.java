package utilities;

import model.Vertix;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<D> {

    private final Vertix<D> startingVertix;

    public BreadthFirstSearch(Vertix start) {
        this.startingVertix = start;
    }

    public void search(){

        Queue<Vertix<D>> vertices = new LinkedList<>();
        vertices.add(startingVertix);

        while (!vertices.isEmpty()){
            Vertix<D> current = vertices.poll();
            if (!current.isVisited()){
                current.setVisited(true);
                TextUtils.LOGGER.info("vertix: " + current.getData() + ", status: " + current.isVisited());
                vertices.addAll(current.getNeighbors());
            }
        }

    }

}
