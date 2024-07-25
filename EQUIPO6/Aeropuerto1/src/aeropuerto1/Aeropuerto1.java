/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeropuerto1;

import java.util.Scanner;

public class Aeropuerto1 {
    private static Grafo grafo = new Grafo();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    insertarAeropuerto();
                    break;
                case 2:
                    insertarRuta();
                    break;
                case 3:
                    mostrarListaAdyacencia();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opcion invalida. Intentelo de nuevo.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Insertar Aeropuerto");
        System.out.println("2. Insertar Ruta");
        System.out.println("3. Mostrar Lista de Adyacencia");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    private static void insertarAeropuerto() {
        System.out.print("Ingrese el nombre del aeropuerto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la ciudad del aeropuerto: ");
        String ciudad = scanner.nextLine();
        System.out.print("Ingrese la capacidad del aeropuerto: ");
        int capacidad = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea

        Aeropuerto aeropuerto = new Aeropuerto(nombre, ciudad, capacidad);
        grafo.agregarAeropuerto(aeropuerto);
        System.out.println("Aeropuerto agregado exitosamente.");
    }

    private static void insertarRuta() {
        System.out.print("Ingrese el nombre del aeropuerto de origen: ");
        String nombreOrigen = scanner.nextLine();
        Aeropuerto origen = grafo.buscarAeropuerto(nombreOrigen);

        if (origen == null) {
            System.out.println("Aeropuerto de origen no encontrado.");
            return;
        }

        System.out.print("Ingrese el nombre del aeropuerto de destino: ");
        String nombreDestino = scanner.nextLine();
        Aeropuerto destino = grafo.buscarAeropuerto(nombreDestino);

        if (destino == null) {
            System.out.println("Aeropuerto de destino no encontrado.");
            return;
        }

        System.out.print("Ingrese el tiempo de vuelo (en horas): ");
        int tiempo = scanner.nextInt();
        System.out.print("Ingrese el número de vuelos: ");
        int vuelos = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea

        Ruta ruta = new Ruta(origen, destino, tiempo, vuelos);
        grafo.agregarRuta(ruta);
        System.out.println("Ruta agregada exitosamente.");
    }

    private static void mostrarListaAdyacencia() {
        grafo.mostrarListaAdyacencia();
    }
}
