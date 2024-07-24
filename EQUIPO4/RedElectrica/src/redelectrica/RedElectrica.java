/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package redelectrica;

/**
 *
 * @author Diana Ximena
 */
public class RedElectrica {
 private Generador inicio;
 
 
 
 
 

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
 
 
    
    //comentario jflajslfj
 
    public static void main(String[] args) {
        int a;
    }
    
}
