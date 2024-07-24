/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.redtelecomunicaciones;
/**
 *
 * @author Thaily Mairyn
 */
public class Arista {
    private Dispositivo dispositivoDestino;
    private float ponderacion;
    private Arista sigArista;

    public Arista(Dispositivo dispositivoDestino, float ponderacion) {
        this.dispositivoDestino = dispositivoDestino;
        this.ponderacion = ponderacion;
        this.sigArista = null;
    }

    public Dispositivo getDispositivoDestino() {
        return dispositivoDestino;
    }

    public void setDispositivoDestino(Dispositivo dispositivoDestino) {
        this.dispositivoDestino = dispositivoDestino;
    }

    public float getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(float ponderacion) {
        this.ponderacion = ponderacion;
    }
 public Arista getSigArista() {
        return sigArista;
    }

    public void setSigArista(Arista sigArista) {
        this.sigArista = sigArista;
    }
}


  
