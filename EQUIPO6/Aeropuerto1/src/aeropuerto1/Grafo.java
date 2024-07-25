/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeropuerto1;

/**
 *
 * @author kungl
 */
import java.util.ArrayList;
import java.util.List;

public class Grafo {
    private List<Aeropuerto> aeropuertos;
    private List<Ruta> rutas;

    public Grafo() {
        aeropuertos = new ArrayList<>();
        rutas = new ArrayList<>();
    }

    public void agregarAeropuerto(Aeropuerto aeropuerto) {
        aeropuertos.add(aeropuerto);
    }

    public void agregarRuta(Ruta ruta) {
        rutas.add(ruta);
    }

    public Aeropuerto buscarAeropuerto(String nombre) {
        for (Aeropuerto aeropuerto : aeropuertos) {
            if (aeropuerto.getNombre().equals(nombre)) {
                return aeropuerto;
            }
        }
        return null;
    }

    public void mostrarListaAdyacencia() {
        for (Ruta ruta : rutas) {
            System.out.println(ruta);
        }
    }
}
