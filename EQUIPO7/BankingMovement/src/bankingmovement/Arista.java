public class Arista {
    private float monto;
    private string fecha;
    private string tipoTransaccion;
    private Vertice cuentaOrigen;
    private Vertice cuentaDestino;

    public Arista (float monto, string fecha, string tipoTransaccion, Verice cuentaOrigen, Vertice cuentaDestino) {
        this.monto = monto; 
        this.fecha=fecha;
        this.tipoTransaccion = tipoTransaccion;
        this.cuentaOrigen = null;
        this.cuentaDestino = null;
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
public String getTipoTransaccion(){
    return tipoTransaccion;
}
public void setTipoTransaccion (String tipoTransaccion) {
    this.tipoTransaccion = tipoTransaccion;
}
public Vertice getCuentaOrigen () {
    
    
