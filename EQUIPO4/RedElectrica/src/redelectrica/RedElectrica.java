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
 
 
 
    public static void main(String[] args) {
        int a;
    }
    
}
