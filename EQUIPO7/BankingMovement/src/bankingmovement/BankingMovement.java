package bankingmovement;
import java.util.Scanner;

public class BankingMovement {

    public static void main(String[] args) {
        Grafo grafo= new Grafo();
        int opc;   
        float monto;
        String fecha,tipoTransaccion,id = null, numeroCuenta, tipoCuenta;
        Vertice cuentaDestino, cuentaOrigen;
        Scanner read = new Scanner(System.in);
        do{
            System.out.println("1. Insertar Vértice");
            System.out.println("2. Insertar Arista");
            System.out.println("3. Mostrar");
            System.out.println("4. Salir");
            opc = read.nextInt();
            read.nextLine();
            switch(opc){
                case 1:
                    System.out.println("Ingrese el ID del vertice: ");
                    id = read.nextLine();
                    System.out.println("Ingrese el numero de cuenta: ");
                    numeroCuenta = read.nextLine();
                    System.out.println("Ingrese el tipo de cuenta: ");
                    tipoCuenta = read.nextLine();
                    System.out.println("Ingrese el saldo: ");
                    float saldo = read.nextFloat();
                    grafo.insertarVertice(id, numeroCuenta, tipoCuenta, saldo);
                    break;
                    
                case 2:
                    System.out.print("Ingrese el monto: ");
                    monto=read.nextFloat();
                    System.out.print("Ingrese la fecha: ");
                    fecha=read.nextLine();
                    System.out.print("Ingrese tipo de transacción ");
                    tipoTransaccion=read.nextLine();
                    cuentaOrigen=grafo.buscarVertice(id);
                    System.out.println("Ingrese el nombre de destino");
                    id=read.next();
                    cuentaDestino=grafo.buscarVertice(id);
                    System.out.println("Origen]: "+cuentaOrigen.getId());
                    System.out.println("Destino]: "+cuentaDestino.getId());
                    grafo.insertarArista(monto,fecha,tipoTransaccion, cuentaDestino, cuentaOrigen);
                    
                    break;
                    
                case 3:
                    grafo.mostrarListaAdyacencia();
                    break;
                    
                case 4:
                    System.out.println("Saliendo....");
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
            }
            
        }while(opc !=4);
        
        read.close();
        
    }
    
}

