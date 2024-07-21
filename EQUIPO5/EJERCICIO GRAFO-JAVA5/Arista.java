public class Arista {
    private int flujo;
    private int distancia;
    private Vertice verticeDestino;
    private Arista sigArista;
    private int flujo;
    private int distancia;
    private String presion;

<<<<<<< HEAD
    public Arista(Vertice verticeDestino, int flujo, int distancia, String presion) {
=======
    public int getFlujo() {
        return flujo;
    }

    public void setFlujo(int flujo) {
        this.flujo = flujo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }


    public Arista(Vertice verticeDestino){
>>>>>>> ab325d34e87dc47453b2f057a2c04f80975d49fa
        this.verticeDestino = verticeDestino;
        this.sigArista = null;
        this.flujo = flujo;
        this.distancia = distancia;
        this.presion = presion;
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
<<<<<<< HEAD

    public int getFlujo() {
        return flujo;
    }

    public void setFlujo(int flujo) {
        this.flujo = flujo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }
}
=======
}
>>>>>>> ab325d34e87dc47453b2f057a2c04f80975d49fa
