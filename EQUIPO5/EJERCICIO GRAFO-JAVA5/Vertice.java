public class Vertice {
    private int capacidad;
    private String tipo;
    private String ubicacion;
    private Vertice sigVertice;
    private Arista inicioArista;

    public Vertice(int capacidad, String tipo, String ubicacion){
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.sigVertice = null;
        this.inicioArista = null;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Vertice getSigVertice(){
        return sigVertice;
    }
    public void setSigVertice(Vertice sigVertice){
        this.sigVertice = sigVertice;
    }

    public Arista getInicioArista(){
        return inicioArista;
    }
    public void setInicioArista(Arista inicioArista){
        this.inicioArista = inicioArista;
    }
}