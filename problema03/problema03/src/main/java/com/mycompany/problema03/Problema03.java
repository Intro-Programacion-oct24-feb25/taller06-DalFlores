/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema03;
import java.util.Scanner;

/**
 *
 * @author dalto
 */
public class Problema03 {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
     
        String nombre;
        String apellido;
        int tipoEmpleado ;
        double sueldoInicial;
        double sueldoFinal;
        double incremento;

        System.out.println("Ingrese el nombre del empleado");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el apellido del empleado");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese el tipo de empleado");
        tipoEmpleado = entrada.nextInt();
        
        System.out.println("Ingrese el sueldo inicial del empleado");
        sueldoInicial = entrada.nextDouble();

        switch (tipoEmpleado) {
            case 1:
                incremento = (sueldoInicial * 5) / 100;
                break;
            case 2:
                incremento = (sueldoInicial * 7) / 100;
                break;
            case 3:
                incremento = (sueldoInicial * 9) / 100;
                break;
            case 4:
                incremento = (sueldoInicial * 12) / 100;
                break;
            case 5:
                incremento = (sueldoInicial * 5) / 100;
                break;
            default:
                incremento = (sueldoInicial * 15) / 100;
        }
        sueldoFinal = sueldoInicial + incremento;
        
        System.out.printf("Nombre: %s\nApellido: %s\nSueldo Inicial; %.2f"
                + "\nIncremento del sueldo: %.2f\nSueldo Final: %.2f\n",
                 nombre, apellido, sueldoInicial, incremento, sueldoFinal);
    }

}
