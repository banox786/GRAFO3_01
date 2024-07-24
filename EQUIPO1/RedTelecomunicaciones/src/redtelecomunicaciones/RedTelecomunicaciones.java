package redtelecomunicaciones;

import java.util.Scanner;
/**
 *
 * @author Victor
 */
public class RedTelecomunicaciones {
    public static void main(String[] args) {
        int opcion;
        String dirIP, nombre, tipo;
        float capacidad, ponderacion;
        Dispositivo dispositivoOrigen, dispositivoDestino;
        RedTelecom redTelecom = new RedTelecom();
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("1. Agregar dispositivo");
            System.out.println("2. Agregar arista");
            System.out.println("3. Mostrar lista de adyacencia");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opcion: ");
            opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    System.out.print("Ingrese la dirección IP del dispositivo: ");
                    dirIP = scanner.next();
                    System.out.print("Ingrese el nombre del dispositivo: ");
                    nombre = scanner.next();
                    System.out.print("Ingrese el tipo del dispositivo: ");
                    tipo = scanner.next();
                    System.out.print("Ingrese la capacidad del dispositivo: ");
                    capacidad = scanner.nextFloat();
                    redTelecom.agregarDispositivo(dirIP, nombre, tipo, capacidad);
                    break;
                case 2:
                    System.out.print("Ingrese la dirección IP del dispositivo origen: ");
                    dirIP = scanner.next();
                    dispositivoOrigen = redTelecom.buscarDispositivo(dirIP);
                    System.out.print("Ingrese la dirección IP del dispositivo destino: ");
                    dirIP = scanner.next();
                    dispositivoDestino = redTelecom.buscarDispositivo(dirIP);
                    System.out.print("Ingrese la ponderación de la arista: ");
                    ponderacion = scanner.nextFloat();
                    redTelecom.agregarArista(dispositivoOrigen, dispositivoDestino, ponderacion);
                    break;
                case 3:
                    redTelecom.mostrarListaAdyacencia();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }while(opcion != 4);
    }
}
