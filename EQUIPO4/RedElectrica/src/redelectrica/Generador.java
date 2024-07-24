/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redelectrica;

/**
 *
 * @author nuti_
 */
public class Generador {
    private int id;
    private int capacidad;
    private String tipo;
    private String ubicacion;
    private Generador sigGenerador;
    private Cable inicioCable;

    public Generador(int id, int capacidad, String tipo, String ubicacion) {
        this.id = id;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.sigGenerador = null;
        this.inicioCable = null;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Generador getSigGenerador() {
        return sigGenerador;
    }

    public void setSigGenerador(Generador sigGenerador) {
        this.sigGenerador = sigGenerador;
    }

    public Cable getInicioCable() {
        return inicioCable;
    }

    public void setInicioCable(Cable inicioCable) {
        this.inicioCable = inicioCable;
    }
    
    
}
