package aviones;

public class Vertice {
    private char dato;
    private Vertice siguienteVertice;
    private Arista inicio;

    public Vertice(char dato) {
        this.dato = dato;
        this.siguienteVertice = null;
        this.inicio = null;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public Vertice getSiguienteVertice() {
        return siguienteVertice;
    }

    public void setSiguienteVertice(Vertice siguienteVertice) {
        this.siguienteVertice = siguienteVertice;
    }

    public Arista getInicio() {
        return inicio;
    }

    public void setInicio(Arista inicio) {
        this.inicio = inicio;
    }
}
