package com.mycompany.redtelecomunicaciones;
/**
 *
 * @author julio y victor
 */
public class Vertice {
    private String dirIP;
    private String nombre;
    private String tipo;
    private float capacidad;
    private Vertice sigDispositivo;
    private Arista primeraArista;

    public Vertice(String dirIP, String nombre, String tipo, float capacidad) {
        this.dirIP = dirIP;
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.sigDispositivo = null;
        this.primeraArista = null;
    }

    public String getDirIP() {
        return dirIP;
    }

    public void setDirIP(String dirIP) {
        this.dirIP = dirIP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public Vertice getSigDispositivo() {
        return sigDispositivo;
    }

    public void setSigDispositivo(Vertice sigDispositivo) {
        this.sigDispositivo = sigDispositivo;
    }

    public Arista getPrimeraArista() {
        return primeraArista;
    }

    public void setPrimeraArista(Arista primeraArista) {
        this.primeraArista = primeraArista;
    }

    @Override
    public String toString() {
        return "Vertice{" + "dirIP=" + dirIP + ", nombre=" + nombre + ", tipo=" + tipo + ", capacidad=" + capacidad + ", sigDispositivo=" + sigDispositivo + ", primeraArista=" + primeraArista + '}';
    }

    
}