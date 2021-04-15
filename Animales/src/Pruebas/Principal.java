/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;
import Modelo.Perro;

/**
 *
 * @author AndreaPabon
 */
public class Principal {
    public static void main(String[] args){
        Perro miPerro = new Perro("Firulais" , 10, 10);
        miPerro.hacerRuido();
        miPerro.comer();
    }
}
