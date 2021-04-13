/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.util.Scanner;
import Modelo.Banco;
import Modelo.Cliente;
import java.util.Date;

/**
 *
 * @author Andrea Pabón
 */
public class Principal {
    public static void main(String[] args){
        Scanner objScanner = new Scanner(System.in);
        
        String nombre, direccion, fecha, tipo, nombreCliente, genero, fecNac, direcCliente, telefono, correo;
        Date fechaNacimiento;
        int nit, numCuenta, cedula;
        float saldo;
        System.out.println("******** Datos del Banco ******************");
        System.out.println("Ingrese el nombre: ");
        nombre = objScanner.nextLine();
        System.out.println("Ingrese la direccion: ");
        direccion = objScanner.nextLine();
        System.out.println("Ingrese el NIT");
        nit = objScanner.nextInt();
        objScanner.nextLine();
        
        Banco banco1 = new Banco(nit, nombre, direccion);
        
        System.out.println("");
        System.out.println("*************** Datos del Cliente *************");
        System.out.println("Ingrese nombre del Cliente");
        nombreCliente = objScanner.nextLine();
        
        System.out.println("Ingrese género del cliente  ");
        genero = objScanner.nextLine();
        
        System.out.println("Ingrese Fecha de Nacimiento");
        fecNac = objScanner.nextLine();       
        
        System.out.println("Ingrese la direccion del cliente  ");
        direcCliente = objScanner.nextLine();
        System.out.println("Ingrese el telefono del cliente  ");
        telefono = objScanner.nextLine();
        
        System.out.println("Ingrese el correo del cliente  ");
        correo = objScanner.nextLine();       
        
        System.out.println("Ingrese la cédula del cliente  ");
        cedula = objScanner.nextInt();
         objScanner.nextLine();
        
        Cliente cliente = new Cliente(nombre, cedula, genero, fecNac, direcCliente, correo, telefono);
        
        System.out.println("");
        System.out.println("*************** Datos de la cuenta *************");
        System.out.println("Ingrese el número de la cuenta");
        numCuenta = objScanner.nextInt();
        objScanner.nextLine();
        System.out.println("Ingrese la fecha ");
        fecha = objScanner.nextLine();
        System.out.println("Ingrese el tipo de cuenta ");
        tipo = objScanner.nextLine();        
        System.out.println("Ingrese el saldo ");
        saldo = objScanner.nextFloat();
         objScanner.nextLine();
        
        banco1.crearCuenta(numCuenta, tipo, fecha, saldo, cliente);
    }
    
}
