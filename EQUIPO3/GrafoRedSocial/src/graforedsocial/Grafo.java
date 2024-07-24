/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graforedsocial;

/**
 *
 * @author HOME
 */
public class Grafo {
    private Vertice inicio;

    public Grafo(){
        this.inicio = null;
    }

    public Vertice getInicio(){
        return inicio;
    }
    
    public void setInicio(){
        this.inicio = inicio;
    }

    public void insertarVertice(String nombre, String ciudad, int seguidores){
        Vertice nuevo = new Vertice(nombre, ciudad, seguidores);
        if(this.getInicio()==null){
            this.setInicio(nuevo);
        }else{
            Vertice actual = this.getInicio();
            while(actual.getSigVertice()!=null){
                actual = actual.getSigVertice();
            }
            actual.setSigVertice(nuevo);
    }
}
