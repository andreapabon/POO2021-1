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
public class Perro extends Animal{
    
    
    public Perro(String nombre, int edad, float peso){
        super(nombre, edad, peso);        
    }

    @Override
    public void hacerRuido() {
        System.out.println("Guau Guau");
    }
    
    
}