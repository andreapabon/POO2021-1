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
public class Cliente {
    //Atributos
    private String nombre;
    private int cedula;
    private String sexo;
    private String fechaNacimiento;
    private String direccion;
    private String correo;
    private String telefono;
    //Atributos de Referencia
    private ArrayList<Cuenta> listaCuentas;

    public Cliente(String nombre, int cedula, String sexo, String fechaNacimiento, String direccion, String correo, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.listaCuentas = new ArrayList<>();
    }

    public Cliente() {
        this.nombre = "";
        this.cedula = 0;
        this.sexo = "";
        this.fechaNacimiento = "";
        this.direccion = "";
        this.correo = "";
        this.telefono = "";
        this.listaCuentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return this.cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }
    
    
    public Cuenta obtenerCuenta(int pos){
        int tam = this.listaCuentas.size();
        if (pos > tam){
            return null;
        }
        else{
            return this.listaCuentas.get(pos);
        }
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
