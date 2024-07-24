package bankingmovement;


public class Grafo {
    private Vertice Inicio;

    public Grafo(Vertice Inicio) {
        this.Inicio = Inicio;
    }

    public Vertice getInicio() {
        return Inicio;
    }

    public void setInicio(Vertice Inicio) {
        this.Inicio = Inicio;
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
   
   
   
   public void insertarVertice(String id, String numeroCuenta, String tipoCuenta, float saldo, Vertice sigVertice, Arista inicioArista){
       Vertice nuevo=new Vertice(id, numeroCuenta, tipoCuenta, saldo);
       if(this.getInicio()==null){
           this.setInicio(nuevo);
       }else{
           Vertice actual=this.getInicio();
           while(actual.getSigVertice()!=null){
               actual=actual.getSigVertice();
           }
           actual.setSigVertice(nuevo);
       }
   }
}         
