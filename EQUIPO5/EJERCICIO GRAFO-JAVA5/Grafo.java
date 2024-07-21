<<<<<<< HEAD
=======
import java.util.Scanner;
>>>>>>> ab325d34e87dc47453b2f057a2c04f80975d49fa

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

    private void insertarVertice(String capacidad, String tipo, String ubicacion){
       Vertice nuevo = new Vertice(capacidad, tipo, ubicacion);
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
        // TODO code application logic here
        int opc;
        int capacidad;
        Vertice origen, destino;
        Scanner leer = new Scanner(System.in);
        Grafo grafo = new Grafo();

        do{
            System.out.print("1. Insertar vertice");
            System.out.print("2. Insertar arista");
            System.out.print("3. Mostrar");
            System.out.print("4. Salir");
            opc=leer.nextInt();
            switch(opc){
                case 1 -> {
                    System.out.print("Ingresa los datos del vertice");
                    
                }
                case 2 ->{
                    System.out.print("Ingresa el valor de origen");

                }
                case 3 -> grafo.mostrarlistaAdyacencia();
                case 4 -> System.out.print("Adios, basura");
            }
        }while(opc!=4);
    }
}