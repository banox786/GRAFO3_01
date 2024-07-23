package graforedsocial;

public class Arista {
    private Vertice verticeDestino;
    private Arista sigArista;

    public Arista(Vertice verticeDestino) {
        this.verticeDestino = verticeDestino;
        this.sigArista = null;
    }

    public Vertice getVerticeDestino() {
        return verticeDestino;
    }

    public void setVerticeDestino(Vertice verticeDestino) {
        this.verticeDestino = verticeDestino;
    }

    public Arista getSigArista() {
        return sigArista;
    }


