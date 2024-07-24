/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafotransporte;

/**
 *
 * @author navy_
 */
public class Aristas {
    Vertice destino;
    double distancia;
    double tiempo;

    public Aristas(Vertice destino, double distancia, double tiempo) {
        this.destino = destino;
        this.distancia = distancia;
        this.tiempo = tiempo;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    
}
