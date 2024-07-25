package aviones;

import java.util.Scanner;

public class Aviones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grafo grafo = new Grafo();
        int opcion;
        char dato, origen, destino;
        int peso;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Insertar vértice");
            System.out.println("2. Insertar arista");
            System.out.println("3. Mostrar lista de adyacencia");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato del vértice: ");
                    dato = scanner.next().charAt(0);
                    grafo.insertarVertice(dato);
                    break;
                case 2:
                    System.out.print("Ingrese el vértice origen: ");
                    origen = scanner.next().charAt(0);
                    System.out.print("Ingrese el vértice destino: ");
                    destino = scanner.next().charAt(0);
                    System.out.print("Ingrese el peso de la arista: ");
                    peso = scanner.nextInt();
                    grafo.insertarArista(origen, destino, peso);
                    break;
                case 3:
                    grafo.mostrarListaAdyacencia();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
