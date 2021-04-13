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
public class Cilindro extends Figura{
    private float radio;
    private float altura;

    public Cilindro(float radio, float altura, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.radio = radio;
        this.altura = altura;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        float area;
        area = 2 * 3.1415f * this.radio * this.altura;
        return area;
        
    }
}
