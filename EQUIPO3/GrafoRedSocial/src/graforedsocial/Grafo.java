package graforedsocial;

public class Grafo {
    private Vertice inicio;

    public Grafo(){
        this.inicio = null;
    }

    public Vertice getInicio() {
        return inicio;
    }

    public void setInicio(Vertice inicio) {
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
    public void insertarArista(Vertice origen, Vertice destino){
        if(origen == null || destino == null){
            System.out.println("No se puede insertar la arista");
        }else{
            Arista nuevaArista=new Arista(destino);
            if(origen.getInicioArista()==null){
                origen.setInicioArista(nuevaArista);
            }else{
                Arista actual=origen.getInicioArista();
                while (actual.getSigArista()==null){
                    actual.setSigArista(nuevaArista);
                }
    }
}
