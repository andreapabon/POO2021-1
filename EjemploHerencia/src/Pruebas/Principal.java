/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Modelo.*;

/**
 *
 * @author Andrea Pabón
 */
public class Principal {
    
    public static void main(String[] args){
        
        
        Perro perrito = new Perro("Firulais", 7, 8);
        Gato gatito = new Gato("Tom", 2, 7, 7);
        
        
        perrito.hacerRuido();
        gatito.hacerRuido();
        gatito.caerDePie();
        
    }
    
}
