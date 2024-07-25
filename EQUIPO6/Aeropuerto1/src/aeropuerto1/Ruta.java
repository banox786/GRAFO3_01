/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeropuerto1;

/**
 *   

 */
public class Ruta {
    private Aeropuerto origen;
    private Aeropuerto destino;
    private int tiempo;
    private int vuelos;

    public Ruta(Aeropuerto origen, Aeropuerto destino, int tiempo, int vuelos) {
        this.origen = origen;
        this.destino = destino;
        this.tiempo = tiempo;
        this.vuelos = vuelos;
    }

    public Aeropuerto getOrigen() {
        return origen;
    }

    public Aeropuerto getDestino() {
        return destino;
    }

    public int getTiempo() {
        return tiempo;
    }

    public int getVuelos() {
        return vuelos;
    }

    @Override
    public String toString() {
        return origen + " -> " + destino + " [Tiempo: " + tiempo + " hrs, Vuelos: " + vuelos + "]";
    }
}
