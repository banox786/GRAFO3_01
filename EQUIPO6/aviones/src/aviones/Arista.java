package aviones;

public class Arista {
    private Vertice verticeDestino;
    private Arista sigArista;
    private int peso;

    public Arista(Vertice verticeDestino, int peso) {
        this.verticeDestino = verticeDestino;
        this.peso = peso;
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

    public void setSigArista(Arista sigArista) {
        this.sigArista = sigArista;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}