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

}
