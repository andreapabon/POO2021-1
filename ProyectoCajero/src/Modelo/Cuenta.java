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
public class Cuenta {
    //atributos
    private long numero;
    private String tipo; 
    private String fechaCreacion;
    private float saldo;  
    //Atributos de referencia
    private Cliente refCliente;

    public Cuenta(long numero, String tipo, String fechaCreacion, float saldo) {
        this.numero = numero;
        this.tipo = tipo;
        this.fechaCreacion = fechaCreacion;
        this.saldo = saldo;
        this.refCliente = new Cliente();
    }

    public Cuenta(int numero, String tipo, String fechaCreacion, float saldo, Cliente refCliente) {
        this.numero = numero;
        this.tipo = tipo;
        this.fechaCreacion = fechaCreacion;
        this.saldo = saldo;
        this.refCliente = refCliente;
    }
    

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getRefCliente() {
        return refCliente;
    }

    public void setRefCliente(Cliente refCliente) {
        this.refCliente = refCliente;
    }
}
