package graforedsocial;

public class Vertice {
    private String nombre;
    private String ciudad;
    private int seguidores;
    private Vertice sigVertice;
    private Arista inicioArista;

    public Vertice(String nombre, String ciudad, int seguidores) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.seguidores = seguidores;
        this.sigVertice = null;
        this.inicioArista = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public Vertice getSigVertice() {
        return sigVertice;
    }

    public void setSigVertice(Vertice sigVertice) {
        this.sigVertice = sigVertice;
    }

    public Arista getInicioArista() {
        return inicioArista;
    }

    public void setInicioArista(Arista inicioArista) {
        this.inicioArista = inicioArista;
    }
    
}