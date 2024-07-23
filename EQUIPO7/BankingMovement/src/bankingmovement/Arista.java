package bankingmovement;

public class Arista {
    private float monto;
    private String fecha;
    private String tipoTransaccion;
    private vertice cuentaOrigen;
    private vertice cuentaDestino;

    public Arista(float monto, String fecha, String tipoTransaccion, vertice cuentaOrigen, vertice cuent;
        this.monto = monto;
        this.fecha = fecha;
        this.tipoTrasaccion = tipoTrasaccion;
        this.cuentaOrigen = null;
        this.cuentaDestino = null;
    }
    public float getMonto(){
        return monto;
    }
    public void setMonto(float monto){
        this.monto = onto;
    }
    public String getFecha(){
        return fecha;
    }
    public void seFecha(String fecha){
        this.fecha = fecha;
    }
    public String getTipoTransaccion(){
        return tipoTransaccion;
    }
    public void setTipoTransaccion(String tipoTransaccion){
        this.tipoTransaccion = tipoTransaccion;
    }
    public vertice getCuentaOrigen(){
        return cuentaOrigen;
    }
    public void setCuentaOrigen(vertice cuentaOrigen){
        this.cuentaOrigen = cuentaOrigen;
    }
    public vertice getCuentaDestino(){
        return cuentaDestino;
    }
    public void setCuentaDestino(vertice cuentaDestino){
        this.cuentaDestino = cuentaDestino;
    }
}
