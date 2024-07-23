package com.mycompany.redtelecomunicaciones;

public class RedTelecomunicaciones {

        private Vertice inicio;

    public Grafo() {
        this.inicio = null;
    }

    public Vertice getInicio() {
        return inicio;
    }

    public void setInicio(Vertice inicio) {
        this.inicio = inicio;
    }
        
    
    public void insertarVertice(char dato){
        Vertice nuevo=new Vertice(dato);
        if(this.getInicio()==null){
            this.setInicio(nuevo);
        }else{
            Vertice actual = this.getInicio();
            while(actual.getSigVertice()!= null){
                actual=actual.getSigVertice();
            }   
            actual.setSigVertice(nuevo);
        }
    }
    
    public Vertice buscarVertice(char dato){
            Vertice actual = this.getInicio();
            while(actual!=null){
                if(actual.getDato()==dato){
                    return actual;
                }else{
                    actual = actual.getSigVertice();
                }
            }
            return null;
    }
    
    public void insertarArista(Vertice origen,Vertice destino){
        if(origen==null || destino ==null){
            System.out.println("No se puede papu");
        }else{
            Arista nuevaArista = new Arista(destino);
            if(origen.getInicioArista()==null){
                origen.setInicioArista(nuevaArista);
            }else{
            Arista actual = origen.getInicioArista();
            while(actual.getSigArista() != null){
                        actual = actual.getSigArista();
            }
            actual.setSigArista(nuevaArista);
        }
      }

    }
    public void mostrarListaAdyacencia (){
        Vertice actual = this.getInicio();
        while (actual != null){
            System.out.print(actual.getDato() + ": ");
            Arista actualArista = actual.getInicioArista();
            while(actualArista != null){
                System.out.print(actualArista.getVerticeDestino().getDato()+"->");
                actualArista = actualArista.getSigArista();
            }
            System.out.println("");
            actual = actual.getSigVertice();
        }
        
        
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
