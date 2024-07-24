package bankingmovement;

public class Arista {
    private float monto;
    private String fecha;
    private String tipoTransaccion;
    private Vertice cuentaOrigen;
    private Vertice cuentaDestino;
    private Arista sigArista;

    public Arista (float monto, String fecha, String tipoTransaccion, Vertice cuentaDestino, Vertice cuentaOrgien) {
        this.monto = monto; 
        this.fecha=fecha;
        this.tipoTransaccion = tipoTransaccion;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.sigArista = null;
    }

public float getMonto(){
    return monto;
}

public void setMonto (float monto){
    this.monto = monto;
}

public String getFecha (){
    return fecha;
}
public void setFecha (String fecha){
        this.fecha = fecha;
}
public String getTipoTransaccion (){
    return tipoTransaccion;
}
public void setTipoTransaccion (String tipoTransaccion) {
    this.tipoTransaccion = tipoTransaccion;
}
public Vertice getCuentaOrigen () {
    return cuentaOrigen;
}
public void setCuentaOrigen (Vertice cuentaOrigen){
    this.cuentaOrigen = cuentaOrigen;
}
public Vertice getCuentaDestino (){
    return cuentaDestino;
}
public void setCuentaDestino (Vertice cuentaDestino){
    this.cuentaDestino = cuentaDestino;
}

    public Arista getSigArista() {
        return sigArista;
    }

    public void setSigArista(Arista sigArista) {
        this.sigArista = sigArista;
    }
}
