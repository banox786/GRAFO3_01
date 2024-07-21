/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafo;

/**
 *
 * @author PC
 */
public class Arista {
    private Vertice verticeDestino;
    private Arista sigArista;
    private int flujo;
    private int distancia;
    private char presion;

    public Arista(Vertice verticeDestino, int flujo, int distancia, char presion) {
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

    public char getPresion() {
        return presion;
    }

    public void setPresion(char presion) {
        this.presion = presion;
    }
}