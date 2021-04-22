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
public class Veterinario {
    private String nombre;
    private long id;

    public Veterinario(String nombre, long id) {
        this.nombre = nombre;
        this.id = id;
    }

    public Veterinario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public void atenderAnimal(Animal objAnimal){
        System.out.println("Hola " + objAnimal.getNombre());
        System.out.println("Soy " + this.nombre + " y  te voy a atender");
        objAnimal.hacerRuido();
    }
    
}
