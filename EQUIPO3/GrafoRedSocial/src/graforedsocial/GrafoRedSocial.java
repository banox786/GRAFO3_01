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
                default:
                    System.out.println("Opcion no valida, elige otra");
                    break;
            }
        } while (opc != 4);
    }
}
