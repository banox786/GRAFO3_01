package aviones;

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

    public void insertarVertice(char dato) {
        Vertice nuevo = new Vertice(dato);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Vertice temp = inicio;
            while (temp.getSiguienteVertice() != null) {
                temp = temp.getSiguienteVertice();
            }
            temp.setSiguienteVertice(nuevo);
        }
    }

    public void insertarArista(char origen, char destino, int peso) {
        Vertice vOrigen = buscarVertice(origen);
        Vertice vDestino = buscarVertice(destino);
        if (vOrigen != null && vDestino != null) {
            Arista nueva = new Arista(vDestino, peso);
            if (vOrigen.getInicio() == null) {
                vOrigen.setInicio(nueva);
            } else {
                Arista temp = vOrigen.getInicio();
                while (temp.getSigArista() != null) {
                    temp = temp.getSigArista();
                }
                temp.setSigArista(nueva);
            }
        }
    }

    private Vertice buscarVertice(char dato) {
        Vertice temp = inicio;
        while (temp != null) {
            if (temp.getDato() == dato) {
                return temp;
            }
            temp = temp.getSiguienteVertice();
        }
        return null;
    }

    public void mostrarListaAdyacencia() {
        Vertice temp = inicio;
        while (temp != null) {
            System.out.print(temp.getDato() + " -> ");
            Arista arista = temp.getInicio();
            while (arista != null) {
                System.out.print(arista.getVerticeDestino().getDato() + "(" + arista.getPeso() + ") ");
                arista = arista.getSigArista();
            }
            System.out.println();
            temp = temp.getSiguienteVertice();
        }
    }
}
