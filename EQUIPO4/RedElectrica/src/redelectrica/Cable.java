/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redelectrica;

/**
 *
 * @author xxKim
 */
public class Cable {
    private Generador generadorDestino;
    private Cable sigCable;

    public Generador getGeneradorDestino() {
        return generadorDestino;
    }

    public void setGeneradorDestino(Generador generadorDestino) {
        this.generadorDestino = generadorDestino;
    }

    public Cable getSigCable() {
        return sigCable;
    }

    public void setSigCable(Cable sigCable) {
        this.sigCable = sigCable;
    }
    
}
