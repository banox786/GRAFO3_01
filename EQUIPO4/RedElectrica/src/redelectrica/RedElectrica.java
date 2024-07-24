/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package redelectrica;
import java.util.Scanner;
/**
 *
 * @author Diana Ximena
 */
public class RedElectrica {
    private Generador inicio;
    
    public RedElectrica() {
        this.inicio = null;
    }
 
    public Generador getInicio() {
        return inicio;
    }
  
    public void setInicio(Generador inicio) {
        this.inicio = inicio;
    }
    
<<<<<<< HEAD
    //Insertar Generador
=======

    //Incertar Generador
>>>>>>> cfb5f4f5c3df1ea4b24fddf0fffbc0f7f27f2200
    public void insertarGenerador(int id, int capacidad, String tipo, String ubicacion){
        //Crear nuevo Generador
        Generador nuevo = new Generador(id, capacidad, tipo, ubicacion);
        
        //Si el grafo esta vacio
        if(this.getInicio() == null){
            this.setInicio(nuevo);
            
        //Si ya existe al menos un elemento
        }else{
            Generador actual = this.getInicio();
            
            //Recorrido al final
            while(actual.getSigGenerador() != null){
                actual = actual.getSigGenerador();
            }
            actual.setSigGenerador(nuevo);
        }
    }
    
    //Mostrar lista de Adyacencia
    public void mostrarListaAdyacencia(){
        //Declara Generador actual
        Generador actual = this.getInicio();
        while(actual != null){
            //Imprime el ID del generador actual
            //System.out.print(actual.getId() + ": ");
            System.out.print("ID=" + actual.getId() + 
                             "{Capacidad=" + actual.getCapacidad() + 
                             ", Tipo=" + actual.getTipo() + 
                             ", Ubicacion=" + actual.getUbicacion() + 
                             "}: ");
            //Inicia con el primer cable del generador actual
            Cable actualCab = actual.getInicioCable();
            //Recorre todos los cables del generador actual
            while(actualCab != null){
                //Imprime el dato del generador destino del cable
                //System.out.print(actualCab.getGeneradorDestino().getId() + " -> ");
                System.out.print("ID=" + actualCab.getGeneradorDestino().getId() + 
                             "{Capacidad=" + actualCab.getGeneradorDestino().getCapacidad() + 
                             ", Tipo=" + actualCab.getGeneradorDestino().getTipo() + 
                             ", Ubicacion=" + actualCab.getGeneradorDestino().getUbicacion() + 
                             "} -> ");
                //Pasa a el siguiente cable
                actualCab = actualCab.getSigCable();
            }
            //Salto de línea para el siguiente generador
            System.out.println("");
            //Pasa al siguiente generador
            actual = actual.getSigGenerador();
        }
    }
 
    //Insertar Cable
    public void insertarCable(Generador origen, Generador destino){
        //Verifica que los generadores de origen y destino no sean nulos
        if(origen == null || destino == null){
            System.out.println("No se puede insertar cable.");
        } else {
            //Crea un nuevo cable que apunta al generador destino
            Cable nuevoCable = new Cable(destino);
            //Si el generador origen no tiene cables, añade el nuevo cable como el primera
            if(origen.getInicioCable() == null){
                origen.setInicioCable(nuevoCable);
            } else {
                //Si el generador origen ya tiene cables, recorre hasta el último cable
                Cable actual = origen.getInicioCable();
                while(actual.getSigCable() != null){
                    actual = actual.getSigCable();
                }
                //Añade el nuevo cable al final de el lista de cables del generador origen
                actual.setSigCable(nuevoCable);
            }
        }
    }
 
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        int opc; //Opcion para el menu
        
        int id; //ID del Generador
        int capacidad; //Capacidad del Generador
        String tipo; //Tipo del Generador
        String ubicacion; //Ubicacion del Generador
        
        Generador origen, destino; //Origen y Destino de Cable
        
        //Creacion de la Red Electrica
        RedElectrica redsita = new RedElectrica();
        
        do{
            //Opciones
            System.out.println("\n Menu: \n 1. Insertar Generador \n 2. Insertar Cable \n 3. Mostrar \n 4. Salir");
            //Leer la opcion
            opc = leer.nextInt();
            leer.nextLine();
            
            switch(opc){
                //1. Insertar Generador
                case 1:
                    System.out.print("Inserta el ID: ");
                    id = leer.nextInt();
                    System.out.print("Inserta la capacidad: ");
                    capacidad = leer.nextInt();
                    System.out.print("Inserta el tipo: ");
                    tipo = leer.next();
                    System.out.print("Inserta la ubicacion: ");
                    ubicacion = leer.next();
                    redsita.insertarGenerador(id, capacidad, tipo, ubicacion);
                break;
                
                //2. Insertar Cable
                case 2:
                    System.out.print("Inserta el ID del generador de origen: ");
                    id = leer.nextInt();
                    origen = redsita.buscarGenerador(id);
                    
                    System.out.print("Inserta el ID del generador de destino: ");
                    id = leer.nextInt();
                    destino = redsita.buscarGenerador(id);
                    
                    System.out.println("Origen}:" + origen.getId());
                    System.out.println("Destino}:" + destino.getId());
                    redsita.insertarCable(origen, destino);
                break;
                //3. Mostrar
                case 3:
                    redsita.mostrarListaAdyacencia();
                break;
                
                //4. Salir
                case 4:
                    System.out.println("Hasta pronto.\n");
                break;
                
                default:
                    System.out.println("Opcion no valida.");
            }
        }while(opc != 4);
    }
}