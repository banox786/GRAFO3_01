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
    
 
 
 
    
    
    //Incertar Generador
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
            Cable nuevaCable = new Cable(destino);
            //Si el generador origen no tiene cables, añade el nuevo cable como el primera
            if(origen.getInicioCable() == null){
                origen.setInicioCable(nuevaCable);
            } else {
                //Si el generador origen ya tiene cables, recorre hasta el último cable
                Cable actual = origen.getInicioCable();
                while(actual.getSigCable() != null){
                    actual = actual.getSigCable();
                }
                //Añade el nueva cable al final de el lista de cables del generador origen
                actual.setSigCable(nuevaCable);
            }
        }
    }
    
    //comentario jflajslfj
 
    public static void main(String[] args) {
        int a;
    }
    
}
