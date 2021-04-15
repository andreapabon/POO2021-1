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
public class Animal {
    protected String foto; //Protected permite que los hijos puedan heredar los atributos. Solo heredan lo público y protegido. 
    protected int nivelHambre;
    protected String comida;
    protected String nombre;

    public Animal(String foto, int nivelHambre, String comida, String nombre) {
        this.foto = foto;
        this.nivelHambre = nivelHambre;
        this.comida = comida;
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getNivelHambre() {
        return nivelHambre;
    }

    public void setNivelHambre(int nivelHambre) {
        this.nivelHambre = nivelHambre;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Métodos Generales
    public void dormir(){
        System.out.println(this.nombre + " está durmiendo");
    }
    public void comer(){
        System.out.println(this.nombre + " está comiento");
    }
    public void hacerRuido(){
    	System.out.println( "Método padre");
        System.out.println("Haciendo ruido como el padre");
    } 
    public void pasear(){
        System.out.println("Paseando como un animal");;
    }
}
