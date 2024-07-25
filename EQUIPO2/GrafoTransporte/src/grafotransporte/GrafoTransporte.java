/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafotransporte;

/**
 *
 * @author navy_
 */
import java.util.Scanner;
public class GrafoTransporte {

    private Vertice primerVertice;

    public GrafoTransporte() {
        this.primerVertice = null;
    }
    //METODOS CREADOS J.A
    public void agregarVertice(String nombreEstacion, String horario) {
        Vertice nuevoVertice = new Vertice(nombreEstacion, horario, null);
        if (primerVertice == null) {
            primerVertice = nuevoVertice;
        } else {
            Vertice temp = primerVertice;
            while (temp.getSigVertices() != null) {
                temp = temp.getSigVertices();
            }
            temp.setSigVertices(nuevoVertice);
        }
    }
//METODO CREADO J.A
    public void agregarArista(String origen, String destino, int distancia, int tiempo) {
        Vertice verticeOrigen = buscarVertice(origen);
        Vertice verticeDestino = buscarVertice(destino);
        if (verticeOrigen != null && verticeDestino != null) {
            Arista nuevaArista = new Arista(verticeDestino, distancia, tiempo);
            if (verticeOrigen.getInicioArista() == null) {
                verticeOrigen.setInicioArista(nuevaArista);
            } else {
                Arista temp = (Arista) verticeOrigen.getInicioArista();
                while (temp.getSigAristas() != null) {
                    temp = temp.getSigAristas();
                }
                temp.setSigAristas(nuevaArista);
            }
        }
    }
//METODO CREADO J.A
    private Vertice buscarVertice(String nombreEstacion) {
        Vertice temp = primerVertice;
        while (temp != null) {
            if (temp.getNombreEstacion().equals(nombreEstacion)) {
                return temp;
            }
            temp = temp.getSigVertices();
        }
        return null;
    }
//METODO CREADO J.A
    public void mostrarGrafo() {
        Vertice temp = primerVertice;
        while (temp != null) {
            System.out.println("Estacion: " + temp.getNombreEstacion() + ", Horario: " + temp.getHorario());
            Arista aristaTemp = temp.getInicioArista();
            while (aristaTemp != null) {
                System.out.println("     Destino: " + aristaTemp.getVerticeDestino().getNombreEstacion() + ", Distancia: " + aristaTemp.getDistancia() + ", Tiempo: " + aristaTemp.getTiempo());
                aristaTemp = aristaTemp.getSigAristas();
            }
            temp = temp.getSigVertices();
        }
    }

    public static void main(String[] args) {
        GrafoTransporte grafo = new GrafoTransporte();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu de opciones:");
            System.out.println("1. Insertar estacion (vertice)");
            System.out.println("2. Insertar conexion (arista)");
            System.out.println("3. Buscar estacion");
            System.out.println("4. Mostrar lista de adyacencia");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opcion: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Nombre de la estacion: ");
                    String nombreEstacion = scanner.nextLine();
                    System.out.print("Horario de la estacion: ");
                    String horario = scanner.nextLine();
                    grafo.agregarVertice(nombreEstacion, horario);
                    break;
                case "2":
                    System.out.print("Nombre de la estacion de origen: ");
                    String origen = scanner.nextLine();
                    System.out.print("Nombre de la estacion de destino: ");
                    String destino = scanner.nextLine();
                    System.out.print("Distancia (km): ");
                    int distancia = Integer.parseInt(scanner.nextLine());
                    System.out.print("Tiempo (min): ");
                    int tiempo = Integer.parseInt(scanner.nextLine());
                    grafo.agregarArista(origen, destino, distancia, tiempo);
                    break;
                case "3":
                    System.out.print("Nombre de la estacion a buscar: ");
                    String nombreBusqueda = scanner.nextLine();
                    Vertice vertice = grafo.buscarVertice(nombreBusqueda);
                    if (vertice != null) {
                        System.out.println("Estacion encontrada: " + vertice.getNombreEstacion() + ", Horario: " + vertice.getHorario());
                    } else {
                        System.out.println("Estacion no encontrada.");
                    }
                    break;
                case "4":
                    grafo.mostrarGrafo();
                    break;
                case "5":
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcion no válida, por favor intenta de nuevo.");
            }
        }
    }
}
