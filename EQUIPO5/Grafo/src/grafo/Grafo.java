/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafo;
import java.util.Scanner;


public class Grafo{

    private Vertice inicio;

    public Grafo(){
        this.inicio = null;
    }

    public Vertice getInicio(){
        return inicio;
    }

    public void setInicio(Vertice inicio){
        this.inicio = inicio;
    }
    public void insertarVertice(char capacidad, char tipo, char ubicacion) {
        Vertice nuevo = new Vertice(capacidad, tipo, ubicacion);
        if (this.inicio == null) {
            this.inicio = nuevo;
        } else {
            Vertice actual = this.inicio;
            while (actual.getSigVertice() != null) {
                actual = actual.getSigVertice();
            }
            actual.setSigVertice(nuevo);
        }
    }
    private Object mostrarlistaAdyacencia() {
        Vertice actual = this.getInicio();
        while(actual != null){
            System.out.print(actual.getCapacidad() + ":");
        }
        return actual;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
        char capacidad, tipo, ubicacion, origen, destino, presion;
        int flujo, distancia;
        Scanner leer = new Scanner(System.in);
        Grafo grafo = new Grafo();

        do {
            System.out.println("1. Insertar vertice");
            System.out.println("2. Insertar arista");
            System.out.println("3. Mostrar");
            System.out.println("4. Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Ingresa la capacidad del vertice: ");
                    capacidad = leer.next().charAt(0);
                    System.out.print("Ingresa el tipo del vertice: ");
                    tipo = leer.next().charAt(0);
                    System.out.print("Ingresa la ubicacion del vertice: ");
                    ubicacion = leer.next().charAt(0);
                    grafo.insertarVertice(capacidad, tipo, ubicacion);
                    break;
                case 2:
                    System.out.print("Ingresa el valor de origen");

                    break;
                case 3:
                    grafo.mostrarlistaAdyacencia();
                    break;
                case 4:
                    System.out.print("Adios, basura");
                    break;
            }
        }while(opc!=4);
    }
}