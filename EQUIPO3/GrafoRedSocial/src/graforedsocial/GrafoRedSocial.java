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
        System.out.println("Menu\n");
        System.out.println("1) Insertar Vertice");
        System.out.println("2) Insertar Arista");
        System.out.println("3) Mostrar");
        System.out.println("4) Salir");
        opc = leer.nextInt();
    }
    
}
