/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author AndreaPabon
 */
public class Gato extends Felino implements iMascota{

    public Gato(String foto, int nivelHambre, String comida, String nombre) {
        super(foto, nivelHambre, comida, nombre);
    }
    
    @Override 
    public void comer(){
        System.out.println("Comiendo como un gato");
    }
    
    @Override
    public void hacerRuido(){
        System.out.println("Haciendo ruido como un gato, miau miau");
    }

    @Override
    public void serAmistoso() {
        System.out.println("Soy un gato amistoso");
    }

    @Override
    public void jugar() {
        System.out.println("Soy un gato jugando");
    }
    
}
