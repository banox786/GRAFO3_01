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
    public void insertarArista(Vertice origen, Vertice destino){
        if(origen == null || destino == null){
            System.out.println("No se puede insertar la arista");
        }else{
            Arista nuevaArista = new Arista(destino);
            if(origen.getInicioArista() == null){
                origen.setInicioArista(nuevaArista);
            }else{
                Arista actual=origen.getInicioArista();
                while(actual.getSigArista()!=null){
                    actual.setSigArista(nuevaArista);
                }
            }
        }
    }
    public void mostrarListaAdyacencia() {
    Vertice actual = this.getInicio();
    while (actual != null) {
        System.out.print("Ciudad: " + actual.getCiudad() + ", ");
        System.out.print("Nombre: " + actual.getNombre() + ", ");
        System.out.println("Seguidores: " + actual.getSeguidores());
        Arista actualArista = actual.getInicioArista();
        while (actualArista != null) {
            System.out.print("  -> Ciudad: " + actualArista.getVerticeDestino().getCiudad() + ", ");
            System.out.print("Nombre: " + actualArista.getVerticeDestino().getNombre() + ", ");
            System.out.println("Seguidores: " + actualArista.getVerticeDestino().getSeguidores());
            actualArista = actualArista.getSigArista();
        }
        actual = actual.getSigVertice();
        System.out.println("");
        }
    }
}
