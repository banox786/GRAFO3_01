package bankingmovement;

public class Grafo {
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

    public void insertarArista(Arista arista) {
        if (arista.getCuentaOrigen() == null || arista.getCuentaDestino() == null) {
            System.out.println("No se puede insertar la arista");
        } else {
            Vertice cuentaOrigen = arista.getCuentaOrigen();
            if (cuentaOrigen.getInicioArista() == null) {
                cuentaOrigen.setInicioArista(arista);
            } else {
                Arista actual = cuentaOrigen.getInicioArista();
                while (actual.getSigArista() != null) {
                    actual = actual.getSigArista();
                }
                actual.setSigArista(arista);
            }
        }
    }

    public void insertarVertice(Vertice vertice) {
        if (this.inicio == null) {
            this.inicio = vertice;
        } else {
            Vertice actual = this.inicio;
            while (actual.getSigVertice() != null) {
                actual = actual.getSigVertice();
            }
            actual.setSigVertice(vertice);
        }
    }

    public Vertice buscarVertice(String id) {
        Vertice actual = this.inicio;
        while (actual != null) {
            if (actual.getId().equals(id)) {
                return actual;
            } else {
                actual = actual.getSigVertice();
            }
        }
        return null;
    }

    public void mostrarListaAdyacencia() {
        Vertice actual = this.inicio;
        while (actual != null) {
            System.out.print(actual.getId() + ": ");
            Arista actualArista = actual.getInicioArista();
            while (actualArista != null) {
                System.out.print(actualArista.getCuentaDestino().getId() + " -> ");
                actualArista = actualArista.getSigArista();
            }
            System.out.println("");
            actual = actual.getSigVertice();
        }
    }
}
         
