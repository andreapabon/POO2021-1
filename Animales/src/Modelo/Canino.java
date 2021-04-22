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
public class Canino extends Animal{

    public Canino(String foto, int nivelHambre, String comida, String nombre) {
        super(foto, nivelHambre, comida, nombre);
    }
    
    @Override
    public void pasear(){
       
        
        System.out.println("Paseando como un canino");
    }
}
