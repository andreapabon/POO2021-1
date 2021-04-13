/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Modelo.Circulo;
import Modelo.Cuadrado;
import java.util.Scanner;


/**
 *
 * @author Andrea Pabón
 */
public class Principal {
    
    public static void main(String[] args){
        
        int opc;
        float lado, area, radio;
        Scanner objScanner = new Scanner(System.in);
        area = 0;
        
        System.out.println("***** Calcular Áreas");
        System.out.println("1. Cuadrado");
        System.out.println("2. Circulo");
        System.out.println("3. Cilindro");
        System.out.println("0. Salir");
        System.out.println("Seleccione una opción: ");
        opc = objScanner.nextInt();
        objScanner.nextLine();
        
        switch (opc){
            case 1:
                System.out.println("Ingrese el valor del lado:");
                lado = objScanner.nextFloat();
                objScanner.nextLine();
                Cuadrado c = new Cuadrado(lado, "Cuadrado", "Figura que representa un cuadrado");
                area = c.calcularArea();
                break;
            case 2:
                System.out.println("Ingrese el valor del radio");
                radio = objScanner.nextFloat();
                objScanner.nextLine();
                Circulo circulo = new Circulo(radio, "Circulo", "Figura de un circulo");
                area = circulo.calcularArea();
                break;
            case 3: 
                System.out.println("Tarea");
                break;
            default:
                System.out.println("Opción no válida");                
        }
        System.out.println("El área es: " + area);
    }    
}
