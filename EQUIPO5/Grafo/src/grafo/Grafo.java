/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafo;
//Importa la clase 'scanner' para leer las entradas del usuario.
import java.util.Scanner;

//Se crea la clase Grafo
public class Grafo{
    // Se declara la variable inicio de tipo vertice
    private Vertice inicio;
    //Constructor 
    public Grafo(){
        this.inicio = null;
    }
    //Getters y Setters
    //Get retorna no lo que este guardado en 'inicio'
    public Vertice getInicio(){
        return inicio;
    }
    //Set actualiza un nuevo valor a 'inicio'
    public void setInicio(Vertice inicio){
        this.inicio = inicio;
    }
    //Método de insertarVertice
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
    public void insertarArista(char origen, char destino, int flujo, int distancia, char presion) {
        Vertice verticeOrigen = buscarVertice(origen);
        Vertice verticeDestino = buscarVertice(destino);
        if (verticeOrigen != null && verticeDestino != null) {
            Arista nuevaArista = new Arista(verticeDestino, flujo, distancia, presion);
            if (verticeOrigen.getInicioArista() == null) {
                verticeOrigen.setInicioArista(nuevaArista);
            } else {
                Arista actual = verticeOrigen.getInicioArista();
                while (actual.getSigArista() != null) {
                    actual = actual.getSigArista();
                }
                actual.setSigArista(nuevaArista);
            }
        } else {
            System.out.println("Uno o ambos vértices no existen.");
        }
    }
    private Vertice buscarVertice(char capacidad) {
        Vertice actual = this.inicio;
        while (actual != null) {
            if (actual.getCapacidad() == capacidad) {
                return actual;
            }
            actual = actual.getSigVertice();
        }
        return null;
    }
    //Método de mostrar
public void mostrarListaAdyacencia() {
        Vertice actual = this.getInicio();
        while (actual != null) {
            System.out.print(actual.getCapacidad() + ": ");
            Arista arista = actual.getInicioArista();
            while (arista != null) {
                System.out.print(arista.getVerticeDestino().getCapacidad() + " ");
                arista = arista.getSigArista();
            }
            System.out.println();
            actual = actual.getSigVertice();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
        char capacidad, tipo, ubicacion,origen,destino, presion;
        int flujo, distancia;
        Scanner leer = new Scanner(System.in);
        Grafo grafo = new Grafo();
        
        do {
            System.out.println("1. Insertar vertice");
            System.out.println("2. Insertar arista");
            System.out.println("3. Mostrar");
            System.out.println("4. Salir");
            opc = leer.nextInt();
            switch (opc){
                case 1 -> {
                    //Le pide al usuario que ingresa la capacidad.
                    System.out.print("Ingresa la capacidad del vertice: ");
                    capacidad = leer.next().charAt(0);
                    System.out.print("Ingresa el tipo del vertice: ");
                    tipo = leer.next().charAt(0);
                    System.out.print("Ingresa la ubicacion del vertice: ");
                    ubicacion = leer.next().charAt(0);
                    grafo.insertarVertice(capacidad, tipo, ubicacion);
                }
                case 2 -> {
                    //Ingresar la informacion de la Arista.
                   System.out.print("Ingresa el vertice origen: ");
                    origen = leer.next().charAt(0);
                    System.out.print("Ingresa el vertice destino: ");
                    destino = leer.next().charAt(0);
                    System.out.print("Ingresa el flujo: ");
                    flujo = leer.nextInt();
                    System.out.print("Ingresa la distancia: ");
                    distancia = leer.nextInt();
                    System.out.print("Ingresa la presion: ");
                    presion = leer.next().charAt(0);
                    grafo.insertarArista(origen, destino, flujo, distancia, presion);
                    break;
                }
                case 3 -> grafo.mostrarListaAdyacencia();
                case 4 -> System.out.print("ADIOS(:");
                default -> System.out.print("Opcion no valida.):\n\n");
            }
            //Insertar vertice
            //Si selecciona un número diferente a los que se muestras le mostra el siguiente mensaje.
                    }while(opc!=4);
    }
}