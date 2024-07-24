package redtelecomunicaciones;

/**
 *
 * @author alan
 */
public class Dispositivo {
    private String dirIP;
    private String nombre;
    private String tipo;
    private float capacidad;
    private Dispositivo sigDispositivo;
    Arista primerArista;

    public Dispositivo(String dirIP, String nombre, String tipo, float capacidad) {
        this.dirIP = dirIP;
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.sigDispositivo = null;
        this.primerArista = null;
    }

    public String getDirIP() {
        return dirIP;
    }

    public void setDirIP(String dirIP) {
        this.dirIP = dirIP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dispositivo getSigDispositivo() {
        return sigDispositivo;
    }

    public void setSigDispositivo(Dispositivo sigDispositivo) {
        this.sigDispositivo = sigDispositivo;
    }

    public Arista getPrimerArista() {
        return primerArista;
    }

    public void setPrimerArista(Arista primerArista) {
        this.primerArista = primerArista;
    }

    @Override
    public String toString() {
        return "IP: " + dirIP + "\nNombre dispositivo: " + nombre + "\nTipo: " + tipo + "\nCapacidad: " + capacidad;
    }

}
