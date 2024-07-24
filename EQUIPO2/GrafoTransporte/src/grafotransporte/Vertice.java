/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafotransporte;

/**
 *
 * @author navy_
 */
public class Vertice {
    private String nombreEstacion;
    private String horario;
    private Arista inicioArista;
    private Vertice sigVertices;

    //Constructor
    public Vertice(String nombreEstacion, String horario, Arista inicioArista) {
        this.nombreEstacion = nombreEstacion;
        this.horario = horario;
        this.inicioArista = inicioArista;
        this.sigVertices = null;
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

    public Arista getInicioArista() {
        return inicioArista;
    }

    public void setInicioArista(Arista inicioArista) {
        this.inicioArista = inicioArista;
    }
    
    public Vertice getSigVertices(){
         return sigVertices;
    }
    
    public void setSigVertices(Vertice sigVertices){
        this.sigVertices = sigVertices;
    }
}
