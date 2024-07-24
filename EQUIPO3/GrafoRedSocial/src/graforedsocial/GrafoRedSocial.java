/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graforedsocial;
import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class GrafoRedSocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Grafo grafo = new Grafo();
        int opc, seguidores;
        String nombre, ciudad;
        Vertice origen, destino;
        do {
            System.out.println("Menu\n");
            System.out.println("1) Insertar Vertice");
            System.out.println("2) Insertar Arista");
            System.out.println("3) Mostrar");
            System.out.println("4) Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingresa el nombre del nuevo vertice");
                    String nombre = leer.nextLine();
                    System.out.println("Ingresa la ciudad del nuevo vertice");
                    String ciudad = leer.nextLine();
                    System.out.println("Ingresa la cantidad de seguidores del nuevo vertice");
                    int seguidores = leer.nextInt();
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
                    
                default:
                    System.out.println("Opcion no valida, elige otra");
                    break;
            }
        } while (opc != 4);
    }
}
