package bankingmovement;

import java.util.Scanner;

public class BankingMovement {

    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        int opc;
        Scanner read = new Scanner(System.in);
        do {
            System.out.println("1. Insertar Vértice");
            System.out.println("2. Insertar Arista");
            System.out.println("3. Mostrar");
            System.out.println("4. Salir");
            opc = read.nextInt();
            read.nextLine();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el ID del vertice: ");
                    String id = read.nextLine();
                    System.out.println("Ingrese el numero de cuenta: ");
                    String numeroCuenta = read.nextLine();
                    System.out.println("Ingrese el tipo de cuenta: ");
                    String tipoCuenta = read.nextLine();
                    System.out.println("Ingrese el saldo: ");
                    float saldo = read.nextFloat();
                    Vertice nuevoVertice = new Vertice(id, numeroCuenta, tipoCuenta, saldo);
                    grafo.insertarVertice(nuevoVertice);
                    break;

                case 2:
                    System.out.print("Ingrese el ID de la cuenta origen: ");
                    String idOrigen = read.nextLine();
                    System.out.print("Ingrese el ID de la cuenta destino: ");
                    String idDestino = read.nextLine();
                    Vertice cuentaOrigen = grafo.buscarVertice(idOrigen);
                    Vertice cuentaDestino = grafo.buscarVertice(idDestino);
                    if (cuentaOrigen == null || cuentaDestino == null) {
                        System.out.println("Cuenta origen o destino no encontrada.");
                    } else {
                        System.out.print("Ingrese el monto: ");
                        float monto = read.nextFloat();
                        read.nextLine();  // Clear the buffer
                        System.out.print("Ingrese la fecha: ");
                        String fecha = read.nextLine();
                        System.out.print("Ingrese el tipo de transacción: ");
                        String tipoTransaccion = read.nextLine();
                        Arista nuevaArista = new Arista(monto, fecha, tipoTransaccion, cuentaOrigen, cuentaDestino);
                        grafo.insertarArista(nuevaArista);
                    }
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

        } while (opc != 4);

        read.close();
    }
}
