package bankingmovement;

public class Vertice {

    private String id;
    private String numeroCuenta;
    private String tipoCuenta;
    private float saldo;
    private Vertice sigVertice;
    private Arista inicioArista;

   public Vertice(String id, String numeroCuenta, String tipoCuenta, float Saldo) {
      this.id = id;
      this.numeroCuenta = numeroCuenta;
      this.tipoCuenta = tipoCuenta;
      this.saldo = saldo;
      this.sigVertice = null;
      this.inicioArista = null
          }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
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



}
