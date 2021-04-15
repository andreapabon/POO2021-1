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
public class Hipopotamo extends Animal{

    public Hipopotamo(String foto, int nivelHambre, String comida, String nombre) {
        super(foto, nivelHambre, comida, nombre);
    }
    @Override 
    public void comer(){
        System.out.println("Comiendo como un hipopotamo");
    }
    
    @Override
    public void hacerRuido(){
        System.out.println("Haciendo ruido como un hipopotamo");
    }
}
