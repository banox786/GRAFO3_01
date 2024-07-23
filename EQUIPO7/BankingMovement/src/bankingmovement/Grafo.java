package bankingmovement;

import java.util.List;


public class Grafo {
    private List <Vertice> vertices;
    private List <Arista> aristas;

    public Grafo(List<Vertice> vertices, List<Arista> aristas) {
        this.vertices = vertices;
        this.aristas = aristas;
    }

    public List<Vertice> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertice> vertices) {
        this.vertices = vertices;
    }

    public List<Arista> getAristas() {
        return aristas;
    }

    public void setAristas(List<Arista> aristas) {
        this.aristas = aristas;
    }
    
    

}
