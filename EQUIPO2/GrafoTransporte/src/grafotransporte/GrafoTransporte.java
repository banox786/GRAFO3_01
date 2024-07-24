/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafotransporte;



/**
 *
 * @author navy_
 */
public class GrafoTransporte {
    private Vertices destino;
    public GrafoTransporte(){
        this.destino = null;
    
    }
    
    public Vertices getDestino() {
        return destino;
    }
    
    
    public void setDestino(Vertices destino) {
        this.destino = destino;
    }

public void insertarvertices(String nombreEstacion, String horario, Vertices destino, Aristas inicioArista){
    Vertices nuevo;
        nuevo = new Vertices(destino);
    if(this.getDestino()==null) {
        this.setDestino(nuevo);
    
    }else{
        Vertices actual = this.getDestino();
        while (actual.getSigVertices()!= null){
            actual=actual.getSigVertices();
        }
        actual.setSigVertices(nuevo);
            
        
    }
    
}

public Vertices buscarVertices(char destino) {
    Vertices actual = this.getDestino();
    while (actual != null) {
        if (actual.getDestino() == destino) {
            return actual;
        } else {
            actual = actual.getSigVertices();
        }
    }
    return null; // Devuelve null si no encuentra el vértice
}
   
public void insertararistas(Vertices origen, Vertices destino ){
    if (origen==null | destino==null){
        System.out.println("Error");
    }else{
        if (origen.getDestinoAristas()==null){
            origen.setDestinoAristas(nuevaArista);
        }else{
        
    }
    
}
public void mostrarListaAdyacensia(){
    Vertice actual = this.getInicio();
    while((actual)!=null){
        System.out.print(actual.getDato()+"->");
        Arista actualAr1=actual.getInicioArista();
        while(actualAr1!=null){
            System.out.print(actualAr1.getVerticeDestino().getDato()+"->");
            actualAr1=actualAr1.getSigArista();
        }
        System.out.println("");
        actual=actual.getSigVertice();
    }

}
   

   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
