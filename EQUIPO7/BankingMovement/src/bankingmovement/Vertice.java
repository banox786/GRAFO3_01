package bankingmovement;

public class Vertice {
    private String id;
    private String numeroCuenta;
    private String tipoCuenta;
    private float saldo;

    public Vertice(String id, String numeroCuenta, String tipoCuenta, float saldo) {
        this.id = id;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }
    
    public String getId(){
    return id;
}
    
public void setId(String id){
    this.id = id;
}
    
public String getNumeroCuenta(){
    return numeroCuenta;
}

public void setNumeroCuenta(String numeroCuenta){
    this.numeroCuenta = numeroCuenta;
}

public String getTipoCuenta(){
    return tipoCuenta;
}

public void setTipoCuenta(String tipoCuenta){
    this.tipoCuenta = tipoCuenta;
}

public float getSaldo(){
    return saldo;
}

public void setSaldo(float saldo){
    this.saldo = saldo;
}

}
