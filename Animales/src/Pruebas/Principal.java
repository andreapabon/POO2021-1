/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;
import Modelo.Animal;
import Modelo.Gato;
import Modelo.Perro;
import java.util.ArrayList;

/**
 *
 * @author AndreaPabon
 */
public class Principal {
    public static void main(String[] args){
        Perro miPerro = new Perro("C:Imagenes/perro.jpg", 2, "Dow Chog", "Firulais");
        Gato miGato = new Gato("C:Imagenes/gato.jpg", 7, "Cat Chow", "Tom");
        miPerro.hacerRuido();
        miPerro.comer();
        miPerro.jugar();
        miPerro.serAmistoso();
        
        ArrayList<Animal> misAnimales = new ArrayList<Animal>();
        
        misAnimales.add(miGato);
        misAnimales.add(miPerro);
       /* int i, tam;
        tam = misAnimales.size();
        for(i = 0; i < tam; i++){
            misAnimales.get(i).hacerRuido();
        }*/
        
        for (Animal animal: misAnimales){
            animal.hacerRuido();
            System.out.println("El animal es un " + animal.getClass());
        }
    }
}
