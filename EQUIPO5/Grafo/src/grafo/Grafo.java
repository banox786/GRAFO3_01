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
    //Método de 'insertarVertice' con los parametros 'capacodad', 'tipo', y 'ubicacion'.
    public void insertarVertice(char capacidad, char tipo, char ubicacion) {
        Vertice nuevo = new Vertice(capacidad, tipo, ubicacion);
        //Si la la lista del vértice está vacia, el nuevo vértice se convierte en el primer vértice de la lista.
        if (this.inicio == null) {
            this.inicio = nuevo;
        //Si la lista no está vacía, el código busca el ultimo vértice de la lista.
        //Se inicializa la variable actual con el vertice ('this.inicio')
        } else {
            Vertice actual = this.inicio;
            /*Se recorre la lista de vértices usando un bucle while, avanzando al siguiente vértice hasta encontrar el ultimo vértice,
            osea que el ultimo vértice sea igual a 'NULL'.*/
            while (actual.getSigVertice() != null) {
                actual = actual.getSigVertice();
            }
            //Una ves encontrado el último vértice se establece 'nuevo' ahora como 'SigVertice'.
            actual.setSigVertice(nuevo);
        }
    }
    //Método de 'insertarArista' con los parametros 'origen', 'destino', 'flujo', 'distancia', 'presion'.
    public void insertarArista(char origen, char destino, int flujo, int distancia, char presion) {
        //Usa el metodo 'buscarVertice' para buscar los vértices de origen.
        Vertice verticeOrigen = buscarVertice(origen);
        Vertice verticeDestino = buscarVertice(destino);
        //Se verifica que ambos vértices existan en el grafo.
        if (verticeOrigen != null && verticeDestino != null) {
            //Se crea un instancia de 'Arista' con los parametros proporcionados antes proporcionados, apuntando a vértice destino con las propiedades
            Arista nuevaArista = new Arista(verticeDestino, flujo, distancia, presion);
            //Si el vértice de origen no tiene aristas se estableve la nueva arista como la primera.
            if (verticeOrigen.getInicioArista() == null) {
                verticeOrigen.setInicioArista(nuevaArista);
            } else {
                //Si ya hay aristas, se recorre la lista de origen hata encontrar la ultima y se añade la nueva arista al final
                Arista actual = verticeOrigen.getInicioArista();
                while (actual.getSigArista() != null) {
                    actual = actual.getSigArista();
                }
                actual.setSigArista(nuevaArista);
            }
            // Si no existen ninguno de los vértices mandara ese mensaje.
        } else {
            System.out.println("Uno o ambos vértices no existen.");
        }
    }
    //Método mostras con los parametros de capacidad
    private Vertice buscarVertice(char capacidad) {
        //Se inicializa una variable actual tipo 'Vertice' con el primer vértice de la lista.
        Vertice actual = this.inicio;
        // Se recorre la lista de vértices mientras 'actual' no sea igual a 'null'.
        while (actual != null) {
            // Se verifica si la capacidad del vértice actual es igual a la capacidad buscada.
            if (actual.getCapacidad() == capacidad) {
                // Si se encuentra el vértice con la capacidad buscada, se retorna ese vértice.
                return actual;
            }
            //Se avanza con el sigueinte vértice de la lista.
            actual = actual.getSigVertice();
        }
        //Si no encuentra ningun vértice con la capacidad buscada, se retorna NULL.
        return null;
    }
    //Método de mostrar
public void mostrarListaAdyacencia() {
    // Inicializa 'actual' con el primer vértice de la lista
        Vertice actual = this.getInicio();
         // Recorre la lista de vértices mientras 'actual' no sea igual a 'null'
        while (actual != null) {
             // Imprime la capacidad del vértice actual seguida de ': '
            System.out.print(actual.getCapacidad() + ": ");
             // Inicializa 'arista' con la primera arista del vértice actual
            Arista arista = actual.getInicioArista();
            
            // Recorre la lista de aristas del vértice actual
            while (arista != null) {
                 // Imprime la capacidad del vértice destino de la arista actual seguido de un espacio
                System.out.print(arista.getVerticeDestino().getCapacidad() + " ");
                 // Avanza a la siguiente arista
                arista = arista.getSigArista();
            }
            // Imprime una nueva línea al final de la lista de aristas del vértice actual
            System.out.println();
            // Avanza al siguiente vértice en la lista
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
            // Menú que se mostrara al usuario
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