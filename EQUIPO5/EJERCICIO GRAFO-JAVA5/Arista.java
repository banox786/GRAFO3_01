public class Arista {
    private int flujo;
    private int distancia;
    private Vertice verticeDestino;
    private Arista sigArista;

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
        this.verticeDestino = verticeDestino;
        this.sigArista = null;
    }

    public Vertice getVerticeDestino(){
        return verticeDestino;
    }
    public void setVerticeDestino(Vertice verticeDestino){
        this.verticeDestino = verticeDestino;
    }

    public Arista getSigArista(){
        return sigArista;
    }

    public void setSigArista(Arista sigArista){
        this.sigArista = sigArista;
    }
}