/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafotransporte;

/**
 *
 * @author navy_
 */
public class GrafoTransporte {

    private Vertices primerVertice;

    public GrafoTransporte() {
        this.primerVertice = null;
    }

    public void agregarVertice(String nombreEstacion, String horario) {
        Vertices nuevoVertice = new Vertices(nombreEstacion, horario, null);
        if (primerVertice == null) {
            primerVertice = nuevoVertice;
        } else {
            Vertices temp = primerVertice;
            while (temp.getSigVertices() != null) {
                temp = temp.getSigVertices();
            }
            temp.setSigVertices(nuevoVertice);
        }
    }

    public void agregarArista(String origen, String destino, int distancia, int tiempo) {
        Vertices verticeOrigen = buscarVertice(origen);
        Vertices verticeDestino = buscarVertice(destino);
        if (verticeOrigen != null && verticeDestino != null) {
            Aristas nuevaArista = new Aristas(verticeDestino, distancia, tiempo);
            if (verticeOrigen.getInicioArista() == null) {
                verticeOrigen.setInicioArista(nuevaArista);
            } else {
                Aristas temp = verticeOrigen.getInicioArista();
                while (temp.getSigAristas() != null) {
                    temp = temp.getSigAristas();
                }
                temp.setSigAristas(nuevaArista);
            }
        }
    }

    private Vertices buscarVertice(String nombreEstacion) {
        Vertices temp = primerVertice;
        while (temp != null) {
            if (temp.getNombreEstacion().equals(nombreEstacion)) {
                return temp;
            }
            temp = temp.getSigVertices();
        }
        return null;
    }

    public void mostrarGrafo() {
        Vertices temp = primerVertice;
        while (temp != null) {
            System.out.println("Estación: " + temp.getNombreEstacion() + ", Horario: " + temp.getHorario());
            Aristas aristaTemp = temp.getInicioArista();
            while (aristaTemp != null) {
                System.out.println("  -> Destino: " + aristaTemp.getVerticeDestino().getNombreEstacion() + ", Distancia: " + aristaTemp.getDistancia() + ", Tiempo: " + aristaTemp.getTiempo());
                aristaTemp = aristaTemp.getSigAristas();
            }
            temp = temp.getSigVertices();
        }
    }

    public static void main(String[] args) {
        GrafoTransporte grafo = new GrafoTransporte();
        grafo.agregarVertice("Estación A", "08:00 - 20:00");
        grafo.agregarVertice("Estación B", "09:00 - 18:00");
        grafo.agregarVertice("Estación C", "07:00 - 22:00");

        grafo.agregarArista("Estación A", "Estación B", 5, 10);
        grafo.agregarArista("Estación A", "Estación C", 10, 20);
        grafo.agregarArista("Estación B", "Estación C", 2, 5);

        grafo.mostrarGrafo();
    }
}