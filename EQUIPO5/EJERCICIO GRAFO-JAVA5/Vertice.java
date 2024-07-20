public class Vertice {
    private int dato;
    private Vertice sigVertice;
    private Arista inicioArista;

    public Vertice(int dato){
        this.dato = dato;
        this.sigVertice = null;
        this.inicioArista = null;
    }

    public int getDato(){
        return dato;
    }
    public void setDato(int dato){
        this.dato = dato;
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
