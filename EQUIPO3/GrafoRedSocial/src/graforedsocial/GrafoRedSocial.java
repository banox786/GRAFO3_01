package graforedsocial;

import java.util.Scanner;

public class GrafoRedSocial {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Grafo grafo = new Grafo();
        int opc, seguidores;
        String nombre, ciudad;
        
        do {
            System.out.println("Menu\n");
            System.out.println("1) Insertar Vertice");
            System.out.println("2) Insertar Arista");
            System.out.println("3) Mostrar");
            System.out.println("4) Salir");
            opc = leer.nextInt();
            leer.nextLine(); // Limpiar el buffer

            switch (opc) {
                case 1:
                    System.out.println("Ingresa el nombre del nuevo vertice");
                    nombre = leer.nextLine();
                    System.out.println("Ingresa la ciudad del nuevo vertice");
                    ciudad = leer.nextLine();
                    System.out.println("Ingresa la cantidad de seguidores del nuevo vertice");
                    seguidores = leer.nextInt();
                    leer.nextLine(); // Limpiar el buffer
                    grafo.insertarVertice(nombre, ciudad, seguidores);
                    break;

                case 2:
                    System.out.println("Ingresa el nombre del vertice de origen");
                    String nombreOrigen = leer.nextLine();
                    Vertice origen = grafo.buscarVertice(nombreOrigen);
                    if (origen == null) {
                        System.out.println("Vertice de origen no encontrado");
                        break;
                    }
                    
                    System.out.println("Ingresa el nombre del vertice de destino");
                    String nombreDestino = leer.nextLine();
                    Vertice destino = grafo.buscarVertice(nombreDestino);
                    if (destino == null) {
                        System.out.println("Vertice de destino no encontrado");
                        break;
                    }
                    
                    System.out.println("Origen: " + origen.getNombre());
                    System.out.println("Destino: " + destino.getNombre());
                    grafo.insertarArista(origen, destino);
                    break;

                case 3:
                    grafo.mostrarListaAdyacencia();
                    break;

                case 4:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opcion no valida, elige otra");
                    break;
            }
        } while (opc != 4);
    }
}
