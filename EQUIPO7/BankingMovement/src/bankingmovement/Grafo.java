package bankingmovement;

import java.util.List;

public class Grafo {
   private List<Vertice> vertices;
   private List<Arista> aristas;

public grafo(List<Vertice> vertices, List<Arista> Aristas){
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

   public void insertarArista(Vertice origen, Vertice destino){
      if (origen == null || destino == null){
         System.out.println("No podemos insertar arista, intentalo de nuevo");
      }else{
      Arista nuevaArista = new Arista(destino);
         if (origen.getInicioArista() == null){
            origen.setInicioArista(nuevaArista);
         }else{
            Arista actual = origen.getInicioArista();
            while (actual.getSigArista() != null);
               actual = actual.getSigArista();
         }
         actual.setSigArista(nuevaArista);
      }
   }
}

   public void mostrarListaAdyacencia(){
      Vertice actuak = this.getInicio();
      while(actual != null){
         System.out.print(actual.getDato() + ":");
         Arista actualAri = actual.getInicioArista();
         while(actualAri != null){
            System.out.print(actualAri.getVerticeDestino().getDato() + " ->");
            actualAri = actualAri.getSiguienteArista();
         }
         System.out.println("null");
         actual = actual.getSigVertice();
      }
   }

         
