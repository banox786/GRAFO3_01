package bankingmovement;

import java.util.List;

public class Grafo {
   private List<Vertice> vertices;
   private List<Arista> aristas;

public Grafo(List<Vertice> vertices, List<Arista> Aristas){
   this.vertices = vertices;
   this. aristas = aristas;
   }
   public List<Vertice> getVertices(){
      return vertices;
   }
   public void setVertices(List<Vertice> vertices){
      this.vertices = vertices;
   }
   public List<Arista> getArista(){
      return aristas;
   }
   public void setAristas(List<Arista> aristas){
      this.aristas = aristas;
   }

   public void insertarArista(float monto, String fecha, String tipoTransaccion, Vertice cuentaDestino, Vertice cuentaOrigen, Arista sigArista){
       if(cuentaOrigen==null || cuentaDestino==null){
           System.out.println("No se puede insertar la arista");
       }else{
           Arista nuevaArista=new Arista(monto,fecha,tipoTransaccion, cuentaDestino, cuentaOrigen);
           if(cuentaOrigen.getInicioArista()==null){
           cuentaOrigen.setInicioArista(nuevaArista);
           
       }else{
               Arista actual=cuentaOrigen.getInicioArista();
               while(actual.getSigArista()!=null){
                   actual=actual.getSigArista();
               }
               actual.setSigArista(nuevaArista);
               }
       }
       
       
      
}
}         
