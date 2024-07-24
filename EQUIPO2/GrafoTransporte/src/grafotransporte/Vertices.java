/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafotransporte;

/**
 *
 * @author navy_
 */
public class Vertices {
    private String nombreEstacion;
    private String horario;
    private Vertices destino;
    private Aristas inicioArista;
    private Vertices sigVertices;

    //Constructor
    public Vertices(String nombreEstacion, String horario, Vertices destino, Aristas inicioArista) {
        this.nombreEstacion = nombreEstacion;
        this.horario = horario;
        this.destino = destino;
        this.inicioArista = inicioArista;
        this.sigVertices = null;
    }

    Vertices(Vertices destino) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //Setters y getters

    public String getNombreEstacion() {
        return nombreEstacion;
    }

    public void setNombreEstacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Vertices getDestino() {
        return destino;
    }

    public void setDestino(Vertices destino) {
        this.destino = destino;
    }

    public Aristas getInicioArista() {
        return inicioArista;
    }

    public void setInicioArista(Aristas inicioArista) {
        this.inicioArista = inicioArista;
    }
    
    public Vertices getSigVertices(){
         return sigVertices;
    }
    
    public void setSigVertices(Vertices sigVertices){
        this.sigVertices = sigVertices;
    }
}
