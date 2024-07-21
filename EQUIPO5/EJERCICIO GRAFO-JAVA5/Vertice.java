public class Vertice {
<<<<<<< HEAD
    private String capacidad;
=======
<<<<<<< HEAD
    private String capacidad;
=======
    private int capacidad;
>>>>>>> ab325d34e87dc47453b2f057a2c04f80975d49fa
>>>>>>> 7f3e106a152c4ef7d62e4b527bdbf6f8fb715176
    private String tipo;
    private String ubicacion;
    private Vertice sigVertice;
    private Arista inicioArista;

<<<<<<< HEAD
    public Vertice(String capacidad, String tipo, String ubicacion){
=======
<<<<<<< HEAD
    public Vertice(String capacidad, String tipo, String ubicacion) {
=======
    public Vertice(int capacidad, String tipo, String ubicacion){
>>>>>>> ab325d34e87dc47453b2f057a2c04f80975d49fa
>>>>>>> 7f3e106a152c4ef7d62e4b527bdbf6f8fb715176
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.sigVertice = null;
        this.inicioArista = null;
    }

<<<<<<< HEAD
    public String getCapacidad() {
=======
<<<<<<< HEAD
    public String getCapacidad() {
        return capacidad;
=======
    public int getCapacidad() {
>>>>>>> 7f3e106a152c4ef7d62e4b527bdbf6f8fb715176
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
>>>>>>> ab325d34e87dc47453b2f057a2c04f80975d49fa
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Vertice getSigVertice() {
        return sigVertice;
    }

    public void setSigVertice(Vertice sigVertice) {
        this.sigVertice = sigVertice;
    }

    public Arista getInicioArista() {
        return inicioArista;
    }

    public void setInicioArista(Arista inicioArista) {
        this.inicioArista = inicioArista;
    }
<<<<<<< HEAD
}

=======
}
>>>>>>> ab325d34e87dc47453b2f057a2c04f80975d49fa
