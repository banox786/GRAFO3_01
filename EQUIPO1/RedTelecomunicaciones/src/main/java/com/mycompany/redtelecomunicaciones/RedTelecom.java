public class RedTelecom {
    private Dispositivo primerDispositivo;

    public RedTelecomAlan() {
        this.primerDispositivo = null;
    }

    public Dispositivo getPrimerDispositivo() {
        return primerDispositivo;
    }

    public void setPrimerDispositivo(Dispositivo primerDispositivo) {
        this.primerDispositivo = primerDispositivo;
    }

    public void agregarDispositivo(Dispositivo nuevoDispositivo) {
        if (this.getPrimerDispositivo() == null) {
            this.setPrimerDispositivo(nuevoDispositivo);
        } else {
            Dispositivo actual = primerDispositivo;
            while (actual.getSigDispositivo() != null) {
                actual = actual.getSigDispositivo();
            }
            actual.setSigDispositivo(nuevoDispositivo);
        }
    }

    public boolean buscarDispositivo(String dirIP) {
        Dispositivo actual = primerDispositivo;
        while (actual != null) {
            if (actual.getDirIP().equals(dirIP)) {
                return actual;
            } else {
                actual = actual.getSigDispositivo();
            }
        }
        System.out.println("Dispositivo no encontrado");
        return false;
    }

    public void agregarArista(String dirIPDispositivoOrigen, String dirIPDispositivoDestino, float ponderacion) {
        Dispositivo dispositivoOrigen = buscarDispositivo(dirIPDispositivoOrigen);
        Dispositivo dispositivoDestino = buscarDispositivo(dirIPDispositivoDestino);
        if (dispositivoOrigen == null || dispositivoDestino == null) {
            System.out.println("Imposible agregar arista");
        } else {
            Arista nuevaArista = new Arista(dispositivoDestino, peso);
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
