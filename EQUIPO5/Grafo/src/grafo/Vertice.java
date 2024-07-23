/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafo;

/**
 *
 * @author PC
 */
//Se crea la clase Vertice
public class Vertice {
    //Se declaran las variables.
    private char capacidad;
    private char tipo;
    private char ubicacion;
    private Vertice sigVertice;
    private Arista inicioArista;
    
    //Constructor del Vertice.
    public Vertice(char capacidad, char tipo, char ubicacion) {
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.sigVertice = null;
        this.inicioArista = null;
    }
    
    //Getters y Setters de las variables anteriormente declaradas
    public char getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(char capacidad) {
        this.capacidad = capacidad;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public char getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(char ubicacion) {
        this.ubicacion = ubicacion;
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