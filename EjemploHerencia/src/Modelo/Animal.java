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
public abstract class Animal {
    protected String nombre; //Protected permite que los hijos puedan heredar los atributos. Solo heredan lo público y protegido. 
    protected int edad;
    protected float peso;

    public Animal(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    //Métodos Generales
    public void dormir(){
        System.out.println(this.nombre + " está durmiendo");
    }
    public void comer(){
        System.out.println(this.nombre + " está comiento");
    }
    public abstract void hacerRuido();
}
