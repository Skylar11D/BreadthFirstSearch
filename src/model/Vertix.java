package model;

import java.util.List;

public class Vertix<D> {

    private final D data;
    private List<Vertix<D>> neighbors;
    private boolean visited;

    public Vertix(D data) {
        this.data = data;
    }

    public void setNeighbors(List<Vertix<D>> neighbors){
        this.neighbors = neighbors;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isVisited() {
        return visited;
    }

    public D getData() {
        return data;
    }

    public List<Vertix<D>> getNeighbors() {
        return neighbors;
    }
}
