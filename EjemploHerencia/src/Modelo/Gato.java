/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Andrea Pabón
 */
public class Gato extends Animal{

    private int numVidas;
    
    public Gato(String nombre, int edad, float peso, int numVidas) {
        super(nombre, edad, peso);
        this.numVidas = numVidas;
    }

    public int getNumVidas() {
        return numVidas;
    }

    public void setNumVidas(int numVidas) {
        this.numVidas = numVidas;
    }
    
    public void caerDePie(){
        System.out.println(this.nombre + " está cayendo de pie");
    }
    
    @Override
    public void hacerRuido(){
        System.out.println("Miau Miau");
    }
}
