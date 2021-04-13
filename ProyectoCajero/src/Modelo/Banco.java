/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Andrea Pabón
 */
public class Banco {
    private long nit;
    private String nombre;
    private String direccion;
    //Atributos de referencia
    private ArrayList<Cuenta> listaCuentas;
    
    //constructor:
    public Banco(){
        this.nit = 0;
        this.direccion = "";
        this.nombre = "";
        this.listaCuentas = new ArrayList<>();
    }
    public Banco(long nit, String nombre, String direccion){
        this.nit = nit;
        this.direccion = nombre;
        this.nombre = direccion;
        this.listaCuentas = new ArrayList<>();
    }
    //set y get
    public void setNit(long nit){
        if(nit >= 0){
            this.nit = nit;
        }
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public long getNit (){
        return this.nit;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getDireccion(){
        return this.direccion;
    }
    
    public void crearCuenta(int numero, String tipo, String fechaCreacion, float saldo, Cliente cliente){
        Cuenta c = new Cuenta(numero, tipo, fechaCreacion, saldo, cliente);
        this.listaCuentas.add(c);
        
    }
    
     /*Agrega cuenta al final de lista*/
    public void agregarCuenta(Cuenta c){
        this.listaCuentas.add(c);        
    }
    /*Agrega cuenta en la posición especificada*/
    public void agregarCuenta(Cuenta c, int pos){
        this.listaCuentas.add(pos, c);        
    }    
    
    public void eliminarCuenta(int pos){
        this.listaCuentas.remove(pos);
    }
}
