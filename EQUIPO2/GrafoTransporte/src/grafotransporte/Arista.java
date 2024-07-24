/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafotransporte;

/**
 *
 * @author navy_
 */
public class Arista {
    private Vertice verticeDestino;
    private int distancia;
    private int tiempo;
    private Arista sigAristas;
   

    public Arista(Vertice verticeDestino, int distancia, int tiempo) {
        this.verticeDestino = verticeDestino;
        this.distancia = distancia;
        this.tiempo = tiempo;
    }

    public Vertice getVerticeDestino() {
        return verticeDestino;
    }

    public void setVerticeDestino(Vertice verticeDestino) {
        this.verticeDestino = verticeDestino;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Arista getSigAristas(){
        return sigAristas;
    }
    
    public void setSigAristas(Arista sigAristas){
        this.sigAristas = sigAristas;
    }

}