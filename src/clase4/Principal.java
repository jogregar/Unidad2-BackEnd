/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

import java.util.Scanner;

/**
 *
 * @author Jose G Garcia A
 */
public class Principal {
    
    public static void main(String[] args) {
        float num, num2;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese numero1: ");
        num=entrada.nextFloat();
        System.out.print("Ingrese numero2: ");
        num2=entrada.nextFloat();
        
        Operaciones operaciones = new Operaciones(num,num2);
        System.out.println(operaciones.num + " + " + operaciones.num2 + " es " + operaciones.sumar());
        System.out.println(operaciones.num + " - " + operaciones.num2 + " es " + operaciones.restar());
        System.out.println(operaciones.num + " * " + operaciones.num2 + " es " + operaciones.multiplicar());
        System.out.println(operaciones.num + " / " + operaciones.num2 + " es " + operaciones.dividir());
    }
    
}
