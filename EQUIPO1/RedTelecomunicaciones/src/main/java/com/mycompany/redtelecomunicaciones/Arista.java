/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.redtelecomunicaciones;

/**
 *
 * @author Thaily Mairyn
 */
public class Arista {
    private Vertice verticeDestino;
    private Arista sigArista;

    public Arista(Vertice destino) {
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

    public void setSigArista(Arista sigArista) {
        this.sigArista = sigArista;
    }
}
