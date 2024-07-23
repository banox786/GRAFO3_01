/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciografo;

/**
 *
 * @author kungl
 */
import java.util.HashMap;
import java.util.LinkedList;

public class Grafo {
    private HashMap<Aeropuerto, LinkedList<Ruta>> adjList;

    public Grafo() {
        adjList = new HashMap<>();
    }

    public void agregarAeropuerto(Aeropuerto aeropuerto) {
        adjList.putIfAbsent(aeropuerto, new LinkedList<>());
    }

    public void agregarRuta(Ruta ruta) {
        adjList.get(ruta.getOrigen()).add(ruta);
    }

    public void mostrarListaAdyacencia() {
        for (Aeropuerto aeropuerto : adjList.keySet()) {
            System.out.println(aeropuerto);
            for (Ruta ruta : adjList.get(aeropuerto)) {
                System.out.println("  " + ruta);
            }
        }
    }
}
