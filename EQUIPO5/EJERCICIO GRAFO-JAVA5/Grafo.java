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

    private void insertarVertice(int capacidad, String tipo, String ubicacion){
       Vertice nuevo = new Vertice(capacidad, tipo, ubicacion);
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
                    capacidad = leer.next().intAt(0);
                }
            }
        }while(opc!=4);
        
    }
}