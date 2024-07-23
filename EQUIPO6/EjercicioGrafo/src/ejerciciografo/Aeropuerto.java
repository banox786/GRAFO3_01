/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciografo;

/**
 *
 * @author kungl
 */
public class Aeropuerto {
    private String nombre;
    private String ciudad;
    private int capacidad;

    public Aeropuerto(String nombre, String ciudad, int capacidad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return nombre + " (" + ciudad + ") - Capacidad: " + capacidad;
    }
}
