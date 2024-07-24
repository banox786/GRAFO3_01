package com.mycompany.redtelecomunicaciones;

public class Arista {
    private Vertice verticeDestino;
    private int ponderacion;
    private Arista sigArista;

    public Arista(Vertice destino) {
        this.verticeDestino = verticeDestino;
        this.sigArista = null;
         this.ponderacion =  ponderacion;
    }

    public Vertice getVerticeDestino() {
        return verticeDestino;
    }

    public void setVerticeDestino(Vertice verticeDestino) {
        this.verticeDestino = verticeDestino;
    }
    
    public int getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(int ponderacion) {
        this.ponderacion = ponderacion;
    }

    public Arista getSigArista() {
        return sigArista;
    }

    public void setSigArista(Arista sigArista) {
        this.sigArista = sigArista;
    }
}
