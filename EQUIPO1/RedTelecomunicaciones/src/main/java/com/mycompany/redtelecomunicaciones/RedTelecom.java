
/**
 *
 * @author alan
 */
public class RedTelecom {
    private Dispositivo primerDispositivo;

    public RedTelecom() {
        this.primerDispositivo = null;
    }

    public Dispositivo getPrimerDispositivo() {
        return primerDispositivo;
    }

    public void setPrimerDispositivo(Dispositivo primerDispositivo) {
        this.primerDispositivo = primerDispositivo;
    }

    public void agregarDispositivo(String dirIP, String nombre, String tipo, float capacidad) {
        Dispositivo nuevoDispositivo = new Dispositivo(dirIP, nombre, tipo, capacidad);
        if (this.getPrimerDispositivo() == null) {
            this.setPrimerDispositivo(nuevoDispositivo);
        } else {
            Dispositivo actual = this.getPrimerDispositivo();
            while (actual.getSigDispositivo() != null) {
                actual = actual.getSigDispositivo();
            }
            actual.setSigDispositivo(nuevoDispositivo);
        }
    }

    public Dispositivo buscarDispositivo(String dirIP) {
        Dispositivo actual = this.getPrimerDispositivo();
        while (actual != null) {
            if (actual.getDirIP().equals(dirIP)) {
                return actual;
            } else {
                actual = actual.getSigDispositivo();
            }
        }
        return null;
    }

    public void agregarArista(Dispositivo dispositivoOrigen, Dispositivo dispositivoDestino, float ponderacion) {
        if (dispositivoOrigen == null || dispositivoDestino == null) {
            System.out.println("Imposible agregar arista");
        } else {
            Arista nuevaArista = new Arista(dispositivoDestino, ponderacion);
            if (dispositivoOrigen.getPrimerArista() == null) {
                dispositivoOrigen.setPrimerArista(nuevaArista);
            } else {
                Arista actual = dispositivoOrigen.getPrimerArista();
                while (actual.getSigArista() != null) {
                    actual = actual.getSigArista();
                }
                actual.setSigArista(nuevaArista);
            }
        }
    }

    public void mostrarListaAdyacencia() {
        Dispositivo actual = primerDispositivo;
        while (actual != null) {
            System.out.println(actual.toString() + "\t");
            Arista actualArista = actual.getPrimerArista();
            while (actualArista != null) {
                System.out.print(actualArista.getDispositivoDestino().getDirIP() + "--" + actualArista.getPonderacion() + "-->");
                actualArista = actualArista.getSigArista();
            }
            System.out.println("");
            actual = actual.getSigDispositivo();
        }
    }
}